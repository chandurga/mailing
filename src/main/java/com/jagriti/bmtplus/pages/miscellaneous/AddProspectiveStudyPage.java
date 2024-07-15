package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.GranulocyteMapOnDashboardPage;
import com.jagriti.bmtplus.pages.patients.patients.data.StudyCategory;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/prospective-study
@Slf4j
public class AddProspectiveStudyPage extends Page<AddProspectiveStudyPage> {

    protected AddProspectiveStudyPage() {
        super(AddProspectiveStudyPage.class);
    }

    public static String PATIENT_ID;
    public static String PATIENT_NAME;

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("#edit-title");

    @As("selectEditFieldStudyAuto")
    private SelenideElement selectEditFieldStudyAuto = $("#edit-field-study-auto-enrolment-und");

    @As("selectEditFieldStudyAuto2")
    private SelenideElement selectEditFieldStudyMainInvestors = $("#edit-field-study-main-investigators-und");

    @As("inputEditFieldStudyStart")
    private SelenideElement inputEditFieldStudyStart = $("#edit-field-study-start-date-und-0-value-datepicker-popup-0");

    @As("inputEditFieldStudyEnd")
    private SelenideElement inputEditFieldStudyEnd = $("#edit-field-study-end-date-und-0-value-datepicker-popup-0");

    @As("selectEditGroupRefUnd")
    private SelenideElement selectEditGroupRefUnd = $("#edit-og-group-ref-und");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("#page-title");

    @As("linkLogout")
    private SelenideElement linkLogout = $("a[class$='btn-info']");

    @As("textAreaOfExecuteCode")
    private SelenideElement textAreaOfExecuteCode = $("#edit-code");

    @As("inputExecuteButton")
    private SelenideElement inputExecuteButton = $("#edit-op");

    @As("mailNotificationMessage")
    private SelenideElement mailNotificationMessage = $(".messages > ul:nth-child(2)");

    @As("linkLogOutOfDevSystem")
    private SelenideElement linkLogOutOfDevSystem = $("li[class='admin-menu-action'] a");

    @As("linkOfThePatient")
    private SelenideElement linkOfThePatient = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > section > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(3) > div > form > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(5) > div > a");

    @As("patientID")
    private SelenideElement patientID = $("div[class='panels-flexible-region panels-flexible-region-1-head_left panels-flexible-region-first head_left']");

    @As("patientName")
    private SelenideElement patientName = $("section[class*='field-name-field-patient-name'] div[class='field-items']");


    public AddProspectiveStudyPage getThePatientID() {
        PATIENT_ID = patientID.shouldBe(visible).getText();
        log.info(PATIENT_ID);
        return this;
    }

    public AddProspectiveStudyPage getThePatientName() {
        PATIENT_NAME = patientName.shouldBe(visible).getText();
        log.info(PATIENT_NAME);
        return this;
    }

    public AddProspectiveStudyPage openTheProspectiveStudyPage() {
        LoginPage.openPath(CONFIG.getString("PROSPECTIVE_STUDY_PATH"));
        return this;
    }

    public AddProspectiveStudyPage enterInputEditTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }

    public AddProspectiveStudyPage setSelectEditFieldStudyAuto(StudyCategory studyCategory) {
        selectEditFieldStudyAuto.shouldBe(visible).selectOptionContainingText(studyCategory.getText());
        return this;
    }

    public AddProspectiveStudyPage setSelectEditFieldMainInvestors(String mainInvestors) {
        selectEditFieldStudyMainInvestors.shouldBe(visible).selectOptionContainingText(mainInvestors);
        return this;
    }

    public AddProspectiveStudyPage enterTheInputEditFieldStudyStartDate(String studyStart) {
        inputEditFieldStudyStart.shouldBe(visible).sendKeys(studyStart);
        return this;
    }

    public AddProspectiveStudyPage enterTheInputEditFieldStudyEndDate(String studyEnd) {
        inputEditFieldStudyEnd.shouldBe(visible).sendKeys(studyEnd);
        return this;
    }

    public AddProspectiveStudyPage setSelectEditGroupRefUnd(String centre) {
        selectEditGroupRefUnd.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }

    public AddProspectiveStudyPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public AddProspectiveStudyPage assertThatProspectiveStudyCreated(UserData user) {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text(user.getTitle()));
        return this;
    }

    public AddProspectiveStudyPage clickOnLogoutLink() {
        linkLogout.shouldBe(visible).click();
        return this;
    }

    public AddProspectiveStudyPage logInWithDevSystemCredentials() {
        LoginPage.openPath(CONFIG.getString("LINK_FOR_EXECUTE_SCRIPT_FOR_PROSPECTIVE_STUDY"));
        return this;
    }

    public AddProspectiveStudyPage enterTextAreaOfExecuteCode() {
        String SCRIPT = "module_load_include('php','jagriti_custom','/Helper/GenerateToDoForProspectiveStudy');\n" +
                "$prospectiveStudy = new GenerateToDoForProspectiveStudy();\n" +
                "$prospectiveStudy->execute();";
        textAreaOfExecuteCode.shouldBe(visible).setValue(SCRIPT);
        return this;
    }

    public AddProspectiveStudyPage clickOnExecuteButton() {
        inputExecuteButton.shouldBe(visible).click();
        return this;
    }

    public AddProspectiveStudyPage assertThatGeneratedMailNotificationMessage() {
        String MESSAGE = mailNotificationMessage.shouldBe(visible).getText();
        log.info(MESSAGE);
        return this;
    }

    public AddProspectiveStudyPage clickOnLinkLogOutOfDevSystem() {
//        linkLogOutOfDevSystem.shouldBe(visible).click();
        LoginPage.openPath(CONFIG.getString("TO_DO_PATH"));
        return this;
    }

    public AddProspectiveStudyPage assertThatLinkOfThePatientInTheToDoPage() {
        String PATIENT = PATIENT_ID +"["+ PATIENT_NAME +"]";
        String patientLocator = "html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > section > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(3) > div > form > div > table > tbody > tr:nth-of-type(%d) > td:nth-of-type(5) > div > a";
        int maxRows = 20; // Assuming you have a fixed number of rows to iterate through

        for (int i = 1; i <= maxRows; i++) {
            String dynamicDateLocator = String.format(patientLocator, i);

            String currentPatient = $(dynamicDateLocator).getText();

            if (currentPatient.equals(PATIENT)) {
                $(dynamicDateLocator).shouldBe(visible).shouldHave(Condition.text(PATIENT));
            }
        }
        return this;
    }

}