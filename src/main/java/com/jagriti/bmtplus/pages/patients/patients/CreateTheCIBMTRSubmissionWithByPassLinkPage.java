package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://bmtplus.com/node/add/cibmtr-submission
public class CreateTheCIBMTRSubmissionWithByPassLinkPage extends Page<CreateTheCIBMTRSubmissionWithByPassLinkPage> {
    protected CreateTheCIBMTRSubmissionWithByPassLinkPage() {
        super(CreateTheCIBMTRSubmissionWithByPassLinkPage.class);
    }

    @As("inputEditNotificationCheckBox")
    public SelenideElement inputEditNotificationCheckBox = $("input[id='edit-ji-notification']");

    @As("inputEditFieldSubmissionPatient")
    private SelenideElement inputEditFieldSubmissionPatient = $("input[id='edit-field-submission-patient-und-0-target-id']");

    @As("inputEditAutoSelectLink")
    private SelenideElement inputEditAutoSelectLink = $x("//*[@id='autocomplete']");

    @As("inputEditFieldSubmissionFromId")
    private SelenideElement inputEditFieldSubmissionFromId = $("a[class='chosen-single'] span");

    @As("enterTheInputOfSubmissionId")
    private SelenideElement enterTheInputOfSubmissionId = $("div[class='chosen-search'] input");

    @As("inputEditFieldFormId")
    private SelenideElement inputEditFieldFormId = $("#edit_field_submission_form_id_und_chosen > div > ul > li:nth-child(1)");

    @As("inputEditFieldCentre")
    private SelenideElement inputEditFieldCentre = $("input[class='default']");

    @As("selectTheCenterInTheList")
    private SelenideElement selectTheCenterInTheList = $("#edit_og_group_ref_und_chosen > div > ul > li:nth-child(1)");

    @As("inputEditSaveButton")
    private SelenideElement inputEditSaveButton = $("input[id='edit-submit']");

    @As("byPassLink")
    private SelenideElement byPassLink = $("div[class^='messages'] p");

    @As("linkHere")
    private SelenideElement linkHere = $("a[onclick*='override']");

    @As("statusMessageSubmissionForm")
    private SelenideElement statusMessageSubmissionForm = $("div[class^='messages']");

    
    
    
    
    

    public CreateTheCIBMTRSubmissionWithByPassLinkPage clickOnInputEditNotificationCheckBox() {
        inputEditNotificationCheckBox.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage enterThePatientId(String patientId) {
        inputEditFieldSubmissionPatient.shouldBe(visible).setValue(patientId);
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage clickOnResultsOfAutoSelectLink() {
        inputEditAutoSelectLink.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage clickOnInputEditFieldSubmissionFromId() {
        inputEditFieldSubmissionFromId.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage setEnterTheInputOfSubmissionId(String submissionId) {
        enterTheInputOfSubmissionId.shouldBe(visible).setValue(submissionId);
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage selectInputEditFieldFormId() {
        inputEditFieldFormId.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage enterTheCenterName(String centre) {
        inputEditFieldCentre.shouldBe(visible).setValue(centre);
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage setSelectTheCenterInTheList() {
        selectTheCenterInTheList.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage clickOnSaveButton() {
        inputEditSaveButton.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage assertThatByPassLinkMessage() {
        byPassLink.shouldBe(visible).shouldHave(Condition.text("Click here to bypass this check and resubmit."));
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage clickOnLinkHere() {
        linkHere.shouldBe(visible).click();
        return this;
    }
    public CreateTheCIBMTRSubmissionWithByPassLinkPage assertThatStatusMessageSubmissionForm() {
        statusMessageSubmissionForm.shouldBe(visible).shouldHave(Condition.text("CIBMTR Submission Form 2814 – Indication for CRID Assignment for TEST1712 has been created."));
        return this;
    }
}