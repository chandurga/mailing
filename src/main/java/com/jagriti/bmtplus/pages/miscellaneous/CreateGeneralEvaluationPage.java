package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/node/add/general-initial-investigation/3752686
public class CreateGeneralEvaluationPage extends Page<CreateGeneralEvaluationPage> {
    protected CreateGeneralEvaluationPage() {
        super(CreateGeneralEvaluationPage.class);
    }
    


    @As("inputEditFieldGiiPatient")
    private SelenideElement inputEditFieldGiiPatient = $("#edit-field-gii-patient-ref-und-0-nid");

    @As("selectTheResult")
    private SelenideElement selectTheResult = $("#autocomplete");

    @As("selectEditFieldGiiSource")
    private SelenideElement selectEditFieldGiiSource = $("select[id='edit-field-gii-source-of-evaluation-und']");

    @As("selectEditFieldGiiFamily")
    private SelenideElement selectEditFieldGiiFamily = $("select[id='edit-field-gii-family-history-und']");

    @As("linkMedicalHistory")
    private SelenideElement linkMedicalHistory = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(2) > a");

    @As("selectEditFieldGiiDevelopment")
    private SelenideElement selectEditFieldGiiDevelopment = $("select[id='edit-field-gii-growth-development-und']");

    @As("selectEditFieldGiiOthr")
    private SelenideElement selectEditFieldGiiOthr = $("select[id='edit-field-gii-othr-medical-prblm-und']");

    @As("selectEditFieldGiiAllergies")
    private SelenideElement selectEditFieldGiiAllergies = $("select[id='edit-field-gii-allergies-und']");

    @As("linkPhysicalExam")
    private SelenideElement linkPhysicalExam = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(3) > a");

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
    private SelenideElement selectEditFieldClinCourse = $("select[id='edit-field-clin-course-tanner-staging-und']");

    @As("selectEditFieldClinCourse2")
    private SelenideElement selectEditFieldClinCourse2 = $("select[id='edit-field-clin-course-pubic-hair-und']");

    @As("selectEditFieldGiiNervous")
    private SelenideElement selectEditFieldGiiNervous = $("select[id='edit-field-gii-nervous-system-und']");

    @As("linkInitialGeneralLabs")
    private SelenideElement linkInitialGeneralLabs = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(4) > a");

    @As("inputEditFieldGiiCount")
    private SelenideElement inputEditFieldGiiCount = $("input[id='edit-field-gii-wbc-count-und-0-value']");

    @As("inputEditFieldGiiUnd")
    private SelenideElement inputEditFieldGiiUnd = $("input[id='edit-field-gii-hb-und-0-first']");

    @As("selectEditFieldGiiUnd")
    private SelenideElement selectEditFieldGiiUnd = $("select[id='edit-field-gii-hb-und-0-second']");

    @As("linkBloodType")
    private SelenideElement linkBloodType = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(5) > a");

    @As("selectEditFieldGiiBlood")
    private SelenideElement selectEditFieldGiiBlood = $("select[id='edit-field-gii-blood-type-und']");

    @As("selectEditFieldGiiDirect")
    private SelenideElement selectEditFieldGiiDirect = $("select[id='edit-field-gii-direct-coombs-und']");

    @As("selectEditFieldGiiIrregular")
    private SelenideElement selectEditFieldGiiIrregular = $("select[id='edit-field-gii-irregular-antibodies-und']");

    @As("linkInitialGeneralImaging")
    private SelenideElement linkInitialGeneralImaging = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(6) > a");

    @As("selectEditFieldGiiChest")
    private SelenideElement selectEditFieldGiiChest = $("select[id='edit-field-gii-chest-x-ray-und']");

    @As("selectEditFieldGiiAbdominal")
    private SelenideElement selectEditFieldGiiAbdominal = $("select[id='edit-field-gii-abdominal-sonogram-und']");

    @As("linkInfectiousDiseases")
    private SelenideElement linkInfectiousDiseases = $("#general-initial-investigation-node-form > div > div.vertical-tabs.clearfix > ul > li:nth-child(7) > a");

    @As("selectEditFieldGiiHepatitis")
    private SelenideElement selectEditFieldGiiHepatitis = $("select[id='edit-field-gii-hepatitis-b-und']");

    @As("selectEditFieldGiiHepatitis2")
    private SelenideElement selectEditFieldGiiHepatitis2 = $("select[id='edit-field-gii-hepatitis-c-und']");

    @As("selectEditFieldGiiUnd2")
    private SelenideElement selectEditFieldGiiUnd2 = $("select[id='edit-field-gii-cmv-und']");

    @As("selectCenter")
    private SelenideElement selectCenter = $("#edit-og-group-ref-und");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");


    public CreateGeneralEvaluationPage setInputEditFieldGiiPatient(String patient) {
        inputEditFieldGiiPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public CreateGeneralEvaluationPage clickToSelectTheResult() {
        selectTheResult.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiSource(SourceOfEvaluation sourceOfEvaluation) {
        selectEditFieldGiiSource.shouldBe(visible).selectOptionByValue(sourceOfEvaluation.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiFamily(FamilyHistory family) {
        selectEditFieldGiiFamily.shouldBe(visible).selectOptionByValue(family.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkMedicalHistory() {
        linkMedicalHistory.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiDevelopment(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiDevelopment.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiOthr(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldGiiOthr.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiAllergies(OtherRelevantMedicalProblems otherRelevantMedicalProblems) {
        selectEditFieldGiiAllergies.shouldBe(visible).selectOptionByValue(otherRelevantMedicalProblems.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkPhysicalExam() {
        linkPhysicalExam.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage enterTheWeight(String weight) {
        inputEditFieldGiiWeight.shouldBe(visible).setValue(weight);
        return this;
    }
    public CreateGeneralEvaluationPage setInputEditFieldGiiHeight(String height) {
        inputEditFieldGiiHeight.shouldBe(visible).setValue(height);
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiSkin(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiSkin.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiLymphnodes(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLymphnodes.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiEnt(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiEnt.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiHeart(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiHeart.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiLungs(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLungs.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiLiver(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiLiver.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiSpleen(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiSpleen.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiGenitalia(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiGenitalia.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldClinCourse(TannerStage tannerStage) {
        selectEditFieldClinCourse.shouldBe(visible).selectOptionContainingText(tannerStage.getText());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldClinCourse2(TannerStage tannerStage) {
        selectEditFieldClinCourse2.shouldBe(visible).selectOptionContainingText(tannerStage.getText());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiNervous(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiNervous.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkInitialGeneralLabs() {
        linkInitialGeneralLabs.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage enterWhiteBloodCellCount(String whiteBloodCells) {
        inputEditFieldGiiCount.shouldBe(visible).setValue(whiteBloodCells);
        return this;
    }
    public CreateGeneralEvaluationPage setInputEditFieldGiiUnd(String hb) {
        inputEditFieldGiiUnd.shouldBe(visible).setValue(hb);
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiUnd(SizeOfTheValues size) {
        selectEditFieldGiiUnd.shouldBe(visible).selectOptionByValue(size.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkBloodType() {
        linkBloodType.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiBlood(BloodType blood) {
        selectEditFieldGiiBlood.shouldBe(visible).selectOptionContainingText(blood.getText());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiDirect(FamilyHistory familyHistory) {
        selectEditFieldGiiDirect.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiIrregular(FamilyHistory familyHistory) {
        selectEditFieldGiiIrregular.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkInitialGeneralImaging() {
        linkInitialGeneralImaging.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiChest(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiChest.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiAbdominal(GrowthAndDevelopment growthAndDevelopment) {
        selectEditFieldGiiAbdominal.shouldBe(visible).selectOptionByValue(growthAndDevelopment.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage clickOnLinkInfectiousDiseases() {
        linkInfectiousDiseases.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiHepatitis(FamilyHistory familyHistory) {
        selectEditFieldGiiHepatitis.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiHepatitis2(FamilyHistory familyHistory) {
        selectEditFieldGiiHepatitis2.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectEditFieldGiiUnd2(FamilyHistory familyHistory) {
        selectEditFieldGiiUnd2.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateGeneralEvaluationPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public CreateGeneralEvaluationPage clickOnSubmitButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateGeneralEvaluationPage assertThatGeneralEvaluationSuccessMessage() {
        successMessage.shouldBe(visible).shouldHave(Condition.exactText("420677831389500-General Evaluation"));
        return this;
    }
    public CreateGeneralEvaluationPage assertThatGeneralEvaluationSuccess() {
        successMessage.shouldBe(visible).shouldHave(Condition.text("General Evaluation"));
        return this;
    }

    public CreateGeneralEvaluationPage createGeneralEvaluation(){
        UserData userData = UserData.getData();
        this.setSelectEditFieldGiiSource(userData.getSourceOfEvaluation());
        this.setSelectEditFieldGiiFamily(userData.getFamilyHistory());
        this.clickOnLinkMedicalHistory();
        this.setSelectEditFieldGiiDevelopment(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiOthr(userData.getOtherRelevantMedicalProblems());
        this.setSelectEditFieldGiiAllergies(userData.getOtherRelevantMedicalProblems());
        this.clickOnLinkPhysicalExam();
        this.enterTheWeight(String.valueOf(userData.getWeight()));
        this.setInputEditFieldGiiHeight("159");
        this.setSelectEditFieldGiiSkin(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiLymphnodes(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiEnt(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiHeart(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiLungs(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiLiver(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiSpleen(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiGenitalia(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldClinCourse(userData.getTannerStage());
        this.setSelectEditFieldClinCourse2(userData.getTannerStage());
        this.setSelectEditFieldGiiNervous(userData.getGrowthAndDevelopment());
        this.clickOnLinkInitialGeneralLabs();
        this.enterWhiteBloodCellCount("6000");
        this.setInputEditFieldGiiUnd("11.5");
        this.setSelectEditFieldGiiUnd(userData.getSize());
        this.clickOnLinkBloodType();
        this.setSelectEditFieldGiiBlood(userData.getBloodType());
        this.setSelectEditFieldGiiDirect(userData.getFamilyHistory());
        this.setSelectEditFieldGiiIrregular(userData.getFamilyHistory());
        this.clickOnLinkInitialGeneralImaging();
        this.setSelectEditFieldGiiChest(userData.getGrowthAndDevelopment());
        this.setSelectEditFieldGiiAbdominal(userData.getGrowthAndDevelopment());
        this.clickOnLinkInfectiousDiseases();
        this.setSelectEditFieldGiiHepatitis(userData.getFamilyHistory());
        this.setSelectEditFieldGiiHepatitis2(userData.getFamilyHistory());
        this.setSelectEditFieldGiiUnd2(userData.getFamilyHistory());
        this.clickOnSubmitButton();
        this.assertThatGeneralEvaluationSuccess();
        return this;
    }
}