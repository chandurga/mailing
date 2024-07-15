package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.data.Complication;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/patient-complication?field_complication_patient=3754076
public class AddNewComplicationPage extends Page<AddNewComplicationPage> {
    protected AddNewComplicationPage() {
        super(AddNewComplicationPage.class);
    }

    @As("inputEditFieldComplicationPatient")
    private SelenideElement inputEditFieldComplicationPatient = $("input[id='edit-field-complication-patient-und-0-target-id']");

    @As("inputEditFieldComplicationPatient")
    private SelenideElement selectThePatient = $x("//*[@id='autocomplete']");

    @As("selectEditFieldComplicationUnd")
    private SelenideElement selectEditFieldComplicationUnd = $("select[id='edit-field-complication-complication-und']");

    @As("inputEditFieldComplicationTransplant")
    private SelenideElement inputEditFieldComplicationTransplant = $("input[id='edit-field-complication-transplant-und-0-target-id']");

    @As("inputEditFieldTransplantDate")
    private SelenideElement inputEditFieldTransplantDate = $("input[id='edit-field-complication-diagnosis-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldTransplantDateResolution")
    private SelenideElement inputEditFieldTransplantDateResolution = $("input[id='edit-field-complication-diagnosis-und-0-value-datepicker-popup-0']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");




    public AddNewComplicationPage clickOnComplicationPatient(String patient) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        inputEditFieldComplicationPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public AddNewComplicationPage clickOnComplicationPatient() {
        selectThePatient.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public AddNewComplicationPage setSelectEditFieldComplicationUnd(Complication complicationUnd) {
        selectEditFieldComplicationUnd.shouldBe(visible).selectOptionContainingText(complicationUnd.getText());
        return this;
    }
    public AddNewComplicationPage setSelectEditFieldComplicationUnd(String complicationUnd) {
        selectEditFieldComplicationUnd.shouldBe(visible).selectOptionContainingText(complicationUnd);
        return this;
    }
    public AddNewComplicationPage setInputEditFieldComplicationTransplant(String transplant) {
        inputEditFieldComplicationTransplant.shouldBe(visible).setValue(transplant);
        return this;
    }
    public AddNewComplicationPage setInputEditFieldTransplantDate(String dateAsString) {
        inputEditFieldTransplantDate.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public AddNewComplicationPage setInputEditFieldTransplantDateResolution(String dateResolution) {
        inputEditFieldTransplantDateResolution.shouldBe(visible).setValue(dateResolution);
        return this;
    }
    public AddNewComplicationPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewComplicationPage assertThatSuccessMessageComplicationCreateOrNot(PatientData patientData) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        successMessage.shouldBe(visible).shouldHave(Condition.text(patientData.getComplication().getText()+"@420677831389500"));
        return this;
    }
    public AddNewComplicationPage assertThatSuccessMessageComplicationCreateOrNotForaGVHD() {
        successMessage.shouldBe(visible).shouldHave(Condition.text("@420677831389500"));
        return this;
    }
    public AddNewComplicationPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Complication field is required."));
        return this;
    }

}