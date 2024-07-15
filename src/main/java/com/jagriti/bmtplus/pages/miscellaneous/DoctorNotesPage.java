package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.NoteType;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/field-collection/field-cc-doctor-notes-fc/add/node/3752782?destination=node/3752782
public class DoctorNotesPage extends Page<DoctorNotesPage> {
    protected DoctorNotesPage() {
        super(DoctorNotesPage.class);
    }

    @As("linkAddNewDoctorsNote")
    private SelenideElement linkAddNewDoctorsNote = $(byText("Add New Doctors Note"));


    @As("inputEditFieldDoctorNotes")
    private SelenideElement inputEditFieldDoctorNotes = $("input[id='edit-field-cc-doctor-notes-summary-und-0-value']");

    @As("selectEditFieldDoctorNote")
    private SelenideElement selectEditFieldDoctorNote = $("select[id='edit-field-cc-doctor-note-type-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkDurgaprasad")
    private SelenideElement linkDurgaprasad = $("td[class$='views-field-field-cc-doctor-name-ref'] a");

    @As("linkViewOfClinicalCourse")
    private SelenideElement linkViewOfClinicalCourse = $("td[class$='views-field-title'] a");

    public DoctorNotesPage clickOnLinkViewOfClinicalCourse() {
        linkViewOfClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public DoctorNotesPage enterSummaryOfTheDoctorNotes(String summary) {
        inputEditFieldDoctorNotes.shouldBe(visible).setValue(summary);
        return this;
    }
    public DoctorNotesPage setSelectEditFieldDoctorNote(NoteType note) {
        selectEditFieldDoctorNote.shouldBe(visible).selectOptionByValue(note.getValue());
        return this;
    }
    public DoctorNotesPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public DoctorNotesPage assertThatDoctorNotesCreatedOrNot() {
        linkDurgaprasad.shouldBe(visible).shouldHave(Condition.exactText("durgaprasad"));
        return this;
    }
    public DoctorNotesPage clickOnAddDoctorNotesButton() {
        linkAddNewDoctorsNote.shouldBe(visible).click();
        return this;
    }
}
