package com.jagriti.bmtplus.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URL;

@Slf4j
public class TestEnvFactory {
    private static final TestEnvFactory UNIQUE_INSTANCE = new TestEnvFactory();

    private Config config;

    private TestEnvFactory() {
        config = setConfig();
    }

    public static TestEnvFactory getInstance() {
        return UNIQUE_INSTANCE;
    }

    public Config getConfig() {
        return config;
    }

    private Config setConfig() {
        log.info("Setting up configuration for the test run");

        try {
            // Load the base configuration
            config = ConfigFactory.load();
            log.info("Loaded base configuration");

            // Load choices configuration
            Config choicesConfig = ConfigFactory.parseResources("choices.conf");
            config = config.withFallback(choicesConfig);
            log.info("Loaded choices configuration");

            // Load common configurations
            config = getAllConfigFromResourcePath("common");
            log.info("Loaded common configurations");

            // Load environment-specific configurations
            TestEnv testEnv = config.getEnum(TestEnv.class, "TEST_ENV");
            config = getAllConfigFromResourcePath(testEnv.getValue());
            log.info("Loaded environment-specific configurations for: {}", testEnv.getValue());

            return config;
        } catch (Exception e) {
            log.error("Failed to set up configuration", e);
            throw new IllegalStateException("Could not set up configuration: " + e.getMessage(), e);
        }
    }

    private Config getAllConfigFromResourcePath(String resourceBasePath) {
        log.info("Loading configurations from resource path: {}", resourceBasePath);

        try {
            URL url = getClass().getClassLoader().getResource(resourceBasePath);
            if (url == null) {
                throw new IllegalStateException("Resource not found: " + resourceBasePath);
            }

            File resourceDir = new File(url.toURI());
            File[] files = resourceDir.listFiles();

            if (files == null) {
                log.warn("No files found in resource path: {}", resourceBasePath);
                return config;
            }

            for (File file : files) {
                String resourcePath = resourceBasePath + "/" + file.getName();
                log.info("Loading configuration from: {}", resourcePath);

                Config childConfig = ConfigFactory.parseResources(resourcePath);
                config = config.withFallback(childConfig);
            }

            return config;
        } catch (Exception e) {
            log.error("Failed to load configurations from resource path: {}", resourceBasePath, e);
            throw new IllegalStateException("Could not load configurations from " + resourceBasePath, e);
        }
    }
}