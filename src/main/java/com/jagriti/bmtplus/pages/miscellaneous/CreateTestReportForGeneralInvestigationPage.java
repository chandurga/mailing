package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.FamilyHistory;
import com.jagriti.bmtplus.pages.miscellaneous.data.GrowthAndDevelopment;
import com.jagriti.bmtplus.pages.miscellaneous.data.OtherRelevantMedicalProblems;
import com.jagriti.bmtplus.pages.miscellaneous.data.TannerStage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/content/tsa230364
public class CreateTestReportForGeneralInvestigationPage extends Page<CreateTestReportForGeneralInvestigationPage> {

    public static String patientRegIDForTestReport;
    protected CreateTestReportForGeneralInvestigationPage() {
        super(CreateTestReportForGeneralInvestigationPage.class);
    }

    @As("linkQuickTabOfGeneralEvaluation")
    private SelenideElement linkQuickTabOfGeneralEvaluation = $("#quicktabs-tab-patient_summary_pre_bmt-1");

    @As("linkAddNewGeneralEvaluations")
    private SelenideElement linkAddNewGeneralEvaluations = $(byText("Add New General Evaluations"));

    @As("selectEditFieldGiiFamily")
    private SelenideElement selectEditFieldGiiFamily = $("select[id='edit-field-gii-family-history-und']");

    @As("linkMedicalHistory")
    private SelenideElement linkMedicalHistory = $(byText("Medical History"));

    @As("selectEditFieldGiiDevelopment")
    private SelenideElement selectEditFieldGiiDevelopment = $("select[id='edit-field-gii-growth-development-und']");

    @As("selectEditFieldGiiOthr")
    private SelenideElement selectEditFieldGiiOthr = $("select[id='edit-field-gii-othr-medical-prblm-und']");

    @As("selectEditFieldGiiAllergies")
    private SelenideElement selectEditFieldGiiAllergies = $("select[id='edit-field-gii-allergies-und']");

    @As("linkPhysicalExam")
    private SelenideElement linkPhysicalExam = $(byText("Physical Exam"));

    @As("inputEditFieldGiiWeight")
    private SelenideElement inputEditFieldGiiWeight = $("input[id='edit-field-gii-weight-und-0-value']");

    @As("inputEditFieldGiiHeight")
    private SelenideElement inputEditFieldGiiHeight = $("input[id='edit-field-gii-height-und-0-value']");

    @As("selectEditFieldGiiSkin")
    private SelenideElement selectEditFieldGiiSkin = $("select[id='edit-field-gii-skin-und']");

    @As("selectEditFieldGiiLymphnodes")
    private SelenideElement selectEditFieldGiiLymphnodes = $("select[id='edit-field-gii-lymphnodes-und']");

    @As("selectEditFieldGiiEnt")
    private SelenideElement selectEditFieldGiiEnt = $("select[id='edit-field-gii-ent-und']");

    @As("selectEditFieldGiiHeart")
    private SelenideElement selectEditFieldGiiHeart = $("select[id='edit-field-gii-heart-und']");

    @As("selectEditFieldGiiLungs")
    private SelenideElement selectEditFieldGiiLungs = $("select[id='edit-field-gii-lungs-und']");

    @As("selectEditFieldGiiLiver")
    private SelenideElement selectEditFieldGiiLiver = $("select[id='edit-field-gii-liver-und']");

    @As("selectEditFieldGiiSpleen")
    private SelenideElement selectEditFieldGiiSpleen = $("select[id='edit-field-gii-spleen-und']");

    @As("selectEditFieldGiiGenitalia")
    private SelenideElement selectEditFieldGiiGenitalia = $("select[id='edit-field-gii-genitalia-und']");

    @As("selectEditFieldClinCourse")
    private SelenideElement selectEditFieldTennerStage = $("select[id='edit-field-clin-course-tanner-staging-und']");

    @As("linkInitialGeneralLabs")
    private SelenideElement linkInitialGeneralLabs = $(byText("Initial General Labs"));

    @As("linkInitialGeneralImaging")
    private SelenideElement linkInitialGeneralImaging = $(byText("Initial General Imaging"));

    @As("selectEditFieldGiiChest")
    private SelenideElement selectEditFieldGiiChest = $("select[id='edit-field-gii-chest-x-ray-und']");

    @As("selectEditFieldGiiAbdominal")
    private SelenideElement selectEditFieldGiiAbdominal = $("select[id='edit-field-gii-abdominal-sonogram-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("linkFamilyHistory")
    private SelenideElement linkFamilyHistory = $(byText("Family History"));

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    public CreateTestReportForGeneralInvestigationPage clickOnLinkQuickTabOfGeneralEvaluation() {
        linkQuickTabOfGeneralEvaluation.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickOnLinkAddNewGeneralEvaluations() {
        linkAddNewGeneralEvaluations.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiFamily(FamilyHistory family) {
        selectEditFieldGiiFamily.shouldBe(visible).selectOptionByValue(family.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickOnLinkMedicalHistory() {
        linkMedicalHistory.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage assertThatMedicalHistoryTabIsVisibleAtGeneralEvaluation() {
        linkMedicalHistory.shouldBe(visible).shouldHave(Condition.text("Medical History"));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiDevelopment(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiDevelopment.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setOtherRelevantMedicalProblems(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldGiiOthr.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiAllergies(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldGiiAllergies.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickOnLinkPhysicalExam() {
        linkPhysicalExam.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage assertThatPhysicalExamTabIsVisibleAtGeneralEvaluation() {
        linkPhysicalExam.shouldBe(visible).shouldHave(Condition.text("Physical Exam"));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setInputEditFieldGiiWeight(int weight) {
        inputEditFieldGiiWeight.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setInputEditFieldGiiHeight(int height) {
        inputEditFieldGiiHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiSkin(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiSkin.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiLymphnodes(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLymphnodes.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiEnt(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiEnt.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiHeart(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiHeart.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiLungs(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLungs.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiLiver(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLiver.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiSpleen(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiSpleen.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiGenitalia(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiGenitalia.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldTennerStage(TannerStage tannerStage) {
        selectEditFieldTennerStage.shouldBe(visible).selectOptionContainingText(tannerStage.getText());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickLinkInitialGeneralLabs() {
        linkInitialGeneralLabs.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage assertThatInitialGeneralImagingTabIsVisibleAtGeneralEvaluation() {
        linkInitialGeneralImaging.shouldBe(visible).shouldHave(Condition.text("Initial General Imaging"));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickLinkInitialGeneralImaging() {
        linkInitialGeneralImaging.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiChest(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiChest.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage setSelectEditFieldGiiAbdominal(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiAbdominal.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public void assertThatSuccessMessageForTestReport() {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text(patientRegIDForTestReport +"-General Evaluation"));
    }
    public CreateTestReportForGeneralInvestigationPage assertThatLinkFamilyHistoryIsVisibleOrNot() {
        linkFamilyHistory.shouldBe(visible).shouldHave(Condition.text("Family History"));
        return this;
    }
    public CreateTestReportForGeneralInvestigationPage captureThePatientID() {
        patientRegIDForTestReport = patientID.shouldBe(visible).getText();
        return this;
    }
}