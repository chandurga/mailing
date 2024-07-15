package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.AddTheCreatedBloodProductInTheTransactionPage;
import com.jagriti.bmtplus.pages.miscellaneous.data.TannerStage;
import com.jagriti.bmtplus.pages.miscellaneous.data.Type;
import com.jagriti.bmtplus.pages.miscellaneous.data.Value;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/609361810808
@Slf4j
public class GranulocyteCheckPage extends Page<GranulocyteCheckPage> {
  protected GranulocyteCheckPage() {
    super(GranulocyteCheckPage.class);
  }

  final String TRANSFUSION =
      "\tPacked red cells, Platelet apheresis, Platelet units, FFP, Whole Blood, Immunoglobulins, Albumin, Granulocyte";

  @As("dateField")
  private SelenideElement dateField =
      $("td[class$='views-field-field-clin-course-date'] span[class='date-display-single']");

  @As("linkAddNewClinicalCourse")
  private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

  @As("linkView")
  private SelenideElement linkView = $x("(//*[text()=\"View\"])[2]");

  @As("inputEditFieldTitle")
  private SelenideElement inputEditFieldTitle = $("#edit-field-clin-course-title-mig-und-0-value");

  @As("selectEditFieldType")
  private SelenideElement selectEditFieldType = $("#edit-field-clin-course-type-und");

  @As("inputEditFieldNextFollow")
  private SelenideElement inputEditFieldNextFollow =
      $("#edit-field-next-follow-up-date-und-0-value-datepicker-popup-0");

  @As("inputEditFieldWeight")
  private SelenideElement inputEditFieldWeight = $("#edit-field-clin-course-weight-und-0-value");

  @As("inputEditFieldHeight")
  private SelenideElement inputEditFieldHeight = $("#edit-field-clin-course-height-und-0-value");

  @As("inputEditFieldMaxTemperature")
  private SelenideElement inputEditFieldMaxTemperature =
      $("#edit-field-clin-course-max-temp-new-und-0-value");

  @As("inputEditFieldWBC")
  private SelenideElement inputEditFieldWBC = $("#edit-field-clin-course-wbc-und-0-value");

  @As("inputEditFieldANC")
  private SelenideElement inputEditFieldANC = $("#edit-field-clin-course-anc-und-0-value");

  @As("inputEditFieldALC")
  private SelenideElement inputEditFieldALC = $("#edit-field-clin-course-alc-und-0-value");

  @As("inputEditFieldAMC")
  private SelenideElement inputEditFieldAMC = $("#edit-field-clin-course-amc-und-0-value");

  @As("inputEditFieldHB")
  private SelenideElement inputEditFieldHB = $("#edit-field-clin-course-hb-1-und-0-first");

  @As("selectEditFieldHBValue")
  private SelenideElement selectEditFieldHBValue = $("#edit-field-clin-course-hb-1-und-0-second");

  @As("inputEditFieldMCV")
  private SelenideElement inputEditFieldMCV = $("#edit-field-clin-course-mcv-und-0-value");

  @As("inputEditFieldPlatelets")
  private SelenideElement inputEditFieldPlatelets =
      $("#edit-field-clin-course-platelets-und-0-value");

  @As("checkBoxPackedRedCells")
  private SelenideElement checkBoxPackedRedCells =
      $("#edit-field-clin-course-transfusions-und-packed-red-cells");

  @As("checkBoxPlateletApheresis")
  private SelenideElement checkBoxPlateletApheresis =
      $("#edit-field-clin-course-transfusions-und-platelet-apheresis");

  @As("checkBoxPlateletUnits")
  private SelenideElement checkBoxPlateletUnits =
      $("#edit-field-clin-course-transfusions-und-platelet-units");

  @As("checkBoxFPP")
  private SelenideElement checkBoxFPP = $("#edit-field-clin-course-transfusions-und-ffp");

  @As("checkBoxWholeBlood")
  private SelenideElement checkBoxWholeBlood = $("#edit-field-clin-course-transfusions-und-wb");

  @As("checkBoxImmunoglobulins")
  private SelenideElement checkBoxImmunoglobulins =
      $("#edit-field-clin-course-transfusions-und-immunoglobulins");

  @As("checkBoxAlbumin")
  private SelenideElement checkBoxAlbumin = $("#edit-field-clin-course-transfusions-und-albumin");

  @As("checkBoxGranulocyte")
  private SelenideElement checkBoxGranulocyte =
      $("#edit-field-clin-course-transfusions-und-granulocyte");

  @As("inputEditFieldSodium")
  private SelenideElement inputEditFieldSodium = $("#edit-field-clin-course-sodium-und-0-value");

  @As("inputEditFieldPotassium")
  private SelenideElement inputEditFieldPotassium =
      $("#edit-field-clin-course-potassium-und-0-value");

  @As("inputEditFieldCalcium")
  private SelenideElement inputEditFieldCalcium = $("#edit-field-clin-course-calcium-und-0-value");

  @As("inputEditFieldSGPRALT")
  private SelenideElement inputEditFieldSGPRALT = $("#edit-field-ciln-course-sgpt-alt-und-0-value");

  @As("inputEditFieldTotalBilirubin")
  private SelenideElement inputEditFieldTotalBilirubin =
      $("#edit-field-clin-course-totalbilirubin-und-0-first");

  @As("inputEditFieldTotalBilirubinValue")
  private SelenideElement inputEditFieldTotalBilirubinValue =
      $("#edit-field-clin-course-totalbilirubin-und-0-second");

  @As("selectEditFieldCreatinine")
  private SelenideElement selectEditFieldCreatinine =
      $("#edit-field-clin-course-creatinine-1-und-0-first");

  @As("selectEditFieldCreatinineValue")
  private SelenideElement selectEditFieldCreatinineValue =
      $("#edit-field-clin-course-creatinine-1-und-0-second");

  @As("inputEditFieldCRP")
  private SelenideElement inputEditFieldCRP = $("#edit-field-clin-course-crp-1-und-0-first");

  @As("inputEditFieldCRPValue")
  private SelenideElement inputEditFieldCRPValue = $("#edit-field-clin-course-crp-1-und-0-second");

  @As("inputEditFieldGCSFGivenValue")
  private SelenideElement inputEditFieldGCSFGivenValue =
      $("#edit-field-clin-course-gsf-given-und-none");

  @As("inputEditFieldCyclosporinlevelPeak")
  private SelenideElement inputEditFieldCyclosporinlevelPeak =
      $("#edit-field-clin-course-cyclosorinpeak-und-0-value");

  @As("inputEditFieldCyclosporinlevelTrough")
  private SelenideElement inputEditFieldCyclosporinlevelTrough =
      $("#edit-field-clin-course-cyclos-trough-und-0-value");

  @As("inputEditFieldTacrolimusPeakLevel")
  private SelenideElement inputEditFieldTacrolimusPeakLevel =
      $("#edit-field-tacrolimus-peak-level-und-0-value");

  @As("inputEditFieldTacrolimusPeak")
  private SelenideElement inputEditFieldTacrolimusPeak =
      $("#edit-field-tacrolimus-trough-level-und-0-value");

  @As("inputEditFieldLiver")
  private SelenideElement inputEditFieldLiver = $("#edit-field-clin-course-liver-und-0-value");

  @As("inputEditFieldSpleen")
  private SelenideElement inputEditFieldSpleen = $("#edit-field-clin-course-spleen-und-0-value");

  @As("inputEditFieldLiverUSG")
  private SelenideElement inputEditFieldLiverUSG =
      $("#edit-field-clin-course-liver-usg-und-0-value");

  @As("inputEditFieldSpleenUSG")
  private SelenideElement inputEditFieldSpleenUSG =
      $("#edit-field-clin-course-spleen-usg-und-0-value");

  @As("inputEditFieldFerritin")
  private SelenideElement inputEditFieldFerritin =
      $("#edit-field-clin-course-ferritin-und-0-value");

  @As("inputEditFieldLanskyPerformanceScore")
  private SelenideElement inputEditFieldLanskyPerformanceScore =
      $("#edit-field-cc-lansky-perf-score-und-0-value");

  @As("inputEditFieldTannerStagePubicHair")
  private SelenideElement inputEditFieldTannerStagePubicHair =
      $("#edit-field-clin-course-pubic-hair-und");

  @As("inputEditFieldTannerStageGenitalsBreasts")
  private SelenideElement inputEditFieldTannerStageGenitalsBreasts =
      $("#edit-field-clin-course-tanner-staging-und");

  @As("checkBoxBloodProduct")
  private SelenideElement checkBoxBloodProduct =
      $("#edit-field-clin-course-tomorrow-labs-und-blood-count");

  @As("inputEditSubmit")
  private SelenideElement inputEditSubmit = $("#edit-submit");

  @As("h1PageTitle")
  private SelenideElement h1Page0Title = $("#page-title");

  @As("patientLink")
  private SelenideElement patientLink =
      $("section[class*='field-name-field-clin-course-patient'] div[class='field-items']");

  @As("transfusion")
  private SelenideElement transfusion =
      $(
          "html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div > div > section > div:nth-of-type(2) > div > div > div > div > div > div > div:nth-of-type(4) > div > div > div > section:nth-of-type(3) > div > div > div > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(1) > table:nth-of-type(2) > tbody > tr:nth-of-type(1) > td:nth-of-type(16)");

  public GranulocyteCheckPage clickOnLinkAddNewClinicalCourse() {
    Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
    linkAddNewClinicalCourse.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage setSelectEditFieldType(Type type) {
    selectEditFieldType.shouldBe(visible).selectOptionByValue(type.getValue());
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldNextFollow(String nextFollow) {
    inputEditFieldNextFollow.shouldBe(visible).setValue(nextFollow);
    return this;
  }

  public GranulocyteCheckPage enterTheWeight(int weight) {
    inputEditFieldWeight.shouldBe(visible).setValue(String.valueOf(weight));
    return this;
  }

  public GranulocyteCheckPage enterTheHeight(int height) {
    inputEditFieldHeight.shouldBe(visible).setValue(String.valueOf(height));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldMaxTemperature(int maxTemperature) {
    inputEditFieldMaxTemperature.shouldBe(visible).setValue(String.valueOf(maxTemperature));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldWBC(int WBC) {
    inputEditFieldWBC.shouldBe(visible).setValue(String.valueOf(WBC));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldANC(int ANC) {
    inputEditFieldANC.shouldBe(visible).setValue(String.valueOf(ANC));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldALC(int ALC) {
    inputEditFieldALC.shouldBe(visible).setValue(String.valueOf(ALC));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldAMC(int AMC) {
    inputEditFieldAMC.shouldBe(visible).setValue(String.valueOf(AMC));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldHB(int HB) {
    inputEditFieldHB.shouldBe(visible).setValue(String.valueOf(HB));
    return this;
  }

  public GranulocyteCheckPage setSelectEditFieldHBValue(String HBValue) {
    selectEditFieldHBValue.shouldBe(visible).selectOptionByValue(HBValue);
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldMCV(int MCV) {
    inputEditFieldMCV.shouldBe(visible).setValue(String.valueOf(MCV));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldPlatelets(int platelets) {
    inputEditFieldPlatelets.shouldBe(visible).setValue(String.valueOf(platelets));
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxPackedRedCells() {
    checkBoxPackedRedCells.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxPlateletApheresis() {
    checkBoxPlateletApheresis.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxPlateletUnits() {
    checkBoxPlateletUnits.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxFPP() {
    checkBoxFPP.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxWholeBlood() {
    checkBoxWholeBlood.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxImmunoglobulins() {
    checkBoxImmunoglobulins.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxAlbumin() {
    checkBoxAlbumin.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxGranulocyte() {
    checkBoxGranulocyte.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldSodium(int sodium) {
    inputEditFieldSodium.shouldBe(visible).setValue(String.valueOf(sodium));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldPotassium(int potassium) {
    inputEditFieldPotassium.shouldBe(visible).setValue(String.valueOf(potassium));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldCalcium(int calcium) {
    inputEditFieldCalcium.shouldBe(visible).setValue(String.valueOf(calcium));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldSGPRALT(int sgpralt) {
    inputEditFieldSGPRALT.shouldBe(visible).setValue(String.valueOf(sgpralt));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldTotalBilirubin(int totalBilirubin) {
    inputEditFieldTotalBilirubin.shouldBe(visible).setValue(String.valueOf(totalBilirubin));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldTotalBilirubinValue(Value value) {
    inputEditFieldTotalBilirubinValue.shouldBe(visible).selectOptionByValue(value.getValue());
    return this;
  }

  public GranulocyteCheckPage setSelectEditFieldCreatinine(int creatinine) {
    selectEditFieldCreatinine.shouldBe(visible).setValue(String.valueOf(creatinine));
    return this;
  }

  public GranulocyteCheckPage setSelectEditFieldCreatinineValue(Value value) {
    selectEditFieldCreatinineValue.shouldBe(visible).selectOptionByValue(value.getValue());
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldCRP(int crp) {
    inputEditFieldCRP.shouldBe(visible).setValue(String.valueOf(crp));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldCRPValue(Value value) {
    inputEditFieldCRPValue.shouldBe(visible).selectOptionByValue(value.getValue());
    return this;
  }

  public GranulocyteCheckPage clickOnCheckboxGCSFGivenNAValue() {
    inputEditFieldGCSFGivenValue.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldCyclosporinlevelPeak(int cyclosporinlevelPeak) {
    inputEditFieldCyclosporinlevelPeak
        .shouldBe(visible)
        .setValue(String.valueOf(cyclosporinlevelPeak));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldCyclosporinlevelTrough(int cyclosporinlevelTrough) {
    inputEditFieldCyclosporinlevelTrough
        .shouldBe(visible)
        .setValue(String.valueOf(cyclosporinlevelTrough));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldTacrolimusPeakLevel(int tacrolimusPeakLevel) {
    inputEditFieldTacrolimusPeakLevel
        .shouldBe(visible)
        .setValue(String.valueOf(tacrolimusPeakLevel));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldTacrolimusPeak(int tacrolimusPeak) {
    inputEditFieldTacrolimusPeak.shouldBe(visible).setValue(String.valueOf(tacrolimusPeak));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldLiver(int liver) {
    inputEditFieldLiver.shouldBe(visible).setValue(String.valueOf(liver));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldSpleen(int spleen) {
    inputEditFieldSpleen.shouldBe(visible).setValue(String.valueOf(spleen));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldLiverUSG(int liverUSG) {
    inputEditFieldLiverUSG.shouldBe(visible).setValue(String.valueOf(liverUSG));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldSpleenUSG(int spleenUSG) {
    inputEditFieldSpleenUSG.shouldBe(visible).setValue(String.valueOf(spleenUSG));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldFerritin(int ferritin) {
    inputEditFieldFerritin.shouldBe(visible).setValue(String.valueOf(ferritin));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldLanskyPerformanceScore(int lanskyPerformanceScore) {
    inputEditFieldLanskyPerformanceScore
        .shouldBe(visible)
        .setValue(String.valueOf(lanskyPerformanceScore));
    return this;
  }

  public GranulocyteCheckPage setInputEditFieldTannerStageGenitalsBreasts(TannerStage tannerStage) {
    inputEditFieldTannerStageGenitalsBreasts
        .shouldBe(visible)
        .selectOptionContainingText(tannerStage.getText());
    return this;
  }

  public GranulocyteCheckPage selectCheckBoxBloodProduct() {
    checkBoxBloodProduct.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage clickOnSaveButton() {
    inputEditSubmit.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage assertThatCreatedClinicalCourse() {
    String title = h1Page0Title.shouldBe(visible).getText();
    log.info(title);
    return this;
  }

  public GranulocyteCheckPage clickOnPatientLink() {
    patientLink.shouldBe(visible).click();
    return this;
  }

  public GranulocyteCheckPage assertTransfusion() {
    transfusion.shouldBe(visible).shouldHave(Condition.text(TRANSFUSION));
    return this;
  }

  public GranulocyteCheckPage checkAndCreateClinicalCourse() {
    Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
    String dateOfClinicalCourse = dateField.shouldBe(visible).getText();
    if (dateOfClinicalCourse.equalsIgnoreCase(DateTimeUtils.getFormattedDateForConsentForm())) {
      linkView.shouldBe(visible).click();
    } else {
      linkAddNewClinicalCourse.shouldBe(visible).click();
      GranulocyteCheckPage granulocyteCheckPage = new GranulocyteCheckPage();
      granulocyteCheckPage.createClinicalCourseForGranulocyte();
    }
    return this;
  }

  public UserData userData;

  public GranulocyteCheckPage createClinicalCourseForGranulocyte() {
    userData = UserData.getData();
    this.setInputEditFieldCRPValue(userData.getValue());
    this.setInputEditFieldNextFollow(userData.getFutureDateFollowUp());
    this.enterTheWeight(userData.getWeight());
    this.enterTheHeight(123);
    this.setInputEditFieldMaxTemperature(94);
    this.setInputEditFieldWBC(userData.getWbc());
    this.setInputEditFieldANC(userData.getAnc());
    this.setInputEditFieldALC(userData.getAlc());
    this.setInputEditFieldAMC(userData.getAmc());
    this.setInputEditFieldHB(userData.getHb());
    this.setSelectEditFieldHBValue("mmol/L");
    this.setInputEditFieldMCV(userData.getMcv());
    this.setInputEditFieldPlatelets(userData.getPlatelets());
    this.selectCheckBoxPackedRedCells();
    this.selectCheckBoxPlateletApheresis();
    this.selectCheckBoxPlateletUnits();
    this.selectCheckBoxFPP();
    this.selectCheckBoxWholeBlood();
    this.selectCheckBoxImmunoglobulins();
    this.selectCheckBoxAlbumin();
    this.selectCheckBoxGranulocyte();
    this.setInputEditFieldSodium(userData.getSodium());
    this.setInputEditFieldPotassium(userData.getPotassium());
    this.setInputEditFieldCalcium(userData.getCalcium());
    this.setInputEditFieldSGPRALT(userData.getSgptalt());
    this.setInputEditFieldTotalBilirubin(userData.getTotalBilirubin());
    this.setInputEditFieldTotalBilirubinValue(userData.getValue());
    this.setSelectEditFieldCreatinine(userData.getCreatinine());
    this.setSelectEditFieldCreatinineValue(userData.getValue());
    this.setInputEditFieldCRP(userData.getCrp());
    this.setInputEditFieldCRPValue(userData.getValue());
    this.clickOnCheckboxGCSFGivenNAValue();
    this.setInputEditFieldCyclosporinlevelPeak(userData.getCyclosporinLevelPeak());
    this.setInputEditFieldCyclosporinlevelTrough(userData.getCyclosporineLevelTrough());
    this.setInputEditFieldTacrolimusPeakLevel(userData.getTacrolimusPeakLevel());
    this.setInputEditFieldTacrolimusPeak(5);
    this.setInputEditFieldLiver(userData.getLiver());
    this.setInputEditFieldLiverUSG(10);
    this.setInputEditFieldSpleen(10);
    this.setInputEditFieldSpleenUSG(10);
    this.setInputEditFieldFerritin(1);
    this.setInputEditFieldLanskyPerformanceScore(80);
    this.setInputEditFieldTannerStageGenitalsBreasts(userData.getTannerStage());
    this.selectCheckBoxBloodProduct();
    this.clickOnSaveButton();
    return this;
  }
}
