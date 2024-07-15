package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.Drugs;
import com.jagriti.bmtplus.pages.miscellaneous.data.Mucositis;
import com.jagriti.bmtplus.pages.miscellaneous.data.Shift;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3752761
public class NurseNotePage extends Page<NurseNotePage> {
    protected NurseNotePage() {
        super(NurseNotePage.class);
    }

    @As("linkAddNewNursingNote")
    private SelenideElement linkAddNewNursingNote = $(byText("Add New Nursing Note"));

    @As("selectEditFieldNursingNote")
    private SelenideElement selectEditFieldNursingNote = $("select[id='edit-field-nursing-note-shift-und']");

    @As("selectEditFieldNursingNote2")
    private SelenideElement selectEditFieldNursingNote2 = $("select[id='edit-field-nursing-note-mucositis-und']");

    @As("inputEditFieldNursingNote")
    private SelenideElement inputEditFieldNursingNote = $("input[id='edit-field-nursing-note-weight-und-0-value']");

    @As("inputEditFieldSystolic")
    private SelenideElement inputEditFieldSystolic = $("input[id='edit-field-nursing-note-bp-systolic-und-0-value']");

    @As("inputEditFieldDiastolic")
    private SelenideElement inputEditFieldDiastolic = $("input[id='edit-field-nursing-note-bp-diastolic-und-0-value']");

    @As("selectEditFieldDrugs")
    private SelenideElement selectEditFieldDrugs = $("select[id='edit-field-nursing-note-drugs-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("liTheChangesHaveBeen")
    private SelenideElement liTheChangesHaveBeen = $(byText("The changes have been saved."));

    @As("linkViewOfClinicalCourse")
    private SelenideElement linkViewOfClinicalCourse = $("td[class$='views-field-title'] a");


    public NurseNotePage clickOnLinkViewOfClinicalCourse() {
        linkViewOfClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public NurseNotePage clickOnLinkAddNewNursingNote() {
        linkAddNewNursingNote.shouldBe(visible).click();
        return this;
    }
    public NurseNotePage setSelectEditFieldNursingNote(Shift shift) {
        selectEditFieldNursingNote.shouldBe(visible).selectOptionByValue(shift.getValue());
        return this;
    }
    public NurseNotePage setSelectEditFieldNursingNote2(Mucositis mucositis) {
        selectEditFieldNursingNote2.shouldBe(visible).selectOptionContainingText(mucositis.getText());
        return this;
    }
    public NurseNotePage setInputEditFieldNursingNote(int weight) {
        inputEditFieldNursingNote.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }
    public NurseNotePage setInputEditFieldSystolic(int systolic) {
        inputEditFieldSystolic.shouldBe(visible).setValue(String.valueOf(systolic));
        return this;
    }
    public NurseNotePage setInputEditFieldDiastolic(int diastolic) {
        inputEditFieldDiastolic.shouldBe(visible).setValue(String.valueOf(diastolic));
        return this;
    }
    public NurseNotePage setSelectEditFieldDrugs(Drugs drugs) {
        selectEditFieldDrugs.shouldBe(visible).selectOptionContainingText(drugs.getText());
        return this;
    }
    public NurseNotePage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public NurseNotePage assertThatNurseNotesCreatedOrNot() {
        liTheChangesHaveBeen.shouldBe(visible).shouldHave(Condition.text("The changes have been saved."));
        return this;
    }
}
