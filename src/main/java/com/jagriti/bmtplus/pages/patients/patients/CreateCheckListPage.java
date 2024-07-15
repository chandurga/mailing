package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/checklist/3752290
public class CreateCheckListPage extends Page<CreateCheckListPage> {
    protected CreateCheckListPage() {
        super(CreateCheckListPage.class);
    }

    @As("selectEditFieldChecklistTerm")
    private SelenideElement selectEditFieldChecklistTerm = $("select[id='edit-field-checklist-term-ref-und']");

    @As("selectCenter")
    private SelenideElement selectCenter = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkMarkAsDone")
    private SelenideElement linkMarkAsDone = $("#block-views-checklist-items-block-block > div > div > div > div > table > tbody > tr:nth-child(2) > td.views-field.views-field-nothing > span > a");

    @As("divErrorMessage")
    private SelenideElement divErrorMessage = $("div[class^='messages error']");

    @As("inputEditFieldChecklistPatient")
    private SelenideElement inputEditFieldChecklistPatient = $("#edit-field-checklist-patient-ref-und-0-target-id");

    @As("selectAutoResult")
    private SelenideElement selectAutoResult = $("#autocomplete");



    public CreateCheckListPage setInputEditFieldChecklistPatient(String patient) {
        inputEditFieldChecklistPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public CreateCheckListPage clickOnAutoResult() {
        selectAutoResult.shouldBe(visible).click();
        return this;
    }
    public CreateCheckListPage setSelectEditFieldChecklistTerm(String checklistTerm) {
        selectEditFieldChecklistTerm.shouldBe(visible).selectOptionContainingText(checklistTerm);
        return this;
    }
    public CreateCheckListPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public CreateCheckListPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateCheckListPage clickOnMarkAsDoneLink() {
        linkMarkAsDone.shouldBe(visible).click();
        return this;
    }
    public CreateCheckListPage assertThatErrorMessage() {
        divErrorMessage.shouldBe(visible).shouldHave(Condition.text("Checklist field is required."));
        return this;
    }

}