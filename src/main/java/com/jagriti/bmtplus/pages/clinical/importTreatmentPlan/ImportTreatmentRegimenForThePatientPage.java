package com.jagriti.bmtplus.pages.clinical.importTreatmentPlan;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/treatment_plan_batch_migration
public class ImportTreatmentRegimenForThePatientPage extends Page<ImportTreatmentRegimenForThePatientPage> {
    protected ImportTreatmentRegimenForThePatientPage() {
        super(ImportTreatmentRegimenForThePatientPage.class);
    }

    @As("inputEditCode")
    private SelenideElement inputEditCode = $("input[id='edit-code']");

    @As("inputEditIgnorePastOrders")
    private SelenideElement inputEditIgnorePastOrders = $("input[id='edit-ignore-past-orders']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("liDayActiveIngredientFludarabine")
    private SelenideElement liDayActiveIngredientFludarabine = $("li.message-item");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages']");



    public ImportTreatmentRegimenForThePatientPage enterPatientCode(String patientCode) {
        inputEditCode.shouldBe(visible).setValue(patientCode);
        return this;
    }
    public ImportTreatmentRegimenForThePatientPage clickOnRadioButtonOfIgnorePastOrders() {
        inputEditIgnorePastOrders.shouldBe(visible).click();
        return this;
    }
    public ImportTreatmentRegimenForThePatientPage clickOnSubmitButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public ImportTreatmentRegimenForThePatientPage assertThatTreatmentPlanOfTheMedicine() {
        liDayActiveIngredientFludarabine.shouldBe(visible).shouldHave(Condition.text("1 Day"));
        return this;
    }
    public ImportTreatmentRegimenForThePatientPage assertThatErrorMessageWhileImportingTheTreatmentPlan() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("The treatment regimen does not exist for the patient 143143 to import"));
        return this;
    }
}