package com.jagriti.bmtplus.utils;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.sleep;

@Slf4j
public class TestUtils {
  private TestUtils() {
    throw new IllegalStateException("Util class");
  }

  /**
   * Use case 1: Wait for an element that may or may not exist (but when we don't want to fail the flow).
   * Use case 2: Wait for an element that maybe transient (between few micro seconds to say a few seconds). Say if not
   * found you can assume, it came and went - without having to fail the test.
  **/

  /**
   * Poll and wait only until the element is not found.Use this instead of most Thread.Sleep usages.
   * If found early
   * ->, come out of wait and return true - then take action accordingly in the caller function.
   * If not found
   * -> after max poll duration, then return false and take action accordingly in the caller function.
   * Usage (only when necessary - when element may or may not come and we don't want to fail our test even if does not
   * come. BUT If you know that element will come (or should come), use normal should explict wait conditions): Usage:
   * if(elementExists(loginName, 3, 1){
   *     loginName.shouldBe(editable).setValue(withText(userName).sensitive());
   * }
   **/
  public static boolean elementExists(SelenideElement element, int pollDurationInSec, int pollIntervalInSec) {
    int pollCounter = 0;
    while (!element.exists() && pollCounter < pollDurationInSec) {
      log.info("Polling for {} sec(s)!", pollIntervalInSec);
      sleep(pollIntervalInSec * 1000);
      pollCounter++;
    }
    
    if (element.exists()) {
      log.info("Element found!");
    }else{
      log.info("Element was not found even after end of pollDurationInSec: {}!", pollDurationInSec);
    }

    return element.exists();
  }
}
