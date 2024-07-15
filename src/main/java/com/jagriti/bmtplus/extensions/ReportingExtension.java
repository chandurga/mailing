package com.jagriti.bmtplus.extensions;

import com.jagriti.bmtplus.config.TestEnvFactory;
import com.jagriti.bmtplus.extensions.report.Elastic;
import com.jagriti.bmtplus.extensions.report.TestRunMetaData;
import com.typesafe.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.IOException;

@Slf4j
public class ReportingExtension implements AfterEachCallback {
    private static final Config CONFIG = TestEnvFactory.getInstance().getConfig();
    private static final boolean PUBLISH_RESULTS_TO_ELASTIC = CONFIG.getBoolean("PUBLISH_RESULTS_TO_ELASTIC");

    @Override
    public void afterEach(ExtensionContext context) throws IOException {
        if (PUBLISH_RESULTS_TO_ELASTIC) {
            TestRunMetaData testRunMetaData = new TestRunMetaData().setBody(context);
            Elastic.publishResults(testRunMetaData);
        }

        // Remove thread created from AfterTestExecutionCallback in TimingExtension class.
        TimingExtension.removeTestExecutionTimeThread();
    }
}
