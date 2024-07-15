package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.utils.DateTimeUtils;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/admin/structure/entity-type/intake_output/intake_output/add/3754247?destination=node/3754247
public class CreateIntakeOutputPage extends Page<CreateIntakeOutputPage> {
    protected CreateIntakeOutputPage() {
        super(CreateIntakeOutputPage.class);
    }

    @As("selectEditFieldOutTime")
    private SelenideElement selectEditFieldOutTime = $("select[id='edit-field-in-out-time-und-0-value-hour']");

    @As("selectEditFieldOutTime2")
    private SelenideElement selectEditFieldOutTime2 = $("select[id='edit-field-in-out-time-und-0-value-minute']");

    @As("linkAddNewIntakeOutput")
    private SelenideElement linkAddNewIntakeOutput = $(byText("Add New Intake Output"));

    @As("inputEditFieldPrimaryMedicine")
    private SelenideElement inputEditFieldPrimaryMedicine = $("input[id='edit-field-primary-medicine-und-0-value']");

    @As("inputEditFieldIntakePrimary")
    private SelenideElement inputEditFieldIntakePrimary = $("input[id='edit-field-intake-primary-medicine-und-0-value']");

    @As("inputEditFieldSecondaryMedicine")
    private SelenideElement inputEditFieldSecondaryMedicine = $("input[id='edit-field-secondary-medicine-name-und-0-value']");

    @As("inputEditFieldIntakeSecondary")
    private SelenideElement inputEditFieldIntakeSecondary = $("input[id='edit-field-intake-secondary-medicine-und-0-value']");

    @As("inputEditFieldTertiaryName")
    private SelenideElement inputEditFieldTertiaryName = $("input[id='edit-field-tertiary-name-und-0-value']");

    @As("inputEditFieldIntakeVolume")
    private SelenideElement inputEditFieldIntakeVolume = $("input[id='edit-field-intake-tertiary-medicine-und-0-value']");

    @As("inputEditFieldIntakeNormal")
    private SelenideElement inputEditFieldIntakeNormalSaline = $("input[id='edit-field-intake-normal-saline-und-0-value']");

    @As("inputEditFieldIntakeOral")
    private SelenideElement inputEditFieldIntakeOral = $("input[id='edit-field-intake-oral-und-0-value']");

    @As("inputEditFieldOutputUrine")
    private SelenideElement inputEditFieldOutputUrine = $("input[id='edit-field-output-urine-und-0-value']");

    @As("inputEditFieldOutputDiarrhea")
    private SelenideElement inputEditFieldOutputDiarrhea = $("input[id='edit-field-output-diarrhea-volume-und-0-value']");

    @As("inputEditFieldOutputOther")
    private SelenideElement inputEditFieldOutputOther = $("input[id='edit-field-output-other-und-0-value']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("h1PageTitle")
    private SelenideElement message = $("h1[id='page-title']");

    @As("linkViewOfTheClinicalCourse")
    public SelenideElement linkViewOfTheClinicalCourse = $x("(//*[text()='View'])[2]");

    public CreateIntakeOutputPage clickOnLinkViewOfTheClinicalCourse() {
        linkViewOfTheClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public CreateIntakeOutputPage clickOnLinkAddNewIntakeOutput() {
        linkAddNewIntakeOutput.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public CreateIntakeOutputPage setSelectEditFieldOutTime() {
        String hour = selectEditFieldOutTime.shouldBe(visible).getText();
        String minute = selectEditFieldOutTime2.shouldBe(visible).getText();
        String time = hour+":"+minute;
        time.equalsIgnoreCase(DateTimeUtils.getFormattedDate());
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldPrimaryMedicine(String medicine) {
        inputEditFieldPrimaryMedicine.shouldBe(visible).setValue(medicine);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldIntakePrimary(String intakePrimary) {
        inputEditFieldIntakePrimary.shouldBe(visible).setValue(intakePrimary);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldSecondaryMedicine(String secondaryMedicine) {
        inputEditFieldSecondaryMedicine.shouldBe(visible).setValue(secondaryMedicine);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldIntakeSecondary(String secondary) {
        inputEditFieldIntakeSecondary.shouldBe(visible).setValue(secondary);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldTertiaryName(String tertiaryName) {
        inputEditFieldTertiaryName.shouldBe(visible).setValue(tertiaryName);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldIntakeVolume(String intakeVolume) {
        inputEditFieldIntakeVolume.shouldBe(visible).setValue(intakeVolume);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldIntakeNormalSaline(String saline) {
        inputEditFieldIntakeNormalSaline.shouldBe(visible).setValue(saline);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldIntakeOral(String intakeOral) {
        inputEditFieldIntakeOral.shouldBe(visible).setValue(intakeOral);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldOutputUrine(String urine) {
        inputEditFieldOutputUrine.shouldBe(visible).setValue(urine);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldOutputDiarrhea(String diarrhea) {
        inputEditFieldOutputDiarrhea.shouldBe(visible).setValue(diarrhea);
        return this;
    }
    public CreateIntakeOutputPage setInputEditFieldOutputOther(String outputOther) {
        inputEditFieldOutputOther.shouldBe(visible).setValue(outputOther);
        return this;
    }
    public CreateIntakeOutputPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateIntakeOutputPage assertThatSuccessMessage() {
        message.shouldBe(visible).shouldHave(Condition.text("17854041663600 - Day"));
        return this;
    }
}