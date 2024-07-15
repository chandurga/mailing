package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/node/add/hape-search/3765084
public class FutureDateOfAgeOfDiagnosisWithHapESearchContentPage extends Page<FutureDateOfAgeOfDiagnosisWithHapESearchContentPage> {
    protected FutureDateOfAgeOfDiagnosisWithHapESearchContentPage() {
        super(FutureDateOfAgeOfDiagnosisWithHapESearchContentPage.class);
    }

    @As("errorMessage")
    private SelenideElement errorMessage = $("#messages > div");

    public FutureDateOfAgeOfDiagnosisWithHapESearchContentPage asserThatErrorMessage() {
        errorMessage.shouldBe(visible).should(Condition.text("Patient's Date of Diagnosis cannot be a future date. Cannot save Hap-E search request form. Patient: 1383081672305200"));
        return this;
    }
}