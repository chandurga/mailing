package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://bmtplus.com/node/add/patient
public class CreateCIBMTRSubmissionWithFollowUpPage extends Page<CreateCIBMTRSubmissionWithFollowUpPage> {
    
    public static String patientRegistrationId;
    protected CreateCIBMTRSubmissionWithFollowUpPage() {
        super(CreateCIBMTRSubmissionWithFollowUpPage.class);
    }

    @As("inputEditFieldDisease")
    private SelenideElement inputEditFieldDisease = $("div[id='edit_field_patient_disease_und_chosen'] a[class='chosen-single']");

    @As("selectTheDisease")
    private SelenideElement selectTheDisease = $("li[data-option-array-index='1']");

    @As("centerTab")
    private SelenideElement centerTab = $("div[id='edit_og_group_ref_und_chosen'] ul[class='chosen-choices']");

    @As("selectCenter")
    private SelenideElement selectCenter = $("li[data-option-array-index='97']");

    @As("linkBasicDetails")
    private SelenideElement linkBasicDetails = $("li[class$='horizontal-tab-button-1'] a");

    @As("inputEditFieldPatientName")
    private SelenideElement inputEditFieldPatientName = $("input[id='edit-field-patient-name-und-0-value']");

    @As("inputEditFieldPatientUhid")
    private SelenideElement inputEditFieldPatientUhid = $("input[id='edit-field-patient-uhid-und-0-value']");

    @As("inputEditFieldPatientDateOfBirth")
    private SelenideElement inputEditFieldPatientDateOfBirth = $("input[id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldPatientGender")
    private SelenideElement inputEditFieldPatientGender = $("input[id='edit-field-patient-gender-und-male']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkOfCIBMTR")
    private SelenideElement linkOfCIBMTR = $("#quicktabs-tab-patient_summary_pre_bmt-18 span[class='link-badge-text']");

    @As("buttonAddNewCIBMTRSubmission")
    private SelenideElement buttonAddNewCIBMTRSubmission = $("a[class$='button']");

    @As("selectEditFieldSubmissionFollow")
    private SelenideElement selectEditFieldSubmissionFollow = $("select[id='edit-field-submission-follow-up-und']");

    @As("inputEditFieldCentre")
    private SelenideElement inputEditFieldCentre = $("input[class='default']");

    @As("selectTheCenterInTheList")
    private SelenideElement selectTheCenterInTheList = $("#edit_og_group_ref_und_chosen > div > ul > li:nth-child(1)");

    @As("statusMessageSubmissionForm")
    private SelenideElement statusMessageSubmissionForm = $("div[class^='messages']");

    @As("linkAddNewSubmission")
    private SelenideElement linkAddNewSubmission = $("a[class*='button']");

    @As("errorMessage")
    private SelenideElement errorMessage = $x("//*[@class=\"messages error\"]");
    
    
    
    
    

    public CreateCIBMTRSubmissionWithFollowUpPage clickOnInputEditFieldDisease() {
        inputEditFieldDisease.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage setSelectTheDisease() {
        selectTheDisease.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnCenterTab() {
        centerTab.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage setSelectCenter() {
        selectCenter.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnLinkBasicDetails() {
        linkBasicDetails.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage enterThePatientName(String name) {
        inputEditFieldPatientName.shouldBe(visible).setValue(name);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage enterThePatientUhid(String uhid) {
        inputEditFieldPatientUhid.shouldBe(visible).setValue(uhid);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage enterThePatientDateOfBirth(String dateOfBirth) {
        inputEditFieldPatientDateOfBirth.shouldBe(visible).setValue(dateOfBirth);
        inputEditFieldPatientDateOfBirth.shouldBe(visible).sendKeys(Keys.ENTER);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnThePatientGender() {
        inputEditFieldPatientGender.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage captureThePatientID() {
        patientRegistrationId = patientID.shouldBe(visible).getText();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnLinkOfCIBMTR() {
        linkOfCIBMTR.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnAddNewCIBMTRSubmissionButton() {
        buttonAddNewCIBMTRSubmission.scrollIntoView(true).shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage setSelectEditFieldSubmissionFollow(String followUp) {
        selectEditFieldSubmissionFollow.shouldBe(visible).selectOptionContainingText(followUp);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage enterTheCenterName(String centre) {
        inputEditFieldCentre.shouldBe(visible).setValue(centre);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage setSelectTheCenterInTheList() {
        selectTheCenterInTheList.shouldBe(visible).click();
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage assertThatStatusMessageSubmissionForm() {
        statusMessageSubmissionForm.shouldBe(visible).shouldHave(Condition.text("Status message\n" +
                "CIBMTR Submission Form 2100 – Post-HSCT Follow-Up for " +patientRegistrationId+ " has been created."));
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnLinkAddNewSubmission() {
        linkAddNewSubmission.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage clickOnLinkAddNewSubmissionAgain() {
        linkAddNewSubmission.shouldBe(visible).click();
        Selenide.switchTo().window(3);
        return this;
    }
    public CreateCIBMTRSubmissionWithFollowUpPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("This form requires that the fields Submission Form ID, Patient, Follow Up, Follow Up Year, Reference are a unique combination. The specified values are already used. Matches are found in the following content:\n" +
                "Form 2100 – Post-HSCT Follow-Up for " +patientRegistrationId +
                " Click here to bypass this check and resubmit."));
        return this;
    }
}