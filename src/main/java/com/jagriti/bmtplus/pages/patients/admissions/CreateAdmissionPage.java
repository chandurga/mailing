package com.jagriti.bmtplus.pages.patients.admissions;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.admissions.data.DepartmentsVisited;
import com.jagriti.bmtplus.pages.patients.admissions.data.Reason2;
import com.jagriti.bmtplus.pages.patients.admissions.data.Reason3;
import com.jagriti.bmtplus.pages.patients.admissions.data.ReasonForAdmission;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/admissions?field_admission_patient=3754076
public class CreateAdmissionPage extends Page<CreateAdmissionPage> {
    protected CreateAdmissionPage() {
        super(CreateAdmissionPage.class);
    }

    @As("inputEditFieldAdmissionPatient")
    private SelenideElement inputEditFieldAdmissionPatient = $("input[id='edit-field-admission-patient-und-0-target-id']");

    @As("selectAppearedResultOfPatient")
    private SelenideElement selectAppearedResultOfPatient = $x("//*[@id='autocomplete']");

    @As("selectEditFieldNextVisit")
    private SelenideElement selectEditFieldNextVisit = $("select[id='edit-field-next-visit-departments-und']");

    @As("selectEditFieldAdmissionReason")
    private SelenideElement selectEditFieldAdmissionReason = $("select[name='field_admission_reason[und][hierarchical_select][selects][0]']");

    @As("addButton")
    private SelenideElement addButton = $x("//*[@value='Add']");

    @As("selectEditFieldAdmissionReason2")
    private SelenideElement selectEditFieldAdmissionReason2 = $("select[id='edit-field-admission-reason-und-hierarchical-select-selects-1']");

    @As("selectCenter")
    private SelenideElement selectCenter = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");
    
    


    public CreateAdmissionPage setInputEditFieldAdmissionPatient(String patient) {
        inputEditFieldAdmissionPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public CreateAdmissionPage clickOnSelectAppearedResultOfPatient() {
        selectAppearedResultOfPatient.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public CreateAdmissionPage setSelectEditFieldDepartmentsVisited(DepartmentsVisited visited) {
        selectEditFieldNextVisit.shouldBe(visible).selectOptionContainingText(visited.getText());
        return this;
    }
    public CreateAdmissionPage setSelectEditFieldAdmissionReason(ReasonForAdmission reasonForAdmission) {
        selectEditFieldAdmissionReason.shouldBe(visible).selectOptionContainingText(reasonForAdmission.getText());
        return this;
    }
    public CreateAdmissionPage setSelectEditFieldAdmissionReasonFields(Reason2 reason2, Reason3 reason3) {
        String reason = selectEditFieldAdmissionReason.shouldBe(visible).getText();
        if(reason.equalsIgnoreCase("Donor Admission")){
            addButton.shouldBe(visible).click();
        } else if (reason.equalsIgnoreCase("Emergency")) {
            selectEditFieldAdmissionReason2.shouldBe(visible).selectOptionContainingText(reason2.getText());
            addButton.shouldBe(visible).click();
        }else {
            selectEditFieldAdmissionReason2.shouldBe(visible).selectOptionContainingText(reason3.getText());
            addButton.shouldBe(visible).click();
        }
        return this;
    }
    public CreateAdmissionPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public CreateAdmissionPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateAdmissionPage assertThatSuccessMessage() {
        successMessage.shouldBe(visible).shouldHave(Condition.text("Admissions @ 420677831389500"));
        return this;
    }
    public CreateAdmissionPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Reason for Admission field is required."));
        return this;
    }
}