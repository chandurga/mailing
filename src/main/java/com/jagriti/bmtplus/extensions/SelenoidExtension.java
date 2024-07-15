package com.jagriti.bmtplus.extensions;

import com.jagriti.bmtplus.config.TestEnvFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SelenoidExtension implements BeforeAllCallback {
    protected static final Config CONFIG = TestEnvFactory.getInstance().getConfig();
    @Override
    public void beforeAll(ExtensionContext context) {
        if(CONFIG.getString("HOST").equalsIgnoreCase("REMOTE")){
//            Configuration.remote = "http://localhost:4444/wd/hub";
//            Configuration.reportsFolder = "target/surefire-reports";
            // Configuration.downloadsFolder = "target/downloads";

//            Map<String, Boolean> options = new HashMap<>();
//            options.put("enableVNC", true);
//            options.put("enableVideo", true);
//            options.put("enableLog", true);

//            ChromeOptions capabilities = new ChromeOptions();
//            Configuration.browserCapabilities = capabilities;
//            Configuration.browserCapabilities.setCapability("selenoid:options", options);
        }

    }
}
