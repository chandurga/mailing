package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.data.CMVorHIV;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.patients.patients.AddNewPatientPage.patientRegID;

public class CreateTestReportForClinicalCoursePage extends Page<CreateTestReportForClinicalCoursePage> {
    protected CreateTestReportForClinicalCoursePage() {
        super(CreateTestReportForClinicalCoursePage.class);
    }

    @As("linkOrderNewTest")
    private SelenideElement linkOrderNewTest = $(byText("Order New Test"));

    @As("sampleCollectionDate")
    private SelenideElement sampleCollectionDate = $("input[id='edit-field-tr-sample-sent-time-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldSampleSentTime")
    private SelenideElement inputEditFieldSampleSentTime = $("input[id='edit-field-tr-sample-sent-time-und-0-value-timeEntry-popup-1']");

    @As("selectEditFieldInvestigationsUnd")
    private SelenideElement selectEditFieldInvestigationsUnd = $("select[id='edit-field-tr-investigations-und']");

    @As("inputEditFieldUndValueOfWBC")
    private SelenideElement inputEditFieldUndValueOfWBC = $("input[id='edit-field-tr-wbc-und-0-value']");

    @As("inputEditFieldANC")
    private SelenideElement inputEditFieldANC = $("input[id='edit-field-tr-anc-und-0-value']");

    @As("inputEditFieldALC")
    private SelenideElement inputEditFieldALC = $("input[id='edit-field-tr-alc-und-0-value']");

    @As("inputEditFieldAMC")
    private SelenideElement inputEditFieldAMC = $("input[id='edit-field-tr-amc-und-0-value']");

    @As("inoutEditFieldHB")
    private SelenideElement inoutEditFieldHB = $("input[id='edit-field-tr-hb-und-0-value']");

    @As("inputEditFieldUndValueMCV")
    private SelenideElement inputEditFieldUndValueMCV = $("input[id='edit-field-tr-mcv-und-0-value']");

    @As("inputEditFieldPlateletsUnd")
    private SelenideElement inputEditFieldPlateletsUnd = $("input[id='edit-field-tr-platelets-und-0-value']");

    @As("inputEditFieldReticulocyteCount")
    private SelenideElement inputEditFieldReticulocyteCount = $("input[id='edit-field-tr-reticulocyte-count-und-0-value']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages']");

    @As("linkViewOfTheClinicalCourse")
    private SelenideElement linkViewOfTheClinicalCourse = $("td[class$='views-field-title'] a");


    public CreateTestReportForClinicalCoursePage clickOnLinkViewOfTheClinicalCourse() {
        linkViewOfTheClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForClinicalCoursePage clickOnOrderNewTest() {
        linkOrderNewTest.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public CreateTestReportForClinicalCoursePage setSampleCollectionDate(String dateAsString) {
        sampleCollectionDate.shouldBe(visible).setValue(dateAsString).sendKeys(Keys.ENTER);
        return this;
    }
    /*For Negative scenario*/
    public CreateTestReportForClinicalCoursePage setInvalidDateForSampleCollection(String invalidDate) {
        sampleCollectionDate.shouldBe(visible).setValue(invalidDate);
        sampleCollectionDate.sendKeys(Keys.ENTER);
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldSampleSentTime(String time) {
        inputEditFieldSampleSentTime.shouldBe(visible).setValue(time);
        return this;
    }
    public CreateTestReportForClinicalCoursePage setSelectEditFieldInvestigationsUnd(String investigation) {
        selectEditFieldInvestigationsUnd.shouldBe(visible).selectOptionContainingText(investigation);
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldUndValueOfWBC(int WBC) {
        inputEditFieldUndValueOfWBC.shouldBe(visible).setValue(String.valueOf(WBC));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldANC(int ANC) {
        inputEditFieldANC.shouldBe(visible).setValue(String.valueOf(ANC));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldALC(int ALC) {
        inputEditFieldALC.shouldBe(visible).setValue(String.valueOf(ALC));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldAMC(int AMC) {
        inputEditFieldAMC.shouldBe(visible).setValue(String.valueOf(AMC));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInoutEditFieldHB(int HB) {
        inoutEditFieldHB.shouldBe(visible).setValue(String.valueOf(HB));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldUndValueMCV(int MCV) {
        inputEditFieldUndValueMCV.shouldBe(visible).setValue(String.valueOf(MCV));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldPlateletsUnd(int platelets) {
        inputEditFieldPlateletsUnd.shouldBe(visible).setValue(String.valueOf(platelets));
        return this;
    }
    public CreateTestReportForClinicalCoursePage setInputEditFieldReticulocyteCount(double ReticulocyteCount) {
        inputEditFieldReticulocyteCount.shouldBe(visible).setValue(String.valueOf(ReticulocyteCount));
        return this;
    }
    public CreateTestReportForClinicalCoursePage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public void assertThatSuccessMessageForTestReport() {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text(patientRegID+" - Day"));
    }
    public CreateTestReportForClinicalCoursePage assertThatErrorMessageForCreateTestReport() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Investigations field is required."));
        return this;
    }
    public CreateTestReportForClinicalCoursePage assertThatErrorMessageForDateAndTimeOFCreateTestReport() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Error message\n" + "The value input for field Date and Time of Sample Collection is invalid:\n" +
                "The value 19-Jun-2023 1533 does not match the expected format.\n" +
                "Investigations field is required."));
        return this;
    }

    private UserData userData;

    @As("spanShowInfectiousDiseases")
    private SelenideElement spanShowInfectiousDiseases = $(byText("Infectious Diseases"));

    @As("selectEditFieldCMV")
    private SelenideElement selectEditFieldCMV = $("select[id='edit-field-gii-cmv-und']");

    @As("selectEditFieldHIV")
    private SelenideElement selectEditFieldHIV = $("select[id='edit-field-gii-hiv-und']");

    
    
    

    public CreateTestReportForClinicalCoursePage clickOnInfectiousDiseasesTab() {
        spanShowInfectiousDiseases.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForClinicalCoursePage setSelectEditFieldCMV(CMVorHIV cmVorHIV) {
        selectEditFieldCMV.shouldBe(visible).selectOptionByValue(cmVorHIV.getvalue());
        return this;
    }
    public CreateTestReportForClinicalCoursePage setSelectEditFieldHIV(CMVorHIV cmVorHIV) {
        selectEditFieldHIV.shouldBe(visible).selectOptionByValue(cmVorHIV.getvalue());
        return this;
    }

    public CreateTestReportForClinicalCoursePage createTestReport(){
        userData = UserData.getData();
        this.clickOnOrderNewTest();
        this.setSampleCollectionDate(userData.getTodayDate());
        this.setInputEditFieldSampleSentTime(userData.getPresentTime());
        this.setSelectEditFieldInvestigationsUnd("25 OH Cholecalciferol (D2+D3)@Associate2461");
        this.setInputEditFieldUndValueOfWBC(userData.getWbc());
        this.setInputEditFieldANC(userData.getAnc());
        this.setInputEditFieldALC(userData.getAlc());
        this.setInputEditFieldAMC(userData.getAmc());
        this.setInoutEditFieldHB(userData.getHb());
        this.setInputEditFieldUndValueMCV(userData.getMcv());
        this.setInputEditFieldPlateletsUnd(userData.getPlatelets());
        this.setInputEditFieldReticulocyteCount(userData.getReticulocyte());
        this.clickOnInfectiousDiseasesTab();
        this.setSelectEditFieldCMV(userData.getCmVorHIV());
        this.setSelectEditFieldHIV(userData.getCmVorHIV());
        this.clickOnSaveButton();
        return this;
    }
}