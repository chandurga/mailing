package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.BloodType;
import com.jagriti.bmtplus.pages.miscellaneous.data.CarrierState;
import com.jagriti.bmtplus.pages.miscellaneous.data.FamilyHistory;
import com.jagriti.bmtplus.pages.miscellaneous.data.SizeOfTheValues;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3753298
@Slf4j
public class CreateTestReportToDonorPage extends Page<CreateTestReportToDonorPage> {
    protected CreateTestReportToDonorPage() {
        super(CreateTestReportToDonorPage.class);
    }

    @As("linkAddNewDonorEvaluation")
    private SelenideElement linkAddNewDonorEvaluation = $(byText("Add New Donor Evaluation Record"));

    @As("inputEditFieldFamilyWeight")
    private SelenideElement inputEditFieldFamilyWeight = $("input[id='edit-field-family-weight-und-0-value']");

    @As("inputEditFieldFamilyHeight")
    private SelenideElement inputEditFieldFamilyHeight = $("input[id='edit-field-family-height-und-0-value']");

    @As("selectEditFieldBloodType")
    private SelenideElement selectEditFieldBloodType = $("select[id='edit-field-de-blood-type-und']");

    @As("inputEditFieldFamilyUnd")
    private SelenideElement inputEditFieldFamilyUnd = $("input[id='edit-field-family-hb-1-und-0-first']");

    @As("selectEditFieldFamilyUnd")
    private SelenideElement selectEditFieldHBSize = $("select[id='edit-field-family-hb-1-und-0-second']");
    
    @As("inputEditFieldGiiCount")
    private SelenideElement inputEditFieldGiiCount = $("input[id='edit-field-gii-wbc-count-und-0-value']");

    @As("inputEditFieldGiiPlatelet")
    private SelenideElement inputEditFieldGiiPlatelet = $("input[id='edit-field-gii-platelet-count-und-0-value']");

    @As("selectEditFieldFamilyHepatitis")
    private SelenideElement selectEditFieldFamilyHepatitis = $("select[id='edit-field-family-hepatitis-b-und']");

    @As("selectEditFieldFamilyTubercolosis")
    private SelenideElement selectEditFieldFamilyTubercolosis = $("select[id='edit-field-family-tubercolosis-und']");

    @As("selectEditFieldFamilyUnd")
    private SelenideElement selectEditFieldBCG = $("select[id='edit-field-family-bcg-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("testReportName")
    private SelenideElement testReportName = $("h1[id='page-title']");

    @As("spanFamilyMembersDonor")
    private SelenideElement spanFamilyMembersDonor = $("#quicktabs-tab-patient_summary_pre_bmt-3");

  @As("linkViewOfTheDonor")
  private SelenideElement linkViewOfTheDonor = $x("(//*[text()=\"View\"])[4]");

    public CreateTestReportToDonorPage clickOnSpanFamilyMembersDonor() {
        spanFamilyMembersDonor.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportToDonorPage clickOnLinkViewOfTheDonor() {
        linkViewOfTheDonor.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportToDonorPage clickOnLinkAddNewDonorEvaluation() {
        linkAddNewDonorEvaluation.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportToDonorPage setInputEditFieldFamilyWeight(int weight) {
        inputEditFieldFamilyWeight.shouldBe(visible).setValue(String.valueOf(weight));
        return this;
    }
    public CreateTestReportToDonorPage setInputEditFieldFamilyHeight(int height) {
        inputEditFieldFamilyHeight.shouldBe(visible).setValue(String.valueOf(height));
        return this;
    }
    public CreateTestReportToDonorPage setSelectEditFieldBloodType(BloodType bloodType) {
        selectEditFieldBloodType.shouldBe(visible).selectOptionContainingText(bloodType.getText());
        return this;
    }
    public CreateTestReportToDonorPage setInputEditFieldFamilyUnd(int hb) {
        inputEditFieldFamilyUnd.shouldBe(visible).setValue(String.valueOf(hb));
        return this;
    }
    public CreateTestReportToDonorPage setSelectEditFieldSizeOfTheHB(SizeOfTheValues size) {
        selectEditFieldHBSize.shouldBe(visible).selectOptionByValue(size.getValue());
        return this;
    }
    public CreateTestReportToDonorPage setInputEditFieldGiiCount(int wbc) {
        inputEditFieldGiiCount.shouldBe(visible).setValue(String.valueOf(wbc));
        return this;
    }
    public CreateTestReportToDonorPage setInputEditFieldGiiPlatelet(int platelet) {
        inputEditFieldGiiPlatelet.shouldBe(visible).setValue(String.valueOf(platelet));
        return this;
    }
    public CreateTestReportToDonorPage setSelectEditFieldFamilyHepatitis(FamilyHistory familyHistory) {
        selectEditFieldFamilyHepatitis.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateTestReportToDonorPage setSelectEditFieldFamilyTubercolosis(FamilyHistory familyHistory) {
        selectEditFieldFamilyTubercolosis.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public CreateTestReportToDonorPage setSelectEditFieldBCG(CarrierState carrierState) {
        selectEditFieldBCG.shouldBe(visible).selectOptionByValue(carrierState.getvalue());
        return this;
    }
    public CreateTestReportToDonorPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateTestReportToDonorPage assertThatTestReportCreateOrNot() {
        String testReport = testReportName.shouldBe(visible).getText();
        log.info(testReport);
        return this;
    }

    public UserData userData;

    public CreateTestReportToDonorPage createDonorEvaluation(){
        userData = UserData.getData();
        this.clickOnLinkAddNewDonorEvaluation();
        this.setInputEditFieldFamilyWeight(userData.getWeight());
        this.setInputEditFieldFamilyHeight(154);
        this.setSelectEditFieldBloodType(userData.getBloodType());
        this.setInputEditFieldFamilyUnd(userData.getHb());
        this.setSelectEditFieldSizeOfTheHB(userData.getSize());
        this.setInputEditFieldGiiCount(userData.getWbc());
        this.setInputEditFieldGiiPlatelet(userData.getPlatelets());
        this.setSelectEditFieldFamilyHepatitis(userData.getFamilyHistory());;
        this.setSelectEditFieldFamilyTubercolosis(userData.getFamilyHistory());
        this.setSelectEditFieldBCG(userData.getCarrierState());
        this.clickOnSaveButton();
        return this;
    }
}