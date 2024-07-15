package com.jagriti.mailing.tests;

import com.jagriti.mailing.annotations.ConfigTest;
import com.jagriti.mailing.config.TestEnvFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SandboxTest {
    protected static final Config CONFIG = TestEnvFactory.getInstance().getConfig();

    @ConfigTest
    void assertThatWeCanReadSecrets() {
        assertAll("Config tests:",
                () -> assertEquals("mailing", CONFIG.getString("SECRET_FIELD_FROM"), "SECRET_FIELD_FROM")
        );
    }

    @Disabled
    @ConfigTest
    void assertThatWeCanReadProperEnvConfigValues() {
        assertAll("Config tests:",
                () -> assertEquals("https://dev.bmtplus.com/node/add/item",
                        CONFIG.getString("LOGIN_URL") + CONFIG.getString("ADD_ITEM_PATH"), "ADD_ITEM_PATH")
        );
    }
}
