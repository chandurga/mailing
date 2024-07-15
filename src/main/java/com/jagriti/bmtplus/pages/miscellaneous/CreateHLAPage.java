package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.Laboratory;
import com.jagriti.bmtplus.pages.miscellaneous.data.TypingMethod;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.miscellaneous.ImportOtherLabsHLAResultsPage.patientRegIDInImportHLAPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

// page_url = https://dev.bmtplus.com/node/add/hla/3752811
public class CreateHLAPage extends Page<CreateHLAPage> {

    public static String Laboratory;
    final String Description = "New HLA for the patient";
    public static String LaboratoryForImportHLA = "HistoGenetics USA";
    protected CreateHLAPage() {
        super(CreateHLAPage.class);
    }

    @As("inputEditFieldHlaFor")
    private SelenideElement radioButtonOfPatient = $("input[id='edit-field-hla-for-whom-und-patient']");

    @As("inputEditFieldHlaDescription")
    private SelenideElement inputEditFieldHlaDescription = $("input[id='edit-field-hla-description-und-0-value']");

    @As("selectEditFieldHlaLaboratory")
    private SelenideElement selectEditFieldHlaLaboratory = $("select[id='edit-field-hla-laboratory-und']");

    @As("selectEditFieldHlaTyping")
    private SelenideElement selectEditFieldHlaTyping = $("select[id='edit-field-hla-typing-method-und']");

    @As("inputEditFieldHlaElementA")
    private SelenideElement inputEditFieldHlaElementA = $("input[id='edit-field-hla-a-df-und-0-first']");

    @As("inputEditFieldHlaElementA2")
    public SelenideElement inputEditFieldHlaElementA2 = $("input[id='edit-field-hla-a-df-und-0-second']");

    @As("inputEditFieldHlaElementB")
    private SelenideElement inputEditFieldHlaElementB = $("input[id='edit-field-hla-b-df-und-0-first']");

    @As("inputEditFieldHlaElementB2")
    private SelenideElement inputEditFieldHlaElementB2 = $("input[id='edit-field-hla-b-df-und-0-second']");

    @As("inputEditFieldHlaElementC")
    private SelenideElement inputEditFieldHlaElementC = $("input[id='edit-field-hla-c-df-und-0-first']");

    @As("inputEditFieldHlaElementC2")
    private SelenideElement inputEditFieldHlaElementC2 = $("input[id='edit-field-hla-c-df-und-0-second']");

    @As("inputEditFieldHlaElementDRB1")
    private SelenideElement inputEditFieldHlaElementDRB1 = $("input[id='edit-field-hla-drb1-df-und-0-first']");

    @As("inputEditFieldHlaElementDEB2")
    private SelenideElement inputEditFieldHlaElementDRB2 = $("input[id='edit-field-hla-drb1-df-und-0-second']");

    @As("inputEditFieldHlaElementDQB1")
    private SelenideElement inputEditFieldHlaElementDQB1 = $("input[id='edit-field-hla-dqb1-df-und-0-first']");

    @As("inputEditFieldHlaElementDQB2")
    private SelenideElement inputEditFieldHlaElementDQB2 = $("input[id='edit-field-hla-dqb1-df-und-0-second']");

    @As("inputEditFieldHlaElementDPB1")
    private SelenideElement inputEditFieldHlaElementDPB1 = $("input[id='edit-field-hla-dpb1-und-0-first']");

    @As("inputEditFieldHlaElementDPB2")
    private SelenideElement inputEditFieldHlaElementDPB2 = $("input[id='edit-field-hla-dpb1-und-0-second']");


    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("inputEditFieldHlaFor2")
    private SelenideElement radioButtonOfPotentialDonor = $("input[id='edit-field-hla-for-whom-und-family-members']");

    @As("selectEditFieldHlaFamily")
    private SelenideElement selectEditFieldHlaFamily = $("select[id='edit-field-hla-family-member-und']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages']");

    @As("laboratory")
    private SelenideElement laboratory = $("li[class$='even']");

    @As("radioButtonForPotentialDonor")
    private SelenideElement radioButtonForPotentialDonor = $(By.id("edit-field-hla-for-whom-und-family-members"));

    @As("inputEditFieldPatientRef")
    private SelenideElement inputEditFieldPatientRef = $("#edit-field-patient-ref-und-0-nid");

    @As("resultsOfPatient")
    private SelenideElement resultsOfPatient = $("#autocomplete");

    @As("selectCenter")
    private SelenideElement selectCenter = $("#edit-og-group-ref-und");

    public CreateHLAPage setInputEditFieldPatientRef(String patientRef) {
        inputEditFieldPatientRef.shouldBe(visible).setValue(patientRef);
        return this;
    }
    public CreateHLAPage clickOnResultsOfPatient() {
        resultsOfPatient.shouldBe(visible).click();
        return this;
    }
    public CreateHLAPage clickTheRadioButtonOfPatient() {
        radioButtonOfPatient.shouldBe(visible).click();
        return this;
    }
    public CreateHLAPage enterTheDescription(String Description) {
        inputEditFieldHlaDescription.shouldBe(visible).setValue(Description);
        return this;
    }
    public CreateHLAPage setSelectEditFieldHlaLaboratory(Laboratory laboratory) {
        selectEditFieldHlaLaboratory.shouldBe(visible).selectOptionContainingText(laboratory.getText());
        return this;
    }
    /*Negative scenario of HLA Laboratory*/
    public CreateHLAPage setSelectEditFieldHlaLaboratory(String laboratory) {
        selectEditFieldHlaLaboratory.shouldBe(visible).selectOptionContainingText(laboratory);
        return this;
    }
    public CreateHLAPage setSelectEditFieldHlaTyping(TypingMethod typing) {
        selectEditFieldHlaTyping.shouldBe(visible).selectOptionByValue(typing.getValue());
        return this;
    }
    public CreateHLAPage enterHlaElementAValue(String elementA) {
        inputEditFieldHlaElementA.shouldBe(visible).setValue(elementA);
        return this;
    }
    public CreateHLAPage enterHlaElementA2Value(String elementA2) {
        inputEditFieldHlaElementA2.shouldBe(visible).setValue(elementA2);
        return this;
    }
    public CreateHLAPage enterHlaElementBValue(String elementB) {
        inputEditFieldHlaElementB.shouldBe(visible).setValue(elementB);
        return this;
    }
    public CreateHLAPage enterHlaElementB2Value(String elementB2) {
        inputEditFieldHlaElementB2.shouldBe(visible).setValue(elementB2);
        return this;
    }
    public CreateHLAPage enterHlaElementCValue(double elementC) {
        inputEditFieldHlaElementC.shouldBe(visible).setValue(String.valueOf(elementC));
        return this;
    }
    public CreateHLAPage enterHlaElementC2Value(String elementC2) {
        inputEditFieldHlaElementC2.shouldBe(visible).setValue(elementC2);
        return this;
    }
    public CreateHLAPage enterHlaElementDRB1Value(String elementDRB1) {
        inputEditFieldHlaElementDRB1.shouldBe(visible).setValue(elementDRB1);
        return this;
    }
    public CreateHLAPage enterHlaElementDRB2Value(String elementDEB2) {
        inputEditFieldHlaElementDRB2.shouldBe(visible).setValue(elementDEB2);
        return this;
    }
    public CreateHLAPage enterHlaElementDQB1Value(String elementDQB1) {
        inputEditFieldHlaElementDQB1.shouldBe(visible).setValue(elementDQB1);
        return this;
    }
    public CreateHLAPage enterHlaElementDQB2Value(String elementDQB2) {
        inputEditFieldHlaElementDQB2.shouldBe(visible).setValue(elementDQB2);
        return this;
    }
    public CreateHLAPage enterHlaElementDPB1Value(String elementDPB1) {
        inputEditFieldHlaElementDPB1.shouldBe(visible).setValue("26:01:02");
        return this;
    }
    public CreateHLAPage enterHlaElementDPB2Value(String elementDPB2) {
        inputEditFieldHlaElementDPB2.shouldBe(visible).setValue(elementDPB2);
        return this;
    }
    public CreateHLAPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public void assertThatHLACreateOrNot() {
        h1PageTitle.shouldBe(visible).shouldHave(text("503719942542700-HLA"));
    }
    public void assertThatCreatedHLA() {
        h1PageTitle.shouldBe(visible).shouldHave(text("HLA"));
    }
    public CreateHLAPage clickOnTheRadioButtonOfThePotentialDonor() {
        radioButtonOfPotentialDonor.shouldBe(visible).click();
        return this;
    }
    public CreateHLAPage setSelectEditFieldHlaFamily(String familyMember) {
        selectEditFieldHlaFamily.shouldBe(visible).selectOptionContainingText(familyMember);
        return this;
    }
    /*Scenario of Potential donor*/
    public void assertThatHLAForPotentialDonorCreateOrNot() {
        h1PageTitle.shouldBe(visible).shouldHave(text("HLA 503719942542700-HLA has been created."));
    }
    public void assertThatErrorMessageWhileCreatingTheHLAForPatient() {
        errorMessage.shouldBe(visible).shouldHave(text("Laboratory field is required."));
    }
    /*Scenario for potential donor*/
    public CreateHLAPage assertThatErrorMessageWhileCreatingTheHLAForPotentialDonor() {
        errorMessage.shouldBe(visible);
        String actualErrorMessage = errorMessage.getText();
        String error2 = "Laboratory field is required.\nSelect Donor field is required.";
        errorMessage.shouldHave(Condition.text(error2));
        return this;
    }

    public CreateHLAPage captureTheLaboratoryLaboratory() {
        Laboratory = laboratory.shouldBe(visible).getText();
        return this;
    }
    public CreateHLAPage clickOnRadioButtonForPotentialDonor() {
        Selenide.switchTo().window(1);
        radioButtonForPotentialDonor.shouldBe(visible).click();
        return this;
    }
    public CreateHLAPage setSelectCentre(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }

    public CreateHLAPage createHLAForHapESearchContent(){
        UserData userData = UserData.getData();
        this.clickTheRadioButtonOfPatient();
        this.enterTheDescription("New HLA for the patient");
        this.setSelectEditFieldHlaLaboratory(userData.getLaboratory());
        this.setSelectEditFieldHlaTyping(userData.getTypingMethod());
        this.enterHlaElementAValue("02:03:01G");
        this.enterHlaElementA2Value("33:03:01G");
        this.enterHlaElementBValue("18:01:01");
        this.enterHlaElementB2Value("52:01:01");
        this.enterHlaElementCValue(Double.parseDouble("07.06"));
        this.enterHlaElementC2Value("14:02:01");
        this.enterHlaElementDRB1Value("07.01.01G");
        this.enterHlaElementDRB2Value("13:01:01");
        this.enterHlaElementDQB1Value("05:02:01G");
        this.enterHlaElementDQB2Value("06.03.01G");
        this.enterHlaElementDPB1Value("26:01:02");
        this.enterHlaElementDPB2Value("26:01:02");
        this.clickOnSaveButton();
        this.assertThatCreatedHLA();
        this.captureTheLaboratoryLaboratory();
        return this;
    }

    public CreateHLAPage createHLA(){
        this.clickTheRadioButtonOfPatient();
        this.enterTheDescription(Description);
        this.setSelectEditFieldHlaLaboratory(LaboratoryForImportHLA);
        this.clickOnSaveButton();
        this.assertThatCreatedHLA();
        this.captureTheLaboratoryLaboratory();
        return this;
    }

    public CreateHLAPage createHLAForPotentialDonor(){
        this.clickOnRadioButtonForPotentialDonor();
        this.setSelectEditFieldHlaFamily(patientRegIDInImportHLAPage + "-Unknown-Lindsay Halvorson V");
        this.enterTheDescription(Description);
        this.setSelectEditFieldHlaLaboratory(LaboratoryForImportHLA);
        this.clickOnSaveButton();
        this.assertThatCreatedHLA();
        this.captureTheLaboratoryLaboratory();
        return this;
    }

}