package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.ChelationTherapy;
import com.jagriti.bmtplus.pages.miscellaneous.data.FacialChanges;
import com.jagriti.bmtplus.pages.miscellaneous.data.SpontaneousHb;
import com.jagriti.bmtplus.pages.miscellaneous.data.TransfusionsFromFamilyMembers;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/disease-summary/3752686
@Slf4j
public class CreateDiseaseSpecificSummaryPage extends Page<CreateDiseaseSpecificSummaryPage> {
    protected CreateDiseaseSpecificSummaryPage() {
        super(CreateDiseaseSpecificSummaryPage.class);
    }

    @As("spanDiseaseSpecificEvaluation")
    private SelenideElement spanDiseaseSpecificEvaluation=$(byText("Disease-specific evaluation"));

    @As("linkAddNewDiseaseSummary")
    private SelenideElement linkAddNewDiseaseSummary=$("#quicktabs-tabpage-patient_summary_pre_bmt-2 > div > div > div > a");

    @As("inputSummaryTitle")
    private SelenideElement inputSummaryTitle = $("input[id='edit-field-dis-summ-title-mig-und-0-value']");

    @As("inputFieldDate")
    private SelenideElement inputFieldDate = $("input[id='edit-field-dis-summ-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldAgeAtDiagnosis")
    private SelenideElement inputEditFieldAgeAtDiagnosis=$("input[id='edit-field-dis-summ-diagnosis-age-und-0-value']");

    @As("inputEditFieldPatientTreatment")
    private SelenideElement inputEditFieldPatientTreatment = $("input[id='edit-field-patient-treatment-center-und-0-value']");

    @As("centerAppeared")
    private SelenideElement centerAppeared = $("div[class='reference-autocomplete']");

    @As("selectEditFieldThalSpontaneous")
    private SelenideElement selectEditFieldThalSpontaneous = $("select[id='edit-field-thal-spontaneous-hb-und']");

    @As("selectEditFieldThalFacial")
    private SelenideElement selectEditFieldThalFacial = $("select[id='edit-field-thal-facial-changes-und']");

    @As("selectEditFieldThalPoor")
    private SelenideElement selectEditFieldThalPoor = $("select[id='edit-field-thal-poor-growth-und']");

    @As("selectEditFieldThalPathological")
    private SelenideElement selectEditFieldThalPathological = $("select[id='edit-field-thal-pathological-fracture-und']");

    @As("selectEditFieldThalExtramedullary")
    private SelenideElement selectEditFieldThalExtramedullary = $("select[id='edit-field-thal-extramedullary-hemato-und']");

    @As("selectTransfusionsFromFamilyMembers")
    private SelenideElement selectTransfusionsFromFamilyMembers = $("select[id='edit-field-list-yes-no-und']");

    @As("selectEditFieldDisSumm")
    private SelenideElement selectEditFieldDisSumm = $("select[id='edit-field-dis-summ-chelation-therapy-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("message")
    private SelenideElement message = $("h1[id='page-title']");

    @As("h2ErrorMessage")
    private SelenideElement h2ErrorMessage = $("#messages > div");

    @As("setPatient")
    private SelenideElement setPatient = $("#edit-field-dis-sum-patient-ref-und-0-nid");
    
    @As("autoComplete")
    private SelenideElement autoComplete = $("#autocomplete");

    @As("selectEditCentre")
    public SelenideElement selectEditCentre = $("#edit-og-group-ref-und");


    public CreateDiseaseSpecificSummaryPage enterThePatient(String patient) {
        setPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public CreateDiseaseSpecificSummaryPage clickOnAutoResults() {
        autoComplete.shouldBe(visible).click();
        return this;
    }
    public CreateDiseaseSpecificSummaryPage clickOnDiseaseSpecificEvaluation() {
        spanDiseaseSpecificEvaluation.shouldBe(visible).click();
        return this;
    }
    public CreateDiseaseSpecificSummaryPage clickOnLinkAddNewDiseaseSummary() {
        linkAddNewDiseaseSummary.shouldBe(visible).click();
        return this;
    }
    public CreateDiseaseSpecificSummaryPage enterTheInputSummaryTitle(String title) {
        inputSummaryTitle.shouldBe(visible).setValue(title);
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setInputFieldDate(String dateAsString) {
        inputFieldDate.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setInputEditFieldAgeAtDiagnosis(String age) {
        inputEditFieldAgeAtDiagnosis.shouldBe(visible).setValue(age);
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setInputEditFieldPatientTreatment(String centre) {
        inputEditFieldPatientTreatment.shouldBe(visible).setValue(centre);
        return this;
    }
    public CreateDiseaseSpecificSummaryPage clickOnCenterAppeared() {
        centerAppeared.shouldBe(visible).click();
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldThalSpontaneous(SpontaneousHb hb) {
        selectEditFieldThalSpontaneous.shouldBe(visible).selectOptionByValue(hb.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldThalFacial(FacialChanges facial) {
        selectEditFieldThalFacial.shouldBe(visible).selectOptionByValue(facial.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldThalPoor(FacialChanges facialChanges) {
        selectEditFieldThalPoor.shouldBe(visible).selectOptionByValue(facialChanges.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldThalPathological(FacialChanges facialChanges) {
        selectEditFieldThalPathological.shouldBe(visible).selectOptionByValue(facialChanges.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldThalExtramedullary(FacialChanges facialChanges) {
        selectEditFieldThalExtramedullary.shouldBe(visible).selectOptionByValue(facialChanges.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectTransfusionsFromFamilyMembers(TransfusionsFromFamilyMembers transfusions) {
        selectTransfusionsFromFamilyMembers.shouldBe(visible).selectOptionByValue(transfusions.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditFieldDisSumm(ChelationTherapy chelationTherapy) {
        selectEditFieldDisSumm.shouldBe(visible).selectOptionByValue(chelationTherapy.getValue());
        return this;
    }
    public CreateDiseaseSpecificSummaryPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateDiseaseSpecificSummaryPage assertThatDiseaseSummaryCreatedOrNot() {
        message.shouldBe(visible).getText();
        log.info(String.valueOf(message));
        return this;
    }
    public CreateDiseaseSpecificSummaryPage assertErrorMessage() {
        h2ErrorMessage.shouldBe(visible).shouldHave(Condition.text("This form requires that the fields Disease, Patient are a unique combination. The specified values are already used. Matches are found in the following content:\n" +
                "Severe Thalassemia (major or intermedia) Specific Summary @ 446525106662800"));
        return this;
    }
    public CreateDiseaseSpecificSummaryPage setSelectEditCentre( ) {
        selectEditCentre.shouldBe(visible).selectOptionContainingText("Test Centre (TSA)");
        return this;
    }

    public CreateDiseaseSpecificSummaryPage createDiseaseSpecificSummary(){
        UserData userData = UserData.getData();
        this.clickOnDiseaseSpecificEvaluation();
        this.clickOnLinkAddNewDiseaseSummary();
        this.enterTheInputSummaryTitle(userData.getTitle());
        this.setInputFieldDate(userData.getDateForDisease());
        this.setInputEditFieldAgeAtDiagnosis("5");
        this.setInputEditFieldPatientTreatment("test");
        this.clickOnCenterAppeared();
        this.setSelectEditFieldThalSpontaneous(userData.getSpontaneousHb());
        this.setSelectEditFieldThalFacial(userData.getFacialChanges());
        this.setSelectEditFieldThalPoor(userData.getFacialChanges());
        this.setSelectEditFieldThalPathological(userData.getFacialChanges());
        this.setSelectEditFieldThalExtramedullary(userData.getFacialChanges());
        this.setSelectTransfusionsFromFamilyMembers(userData.getTransfusionsFromFamilyMembers());
        this.setSelectEditFieldDisSumm(userData.getChelationTherapy());
        this.clickOnSaveButton();
        this.and();
        this.assertThatDiseaseSummaryCreatedOrNot();
        return this;
    }

}