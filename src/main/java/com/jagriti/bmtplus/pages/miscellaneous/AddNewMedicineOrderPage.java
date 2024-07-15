package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class AddNewMedicineOrderPage extends Page<AddNewMedicineOrderPage> {

    public static String patientRegistrationIdForMedicineOrder;
    protected AddNewMedicineOrderPage() {
        super(AddNewMedicineOrderPage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkViewOfTransplantSummary")
    private SelenideElement linkViewOfTransplantSummary = $x("(//*[text()=\"View\"])[3]");

    @As("linkPatientTreatmentPlan")
    private SelenideElement linkPatientTreatmentPlan = $(byText("Patient Treatment Plan"));

    @As("linkAddNewMedicineOrder")
    private SelenideElement linkAddNewMedicineOrder = $(byText("Add New Medicine Order"));

    @As("selectEditMedicine")
    private SelenideElement selectEditMedicine = $("select[id='edit-medicine']");

    @As("inputEditDayFrom")
    private SelenideElement inputEditDayFrom = $("input[id='edit-day-from']");

    @As("inputEditDayTo")
    private SelenideElement inputEditDayTo = $("input[id='edit-day-to']");

    @As("selectEditTimeHour")
    private SelenideElement selectEditTimeHour = $("select[id='edit-time-1-hour']");

    @As("selectEditTimeMinute")
    private SelenideElement selectEditTimeMinute = $("select[id='edit-time-1-minute']");

    @As("selectEditTherapy")
    private SelenideElement selectEditTherapy = $("select[id='edit-therapy']");

    @As("inputEditDosage")
    private SelenideElement inputEditDosage = $("input[id='edit-dosage']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");




    public AddNewMedicineOrderPage captureThePatientID() {
        patientRegistrationIdForMedicineOrder = patientID.shouldBe(visible).getText();
        return this;
    }
    public AddNewMedicineOrderPage clickLinkViewOfTransplantSummary() {
        linkViewOfTransplantSummary.shouldBe(visible).click();
        return this;
    }
    public AddNewMedicineOrderPage clickLinkPatientTreatmentPlan() {
        linkPatientTreatmentPlan.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public AddNewMedicineOrderPage clickLinkAddNewMedicineOrder() {
        linkAddNewMedicineOrder.shouldBe(visible).click();
        Selenide.switchTo().window(3);
        return this;
    }
    public AddNewMedicineOrderPage setSelectEditMedicine(String medicine) {
        selectEditMedicine.shouldBe(visible).selectOptionContainingText(medicine);
        return this;
    }
    public AddNewMedicineOrderPage enterInputEditDayFrom(int from) {
        inputEditDayFrom.shouldBe(visible).setValue(String.valueOf(from));
        return this;
    }
    public AddNewMedicineOrderPage enterInputEditDayTo(int to) {
        inputEditDayTo.shouldBe(visible).setValue(String.valueOf(to));
        return this;
    }
    public AddNewMedicineOrderPage setSelectEditTimeHour(int hour) {
        selectEditTimeHour.shouldBe(visible).selectOptionByValue(String.valueOf(hour));
        return this;
    }
    public AddNewMedicineOrderPage setSelectEditTimeMinute(String minute) {
        selectEditTimeMinute.shouldBe(visible).selectOptionByValue(minute);
        return this;
    }
    public AddNewMedicineOrderPage setSelectEditTherapy(String therapy) {
        selectEditTherapy.shouldBe(visible).selectOptionByValue(therapy);
        return this;
    }
    public AddNewMedicineOrderPage setInputEditDosage(int dosage) {
        inputEditDosage.shouldBe(visible).setValue(String.valueOf(dosage));
        return this;
    }
    public AddNewMedicineOrderPage clickOnSubmitButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewMedicineOrderPage getSuccessMessage() {
        log.info(successMessage.shouldBe(visible).getText());
        return this;
    }
}