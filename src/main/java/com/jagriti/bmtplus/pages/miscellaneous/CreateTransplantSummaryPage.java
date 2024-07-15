package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.*;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.miscellaneous.DonorWeightAtBMTPage.FAMILY_MEMBER;

// page_url = https://dev.bmtplus.com/node/add/transplant-summary/3752811#undefined
@Slf4j
public class CreateTransplantSummaryPage extends Page<CreateTransplantSummaryPage> {
    protected CreateTransplantSummaryPage() {
        super(CreateTransplantSummaryPage.class);
    }

    @As("inputEditFieldTransplantDescr")
    private SelenideElement inputEditFieldTransplantDescr = $("input[id='edit-field-transplant-descr-und-0-value']");

    @As("selectEditFieldTransplantType")
    private SelenideElement selectEditFieldTransplantType = $("select[id='edit-field-transplant-type-und']");

    @As("inputDateOfBMT")
    private SelenideElement inputDateOfBMT = $("input[id='edit-field-transplant-date-und-0-value-datepicker-popup-0']");

    @As("selectEditFieldTransplantHla")
    private SelenideElement selectEditFieldTransplantHla = $("select[id='edit-field-transplant-hla-typ-status-und']");

    @As("inputEditFieldTransplantPatientWeight")
    private SelenideElement inputEditFieldTransplantPatientWeight = $("input[id='edit-field-transplant-patient-weight-und-0-value']");

    @As("inputEditFieldTransplantPatientHeight")
    public SelenideElement inputEditFieldTransplantPatientHeight = $("input[id='edit-field-transplant-patient-height-und-0-value']");

    @As("selectEditFieldTransplantRegimen")
    private SelenideElement selectEditFieldTransplantRegimen = $("select[id='edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-0']");

    @As("selectEditFieldTransplantRegimen2")
    private SelenideElement selectEditFieldTransplantRegimen2 = $("select[name='field_transplant_trtmnt_regimen[und][hierarchical_select][selects][1]']");

    @As("selectEditFieldTransplantCell")
    private SelenideElement selectEditFieldTransplantCell = $("select[id='edit-field-transplant-cell-source-und']");

    @As("selectEditFieldTransplantPriming")
    private SelenideElement selectEditFieldTransplantPriming = $("select[id='edit-field-transplant-gcsf-priming-und']");

    @As("selectEditFieldTransplantPost")
    private SelenideElement selectEditFieldTransplantPost = $("select[id='edit-field-transplant-g-post-und']");

    @As("inputEditFieldTransfusedVolume")
    private SelenideElement inputEditFieldTransfusedVolume = $("input[id='edit-field-transplant-collection-vol-und-0-value']");

    @As("selectEditFieldTransplantFever")
    private SelenideElement selectEditFieldTransplantFever = $("select[id='edit-field-transplant-fever-und']");

    @As("selectEditFieldTransplantInfection")
    private SelenideElement selectEditFieldTransplantInfection = $("select[id='edit-field-transplant-infection-und']");

    @As("selectEditFieldTransplantToxicity")
    private SelenideElement selectEditFieldTransplantToxicity = $("select[id='edit-field-transplant-gu-toxicity-und']");

    @As("selectEditFieldTransplantToxicity2")
    private SelenideElement selectEditFieldTransplantToxicity2 = $("select[id='edit-field-transplant-gi-toxicity-und']");

    @As("selectEditFieldTransplantLiver")
    private SelenideElement selectEditFieldTransplantLiver = $("select[id='edit-field-transplant-liver-toxicity-und']");

    @As("selectEditFieldTransplantPulmonary")
    private SelenideElement selectEditFieldTransplantPulmonary = $("select[id='edit-field-transplant-pulmonary-toxi-und']");

    @As("linkDiseaseSpecificTransplantInfo")
    private SelenideElement linkDiseaseSpecificTransplantInfo = $("li[class$='horizontal-tab-button-1'] a");

    @As("selectEditFieldTransplantConsanguinity")
    private SelenideElement selectEditFieldTransplantConsanguinity = $("select[id='edit-field-transplant-consanguinity-und']");

    @As("selectEditFieldListYes")
    private SelenideElement selectEditFieldListYes = $("select[id='edit-field-list-yes-no-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("successMessage")
    private SelenideElement successMessage = $x("(//*[@class=\"field-item even\"])[1]");

    @As("linkGeneralTransplantInfo")
    private SelenideElement linkGeneralTransplantInfo = $("li[class$='first'] a");

    @As("selectEditFieldTransplantRegimen3")
    private SelenideElement selectEditFieldTransplantRegimen3 = $("#edit-field-transplant-trtmnt-regimen-und-hierarchical-select-selects-1--2");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    @As("ulDateFieldRequiredValid")
    private SelenideElement ulDateFieldRequiredValid = $("div[class^='messages error'] ul");

    @As("inputEditFieldTransplantPatient")
    private SelenideElement inputEditFieldTransplantPatient = $("#edit-field-transplant-patient-und-0-nid");

    @As("selectResultOfPatient")
    private SelenideElement resultOfPatient = $("#autocomplete");

    @As("inputEditFieldCentre")
    private SelenideElement inputEditFieldCentre = $("#edit-og-group-ref-und");

    @As("selectEditFieldTransplantFamily")
    private SelenideElement selectEditFieldTransplantFamily = $("#edit-field-transplant-family-member-und");

    @As("inputEditFieldDonorHeight")
    private SelenideElement inputEditFieldDonorHeight = $("#edit-field-donor-height-und-0-value");

    @As("inputEditFieldDonorWeight")
    private SelenideElement inputEditFieldDonorWeight = $("#edit-field-donor-weight-und-0-value");


    public CreateTransplantSummaryPage setInputEditFieldTransplantPatient(String patient) {
        inputEditFieldTransplantPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public CreateTransplantSummaryPage clickOnResultOfPatient() {
        resultOfPatient.shouldBe(visible).click();
        return this;
    }
    public CreateTransplantSummaryPage setInputEditFieldCentre(String centre) {
        inputEditFieldCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public CreateTransplantSummaryPage assertTheMessagesForMissingMandatoryFields() {
        ulDateFieldRequiredValid.shouldBe(visible).shouldHave(Condition.text("Date field is required.\n" +
                "A valid date is required for Date of BMT.\n" +
                "Transplant Type field is required.\n" +
                "Patient Weight field is required.\n" +
                "Patient Height field is required."));
        return this;
    }
    public CreateTransplantSummaryPage setInputEditFieldTransplantDescr(String Discription) {
        inputEditFieldTransplantDescr.shouldBe(visible).setValue(Discription);
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantType(TransplantType transplantType) {
        selectEditFieldTransplantType.shouldBe(visible).selectOptionByValue(transplantType.getValue());
        return this;
    }
    // For Donor Weight
    public CreateTransplantSummaryPage setSelectEditFieldTransplantType(TransplantTypeForDonorWeight transplantType) {
        selectEditFieldTransplantType.shouldBe(visible).selectOptionByValue(transplantType.getValue());
        return this;
    }
    // For Negative scenario
    public CreateTransplantSummaryPage setSelectEditFieldTransplantType(String transplantType) {
        selectEditFieldTransplantType.shouldBe(visible).selectOptionByValue(transplantType);
        return this;
    }
    public CreateTransplantSummaryPage enterTheInputDateOfBMT(String dateAsString) {
        inputDateOfBMT.shouldBe(visible).sendKeys(dateAsString);
        inputDateOfBMT.shouldBe(visible).sendKeys(Keys.ENTER);
        return this;
    }
    // For Negative scenario
    public CreateTransplantSummaryPage clearTheDateField() {
        inputDateOfBMT.shouldBe(visible).clear();
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantHla(HLATypingStatus hla) {
        selectEditFieldTransplantHla.shouldBe(visible).selectOptionByValue(hla.getValue());
        return this;
    }
    public CreateTransplantSummaryPage setInputEditFieldTransplantPatientWeight(int weight) {
        inputEditFieldTransplantPatientWeight.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }
    //For Negative scenario
    public CreateTransplantSummaryPage clearTheWeightInputField() {
        inputEditFieldTransplantPatientWeight.shouldBe(visible).clear();
        return this;
    }
    public CreateTransplantSummaryPage setInputEditFieldTransplantPatientHeight(int height) {
        inputEditFieldTransplantPatientHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }
    // For Negative scenario
    public CreateTransplantSummaryPage clearTheHeightInputField() {
        inputEditFieldTransplantPatientHeight.shouldBe(visible).clear();
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantRegimen(String regimen) {
        selectEditFieldTransplantRegimen.shouldBe(visible).selectOptionContainingText(regimen);
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantRegimen2(OldTreatmentPlan oldTreatmentPlan) {
        selectEditFieldTransplantRegimen2.should(visible, Duration.ofSeconds(20)).selectOptionContainingText(oldTreatmentPlan.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantRegimen2(String oldTreatmentPlan) {
        selectEditFieldTransplantRegimen2.shouldBe(visible).selectOptionContainingText(oldTreatmentPlan);
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantCell(CellSource cellSource) {
        selectEditFieldTransplantCell.shouldBe(visible).selectOptionByValue(cellSource.getValue());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantPriming(FacialChanges facialChanges) {
        selectEditFieldTransplantPriming.shouldBe(visible).selectOptionByValue(facialChanges.getValue());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantPost(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldTransplantPost.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateTransplantSummaryPage setInputEditFieldTransfusedVolume(String transfusedVolume) {
        inputEditFieldTransfusedVolume.shouldBe(visible).setValue(transfusedVolume);
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantFever(Mucositis mucositis) {
        selectEditFieldTransplantFever.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantInfection(Mucositis mucositis) {
        selectEditFieldTransplantInfection.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantToxicity(Mucositis mucositis) {
        selectEditFieldTransplantToxicity.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantToxicity2(Mucositis mucositis) {
        selectEditFieldTransplantToxicity2.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantLiver(Mucositis mucositis) {
        selectEditFieldTransplantLiver.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantPulmonary(Mucositis mucositis) {
        selectEditFieldTransplantPulmonary.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public CreateTransplantSummaryPage clickOnLinkDiseaseSpecificTransplantInfo() {
        linkDiseaseSpecificTransplantInfo.shouldBe(visible).scrollIntoView(true).click();
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantConsanguinity(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldTransplantConsanguinity.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldListYes(TransfusionsFromFamilyMembers transfusionsFromFamilyMembers) {
        selectEditFieldListYes.shouldBe(visible).selectOptionByValue(transfusionsFromFamilyMembers.getValue());
        return this;
    }
    public CreateTransplantSummaryPage clickOnSaveButton() {
        if(!selectEditFieldListYes.isSelected()) {
            inputEditSubmit.shouldBe(visible).click();
        }else{
            inputEditSubmit.shouldBe(visible, Duration.ofSeconds(15)).click();
        }
        return this;
    }
    public CreateTransplantSummaryPage assertThatTransplantSummaryCreateOrNot() {
        successMessage.shouldBe(visible).shouldHave(
                Condition.text("420677831389500 [Brande Stiedemann Sr]"));
        return this;
    }
    public CreateTransplantSummaryPage assertThatTransplantSummaryCreated() {
        String MESSAGE = successMessage.shouldBe(visible).getText();
        log.info(MESSAGE);
        return this;
    }
    public CreateTransplantSummaryPage clickLinkGeneralTransplantInfo() {
        linkGeneralTransplantInfo.shouldBe(visible).click();
        return this;
    }
    //For negative scenario
    public CreateTransplantSummaryPage setSelectEditFieldTransplantRegimen3(String regimen3) {
        selectEditFieldTransplantRegimen3.shouldBe(visible).selectOptionByValue(regimen3);
        return this;
    }
    public CreateTransplantSummaryPage assertThatErrorMessageWithoutRegimen() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Treatment Regimen field is required."));
        return this;
    }
    public CreateTransplantSummaryPage assertThatErrorMessageWithOutDonorWeightAndHeight() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Donor Height is mandatory\n" +
                "Donor Weight is mandatory"));
        return this;
    }
    public CreateTransplantSummaryPage setSelectEditFieldTransplantFamily(String family) {
        selectEditFieldTransplantFamily.shouldBe(visible).selectOptionContainingText(family);
        return this;
    }
    public CreateTransplantSummaryPage enterInputEditFieldDonorHeight(int height) {
        inputEditFieldDonorHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }

    public CreateTransplantSummaryPage enterInputEditFieldDonorWeight(int weight) {
        inputEditFieldDonorWeight.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }


    public CreateTransplantSummaryPage createTransplant(){
        UserData userData = UserData.getData();
        this.setInputEditFieldTransplantDescr("New transplant summary");
        this.setSelectEditFieldTransplantType(userData.getTransplantType());
        this.enterTheInputDateOfBMT(userData.getDateForBMT());
        this.setSelectEditFieldTransplantHla(userData.getHlaTypingStatus());
        this.setInputEditFieldTransplantPatientWeight(userData.getWeight());
        this.setInputEditFieldTransplantPatientHeight(157);
        this.setSelectEditFieldTransplantRegimen("Old Treatment Plans");
        this.setSelectEditFieldTransplantRegimen2("TMC-AML-BU-CY");
        this.setSelectEditFieldTransplantCell(userData.getCellSource());
        this.setSelectEditFieldTransplantPriming(userData.getFacialChanges());
        this.setSelectEditFieldTransplantPost(userData.getOtherRelevantMedicalProblems());
        this.setInputEditFieldTransfusedVolume(String.valueOf(220));
        this.setSelectEditFieldTransplantFever(userData.getMucositis());
        this.setSelectEditFieldTransplantInfection(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity2(userData.getMucositis());
        this.setSelectEditFieldTransplantLiver(userData.getMucositis());
        this.setSelectEditFieldTransplantPulmonary(userData.getMucositis());
        this.clickOnLinkDiseaseSpecificTransplantInfo();
        this.setSelectEditFieldTransplantConsanguinity(userData.getOtherRelevantMedicalProblems());
        this.setSelectEditFieldListYes(userData.getTransfusionsFromFamilyMembers());
        this.clickOnSaveButton();
        this.assertThatTransplantSummaryCreated();
        return this;
    }

    public CreateTransplantSummaryPage createTransplantForProductType(){
        UserData userData = UserData.getData();
        this.setInputEditFieldTransplantDescr("New transplant summary");
        this.setSelectEditFieldTransplantType(userData.getTransplantType());
        this.enterTheInputDateOfBMT(userData.getTodayDate());
        this.setSelectEditFieldTransplantHla(userData.getHlaTypingStatus());
        this.setInputEditFieldTransplantPatientWeight(userData.getWeight());
        this.setInputEditFieldTransplantPatientHeight(157);
        this.setSelectEditFieldTransplantRegimen("Old Treatment Plans");
        this.setSelectEditFieldTransplantRegimen2(userData.getOldTreatmentPlan());
        this.setSelectEditFieldTransplantCell(userData.getCellSource());
        this.setSelectEditFieldTransplantPriming(userData.getFacialChanges());
        this.setSelectEditFieldTransplantPost(userData.getOtherRelevantMedicalProblems());
        this.setInputEditFieldTransfusedVolume(String.valueOf(220));
        this.setSelectEditFieldTransplantFever(userData.getMucositis());
        this.setSelectEditFieldTransplantInfection(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity2(userData.getMucositis());
        this.setSelectEditFieldTransplantLiver(userData.getMucositis());
        this.setSelectEditFieldTransplantPulmonary(userData.getMucositis());
        this.clickOnLinkDiseaseSpecificTransplantInfo();
        this.setSelectEditFieldTransplantConsanguinity(userData.getOtherRelevantMedicalProblems());
        this.setSelectEditFieldListYes(userData.getTransfusionsFromFamilyMembers());
        this.clickOnSaveButton();
        this.assertThatTransplantSummaryCreated();
        return this;
    }

    public CreateTransplantSummaryPage createTransplantForDonorWeight(){
        int HEIGHT = 123;
        UserData userData = UserData.getData();
        this.setInputEditFieldTransplantDescr("New transplant summary");
        this.setSelectEditFieldTransplantType(userData.getTransplantTypeForDonorWeight());
        this.enterTheInputDateOfBMT(userData.getDateForBMT());
        this.setSelectEditFieldTransplantFamily(FAMILY_MEMBER);
        this.enterInputEditFieldDonorHeight(HEIGHT);
        this.enterInputEditFieldDonorWeight(userData.getWeight());
        this.setSelectEditFieldTransplantHla(userData.getHlaTypingStatus());
        this.setInputEditFieldTransplantPatientWeight(userData.getWeight());
        this.setInputEditFieldTransplantPatientHeight(157);
        this.setSelectEditFieldTransplantRegimen("Old Treatment Plans");
        this.setSelectEditFieldTransplantRegimen2("TMC-AML-BU-CY");
        this.setSelectEditFieldTransplantCell(userData.getCellSource());
        this.setSelectEditFieldTransplantPriming(userData.getFacialChanges());
        this.setSelectEditFieldTransplantPost(userData.getOtherRelevantMedicalProblems());
        this.setInputEditFieldTransfusedVolume(String.valueOf(220));
        this.setSelectEditFieldTransplantFever(userData.getMucositis());
        this.setSelectEditFieldTransplantInfection(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity(userData.getMucositis());
        this.setSelectEditFieldTransplantToxicity2(userData.getMucositis());
        this.setSelectEditFieldTransplantLiver(userData.getMucositis());
        this.setSelectEditFieldTransplantPulmonary(userData.getMucositis());
        this.clickOnLinkDiseaseSpecificTransplantInfo();
        this.setSelectEditFieldTransplantConsanguinity(userData.getOtherRelevantMedicalProblems());
        this.setSelectEditFieldListYes(userData.getTransfusionsFromFamilyMembers());
        this.clickOnSaveButton();
        this.assertThatTransplantSummaryCreated();
        return this;
    }
}
