package com.jagriti.bmtplus.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.jagriti.bmtplus.config.TestEnvFactory;
import com.jagriti.bmtplus.extensions.ReportingExtension;
import com.jagriti.bmtplus.extensions.TimingExtension;
import com.typesafe.config.Config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;

@ExtendWith(ReportingExtension.class)
@ExtendWith(ScreenShooterExtension.class)
@ExtendWith(TextReportExtension.class)
@ExtendWith(SoftAssertsExtension.class)
@ExtendWith(TimingExtension.class)
public class TestSetup {
  protected static final Config CONFIG = TestEnvFactory.getInstance().getConfig();
  private static final String TEST_RUN_DIRECTORY = "test-result/runs/" + TestRun.getUniqueName();

  @BeforeAll
  public static void setConfig() {
    Configuration.reportsFolder = TEST_RUN_DIRECTORY;

    if ("chrome".equalsIgnoreCase(Configuration.browser)) {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      Configuration.browserCapabilities = options;
    }
  }

  @AfterEach
  public void clearBrowserCookies() {
    // To avoid getting new instances that are already logged in.
    Selenide.closeWebDriver();
    /**
     * Note: Do not use Selenide.closeWebDriver() since for every parallel iteration, it will take
     * close to 11 seconds to launch new browsers. Clearing Browser cookies via
     * Selenide.clearBrowserCookies() gives you all that time back - which adds up with every
     * iteration (say every time 4 threads are consumed) while functionally doing the same task.
     */
  }
}
