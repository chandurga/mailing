package com.jagriti.bmtplus.pages.QMTools.logs;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.QMTools.logs.data.LogStatus;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/log
@Slf4j
public class AddNewLogPage extends Page<AddNewLogPage> {
    public static String labIdForSurveillance ;

    protected AddNewLogPage() {
        super(AddNewLogPage.class);
    }

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("selectEditFieldLogType")
    private SelenideElement selectEditFieldLogType = $("select[id='edit-field-log-type-und']");

    @As("selectEditFieldLogStatus")
    private SelenideElement selectEditFieldLogStatus = $("select[id='edit-field-log-status-und']");

    @As("selectEditFieldCloseDate")
    private SelenideElement selectEditFieldCloseDate = $("input[id='edit-field-closure-date-und-0-value-datepicker-popup-0']");

    @As("selectEditGroupRefUnd")
    private SelenideElement selectEditGroupCenter = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkOrderNewTest")
    private SelenideElement linkOrderNewTest = $(byText("Order New Test"));

    @As("inputDateOfSampleCollection")
    private SelenideElement inputDateOfSampleCollection = $("input[id='edit-field-tr-sample-sent-time-und-0-value-datepicker-popup-0']");

    @As("inputTimeOfSampleCollection")
    private SelenideElement inputTimeOfSampleCollection = $("input[id='edit-field-tr-sample-sent-time-und-0-value-timeEntry-popup-1']");

    @As("selectEditFieldInvestigationsUnd")
    private SelenideElement selectEditFieldInvestigationsUnd = $("select[id='edit-field-tr-investigations-und']");

    @As("textareaEditFieldInfFor")
    private SelenideElement inoutClinicalInfoForLab = $("#edit-field-tr-inf-for-lab-und-0-value");

    @As("linkTestReportJul")
    private SelenideElement linkTestReportJul = $("td[class$='views-field-title'] a");

    @As("linkClickSyncLabRequest")
    private SelenideElement linkClickSyncLabRequest = $("a[class$='flag-link-normal']");

    @As("logId")
    private SelenideElement logId = $x("(//*[@class=\"field-item even\"])[5]");

    @As("clinicalData")
    private SelenideElement clinicalData = $("section[class*='field-name-field-tr-inf-for-lab'] div[class='field-items']");

    @As("linkTestRequests")
    private SelenideElement linkTestRequests=$x("(//*[text()=\"Test Requests\"])[2]");


    @As("getTheLogId")
    private SelenideElement getTheLogId = $("div[class*='field--name-field-lab-request-id'] div[class='field--item']");

    @As("linkView")
    private SelenideElement linkView = $(byText("view"));

    @As("fieldItemOfClinicalItem")
    private SelenideElement fieldItemOfClinicalItem = $("div[class*='field--name-field-tr-clinical-information'] div[class='field--item']");



    public AddNewLogPage enterTheTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }
    public AddNewLogPage setSelectEditFieldLogType(String  logType) {
        selectEditFieldLogType.shouldBe(visible).selectOptionContainingText(logType);
        return this;
    }
    public AddNewLogPage setSelectEditFieldLogStatus(LogStatus logStatus) {
        selectEditFieldLogStatus.shouldBe(visible).selectOptionContainingText(logStatus.getValue());
        return this;
    }
    public AddNewLogPage setSelectEditFieldCloseDateForSomeOfLogStatus() {
        String logStatus = selectEditFieldLogStatus.shouldBe(visible).getText();
        switch (logStatus){
            case "Discarded":
                selectEditFieldCloseDate.shouldBe(visible).setValue(DateTimeUtils.getFormattedDateForConsentForm());
            case "Disposed":
                selectEditFieldCloseDate.shouldBe(visible).setValue(DateTimeUtils.getFormattedDateForConsentForm());
            case "Sold":
                selectEditFieldCloseDate.shouldBe(visible).setValue(DateTimeUtils.getFormattedDateForConsentForm());
            case "Lost":
                selectEditFieldCloseDate.shouldBe(visible).setValue(DateTimeUtils.getFormattedDateForConsentForm());
        }
        return this;
    }
    public AddNewLogPage setSelectCenterAsTestCenter(String center) {
        selectEditGroupCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public AddNewLogPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewLogPage clickOnOrderNewTestButton() {
        linkOrderNewTest.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public AddNewLogPage setInputDateOfSampleCollection(String date) {
        inputDateOfSampleCollection.shouldBe(visible).setValue(date);
        return this;
    }
    public AddNewLogPage setInputTimeOfSampleCollection(String time) {
        inputTimeOfSampleCollection.shouldBe(visible).setValue(time);
        return this;
    }
    public AddNewLogPage setSelectEditFieldInvestigationsUnd(String investigations) {
        selectEditFieldInvestigationsUnd.shouldBe(visible).selectOptionContainingText(investigations);
        return this;
    }
    public AddNewLogPage enterTheDataForClinicalInfoForLab(String area) {
        inoutClinicalInfoForLab.shouldBe(visible).setValue(area);
        return this;
    }
    public AddNewLogPage clickOnLinkTestReportOfTest() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(3));
        linkTestReportJul.shouldBe(visible).click();
        return this;
    }
    public AddNewLogPage clickOnLinkClickSyncLabRequestButton() {
        linkClickSyncLabRequest.shouldBe(visible).click();
        return this;
    }
    public AddNewLogPage getTheLogId() {
        labIdForSurveillance = logId.shouldBe(visible).getText();
        log.info(labIdForSurveillance);
        Selenide.open("http://devlabs.sankalpindia.net/");
        return this;
    }
    public AddNewLogPage getTheClinicalData() {
        clinicalData.shouldBe(visible).shouldHave(Condition.text("testing the field"));
        return this;
    }
    public AddNewLogPage clickOnLinkTestRequests() {
        linkTestRequests.shouldBe(visible).click();
        return this;
    }
    public AddNewLogPage assertThatLabId() {
        getTheLogId.scrollIntoView(true).shouldHave(Condition.text(labIdForSurveillance));
        return this;
    }
    public AddNewLogPage clickOnLinkView() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public void assertFieldItemOfClinicalItem() {
        fieldItemOfClinicalItem.shouldBe(visible).shouldHave(Condition.text("testing the field"));
    }
}