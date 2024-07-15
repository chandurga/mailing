package com.jagriti.bmtplus.strategy;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class JunitSelenideStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {

    private static final int THREAD_COUNT = 4;

    @Override
    public int getParallelism() {
        return THREAD_COUNT;
    }

    @Override
    public int getMinimumRunnable() {
        return THREAD_COUNT;
    }

    @Override
    public int getMaxPoolSize() {
        return THREAD_COUNT;
    }

    @Override
    public int getCorePoolSize() {
        return THREAD_COUNT;
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        return this;
    }
}
