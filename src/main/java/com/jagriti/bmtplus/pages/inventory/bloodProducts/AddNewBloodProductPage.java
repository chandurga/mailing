package com.jagriti.bmtplus.pages.inventory.bloodProducts;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.BloodComponent;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.BloodType;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.Investigations;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.Physician;
import com.jagriti.bmtplus.pages.patients.patients.AddNewPatientPage;
import com.jagriti.bmtplus.pages.patients.patients.data.BloodProductType;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.patients.patients.ProductTypePage.patientRegistrationId;

// page_url = https://dev.bmtplus.com/node/add/blood-products
public class AddNewBloodProductPage extends Page<AddNewBloodProductPage> {
    protected AddNewBloodProductPage() {
        super(AddNewBloodProductPage.class);
    }

    @As("inputEditFieldBloodBag")
    private SelenideElement inputEditFieldBloodBag = $("input[id='edit-field-bp-blood-bag-number-und-0-value']");

    @As("selectEditFieldBloodComponent")
    private SelenideElement selectEditFieldBloodComponent = $("select[id='edit-field-bp-blood-component-und']");

    @As("selectEditFieldCoreAttributes")
    private SelenideElement selectEditFieldCoreAttributes = $("#edit-field-bp-core-attributes-und--2");

    @As("inputEditFieldReceivedDate")
    private SelenideElement inputEditFieldReceivedDate = $("input[id='edit-field-bp-received-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldIssuedUnd")
    private SelenideElement inputEditFieldIssuedUnd = $("input[id='edit-field-bp-issued-to-und-0-target-id']");

    @As("selectThePatientID")
    private SelenideElement selectThePatientID = $("#autocomplete");

    @As("selectEditFieldTypeUnd")
    private SelenideElement selectEditFieldBloodProductType = $("select[id='edit-field-bp-type-und']");

    @As("inputEditFieldDonorUnd")
    private SelenideElement inputEditFieldDonorUnd = $("input[id='edit-field-bp-donor-id-und-0-target-id']");

    @As("inputEditFieldTransplantCell")
    private SelenideElement inputEditFieldTransplantCell = $("input[id='edit-field-transplant-cell-count-und-0-value']");
    
    @As("selectEditFieldBloodType")
    private SelenideElement selectEditFieldBloodType = $("select[id='edit-field-bp-blood-type-und']");

    @As("inputEditFieldDateOfCollection")
    private SelenideElement inputEditFieldDateOfCollection = $("input[id='edit-field-bp-collection-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldExpiryDate")
    private SelenideElement inputEditFieldExpiryDate = $("input[id='edit-field-bp-expiry-date-und-0-value-datepicker-popup-0']");

    @As("selectEditFieldStatusUnd")
    public SelenideElement selectEditFieldStatusUnd = $("select[id='edit-field-bp-status-und']");

    @As("inputEditFieldUsedFor")
    private SelenideElement inputEditFieldUsedFor = $("input[id='edit-field-bp-used-for-patient-und-0-target-id']");

    @As("inputEditFieldIrradiationCentres")
    private SelenideElement inputEditFieldIrradiationCentres = $("input[id='edit-field-bp-irradiation-centres-und-0-target-id']");

    @As("autoResult")
    private SelenideElement autoResult = $("#autocomplete");

    @As("selectEditFieldSignsAnd")
    private SelenideElement selectEditFieldSignsAnd = $("select[id='edit-field-bp-tr-signs-and-symptoms-und-hierarchical-select-selects-0']");

    @As("selectEditFieldSignsAnd2")
    private SelenideElement selectEditFieldSignsAnd2 = $("select[id='edit-field-bp-tr-signs-and-symptoms-und-hierarchical-select-selects-1']");

    @As("radioButtonOfShowDateAndTime")
    private SelenideElement radioButtonOfShowDateAndTime = $("input[id='edit-field-bp-used-date-und-0-show-todate']");

    @As("inputEditFieldOfTransfusionStartDate")
    private SelenideElement inputEditFieldOfTransfusionStartDate = $("input[id='edit-field-bp-used-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldOfTransfusionStartTime")
    private SelenideElement inputEditFieldOfTransfusionStartTime = $("input[id='edit-field-bp-used-date-und-0-value-timeEntry-popup-1']");

    @As("inputEditFieldOfTransfusionEndDate")
    private SelenideElement inputEditFieldOfTransfusionEndDate = $("input[id='edit-field-bp-used-date-und-0-value2-datepicker-popup-0']");

    @As("inputEditFieldOfTransfusionEndTime")
    private SelenideElement inputEditFieldOfTransfusionEndTime = $("input[id='edit-field-bp-used-date-und-0-value2-timeEntry-popup-1']");
    
    @As("selectEditFieldInvestigations")
    private SelenideElement selectEditFieldInvestigations = $("select[id='edit-field-bp-tr-investigations-sent-und']");

    @As("selectEditFieldAttendingPhysician")
    private SelenideElement selectEditFieldAttendingPhysician = $("select[id='edit-field-bp-tr-attending-physician-und']");

    @As("BloodProductMessage")
    private SelenideElement bloodProductMessage = $("div.field-item.even");

    @As("errorMessage")
    private SelenideElement errorMessage = $("#messages > div.messages.error");

    @As("patientIdLink")
    private SelenideElement patientIdLink = $x("(//*[@class=\"field-item even\"])[7]");

    @As("linkQuicktabsTabPatientSummary")
    private SelenideElement linkQuicktabsTabPatientSummary = $("#quicktabs-tab-patient_summary_pre_bmt-9");

    @As("linkView")
    private SelenideElement linkView = $("#quicktabs-tabpage-patient_summary_pre_bmt-9 > div > div.view-content > table > tbody > tr > td.views-field.views-field-title > a");

    @As("linkPleaseClickUpdatePatient")
    private SelenideElement linkPleaseClickUpdatePatient = $("a[class$='flag-link-confirm']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("divStatusMessageUpdateProcessing")
    private SelenideElement divStatusMessageUpdateProcessing = $("div[class$='status']");

    @As("selectEditFieldPaymentMode")
    private SelenideElement selectEditFieldPaymentMode = $("select[id='edit-field-bp-payment-mode-und']");

    @As("selectEditFieldStatusUnd2")
    private SelenideElement selectEditFieldStatus = $("select[id='edit-field-bp-status-und']");

    @As("inputEditFieldUsedFor2")
    private SelenideElement inputEditFieldUsedFor2 = $("input[id='edit-field-bp-used-for-patient-und-0-target-id']");

    public AddNewBloodProductPage enterTheBloodBagNumber(String bloodProductNumber) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        inputEditFieldBloodBag.shouldBe(visible).setValue(bloodProductNumber);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldBloodComponent(BloodComponent bloodComponent) {
        selectEditFieldBloodComponent.shouldBe(visible).selectOptionContainingText(bloodComponent.getText());
        return this;
    }
    //For Negative scenario
    public AddNewBloodProductPage setSelectEditFieldBloodComponent(String bloodComponent) {
        selectEditFieldBloodComponent.shouldBe(visible).selectOptionContainingText(bloodComponent);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldCoreAttributes(String coreAttributes) {
        selectEditFieldCoreAttributes.shouldBe(visible).selectOptionContainingText(coreAttributes);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldReceivedDate(String dateAsString) {
        inputEditFieldReceivedDate.shouldBe(visible).setValue(dateAsString);
        inputEditFieldReceivedDate.sendKeys(Keys.ENTER);
        return this;
    }
    //for Negative scenario
    public AddNewBloodProductPage setInputEditFieldReceivedDate() {
        inputEditFieldReceivedDate.shouldBe(visible).clear();
        inputEditFieldReceivedDate.sendKeys(Keys.ENTER);
        return this;
    }
    public AddNewBloodProductPage setBloodProductIssuedTo(String issuedPatient) {
        inputEditFieldIssuedUnd.shouldBe(visible).setValue(issuedPatient);
        return this;
    }
    //For Negative scenario
    public AddNewBloodProductPage setBloodProductIssuedTo() {
        inputEditFieldIssuedUnd.shouldBe(visible).clear();
        return this;
    }
    public AddNewBloodProductPage setSelectThePatientID() {
        selectThePatientID.shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldBloodProductType(String BloodProductType) {
        selectEditFieldBloodProductType.shouldBe(visible).selectOptionByValue(BloodProductType);
        return this;
    }
    /*For Product type test script*/
    public AddNewBloodProductPage setSelectEditFieldBloodProductType(BloodProductType bloodProductType) {
        selectEditFieldBloodProductType.shouldBe(visible).selectOptionByValue(bloodProductType.getValue());
        String productType = selectEditFieldBloodProductType.getText();
        if(productType.equalsIgnoreCase("Donor Stem Cells (PBSC)")){
        }else{
            inputEditFieldDonorUnd.shouldBe(visible).setValue(patientRegistrationId);
            selectThePatientID.shouldBe(visible, Duration.ofSeconds(10));
        }
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldDonor(String Donor) {
        inputEditFieldDonorUnd.shouldBe(visible).setValue(Donor);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldTransplantCell(int nucleatedCellCount) {
        inputEditFieldTransplantCell.shouldBe(visible).setValue(String.valueOf(nucleatedCellCount));
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldBloodType(BloodType bloodType) {
        selectEditFieldBloodType.shouldBe(visible).selectOptionContainingText(bloodType.getText());
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldDateOfCollection(String dateAsString) {
        inputEditFieldDateOfCollection.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldExpiryDate(String dateAsString) {
        inputEditFieldExpiryDate.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldStatus(String status) {
        selectEditFieldStatus.shouldBe(visible).selectOptionContainingText(status);
        return this;
    }
    public AddNewBloodProductPage enterPatientIdInTheUsedForWhichPatient(String patient) {
        inputEditFieldUsedFor2.shouldBe(visible).setValue(patient);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldStatusUnd(String status) {
        selectEditFieldStatusUnd.shouldBe(visible).selectOptionContainingText(status);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldUsedFor(String usedForPatient) {
        inputEditFieldUsedFor.shouldBe(visible).setValue(usedForPatient);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldIrradiationCentres(String test) {
        inputEditFieldIrradiationCentres.shouldBe(visible).setValue(test);
        return this;
    }
    public AddNewBloodProductPage setAutoResult() {
        autoResult.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldSignsAnd(String sign) {
        selectEditFieldSignsAnd.shouldBe(visible).selectOptionContainingText(sign);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldSignsAnd2(String signsAnd2) {
        selectEditFieldSignsAnd2.shouldBe(Condition.appear, Duration.ofSeconds(10)).selectOptionContainingText(signsAnd2);
        return this;
    }
    public AddNewBloodProductPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage clickOnRadioButtonOfShowDateAndTime() {
        radioButtonOfShowDateAndTime.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldOfTransfusionStartDate(String transfusionDate) {
        inputEditFieldOfTransfusionStartDate.shouldBe(visible).setValue(transfusionDate);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldOfTransfusionStartTime(String transfusionStartTime) {
        inputEditFieldOfTransfusionStartTime.shouldBe(visible).setValue(transfusionStartTime);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldOfTransfusionEndDate(String transfusionEndDate) {
        inputEditFieldOfTransfusionEndDate.shouldBe(visible).setValue(transfusionEndDate);
        return this;
    }
    public AddNewBloodProductPage setInputEditFieldOfTransfusionEndTime(String transfusionEndTime) {
        inputEditFieldOfTransfusionEndTime.shouldBe(visible).setValue(transfusionEndTime);
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldInvestigations(Investigations investigations) {
        selectEditFieldInvestigations.shouldBe(visible).selectOptionByValue(investigations.getValue());
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldAttendingPhysician(Physician physician) {
        selectEditFieldAttendingPhysician.shouldBe(visible).selectOptionContainingText(physician.getText());
        return this;
    }
    public AddNewBloodProductPage assertThatBloodProductCreateOrNot(BloodProductData blood) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        bloodProductMessage.shouldBe(visible).shouldHave(Condition.text(blood.getUniqueBloodProductNumber()));
        return this;
    }
    public AddNewBloodProductPage assertThatErrorMessageForDifferentPatient() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("The blood product is being used for a different patient than the one it was issued for. Kindly check."));
        return this;
    }
    public AddNewBloodProductPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Blood Product Issued to field is required.\n" +
                "Date field is required.\n" +
                "A valid date is required for Received On.\n" +
                "Blood Component field is required."));
        return this;
    }
    public AddNewBloodProductPage assertThatErrorMessageOfWithoutDonor() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Error message\n" +
                "No items found for Donor"));
        return this;
    }
    public AddNewBloodProductPage clickOnPatientIdLink() {
        patientIdLink.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage clickOnTransplantSummaryLink() {
        linkQuicktabsTabPatientSummary.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage clickOnViewLink() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage clickOnLinkPleaseClickUpdatePatient() {
        linkPleaseClickUpdatePatient.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage clickOnUpdatePatientDataButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewBloodProductPage assertThatPatientDataUpdatedOrNot() {
        divStatusMessageUpdateProcessing.shouldBe(visible).shouldHave(Condition.text("Update Processing complete"));
        return this;
    }
    public AddNewBloodProductPage setSelectEditFieldPaymentMode(String paymentMode) {
        selectEditFieldPaymentMode.shouldBe(visible).selectOptionContainingText(paymentMode);
        return this;
    }
}