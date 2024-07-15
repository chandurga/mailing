package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb.*;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Slf4j
public class AddNewDonorForEbbPage extends Page<AddNewDonorForEbbPage> {

    public static String donorCode;
    protected AddNewDonorForEbbPage() {
        super(AddNewDonorForEbbPage.class);
    }

    @As("selectTypeOfDonor")
    private SelenideElement selectTypeOfDonor = $("select[id='edit-field-donor-entry-type']");

    @As("donorRegistrationInput")
    private SelenideElement donorRegistrationInput =
            $("input[id='edit-field-donor-registration-id-0-value']");

    @As("donorNameInput")
    private SelenideElement donorNameInput = $("input[id='edit-field-donor-name-0-value']");

    @As("bloodGroupTypeDropDown")
    private SelenideElement bloodGroupTypeDropDown = $("select[id='edit-field-blood-group']");

    @As("selectTypeDonorOccupation")
    private SelenideElement selectTypeDonorOccupation = $("select[id='edit-field-donor-occupation']");

    @As("donationLocationTypeDropDown")
    private SelenideElement genderTypeDropDown = $("select[id='edit-field-gender']");

    @As("donorRegistrationInput")
    private SelenideElement donationLocationTypeDropDown =
            $("select[id='edit-field-donor-donation-location']");

    @As("numberOfDonationTypeDropDown")
    private SelenideElement numberOfDonationTypeDropDown = $("#edit-field-number-of-donations");

    @As("selectStateType")
    private SelenideElement selectStateType =
            $("select[id='edit-field-address-0-address-administrative-area']");

    @As("ageOfTheDonor")
    private SelenideElement ageOfTheDonor = $("input[id='edit-field-age-0-value']");

    @As("medicalExaminationTab")
    private SelenideElement medicalExaminationTab =
            $(
                    "#node-donation-record-form > div.field-group-tabs-wrapper > div > ul > li:nth-child(2) > a");

    @As("weightInputValue")
    private SelenideElement weightInputValue = $("input[id='edit-field-weight-0-value']");

    @As("bloodPressureDiastolicInputValue")
    private SelenideElement bloodPressureSystolicInputValue =
            $("input[id='edit-field-bp-systolic-0-value']");

    @As("hemoglobinTestInputValue")
    private SelenideElement hemoglobinTestInputValue =
            $("select[data-drupal-selector='edit-field-hemoglobin-test']");

    @As("donorRegistrationInput")
    private SelenideElement bloodPressureDiastolicInputValue =
            $("input[id='edit-field-bp-diastolic-0-value']");

    @As("bloodCollectionDetailsTab")
    private SelenideElement bloodCollectionDetailsTab = $x("//*[text()='Blood Collection Details']");

    @As("dateCollectionInputField")
    private SelenideElement dateCollectionInputField =
            $("input[id='edit-field-date-of-collection-0-value-date']");

    @As("timeCollectionInputField")
    private SelenideElement timeCollectionInputField =
            $("input[id='edit-field-date-of-collection-0-value-time']");

    @As("typeOfBagTypeDropDown")
    private SelenideElement typeOfBagTypeDropDown = $("select[id='edit-field-type-of-bag']");

    @As("selectEditFieldComponentsPrepared")
    private SelenideElement selectOptionComponentsPrepared =
            $("select[data-drupal-selector='edit-field-components-to-be-prepared']");

    @As("submitButton")
    private SelenideElement submitButton = $("button[id='edit-submit']");

    @As("donorAddedMessage")
    private SelenideElement donorAddedMessage = $("h1[class='page-header'] span");

    @As("duplicateDonorRequestIdAlert")
    private SelenideElement duplicateDonorRequestIdAlert = $x("//*[@class='item item--message'][1]");

    @As("donorQuestionnaire")
    private SelenideElement donorQuestionnaireTab = $(byText("Donor Questionnaire"));

    @As("donorRequestErrorMessage")
    private SelenideElement donorRequestErrorMessages = $("ul[class$='comma-list']");

    @As("inputEditFieldAddressLocality")
    private SelenideElement inputFieldOfDistrict = $("input[id='edit-field-mobile-0-value']");

    @As("inputEditFieldMobileValue")
    private SelenideElement inputEditFieldMobileValue = $("input[id='edit-field-mobile-0-value']");

    @As("inputEditFieldAllowDuplicate")
    private SelenideElement inputEditFieldAllowDuplicate =
            $("input[id='edit-field-allow-duplicate-number-value']");

    @As("assertDonorInEligibleMessage")
    private SelenideElement donorInEligibleMessage = $x("//*[@class='item item--message'][1]");

    @As("checkBoxDiscardedYes")
    private SelenideElement checkBoxDiscardedYes = $("input[id='edit-field-discarded-yes']");

    @As("inputEditFieldDateDiscard")
    private SelenideElement inputEditFieldDateDiscard =
            $("input[id='edit-field-date-of-discard-0-value-date']");

    @As("reasonForDiscardEditField")
    private SelenideElement reasonForDiscardEditField =
            $("select[id='edit-field-reason-for-discard']");

    @As("createComponentsButton")
    private SelenideElement createComponentsButton =
            $("a[title$='Please click to create components']");

    @As("componentStatusText")
    private SelenideElement componentStatusText =
            $("td.views-field.views-field-field-component-status");

    @As("registrationIDText")
    private SelenideElement registrationIDText =
            $(
                    "#bootstrap-panel > div > div.field.field--name-field-donor-registration-id.field--type-string.field--label-inline > div.field--item");

    @As("componentStatus")
    private SelenideElement componentStatus = $("td.views-field.views-field-field-component-status");

    @As("addNewSerologyTestsButton")
    private SelenideElement addNewSerologyTestsButton = $("a[class$='btn-primary']");

    @As("selectEditFieldTestsTechnician")
    private SelenideElement selectEditFieldTestsTechnician =
            $("select[id='edit-field-tests-technician']");

    @As("verifySerologyButton")
    private SelenideElement verifySerologyButton = $("a[rel='nofollow']");

    @As("linkOfTheDonor")
    private SelenideElement linkOfTheDonor = $("a[hreflang='en']");

    @As("loadIcon")
    private SelenideElement loadIcon = $("span.input-group-addon");

    @As("inputEditFieldBagValue")
    private SelenideElement inputEditFieldBagValue = $("input[id='edit-field-bag-no-0-value']");

    @As("linkFirstCentre")
    private SelenideElement linkFirstCentre = $(byText("First Centre"));

    @As("userName")
    private SelenideElement userName = $("li[class='first '] a");

    @As("nonMandatoryCheckBox")
    private SelenideElement nonMandatoryCheckBox =
            $("#edit-field-centre-custom-settings-blood-group-non-mandatory-in-donation-record");

    @As("errorMessageWhileCreatingTheDonationRecord")
    private SelenideElement errorMessageWhileCreatingTheDonationRecord = $("ul[class$='comma-list']");

    @As("errorMessageInDonorField")
    private SelenideElement errorMessageInDonorField =
            $("div[class*='form-item-field-donor-name-0-value'] div[class*='alert-danger']");

    @As("errorMessageInCampLocationField")
    public SelenideElement errorMessageInCampLocationField =
            $("div[class*='form-item-field-blood-donation-camp-0-target-id'] div[class*='alert-danger']");

    @As("selectEditFieldDonationType")
    private SelenideElement selectEditFieldDonationType = $x("//*[@id=\"edit-field-donation-type\"]");

    @As("inputEditFieldDonorSegment")
    private SelenideElement inputEditFieldDonorSegment =
            $("input[id='edit-field-donor-segment-number-0-value']");

    @As("verifyBloodGroupButton")
    private SelenideElement verifyBloodGroupButton = $("a[title^='Verify']");

    @As("divErrorMessageForSegmentNumber")
    private SelenideElement divErrorMessageForSegmentNumber = $("div[class^='alert']");

    @As("inputEditFieldDifferentialCount")
    private SelenideElement inputEditFieldDifferentialCount =
            $("input[id='edit-field-wbc-differential-count-0-value']");

    @As("inputEditFieldSerumProteinLevel")
    private SelenideElement inputEditFieldSerumProteinLevel =
            $("#edit-field-serum-protein-level-0-value");

    @As("donorHeight")
    private SelenideElement donorHeight = $("input[id='edit-field-donor-height-0-value']");

    @As("inputToolHCT")
    private SelenideElement inputToolHCT = $("input[id='edit-field-donor-hct-0-value']");

    @As("inputPlateletCount")
    private SelenideElement inputPlateletCount =
            $("input[id='edit-field-donor-platelet-count-0-value']");

    @As("inputEditFieldNeutrophilCount")
    private SelenideElement inputEditFieldNeutrophilCount =
            $("input[id='edit-field-neutrophil-count-0-value']");

    @As("selectEditFieldDonorDoctor")
    private SelenideElement selectEditFieldDonorDoctor = $("#edit-field-donor-doctor");

    @As("selectDeferralStatus")
    private SelenideElement deferralStatus = $("select[data-original-title^='If']");

    @As("selectEditFieldDeferralReason")
    private SelenideElement selectEditFieldDeferralReason = $("#edit-field-deferral-reason");

    @As("linkNodeEdit")
    private SelenideElement linkNodeEdit = $(byText("Edit"));

    @As("linkToViewComponent")
    private SelenideElement linkToViewComponent = $("#block-views-block-dono-related-components-block-1 > div.form-group > div > div.view-content > table > tbody > tr:nth-child(2) > td.views-field.views-field-view-node > a");

    @As("editButton")
    private SelenideElement editButton = $(byText("Edit"));

    @As("inputComponentVolume")
    private SelenideElement inputComponentVolume = $("input[id='edit-field-quantity-0-value']");

    @As("crossMatchButton")
    private SelenideElement crossMatchButton = $("a[class*='btn-primary']");

    @As("selectEditFieldCrossmatchPatient")
    private SelenideElement selectEditFieldCrossmatchPatient = $("select[id='edit-field-crossmatch-patient']");

    @As("selectEditFieldCompatibility")
    private SelenideElement selectEditFieldCompatibility = $("select[id='edit-field-compatibility']");

    @As("selectEditFieldTechnician")
    private SelenideElement selectEditFieldTechnician = $("select[id='edit-field-er-technician']");

    @As("issueReserveButton")
    private SelenideElement issueReserveButton=$(byText("Issue/Reserve"));

    public AddNewDonorForEbbPage loadIconOfTypeOfBagWillDisappearAfterSelect() throws InterruptedException {
        loadIcon.shouldBe(disappear);
        Thread.sleep(5000);
        return this;
    }

    public AddNewDonorForEbbPage setSelectDonorTypeField(String typeOfDonor) {
        selectTypeOfDonor.shouldBe(visible).selectOptionByValue(typeOfDonor);
        return this;
    }

    public AddNewDonorForEbbPage setDonorRegistrationInput(String RegID) {
        donorRegistrationInput.shouldBe(visible).setValue(RegID);
        return this;
    }

    public AddNewDonorForEbbPage setDonorNameInput(String name) {
        donorNameInput.shouldBe(visible).setValue(name);
        return this;
    }

    /*For Negative scenario*/
    public AddNewDonorForEbbPage setDonorNameInput() {
        donorNameInput.shouldBe(visible).clear();
        return this;
    }

    public AddNewDonorForEbbPage selectBloodGroupDropDown(BloodGroupType bloodGroupType) {
        bloodGroupTypeDropDown.shouldBe(visible).selectOptionByValue(bloodGroupType.getValue());
        return this;
    }

    public AddNewDonorForEbbPage selectGenderDropDown(Gender gender) {
        genderTypeDropDown.shouldBe(visible).selectOptionByValue(gender.getValue());
        return this;
    }

    public AddNewDonorForEbbPage setSelectTypeDonorOccupation(Occupation occupation) {
        selectTypeDonorOccupation.shouldBe(visible).selectOptionContainingText(occupation.getText());
        return this;
    }

    public AddNewDonorForEbbPage setSelectStateType(State state) {
        selectStateType.shouldBe(visible).selectOptionByValue(state.getValue());
        return this;
    }

    public AddNewDonorForEbbPage selectInputFieldOfDistrict(String district) {
        inputFieldOfDistrict.shouldBe(visible).setValue(district);
        return this;
    }

    public AddNewDonorForEbbPage selectInputEditFieldMobileValue(String mobileValue) {
        inputEditFieldMobileValue.shouldBe(visible).setValue(mobileValue);
        return this;
    }

    public AddNewDonorForEbbPage selectInputEditFieldAllowDuplicate() {
        inputEditFieldAllowDuplicate.shouldBe(visible).click();
        return this;
    }

    /* For testing negative scenario */
    public AddNewDonorForEbbPage selectBloodGroupDropDown(String bloodGroup) {
        bloodGroupTypeDropDown.shouldBe(visible).selectOptionByValue(bloodGroup);
        return this;
    }

    public AddNewDonorForEbbPage selectDonationLocationDropDown(DonationLocation donationLocation) {
        donationLocationTypeDropDown.shouldBe(visible).selectOptionByValue(donationLocation.getValue());
        return this;
    }

    /* For testing negative scenarios */
    public AddNewDonorForEbbPage selectDonationLocationDropDown(String donationLocation) {
        donationLocationTypeDropDown.shouldBe(visible).selectOptionByValue(donationLocation);
        return this;
    }

    public AddNewDonorForEbbPage selectNumberOfDonationDropDown(NumberOfDonations numberOfDonations) {
        numberOfDonationTypeDropDown
                .shouldBe(visible)
                .selectOptionByValue(numberOfDonations.getValue());
        return this;
    }

    /* For testing negative scenarios */
    public AddNewDonorForEbbPage selectNumberOfDonationDropDown(String numberOfDonations) {
        numberOfDonationTypeDropDown.shouldBe(visible).selectOptionByValue(numberOfDonations);
        return this;
    }

    public AddNewDonorForEbbPage enterTheAgeOfTheDonor(int age) {
        ageOfTheDonor.shouldBe(visible).setValue(String.valueOf(age));
        return this;
    }

    /*For negative scenario*/
    public AddNewDonorForEbbPage enterTheAgeOfTheDonor(String age) {
        ageOfTheDonor.shouldBe(visible).setValue(age);
        return this;
    }

    public AddNewDonorForEbbPage clickMedicalExaminationTab() {
        medicalExaminationTab.scrollIntoView(false).shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage enterWeightInputValue(int weight) {
        weightInputValue.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }

    /*For Negative scenario*/
    public AddNewDonorForEbbPage enterWeightInputValue(double weight) {
        weightInputValue.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }

    public AddNewDonorForEbbPage enterBloodPressureSystolicInputValue(int bloodPressureSystolicValue) {
        bloodPressureSystolicInputValue
                .shouldBe(visible)
                .setValue(String.valueOf(bloodPressureSystolicValue));
        return this;
    }

    public AddNewDonorForEbbPage setHemoglobinTestInputValue(String hemoglobin) {
        hemoglobinTestInputValue.shouldBe(visible).setValue(hemoglobin);
        return this;
    }

    public AddNewDonorForEbbPage enterBloodPressureDiastolicInputValue(int bloodPressureDiastolicValue) {
        bloodPressureDiastolicInputValue
                .shouldBe(visible)
                .setValue(String.valueOf(bloodPressureDiastolicValue));
        return this;
    }

    public AddNewDonorForEbbPage clickBloodCollectionDetailsTab() {
        bloodCollectionDetailsTab.scrollIntoView(false).shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage enterDateCollectionInputField(String dateAsString) {
        dateCollectionInputField.shouldBe(visible).sendKeys(dateAsString);
        return this;
    }

    public AddNewDonorForEbbPage enterTimeCollectionInputField(String timeAsString) {
        timeCollectionInputField.shouldBe(visible).sendKeys(timeAsString);
        return this;
    }

    public AddNewDonorForEbbPage enterInputEditFieldDonorSegment(String donorCode) {
        inputEditFieldDonorSegment.shouldBe(visible).setValue(donorCode);
        return this;
    }

    public AddNewDonorForEbbPage selectTypeOfBagTypeDropDown(TypeOfBag typeOfBag) {
        typeOfBagTypeDropDown.shouldBe(visible).selectOptionContainingText(typeOfBag.getText());
        return this;
    }

    public AddNewDonorForEbbPage selectTypeOfBagTypeDropDown() {
        String typeOfDonation = selectEditFieldDonationType.shouldBe(visible).getText();
        if (typeOfDonation.equals("Plasmapheresis Donation")) {
            bloodCollectionDetailsTab.scrollIntoView(false).should(visible).click();
            typeOfBagTypeDropDown.shouldBe(visible).selectOptionContainingText("Plasma Kit");
            loadIcon.shouldBe(disappear);
            Selenide.Wait().withTimeout(Duration.ofSeconds(5));
        } else {
            bloodCollectionDetailsTab.scrollIntoView(false).should(visible).click();
            typeOfBagTypeDropDown.shouldBe(visible).selectOptionContainingText("WBC Kit");
            loadIcon.shouldBe(disappear);
            Selenide.Wait().withTimeout(Duration.ofSeconds(5));
        }
        return this;
    }

    public AddNewDonorForEbbPage setSelectComponentsToBePreparedField(String componentToBePrepared) {
        selectOptionComponentsPrepared
                .shouldBe(visible)
                .selectOptionContainingText(componentToBePrepared);
        return this;
    }

    public AddNewDonorForEbbPage getTheTextFromSelectComponentsToBePreparedField(
            ComponentToBePrepared componentToBePrepared) {
        selectOptionComponentsPrepared
                .shouldBe(visible)
                .selectOptionContainingText(componentToBePrepared.getText());
        return this;
    }

    public AddNewDonorForEbbPage saveDonor() {
        submitButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage getDonorRegistrationId() {
        donorCode = registrationIDText.shouldBe(visible).getText();
        log.info(donorCode);
        return this;
    }

    public AddNewDonorForEbbPage clickVerifyBloodGroupButton() {
        verifyBloodGroupButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage getComponentStatus() {
        String ComponentStatus = componentStatus.shouldBe(visible).getText();
        log.info(ComponentStatus);
        return this;
    }

    public AddNewDonorForEbbPage clickToCreateAddNewSerologyTests() {
        addNewSerologyTestsButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage setSelectEditFieldTestsTechnician(Technician technician) {
        selectEditFieldTestsTechnician
                .shouldBe(visible)
                .selectOptionContainingText(technician.getText());
        return this;
    }

    public AddNewDonorForEbbPage clickOnVerifySerologyButton() {
        verifySerologyButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage clickOnDonorLinkToSeeRecord() {
        linkOfTheDonor.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage setSelectEditFieldDonationType(String donationType) {
        selectEditFieldDonationType.shouldBe(visible).selectOptionByValue(donationType);
        return this;
    }

    public AddNewDonorForEbbPage enterTheSegmentNumber(String donor) {
        inputEditFieldDonorSegment.shouldBe(visible).setValue(donor);
        return this;
    }

    public AddNewDonorForEbbPage clickOnLinkToViewComponent() {
        linkToViewComponent.shouldBe(visible).click();
        return this;
    }
    public AddNewDonorForEbbPage clickOnEditButton() {
        editButton.shouldBe(visible).click();
        return this;
    }
    public AddNewDonorForEbbPage setInputComponentVolume(int componentVolume) {
        inputComponentVolume.shouldBe(visible).setValue(String.valueOf(componentVolume));
        return this;
    }
    public AddNewDonorForEbbPage clickOnSubmitButton() {
        submitButton.shouldBe(visible).click();
        return this;
    }
    public AddNewDonorForEbbPage clickOnCreateCrossMatchButton() {
        crossMatchButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage setSelectEditFieldCrossmatchPatient(String patientName) {
        selectEditFieldCrossmatchPatient.shouldBe(visible).selectOptionContainingText(patientName);
        return this;
    }
    public AddNewDonorForEbbPage setSelectEditFieldCompatibility(Compatibility compatibility) {
        selectEditFieldCompatibility.shouldBe(visible).selectOptionByValue(compatibility.getValue());
        return this;
    }
    public AddNewDonorForEbbPage setSelectEditFieldTechnician(Technician technician) {
        selectEditFieldTechnician.shouldBe(visible).selectOptionContainingText(technician.getText());
        return this;
    }
    public AddNewDonorForEbbPage clickOnIssueReserveButton() {
        issueReserveButton.shouldBe(visible).click();
        return this;
    }
    public AddNewDonorForEbbPage clickOnCreateComponentsButton() {
        createComponentsButton.shouldBe(visible).click();
        return this;
    }

    public AddNewDonorForEbbPage createDonor() throws InterruptedException {
        DonorData donor = new DonorData();
        this.setDonorRegistrationInput(donor.getUniqueDonorRegistrationID());
        this.setDonorNameInput(donor.getName());
        this.selectBloodGroupDropDown(donor.getBloodGroupForReusableDonor());
        this.selectGenderDropDown(donor.getGender());
        this.selectDonationLocationDropDown(donor.getDonationLocation());
        this.selectInputEditFieldMobileValue(donor.getMobile());
        this.selectInputEditFieldAllowDuplicate();
        this.selectNumberOfDonationDropDown(donor.getNumberOfDonations());
        this.enterTheAgeOfTheDonor(donor.getAgeOfDonor());
        this.clickMedicalExaminationTab();
        this.enterWeightInputValue(donor.getWeightOfDonor());
        this.setSelectEditFieldDonationType("WBD");
        this.enterBloodPressureSystolicInputValue(donor.getSystolic());
        this.enterBloodPressureDiastolicInputValue(donor.getDiastolic());
        this.clickBloodCollectionDetailsTab();
        this.enterDateCollectionInputField(donor.getDateOfBloodCollection());
        this.enterTimeCollectionInputField(donor.getTimeOfBloodCollection());
        this.enterTheSegmentNumber(donor.getSegmentNumber());
        this.selectTypeOfBagTypeDropDown(donor.getTypeOfBag());
        this.loadIconOfTypeOfBagWillDisappearAfterSelect();
        this.saveDonor();
        this.getDonorRegistrationId();
        this.clickOnCreateComponentsButton();
        this.saveDonor();
        this.getComponentStatus();
        this.clickToCreateAddNewSerologyTests();
        this.setSelectEditFieldTestsTechnician(donor.getTechnician());
        this.saveDonor();
        this.clickOnDonorLinkToSeeRecord();
        this.clickOnVerifySerologyButton();
        this.clickOnDonorLinkToSeeRecord();
        this.clickVerifyBloodGroupButton();
        this.getComponentStatus();
        this.clickOnLinkToViewComponent();
        this.clickOnEditButton();
        this.setInputComponentVolume(250);
        this.clickOnSubmitButton();
        this.and();
        this.clickOnCreateCrossMatchButton();
        this.setSelectEditFieldCrossmatchPatient(donor.getPatientForNegativeScript());
        this.setSelectEditFieldCompatibility(donor.getCompatibility());
        this.setSelectEditFieldTechnician(donor.getTechnician());
        this.clickOnSubmitButton();
        this.clickOnIssueReserveButton();
        this.clickOnSubmitButton();
        return this;
    }
}