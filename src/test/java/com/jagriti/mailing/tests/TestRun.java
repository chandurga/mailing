package com.jagriti.mailing.tests;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class TestRun {
    private TestRun(){
        throw new IllegalStateException("Util class");
    }

    public static String getUniqueName(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy-HH-mm-ss");
        String testRun = getFormattedDate(dateTimeFormatter);

        log.info("Test run name: {}", testRun);
        return testRun;
    }

    public static String getFormattedDate(DateTimeFormatter dateTimeFormatter){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.debug("Before formatting: {}", localDateTime);

        return localDateTime.format(dateTimeFormatter);
    }
}
