package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/tsa230191
@Slf4j
public class TreatmentPlanPage extends Page<TreatmentPlanPage> {
    public static String medicineName;
    protected TreatmentPlanPage() {
        super(TreatmentPlanPage.class);
    }

    @As("linkOverall")
    private SelenideElement linkOverall = $(byText("Overall"));

    @As("linkMedicineName")
    private SelenideElement linkMedicineName = $("#views-form-patient-treatment-plan-page > div > table > tbody > tr.odd.views-row-first > td.views-field.views-field-field-treatment-plan-medicine > a");

    @As("selectEditFieldTreatmentPlan")
    private SelenideElement selectEditFieldTreatmentPlan = $("select[id='edit-field-treatment-plan-medicine-target-id']");

    @As("inputEditSubmitPatientTreatment")
    private SelenideElement inputEditSubmitPatientTreatment = $("input[id='edit-submit-patient-treatment-plan']");

    @As("linkToday")
    private SelenideElement linkToday = $(byText("Today"));

    @As("tableOfMedicine")
    private SelenideElement tableOfMedicine = $("#page-title");

    

    public TreatmentPlanPage clickLinkOverallOfTreatmentPlan() {
        linkOverall.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public TreatmentPlanPage getTheMedicineName() {
        medicineName = linkMedicineName.shouldBe(visible).getText();
        return this;
    }
    public TreatmentPlanPage setSelectEditFieldTreatmentPlan(String medicine) {
        selectEditFieldTreatmentPlan.shouldBe(visible).selectOptionContainingText(medicine);
        return this;
    }
    public TreatmentPlanPage clickOnApplyButton() {
        inputEditSubmitPatientTreatment.shouldBe(visible).click();
        return this;
    }
    public TreatmentPlanPage assertThatMedicineName() {
        linkMedicineName.shouldBe(visible).shouldHave(Condition.text(medicineName));
        Selenide.switchTo().window(0);
        return this;
    }
    public TreatmentPlanPage clickLinkTodayOfTreatmentPlan() {
        linkToday.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public TreatmentPlanPage getTheTableOfMedicine() {
        log.info(tableOfMedicine.shouldBe(visible).getText());
        return this;
    }
}