package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.AddTheCreatedBloodProductInTheTransactionPage;
import com.jagriti.bmtplus.pages.patients.patients.data.*;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.jagriti.bmtplus.pages.miscellaneous.AddNewDonorForEbbPage.donorCode;
import static com.jagriti.bmtplus.pages.miscellaneous.ScanTheBloodProductPage.IpNumber;

public class AddNewPatientPage extends Page<AddNewPatientPage> {

    public static String patientRegID;

    public static String patientRegIDForReUse;

    public static String patientUHID;

    final static String DUPLICATE_IP_NUMBER = "23896201687900";

    final static String ERROR_MESSAGE_FOR_DUPLICATE_UHID = "Duplicate UHID found - 23896201687900";

    final static String ERROR_MESSAGE_FOR_UHID = "UHID field is required.";

    final static String ERROR_MESSAGE_FOR_CAUSE_OF_DEATH = "Other causes of death needs to be specified.";

    protected AddNewPatientPage() {
        super(AddNewPatientPage.class);
    }

    @As("selectEditFieldPatientDisease")
    private SelenideElement selectEditFieldPatientDisease = $("select[id='edit-field-patient-disease-und']");

    @As("selectEditGroupRefUnd")
    private SelenideElement centerField = $("select[id='edit-og-group-ref-und']");

    @As("linkBasicDetails")
    private SelenideElement linkBasicDetails = $("li[class$='horizontal-tab-button-1'] a");

    @As("inputEditFieldPatientName")
    private SelenideElement inputEditFieldPatientName = $("input[id='edit-field-patient-name-und-0-value']");

    @As("inputEditFieldPatientUhid")
    private SelenideElement inputEditFieldPatientUhid = $("input[id='edit-field-patient-uhid-und-0-value']");


    @As("inputEditFieldPatientDate")
    private SelenideElement inputEditFieldPatientDate = $("input[id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldPatientGender")
    private SelenideElement inputEditFieldPatientGender = $("input[id='edit-field-patient-gender-und-male']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("getInputEditFieldPatientName")
    private SelenideElement getInputEditFieldPatientName = $x("(//*[@class=\"field-items\"])[2]");

    @As("selectEditFieldPatientReligion")
    private SelenideElement selectEditFieldPatientReligion = $("select[id='edit-field-patient-religion-und']");

    @As("selectCountry")
    private SelenideElement selectCountry = $("select[id='edit-field-patient-address-und-0-country']");

    @As("inputEditFieldPatientPhone")
    private SelenideElement inputEditFieldPatientPhone = $("input[id='edit-field-patient-phone-und-0-value']");

    @As("inputEditFieldPatientEmail")
    private SelenideElement inputEditFieldPatientEmail = $("input[id='edit-field-patient-email-und-0-email']");

    @As("selectEditFieldPatientReg")
    private SelenideElement selectEditFieldPatientReg = $("select[id='edit-field-patient-reg-complete-und']");

    @As("linkMedicalDetails")
    private SelenideElement linkMedicalDetails = $("li[class$='first'] a");

    @As("selectEditFieldPatientHla")
    private SelenideElement selectEditFieldPatientHla = $("select[id='edit-field-patient-hla-status-und']");

    @As("selectEditFieldPatientHla2")
    private SelenideElement selectEditFieldPatientHla2 = $("select[id='edit-field-patient-hla-conf-status-und']");

    @As("selectEditFieldPatientRisk")
    private SelenideElement selectEditFieldPatientRisk = $("select[id='edit-field-patient-risk-factor-und']");

    @As("selectEditFieldPatientReferral")
    private SelenideElement selectEditFieldPatientReferral = $("select[id='edit-field-patient-referral-und']");

    @As("inputEditFieldPatientProposed")
    private SelenideElement inputEditFieldPatientProposed = $("input[id='edit-field-patient-proposed-tx-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldPatientScheduling")
    private SelenideElement inputEditFieldPatientScheduling = $("input[id='edit-field-patient-scheduling-remark-und-0-value']");

    @As("linkOfCIBMTR")
    private SelenideElement linkOfCIBMTR = $("li[class*='horizontal-tab-button-3'] a");

    @As("selectEditFieldPatientEthnicity")
    private SelenideElement selectEditFieldPatientEthnicity = $("select[id='edit-field-patient-ethnicity-und']");

    @As("selectEditFieldPatientRace")
    private SelenideElement selectEditFieldPatientRace = $("select[id='edit-field-patient-race-und']");

    @As("selectEditFieldPatientRace2")
    private SelenideElement selectEditFieldPatientRace2 = $("select[id='edit-field-patient-race-detail-und']");

    @As("selectEditFieldListYes")
    private SelenideElement selectEditFieldListYes = $("select[id='edit-field-list-yes-no-und']");

    @As("selectEditFieldListYes2")
    private SelenideElement selectEditFieldListYes2 = $("select[id='edit-field-list-yes-no-2-und']");

    @As("liSevereThalassemiaMajorIntermedia")
    private SelenideElement liSevereThalassemiaMajorIntermedia = $x("(//*[@class=\"field-item even\"])[7]");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("errorMessageUHIDField")
    private SelenideElement errorMessageUHIDField = $("div[class^='messages error']");

    @As("linkPatients")
    private SelenideElement linkPatients = $(byText("Patients"));

    @As("linkAddNewPatient")
    private SelenideElement linkAddNewPatient = $("a.btn.btn-default.btn-sm");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    @As("inputEditFieldResearchUnd")
    private SelenideElement inputEditFieldResearchUnd = $("input[id='edit-field-cibmtr-research-id-und-0-value']");

    @As("inputRegistrationDate")
    private SelenideElement inputRegistrationDate = $("input[id='edit-field-patient-registration-date-und-0-value-datepicker-popup-0']");

    @As("selectFieldPrimaryCauseOfDeath")
    public SelenideElement selectFieldPrimaryCauseOfDeath = $("#edit-field-patient-death-causes-und");

    @As("selectEditFieldSecondCauseOfDeath")
    public SelenideElement selectEditFieldSecondCauseOfDeath = $("#edit-field-secondary-cause-of-death-und");

    @As("selectEditFieldPatientStudy")
    private SelenideElement selectEditFieldPatientStudy = $("#edit-field-patient-study-category-und");


    public AddNewPatientPage setSelectEditFieldPatientDisease(Disease disease) {
        selectEditFieldPatientDisease.shouldBe(visible).selectOptionContainingText(disease.getText());
        return this;
    }

    /*For Negative Scenario*/
    public AddNewPatientPage setSelectEditFieldPatientDisease(String disease) {
        selectEditFieldPatientDisease.shouldBe(visible).selectOptionContainingText(disease);
        return this;
    }

    public AddNewPatientPage assertThatDiseaseAssignedAsSevereThalassemia() {
        String captureTheDisease = liSevereThalassemiaMajorIntermedia.shouldBe(visible).getText();
        liSevereThalassemiaMajorIntermedia.shouldBe(visible).shouldHave(Condition.exactText(captureTheDisease));
        return this;
    }

    public AddNewPatientPage setSelectCentre(String centre) {
        centerField.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }

    public AddNewPatientPage clickOnLinkBasicDetails() {
        linkBasicDetails.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientName(String name) {
        inputEditFieldPatientName.shouldBe(visible).setValue(name);
        return this;
    }

    /*For Negative scenario*/
    public AddNewPatientPage clearThePatientName() {
        inputEditFieldPatientName.shouldBe(visible).clear();
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientUHID(String UHID) {
        inputEditFieldPatientUhid.shouldBe(visible).setValue(UHID);
        return this;
    }

    /*For Negative scenario*/
    public AddNewPatientPage clearTheUHIDField() {
        inputEditFieldPatientUhid.shouldBe(visible).clear();
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientDate(String dateAsString) {
        inputEditFieldPatientDate.shouldBe(visible).sendKeys(dateAsString);
        inputEditFieldPatientDate.sendKeys(Keys.ENTER);
        return this;
    }

    public AddNewPatientPage clearTheInputEditFieldPatientDate() {
        inputEditFieldPatientDate.shouldBe(visible).clear();
        return this;
    }

    public AddNewPatientPage clickOnRadioButtonOfGender() {
        inputEditFieldPatientGender.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage assertThePatientName(PatientData patientData) {
        String patientName = patientData.getName();
        getInputEditFieldPatientName.shouldBe(visible).shouldHave(Condition.exactText(patientName));
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientReligion(Religion religion) {
        selectEditFieldPatientReligion.shouldBe(visible).selectOptionByValue(religion.getValue());
        return this;
    }

    public AddNewPatientPage setSelectCountry(Country country) {
        selectCountry.shouldBe(visible).selectOptionByValue(country.getValue());
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientPhone(String phone) {
        inputEditFieldPatientPhone.shouldBe(visible).setValue(phone);
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientEmail(String Email) {
        inputEditFieldPatientEmail.shouldBe(visible).setValue(Email);
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientReg(RegistrationComplete registrationComplete) {
        selectEditFieldPatientReg.shouldBe(visible).selectOptionByValue(registrationComplete.getValue());
        return this;
    }

    public AddNewPatientPage clickOnLinkMedicalDetails() {
        linkMedicalDetails.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientHla(HLAStatus hla) {
        selectEditFieldPatientHla.shouldBe(visible).selectOptionByValue(hla.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientHla2(HLAConfirmatoryTypingStatus hla2) {
        selectEditFieldPatientHla2.shouldBe(visible).selectOptionByValue(hla2.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientRisk(RiskGroup risk) {
        selectEditFieldPatientRisk.shouldBe(visible).selectOptionContainingText(risk.getText());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientReferral(Referral referral) {
        selectEditFieldPatientReferral.shouldBe(visible).selectOptionByValue(referral.getValue());
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientProposed(String dateAsString) {
        inputEditFieldPatientProposed.shouldBe(visible).sendKeys(dateAsString);
        return this;
    }

    public AddNewPatientPage setInputEditFieldPatientScheduling() {
        inputEditFieldPatientScheduling.shouldBe(visible).setValue("All details are available after generate the patient ID");
        return this;
    }

    public AddNewPatientPage clickOnLinkOfCIBMTR() {
        linkOfCIBMTR.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientEthnicity(Ethnicity ethnicity) {
        selectEditFieldPatientEthnicity.shouldBe(visible).selectOptionByValue(ethnicity.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientRace(Race race) {
        selectEditFieldPatientRace.shouldBe(visible).selectOptionByValue(race.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientRace2(RaceDetail raceDetail) {
        selectEditFieldPatientRace2.shouldBe(visible).selectOptionByValue(raceDetail.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldListYes(IsThePatientParticipatingInAClinicalTrial isThePatientParticipatingInAClinicalTrial) {
        selectEditFieldListYes.shouldBe(visible).selectOptionByValue(isThePatientParticipatingInAClinicalTrial.getValue());
        return this;
    }

    public AddNewPatientPage setSelectEditFieldListYes2(IsThePatientParticipatingInAClinicalTrial isThePatientParticipatingInAClinicalTrial) {
        selectEditFieldListYes2.shouldBe(visible).selectOptionByValue(isThePatientParticipatingInAClinicalTrial.getValue());
        return this;
    }

    public AddNewPatientPage captureThePatientID() {
        patientRegID = patientID.shouldBe(visible).getText();
        return this;
    }

    /*For UHID Field of patient form*/
    public AddNewPatientPage captureThePatientUHIDID(PatientData patientData) {
        patientUHID = patientID.shouldBe(visible).getText();
        patientID.shouldBe(visible).shouldHave(Condition.text(patientData.getUhid()));
        return this;
    }

    public AddNewPatientPage captureThePatientIDForReUse() {
        patientRegIDForReUse = patientID.shouldBe(visible).getText();
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageOfUHIDField() {
        errorMessageUHIDField.shouldBe(visible).shouldHave(Condition.text(ERROR_MESSAGE_FOR_UHID));
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageOfCauseOfDeathFields() {
        errorMessageUHIDField.shouldBe(visible).shouldHave(Condition.text(ERROR_MESSAGE_FOR_CAUSE_OF_DEATH));
        return this;
    }

    public AddNewPatientPage clickOnLinkPatients() {
        linkPatients.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage clickOnLinkAddNewPatient() {
        linkAddNewPatient.shouldBe(visible).click();
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageMissingMandatoryFields() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Name field is required.\n" +
                "Disease field is required."));
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageDuplicateUhid() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text(CONFIG.getString("DUPLICATE_PATIENT_ERROR")));
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageOfFutureDateOfBirth() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Patient date of birth should not be set to a future date.\n" +
                "Patient registration date should not be less than patient dob."));
        return this;
    }

    public AddNewPatientPage setInputEditFieldResearchUnd(String researchId) {
        inputEditFieldResearchUnd.shouldBe(visible).setValue(researchId);
        return this;
    }

    public AddNewPatientPage setInputRegistrationDate(String registrationDate) {
        inputRegistrationDate.shouldBe(visible).setValue(registrationDate);
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageOfDuplicateUHIDField() {
        errorMessageUHIDField.shouldBe(visible).shouldHave(Condition.text(ERROR_MESSAGE_FOR_DUPLICATE_UHID));
        return this;
    }

    public AddNewPatientPage assertThatErrorMessageOfDuplicateBloodProduct() {
        errorMessageUHIDField.shouldBe(visible).shouldHave(Condition.text(ERROR_MESSAGE_FOR_DUPLICATE_UHID));
        return this;
    }

    public AddNewPatientPage setSelectFieldPrimaryCauseOfDeath(String primaryCauseOfDeath) {
        selectFieldPrimaryCauseOfDeath.shouldBe(visible).selectOptionContainingText(primaryCauseOfDeath);
        return this;
    }

    public AddNewPatientPage setSelectEditFieldSecondCauseOfDeath(String secondCauseOfDeath) {
        selectEditFieldSecondCauseOfDeath.shouldBe(visible).selectOptionContainingText(secondCauseOfDeath);
        return this;
    }

    public AddNewPatientPage setSelectEditFieldPatientStudy(StudyCategory studyCategory) {
        selectEditFieldPatientStudy.shouldBe(visible).selectOptionContainingText(studyCategory.getText());
        return this;
    }

    public AddNewPatientPage createPatient() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        PatientData patientData = PatientData.getData();
        this.setSelectEditFieldPatientDisease(patientData.getDisease());
        this.setSelectEditFieldPatientStudy(patientData.getStudyCategory());
        this.setSelectCentre(patientData.getCentre());
        this.clickOnLinkBasicDetails();
        this.setInputEditFieldPatientName(patientData.getName());
        this.setInputEditFieldPatientUHID(patientData.getUhid());
        // Enable the setting of capturing the UHID field then this method is worked of the test center TSA (Uncomment the line when enable the setting)
        this.setInputEditFieldPatientDate(patientData.getDateOfBirth());
        this.clickOnRadioButtonOfGender();
        this.clickOnLinkOfCIBMTR();
        this.setSelectEditFieldPatientRace(patientData.getRace());
        this.setSelectEditFieldPatientRace2(patientData.getRaceDetail());
        this.clickOnSaveButton();
        this.assertThePatientName(patientData);
        this.captureThePatientID();
        return this;
    }

    public AddNewPatientPage createPatientForHapESearch() {
        PatientData patientData = PatientData.getData();
        this.setSelectEditFieldPatientDisease("Acute Lymphoblastic Leukemia");
        this.setSelectCentre(patientData.getCentre());
        this.clickOnLinkBasicDetails();
        this.setInputEditFieldPatientName(patientData.getName());
        this.setInputEditFieldPatientUHID(patientData.getUhid());
        // Enable the setting of capturing the UHID field then this method is worked of the test center TSA (Uncomment the line when enable the setting)
        this.setInputEditFieldPatientDate(patientData.getDateOfBirth());
        this.clickOnRadioButtonOfGender();
        this.clickOnLinkOfCIBMTR();
        this.setSelectEditFieldPatientRace(patientData.getRace());
        this.setSelectEditFieldPatientRace2(patientData.getRaceDetail());
        this.clickOnSaveButton();
        this.assertThePatientName(patientData);
        return this;
    }

    public AddNewPatientPage createPatientForProductTypeTest() {
        PatientData patientData = PatientData.getData();
        this.setSelectEditFieldPatientDisease(patientData.getDisease());
        this.setSelectCentre(patientData.getCentre());
        this.clickOnLinkBasicDetails();
        this.setInputEditFieldPatientName(patientData.getName());
        //this.setInputEditFieldPatientUHID(patientData.getUhid());
        // Enable the setting of capturing the UHID field then this method is worked of the test center TSA (Uncomment the line when enable the setting)
        this.setInputEditFieldPatientDate(patientData.getDateOfBirth());
        this.clickOnRadioButtonOfGender();
        this.clickOnLinkOfCIBMTR();
        this.setInputEditFieldResearchUnd("1234");
        this.clickOnSaveButton();
        this.assertThePatientName(patientData);
        this.captureThePatientID();
        return this;
    }

    public AddNewPatientPage createPatientForQRCodeData() {
        PatientData patientData = PatientData.getData();
        this.setSelectEditFieldPatientDisease(patientData.getDisease());
        this.setSelectCentre(patientData.getCentre());
        this.clickOnLinkBasicDetails();
        this.setInputEditFieldPatientName(patientData.getName());
        this.setInputEditFieldPatientUHID(IpNumber);
        // Enable the setting of capturing the UHID field then this method is worked of the test center TSA (Uncomment the line when enable the setting)
        this.setInputEditFieldPatientDate(patientData.getDateOfBirth());
        this.clickOnRadioButtonOfGender();
        this.clickOnLinkOfCIBMTR();
        this.setInputEditFieldResearchUnd("1234");
        this.clickOnSaveButton();
        this.assertThePatientName(patientData);
        this.captureThePatientID();
        return this;
    }

    public AddNewPatientPage createPatientForQRCodeDataInNegativeScenario() {
        PatientData patientData = PatientData.getData();
        this.setSelectEditFieldPatientDisease(patientData.getDisease());
        this.setSelectCentre(patientData.getCentre());
        this.clickOnLinkBasicDetails();
        this.setInputEditFieldPatientName(patientData.getName());
        this.setInputEditFieldPatientUHID(DUPLICATE_IP_NUMBER);
        // Enable the setting of capturing the UHID field then this method is worked of the test center TSA (Uncomment the line when enable the setting)
        this.setInputEditFieldPatientDate(patientData.getDateOfBirth());
        this.clickOnRadioButtonOfGender();
        this.clickOnLinkOfCIBMTR();
        this.setInputEditFieldResearchUnd("1234");
        this.clickOnSaveButton();
        return this;
    }
}
