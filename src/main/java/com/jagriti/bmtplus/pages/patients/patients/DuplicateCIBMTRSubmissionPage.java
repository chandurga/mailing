package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.data.SubmissionID;

import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/cibmtr-submission?field_submission_patient=[field_submission_patient]
public class DuplicateCIBMTRSubmissionPage extends Page<DuplicateCIBMTRSubmissionPage> {
    protected DuplicateCIBMTRSubmissionPage() {
        super(DuplicateCIBMTRSubmissionPage.class);
    }

    @As("inputEditFieldSubmissionPatient")
    private SelenideElement inputEditFieldSubmissionPatient = $("input[id='edit-field-submission-patient-und-0-target-id']");

    @As("selectEditFieldSubmissionForm")
    private SelenideElement selectEditFieldSubmissionForm = $("select[id='edit-field-submission-form-id-und']");


    @As("inputEditFieldTransplantSummary")
    private SelenideElement inputEditFieldTransplantSummary = $("input[id='edit-field-transplant-summary-und-0-target-id']");

    @As("autoSelect")
    private SelenideElement autoSelect = $x("//*[@id='autocomplete']");

    @As("selectCenterInTheOptions")
    private SelenideElement selectCenterInTheOptions = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("errorMessageThisForm")
    private SelenideElement errorMessageThisForm = $("div[class^='messages']");
    
    


    public DuplicateCIBMTRSubmissionPage enterTheSubmissionPatientId(String patientId) {
        inputEditFieldSubmissionPatient.shouldBe(Condition.visible).setValue(patientId);
        return this;
    }
    public DuplicateCIBMTRSubmissionPage enterTheAutoSelectOfResult() {
        autoSelect.shouldBe(Condition.visible).click();
        return this;
    }
    public DuplicateCIBMTRSubmissionPage setSelectEditFieldSubmissionForm(String submissionForm) {
        selectEditFieldSubmissionForm.should(Condition.visible).selectOptionContainingText(submissionForm);
        return this;
    }
    /*For Product Type class*/
    public DuplicateCIBMTRSubmissionPage setSelectEditFieldSubmissionForm(SubmissionID submissionForm) {
        selectEditFieldSubmissionForm.should(Condition.visible).selectOptionContainingText(submissionForm.getText());
        return this;
    }
    public DuplicateCIBMTRSubmissionPage setInputEditFieldTransplantSummary(String transplantSummary) {
        inputEditFieldTransplantSummary.shouldBe(Condition.visible).setValue(transplantSummary);
        return this;
    }
    public DuplicateCIBMTRSubmissionPage setSelectCentreInTheOptions(String centre) {
        selectCenterInTheOptions.shouldBe(Condition.visible).selectOptionContainingText(centre);
        return this;
    }
    public DuplicateCIBMTRSubmissionPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(Condition.visible).click();
        return this;
    }
    public DuplicateCIBMTRSubmissionPage assertThatErrorMessageThisForm() {
        errorMessageThisForm.shouldBe(Condition.visible).shouldHave(Condition.text("This form requires that the fields Submission Form ID, Submission Patient, Reference are a unique combination. The specified values are already used. Matches are found in the following content:\n" +
                "Form 2804 – Initial Patient Registration for TSA231464"));
        return this;
    }
}