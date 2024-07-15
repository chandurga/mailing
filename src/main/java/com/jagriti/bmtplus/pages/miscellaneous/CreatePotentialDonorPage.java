package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.*;
import com.jagriti.bmtplus.pages.patients.patients.AddNewPatientPage;
import com.jagriti.bmtplus.user.User;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.patients.patients.AddNewPatientPage.patientRegID;

// page_url = https://dev.bmtplus.com/node/add/family-members/3752739
@Slf4j
public class CreatePotentialDonorPage extends Page<CreatePotentialDonorPage> {

    public static String patientRegistrationId;
    protected CreatePotentialDonorPage() {
        super(CreatePotentialDonorPage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkQuicktabsTabPatientSummary")
    private SelenideElement linkQuicktabsTabPatientSummary = $("#quicktabs-tab-patient_summary_pre_bmt-3");

    @As("linkAddNewPotentialDonor")
    private SelenideElement linkAddNewPotentialDonor = $(byText("Add New Potential Donor"));
    
    @As("inputEditFieldFamilyName")
    private SelenideElement inputEditFieldFamilyName = $("input[id='edit-field-family-name-und-0-value']");

    @As("dateOfBirth")
    private SelenideElement setDateOfBirth = $("input[id='edit-field-family-date-of-birth-und-0-value-datepicker-popup-0']");

    @As("selectEditFieldFamilyGender")
    private SelenideElement selectEditFieldFamilyGender = $("select[id='edit-field-family-gender-und']");

    @As("selectEditFieldFamilyRelationship")
    private SelenideElement selectEditFieldFamilyRelationship = $("select[id='edit-field-family-relationship-und']");

    @As("selectEditFieldFamilySwab")
    private SelenideElement selectEditFieldFamilySwab = $("select[id='edit-field-family-hb-swab-sent-und']");

    @As("selectEditFieldFamilySelected")
    private SelenideElement selectEditFieldFamilySelected = $("select[id='edit-field-family-selected-donor-und']");

    @As("selectEditFieldTransplantRegimen")
    private SelenideElement selectEditFieldTransplantRegimen=$("select[id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-0']");

    @As("selectEditFieldTransplantRegimen2")
    private SelenideElement selectEditFieldTransplantRegimen2=$("select[id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-1']");




    @As("selectEditFieldFamilyCarrier")
    private SelenideElement selectEditFieldFamilyCarrier = $("select[id='edit-field-family-carrier-state-und']");

    @As("selectEditFieldFamilyCounseling")
    private SelenideElement selectEditFieldFamilyCounseling = $("select[id='edit-field-family-counseling-und']");

    @As("selectEditFieldFamilyParental")
    private SelenideElement selectEditFieldFamilyParental = $("select[id='edit-field-family-parental-diagnosis-und']");

    @As("selectEditFieldFamilyDiag")
    private SelenideElement selectEditFieldFamilyDiag = $("select[id='edit-field-family-diag-supported-by-und']");

    @As("selectEditFieldFamilyDiag2")
    private SelenideElement selectEditFieldFamilyDiag2 = $("select[id='edit-field-family-diag-laboratory-und']");

    @As("selectEditFieldDonorRelationship")
    private SelenideElement selectEditFieldDonorRelationship = $("select[id='edit-field-donor-relationship-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("#messages > div > ul > li:nth-child(1)");

    @As("donorLink")
    private SelenideElement donorLink = $x("(//*[@Class=\"field-item even\"])[2]");
    
    @As("donorLink")
    private SelenideElement donorLinkInTransplantSummary = $x("(//*[@Class=\"field-item even\"])[1]");

    @As("linkAddNewDonorEvaluation")
    private SelenideElement linkAddNewDonorEvaluation=$("div[class$='btn-primary'] a");

    @As("inputEditFieldFamilyWeight")
    private SelenideElement inputEditFieldFamilyWeight=$("input[id='edit-field-family-weight-und-0-value']");

    @As("inputEditFieldFamilyHeight")
    public SelenideElement inputEditFieldFamilyHeight=$("input[id='edit-field-family-height-und-0-value']");

    @As("linkImportTreatmentPlan")
    public SelenideElement linkImportTreatmentPlan=$("li[id='menu-9629-2'] a[class='sf-depth-1']");

    @As("divTestGeneral")
    public SelenideElement divTestGeneral=$x("(//*[@class=\"field-item even\"])[1]");


    public CreatePotentialDonorPage captureThePatientID() {
        patientRegistrationId = patientID.shouldBe(visible).getText();
        return this;
    }
    public CreatePotentialDonorPage clickOnPotentialDonorLink() {
        linkQuicktabsTabPatientSummary.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage clickOnAddNewPotentialDonorButton() {
        linkAddNewPotentialDonor.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage setInputEditFieldFamilyName(String name) {
        inputEditFieldFamilyName.shouldBe(visible).setValue(name);
        return this;
    }
    /*Negative Scenario*/
    public CreatePotentialDonorPage removeNameFromInputNameField() {
        inputEditFieldFamilyName.shouldBe(visible).clear();
        return this;
    }
    public CreatePotentialDonorPage enterDateOfBirth(String dateAsString) {
        setDateOfBirth.shouldBe(visible).setValue(dateAsString);
        setDateOfBirth.sendKeys(Keys.ENTER);
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyGender(Gender gender) {
        selectEditFieldFamilyGender.shouldBe(visible).selectOptionByValue(gender.getValue());
        return this;
    }
    /*For Negative scenario*/
    public CreatePotentialDonorPage setSelectEditFieldFamilyGender(String gender) {
        selectEditFieldFamilyGender.shouldBe(visible).selectOptionByValue(gender);
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyRelationship(Relationship relationship) {
        selectEditFieldFamilyRelationship.shouldBe(visible).selectOptionByValue(relationship.getValue());
        return this;
    }
    /*For Negative Scenario*/
    public CreatePotentialDonorPage setSelectEditFieldFamilyRelationship(String relationship) {
        selectEditFieldFamilyRelationship.shouldBe(visible).selectOptionByValue(relationship);
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilySwab(HBSwabSent hbSwabSent) {
        selectEditFieldFamilySwab.shouldBe(visible).selectOptionByValue(hbSwabSent.getValue());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilySelected(SelectDonor selectDonor) {
        selectEditFieldFamilySelected.shouldBe(visible).selectOptionContainingText(selectDonor.getText());
        return this;
    }
    /*selectYesForDonor*/
    public CreatePotentialDonorPage setSelectEditFieldFamilySelected(String selectDonor) {
        selectEditFieldFamilySelected.shouldBe(visible).selectOptionContainingText(selectDonor);
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldTransplantRegimen(String transplantRegimen) {
        selectEditFieldTransplantRegimen.shouldBe(visible).selectOptionContainingText(transplantRegimen);
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldTransplantRegimen2(OldTreatmentPlan transplantRegimen2) {
        selectEditFieldTransplantRegimen2.shouldBe(visible, Duration.ofSeconds(5)).selectOptionContainingText(transplantRegimen2.getText());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyCarrier(CarrierState carrier) {
        selectEditFieldFamilyCarrier.shouldBe(visible).selectOptionByValue(carrier.getvalue());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyCounseling(CarrierState carrierState) {
        selectEditFieldFamilyCounseling.shouldBe(visible).selectOptionByValue(carrierState.getvalue());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyParental(HBSwabSent hbSwabSent) {
        selectEditFieldFamilyParental.shouldBe(visible).selectOptionByValue(hbSwabSent.getValue());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldFamilyDiag(PrenetalDiagnosisSupportedBy prenetalDiagnosisSupportedBy) {
        selectEditFieldFamilyDiag.shouldBe(visible).selectOptionContainingText(prenetalDiagnosisSupportedBy.getText());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldLaboratory(Laboratory laboratory) {
        selectEditFieldFamilyDiag2.shouldBe(visible).selectOptionContainingText(laboratory.getText());
        return this;
    }
    public CreatePotentialDonorPage setSelectEditFieldDonorRelationship(DonorRelationship donorRelationship) {
        selectEditFieldDonorRelationship.shouldBe(visible).scrollIntoView(true).selectOptionByValue(donorRelationship.getValue());
        return this;
    }
    public CreatePotentialDonorPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage captureTheSuccessMessage(UserData userData) {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text(patientRegID+"-"+ userData.getRelationship().getValue() + "-test general"));
        return this;
    }
    public CreatePotentialDonorPage getThePotentialDonorCreatingMessage() {
        String donor = h1PageTitle.shouldBe(visible).getText();
        log.info(donor);
        return this;
    }
    public CreatePotentialDonorPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Relationship field is required."));
        return this;
    }
    public CreatePotentialDonorPage clickOnDonorLink() {
        donorLink.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage clickOnDonorLinkInTheTransplantSummaryPage() {
        Selenide.switchTo().window(1);
        donorLinkInTransplantSummary.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage clickOnLinkAddNewDonorEvaluation() {
        linkAddNewDonorEvaluation.shouldBe(visible).click();
        return this;
    }
    public CreatePotentialDonorPage setInputEditFieldFamilyWeight(String weight) {
        inputEditFieldFamilyWeight.shouldBe(visible).setValue(weight);
        return this;
    }
    public CreatePotentialDonorPage setInputEditFieldFamilyHeight(int height) {
        inputEditFieldFamilyHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }
    public CreatePotentialDonorPage clickOnLinkImportTreatmentPlan() {
        linkImportTreatmentPlan.shouldBe(visible).scrollIntoView(false).click();
        return this;
    }
    public CreatePotentialDonorPage assertThatDonorCreateOrNot(UserData user) {
        divTestGeneral.shouldBe(visible).shouldHave(Condition.exactText(user.getPatientName()));
        return this;
    }

    public UserData userData;

    public CreatePotentialDonorPage createDonor(){
        userData = UserData.getData();
        this.clickOnPotentialDonorLink();
        this.it();
        this.clickOnAddNewPotentialDonorButton();
        this.setInputEditFieldFamilyName(userData.getPatientName());
        this.enterDateOfBirth(userData.getDate());
        this.setSelectEditFieldFamilyGender(userData.getGender());
        this.setSelectEditFieldFamilyRelationship("Unknown");
        this.setSelectEditFieldFamilySwab(userData.getHbSwabSent());
        this.setSelectEditFieldFamilySelected("Yes");
        this.setSelectEditFieldTransplantRegimen("Old Treatment Plans");
        this.setSelectEditFieldTransplantRegimen2(userData.getOldTreatmentPlan());
        this.setSelectEditFieldFamilyCarrier(userData.getCarrierState());
        this.setSelectEditFieldFamilyCounseling(userData.getCarrierState());
        this.setSelectEditFieldFamilyParental(userData.getHbSwabSent());
        this.setSelectEditFieldFamilyDiag(userData.getPrenetalDiagnosisSupportedBy());
        this.setSelectEditFieldLaboratory(userData.getLaboratory());
        this.setSelectEditFieldDonorRelationship(userData.getDonorRelationship());
        this.clickOnSaveButton();
        this.and();
        this.assertThatDonorCreateOrNot(userData);
        return this;
    }
}
