package com.jagriti.bmtplus.pages.QMTools.logs;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.QMTools.logs.data.LogStatus;
import com.jagriti.bmtplus.pages.patients.patients.PatientData;
import com.jagriti.bmtplus.pages.patients.patients.data.Country;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;
import org.openqa.selenium.logging.Logs;

@Data
public class LogsData {

    private String title;
    private LogStatus logStatus;
    private String collectionDate;
    private String collectionTime;

    LogsData(){
        setData();
    }

    public static LogsData getData() {
        return new LogsData();
    }

    private LogsData setData() {
        Faker fakeData = new Faker();

        this.title = fakeData.name().fullName();
        this.logStatus=(LogStatus) new RandomEnumGenerator(LogStatus.class).randomEnum();
        this.collectionDate = DateTimeUtils.getFormattedDate();
        this.collectionTime = DateTimeUtils.getFormattedTime();
        return this;
    }
}
