package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.FamilyMember;
import com.jagriti.bmtplus.pages.miscellaneous.data.TransfusionsFromFamilyMembers;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/node/add/consent/3752739
public class CreateConsentFormPage extends Page<CreateConsentFormPage> {
    protected CreateConsentFormPage() {
        super(CreateConsentFormPage.class);
    }

    @As("inputEditFieldConsentPatient")
    private SelenideElement inputEditFieldConsentPatient = $("#edit-field-consent-patient-und-0-nid");

    @As("selectPatient")
    private SelenideElement selectPatient = $("#edit-field-consent-patient-und-0-nid");
    
    @As("selectEditFieldConsentFamily")
    private SelenideElement selectEditFieldConsentFamily = $("select[id='edit-field-consent-family-member-und']");

    @As("selectEditFieldConsentTemplate")
    private SelenideElement selectEditFieldConsentTemplate = $("select[id='edit-field-consent-template-und-hierarchical-select-selects-0']");

    @As("selectEditFieldConsentTemplate2")
    private SelenideElement selectEditFieldConsentTemplate2 = $("select[name='field_consent_template[und][hierarchical_select][selects][1]']");

    @As("CIBMTRButton")
    private SelenideElement CIBMTRButton = $("#consent-node-form > div > fieldset.collapsible.group-consent-cibmtr-mge.field-group-fieldset.form-wrapper.collapse-processed.collapsed > legend > span");

    @As("selectEditFieldListYes")
    private SelenideElement selectEditFieldListYes = $("select[id='edit-field-list-yes-no-und']");

    @As("selectEditFieldListYes3")
    private SelenideElement selectEditFieldListYes3 = $("select[id='edit-field-list-yes-no-3-und']");

    @As("selectEditFieldListYes4")
    private SelenideElement selectEditFieldListYes4 = $("select[id='edit-field-list-yes-no-4-und']");

    @As("dateOfTheConsent")
    private SelenideElement dateOfTheConsent = $("input[id='edit-field-assessment-date-und-0-value-datepicker-popup-0']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("selectEditCentre")
    private SelenideElement selectEditCentre = $("#edit-og-group-ref-und");

    public CreateConsentFormPage setInputEditFieldConsentPatient(String patient) {
        inputEditFieldConsentPatient.shouldBe(visible).setValue(patient);
        return this;
    }

    public CreateConsentFormPage clickOnResultOfPatient() {
        selectPatient.shouldBe(visible).click();
        return this;
    }
    public CreateConsentFormPage setDirectlyContacted(FamilyMember family) {
        selectEditFieldConsentFamily.shouldBe(visible).selectOptionContainingText(family.getText());
        return this;
    }
    public CreateConsentFormPage setSelectEditFieldConsentTemplate(String template) {
        selectEditFieldConsentTemplate.shouldBe(visible).selectOptionContainingText(template);
        return this;
    }
    public CreateConsentFormPage setSelectEditFieldConsentTemplate2(String template2) {
        selectEditFieldConsentTemplate2.shouldBe(visible).selectOptionContainingText(template2);
        return this;
    }
    public CreateConsentFormPage clickOnCIBMTRButton() {
        CIBMTRButton.shouldBe(visible).click();
        return this;
    }
    public CreateConsentFormPage setIRBApprovedConsentForm(TransfusionsFromFamilyMembers transfusions) {
        selectEditFieldListYes.shouldBe(visible).selectOptionByValue(transfusions.getValue());
        return this;
    }
    public CreateConsentFormPage setDonateResearchBloodSamples(TransfusionsFromFamilyMembers transfusions) {
        selectEditFieldListYes3.shouldBe(visible).selectOptionByValue(transfusions.getValue());
        return this;
    }
    public CreateConsentFormPage setDonorSignedAnIRBApproved(TransfusionsFromFamilyMembers transfusions) {
        selectEditFieldListYes4.shouldBe(visible).selectOptionByValue(transfusions.getValue());
        return this;
    }
    public CreateConsentFormPage enterTheDateOfTheConsent(String dateAsString) {
        dateOfTheConsent.shouldBe(visible).sendKeys(dateAsString);
        return this;
    }
    public CreateConsentFormPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateConsentFormPage assertThatConsentFormCreatedOrNot() {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text("Unified Database Enrolment and HLA Typing Consent Form@17854041663600"));
        return this;
    }

    public CreateConsentFormPage setSelectEditCentre(String centre) {
        selectEditCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }

    public UserData userData;


    public CreateConsentFormPage createConsentForm(){
        userData = UserData.getData();
        this.setSelectEditFieldConsentTemplate("Clinical Forms");
        this.setSelectEditFieldConsentTemplate2("Discharge Summary (TEST CENTRE)");
        this.clickOnCIBMTRButton();
        this.setIRBApprovedConsentForm(userData.getTransfusionsFromFamilyMembers());
        this.setDonateResearchBloodSamples(userData.getTransfusionsFromFamilyMembers());
        this.setDonorSignedAnIRBApproved(userData.getTransfusionsFromFamilyMembers());
        this.enterTheDateOfTheConsent(userData.getDateOfConsent());
        this.clickOnSaveButton();
        return this;
    }

}