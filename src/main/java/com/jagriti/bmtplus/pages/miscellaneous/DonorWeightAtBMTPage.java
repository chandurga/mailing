package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.PatientData;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/22549574931200
public class DonorWeightAtBMTPage extends Page<DonorWeightAtBMTPage> {

    protected DonorWeightAtBMTPage() {
        super(DonorWeightAtBMTPage.class);
    }

    public static String patientRegID;
    public static String FAMILY_MEMBER;
    public static String FAMILY_MEMBER_CODE = "UNK1";

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkOfFamilyMemberInEvaluation")
    private SelenideElement linkOfFamilyMemberInEvaluation = $("section[class*='field-name-field-de-family-member-reference'] div[class='field-items']");

    @As("linkOfPatientInEvaluation")
    private SelenideElement linkOfPatientInEvaluation = $("section[class*='field-name-field-family-relative-of'] div[class='field-items']");

    @As("linkImportTreatmentPlan")
    private SelenideElement linkImportTreatmentPlan = $x("(//*[text()=\"Import Treatment Plan\"])[2]");

    @As("inputEditCode")
    private SelenideElement inputEditCode = $("#edit-code");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("importedTreatmentPlan")
    private SelenideElement importedTreatmentPlan = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > ul > li:nth-of-type(1)");

    @As("linkClinical")
    private SelenideElement linkClinical = $("a[class='menu_icon menu-13935 sf-depth-1 menuparent']");

    @As("linkOutComes")
    private SelenideElement linkOutComes = $("#menu-13948-1");

    @As("linkTransplantOutComes")
    private SelenideElement linkTransplantOutComes = $("#menu-10351-1");

    @As("inputEditFieldCode")
    private SelenideElement inputEditFieldCode = $("#edit-title");

    @As("applyButton")
    private SelenideElement applyButton = $("#edit-submit-transplant-outcomes");

    @As("tsLink")
    private SelenideElement tsLink = $("#DataTables_Table_0_wrapper > div.DTFC_ScrollWrapper > div.DTFC_LeftWrapper > div.DTFC_LeftBodyWrapper > div > table > tbody > tr.views-row-last.odd > td.views-field.views-field-title > a");


    public DonorWeightAtBMTPage captureThePatientID() {
        patientRegID = patientID.shouldBe(visible).getText();
        return this;
    }

    public DonorWeightAtBMTPage clickOnLinkOfFamilyMemberInEvaluationPage() {
        FAMILY_MEMBER = linkOfFamilyMemberInEvaluation.shouldBe(visible).getText();
        linkOfFamilyMemberInEvaluation.shouldBe(visible).click();
        return this;
    }

    public DonorWeightAtBMTPage clickOnLinkOfPatientInEvaluationPage() {
        linkOfPatientInEvaluation.shouldBe(visible).click();
        return this;
    }

    public DonorWeightAtBMTPage clickOnLinkImportTreatmentPlan() {
        linkImportTreatmentPlan.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }

    public DonorWeightAtBMTPage enterTheInputEditDonorCode(PatientData patientData) {
        inputEditCode.shouldBe(visible).setValue(patientRegID + "-" + FAMILY_MEMBER_CODE);
        return this;
    }

    public DonorWeightAtBMTPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public DonorWeightAtBMTPage assertThatImportedTreatmentPlanOfTheDonorWeight(UserData userData) {
        String DAY = importedTreatmentPlan.shouldBe(visible).getText().split("Weight:")[1].trim();
        DAY.equals(userData.getWeight());
        return this;
    }

    public DonorWeightAtBMTPage openTransplantOutComesInTheClinicalMenu() {
        LoginPage.openPath(CONFIG.getString("TRANSPLANT_COMES_PATH"));
        return this;
    }

    public DonorWeightAtBMTPage enterTheCodeOfPatient(String code) {
        inputEditFieldCode.shouldBe(visible).setValue(code);
        return this;
    }

    public DonorWeightAtBMTPage clickOnApplyButton() {
        applyButton.shouldBe(visible).click();
        return this;
    }

    public void assertThatTsLink() {
        String TS_LINK = String.format(patientRegID + "-TS-1");
        tsLink.shouldBe(visible).shouldHave(Condition.text(TS_LINK));
    }

}