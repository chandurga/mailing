package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PatientAgeInYearsAndMonthsPage extends Page<PatientAgeInYearsAndMonthsPage> {
    protected PatientAgeInYearsAndMonthsPage() {
        super(PatientAgeInYearsAndMonthsPage.class);
    }

    @As("linkPrintClinicalCourse")
    private SelenideElement linkPrintClinicalCourse = $("a[class='btn btn-info btn-xs button-blue']");

    @As("age")
    private SelenideElement age = $("body > table:nth-child(4) > tbody > tr:nth-child(2) > td:nth-child(4)");

    public PatientAgeInYearsAndMonthsPage clickOnButtonOfPrintClinicalCourse() {
        linkPrintClinicalCourse.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    public PatientAgeInYearsAndMonthsPage assertThePatientAge() {
        age.shouldBe(visible).shouldHave(Condition.text("28 years 12 months"));
        return this;
    }
}
