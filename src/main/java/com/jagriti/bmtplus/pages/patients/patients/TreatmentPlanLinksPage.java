package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.UserData;
import com.jagriti.bmtplus.pages.miscellaneous.data.OldTreatmentPlan;
import com.jagriti.bmtplus.pages.patients.patients.data.TreatmentIssues;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/treatment-summary/3769775
@Slf4j
public class TreatmentPlanLinksPage extends Page<TreatmentPlanLinksPage> {
    protected TreatmentPlanLinksPage() {
        super(TreatmentPlanLinksPage.class);
    }

    int DAY;
    String firstMed;
    String secondMed;
    String thirdMed;
    String firstTime;
    String secondTime;

    @As("linkQuicktabsTabTreatmentSummary")
    private SelenideElement linkQuicktabsTabTreatmentSummary = $("#quicktabs-tab-patient_summary_pre_bmt-10");

    @As("linkAddNewTreatmentSummary")
    private SelenideElement linkAddNewTreatmentSummary = $("a[target='blank']");

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("#edit-title");

    @As("selectEditFieldTreatsumRegimen")
    private SelenideElement selectEditFieldTreatsumRegimen = $("#edit-field-treatsum-regimen-und-hierarchical-select-selects-0");

    @As("selectEditFieldTreatsumRegimen2")
    private SelenideElement selectEditFieldTreatsumRegimen2 = $("#edit-field-treatsum-regimen-und-hierarchical-select-selects-1");

    @As("treatmentStartDate")
    private SelenideElement treatmentStartDate = $("#edit-field-treatsum-start-date-und-0-value-datepicker-popup-0");

    @As("treatementEndDate")
    private SelenideElement treatementEndDate = $("#edit-field-treatsum-end-date-und-0-value-datepicker-popup-0");

    @As("inputEditFieldPatientHeight")
    private SelenideElement inputEditFieldPatientHeight = $("#edit-field-transplant-patient-height-und-0-value");

    @As("inputEditFieldPatientWeight")
    private SelenideElement inputEditFieldPatientWeight = $("#edit-field-transplant-patient-weight-und-0-value");

    @As("selectEditFieldTreatmentIssues")
    private SelenideElement selectEditFieldTreatmentIssues = $("#edit-field-treatment-issues-und-hierarchical-select-selects-0");

    @As("inputEditFieldTreatmentIssuesAddButton")
    private SelenideElement inputEditFieldTreatmentIssuesAddButton = $("#edit-field-treatment-issues-und-hierarchical-select-dropbox-add");

    @As("trLongTermComplicationsRemove")
    private SelenideElement trLongTermComplicationsRemove = $("tr[class$='odd']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("linkImportTreatmentPlan")
    public SelenideElement linkImportTreatmentPlan = $("#block-jagriti-custom-ji-add-content > div > div > ul > li:nth-child(2) > a");

    @As("dayOfTheTodayTreatment")
    private SelenideElement dayOfTheTodayTreatment = $("td[class$='views-field-field-trans-treatment-plan-day']");

    @As("medicineOne")
    private SelenideElement medicineOne = $("td[class$='views-field-field-treatment-plan-medicine']");

    @As("medicineTwo")
    private SelenideElement medicineThree = $("tr[class$='views-row-last'] td[class$='views-field-field-treatment-plan-medicine']");

    @As("timeOne")
    private SelenideElement timeOne = $("div > section > div > div > div > div > div > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3) > span:nth-of-type(1)");

    @As("timeTwo")
    private SelenideElement timeTwo = $("div > section > div > div > div > div > div > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(3) > span:nth-of-type(2)");

    @As("linkToday")
    private SelenideElement linkToday = $(byText("Today"));

    @As("linkOverall")
    private SelenideElement linkOverall = $(byText("Overall"));

    @As("linkFirstMedInOverallPage")
    private SelenideElement linkFirstMedInOverallPage = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div > div > section > div > div > div > div > div > div > div:nth-of-type(3) > div > form > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a");

    @As("timeInOverallPage")
    private SelenideElement timeInOverallPage = $("tr[class$='views-row-first'] td[class$='views-field-field-trans-treatment-plan-time']");

    @As("inputEditFieldDayTreatment")
    private SelenideElement inputEditFieldDayTreatment = $("#edit-field-trans-treatment-plan-day-value-value");

    @As("inputEditApplyButton")
    private SelenideElement inputEditApplyButton = $("#edit-submit-patient-treatment-plan");


    public TreatmentPlanLinksPage clickOnLinkTabTreatmentSummary() {
        linkQuicktabsTabTreatmentSummary.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage clickOnLinkAddNewTreatmentSummary() {
        linkAddNewTreatmentSummary.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    public TreatmentPlanLinksPage enterTheInputTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }

    public TreatmentPlanLinksPage setSelectEditFieldTreatsumRegimen(String treatsumRegimen) {
        selectEditFieldTreatsumRegimen.shouldBe(visible).selectOptionContainingText(treatsumRegimen);
        return this;
    }

    public TreatmentPlanLinksPage setSelectEditFieldTreatsumRegimen2(OldTreatmentPlan treatsumRegimen) {
        selectEditFieldTreatsumRegimen2.shouldBe(visible).selectOptionContainingText(treatsumRegimen.getText());
        return this;
    }

    public TreatmentPlanLinksPage setTreatmentStartDate(String startDate) {
        treatmentStartDate.shouldBe(visible).click();
        treatmentStartDate.shouldBe(visible).setValue(startDate);
        treatmentStartDate.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage setTreatementEndDate(String endDate) {
        treatementEndDate.shouldBe(visible).click();
        treatementEndDate.shouldBe(visible).setValue(endDate);
        treatementEndDate.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage setInputEditFieldPatientHeight(int height) {
        inputEditFieldPatientHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }

    public TreatmentPlanLinksPage setInputEditFieldPatientWeight(int weight) {
        inputEditFieldPatientWeight.shouldBe(visible).sendKeys(String.valueOf(weight));
        return this;
    }

    public TreatmentPlanLinksPage setSelectEditFieldTreatmentIssues(TreatmentIssues treatmentIssues) {
        selectEditFieldTreatmentIssues.shouldBe(visible).selectOptionContainingText(treatmentIssues.getText());
        return this;
    }

    public TreatmentPlanLinksPage clickOnTreatmentIssuesAddButton() {
        inputEditFieldTreatmentIssuesAddButton.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage assertThatTreatmentIssueAddedOrNot() {
        trLongTermComplicationsRemove.shouldBe(visible);
        return this;
    }

    public TreatmentPlanLinksPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage clickOnLinkImportTreatmentPlan() throws InterruptedException {
        Thread.sleep(3000);
        linkImportTreatmentPlan.shouldBe(visible).click();
        Thread.sleep(3000);
        Selenide.switchTo().window(2);
        return this;
    }

    public TreatmentPlanLinksPage switchBackMainWindow() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        return this;
    }

    public TreatmentPlanLinksPage clickLinkTodayOfTreatmentPlan() {
        linkToday.shouldBe(visible).click();
        Selenide.switchTo().window(3);
        return this;
    }

    public TreatmentPlanLinksPage getDayOfTheTodayTreatment() {
        DAY = Integer.parseInt(dayOfTheTodayTreatment.shouldBe(visible).getText());
        Selenide.switchTo().window(3);
        return this;
    }

    public TreatmentPlanLinksPage getTheFirstMedicine() {
        firstMed = medicineOne.shouldBe(visible).getText();
        return this;
    }

    public TreatmentPlanLinksPage getTheThirdMedicine() {
        thirdMed = medicineThree.shouldBe(visible).getText();
        return this;
    }

    public TreatmentPlanLinksPage getTimeOne() {
        firstTime = timeOne.shouldBe(visible).getText();
        return this;
    }

    public TreatmentPlanLinksPage getTimeTwo() {
        secondTime = timeTwo.shouldBe(visible).getText();
        return this;
    }

    public TreatmentPlanLinksPage clickOnLinkOverall() {
        linkOverall.shouldBe(visible).click();
        Selenide.switchTo().window(4);
        return this;
    }

    public TreatmentPlanLinksPage assertLinkFirstMedInOverallPage() {
        linkFirstMedInOverallPage.shouldBe(visible).shouldHave(Condition.text(firstMed));
        return this;
    }

    public TreatmentPlanLinksPage assertThatTimeInOverallPage() {
        timeInOverallPage.shouldBe(visible).shouldHave(Condition.text(firstTime));
        return this;
    }

    public TreatmentPlanLinksPage setInputEditFieldDayTreatment() {
        inputEditFieldDayTreatment.shouldBe(visible).setValue(String.valueOf(DAY));
        return this;
    }

    public TreatmentPlanLinksPage clickOnApplyButton() {
        inputEditApplyButton.shouldBe(visible).click();
        return this;
    }

    public TreatmentPlanLinksPage createTreatmentPlan() {
        PatientData patientData = PatientData.getData();
        UserData userData = UserData.getData();
        this.clickOnLinkTabTreatmentSummary();
        this.clickOnLinkAddNewTreatmentSummary();
        this.enterTheInputTitle(patientData.getTitle());
        this.setSelectEditFieldTreatsumRegimen("Old Treatment Plans");
        this.setSelectEditFieldTreatsumRegimen2(userData.getOldTreatmentPlan());
        this.setTreatmentStartDate(patientData.getDateForComplication());
        this.setTreatementEndDate(userData.getFutureDateFollowUp());
        this.setTreatementEndDate(userData.getFutureDateFollowUp());
        this.setInputEditFieldPatientHeight(Integer.parseInt("80"));
        this.setInputEditFieldPatientWeight(userData.getWeight());
/*      this.setSelectEditFieldTreatmentIssues(patientData.getTreatmentIssues());
        this.clickOnTreatmentIssuesAddButton();
        this.assertThatTreatmentIssueAddedOrNot();*/
        this.clickOnSaveButton();
        return this;
    }
}