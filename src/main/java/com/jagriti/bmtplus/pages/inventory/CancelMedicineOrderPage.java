package com.jagriti.bmtplus.pages.inventory;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://dev.bmtplus.com/patient-treatment-plan/3764777
@Slf4j
public class CancelMedicineOrderPage extends Page<CancelMedicineOrderPage> {

    public static String patientRegistrationIdForCancelMed;

    public String medicine;
    public String time;
    public static String drugOption;

    protected CancelMedicineOrderPage() {
        super(CancelMedicineOrderPage.class);
    }

    @As("date")
    private SelenideElement date = $("#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(11) > td.views-field.views-field-php");

    @As("inputEditFieldFlagReason")
    private SelenideElement inputEditFieldFlagReason = $("#edit-field-flag-reason-und-0-value");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("linkCancelledMedicineOrder")
    private SelenideElement linkCancelledMedicineOrder = $x("//a[contains(@href, 'cancelled')]");

    @As("linkOfCancelledMedicine")
    private SelenideElement linkOfCancelledMedicine = $("td[class$='views-field-field-treatment-plan-medicine'] a");

    @As("linkNextPage")
    private SelenideElement linkNextPage = $("a[title*='next']");

    @As("linkPatients")
    private SelenideElement linkPatients = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("#edit-title");

    @As("inputEditSubmitPatients")
    private SelenideElement inputEditSubmitPatients = $("#edit-submit-patients");

    @As("linkOfThePatient")
    private SelenideElement linkOfThePatient = $("td[class$='views-field-field-patient-code'] a[target='_blank']");

    @As("linkViewOfClinicalCourse")
    private SelenideElement linkViewOfClinicalCourse = $("td[class$='views-field-title'] a");

    @As("linkAdministerDrugNurses")
    private SelenideElement linkAdministerDrugNurses = $(byText("Administer Drug (Nurses)"));

    @As("inputEditFieldMedicinesMedicine")
    private SelenideElement inputEditFieldMedicinesMedicine = $("#edit-field-medicines-medicine-barcode-und-0-value");

    @As("inputEditFieldMedicinesQuantity")
    private SelenideElement inputEditFieldMedicinesQuantity = $("#edit-field-medicines-quantity-und-0-value");

    @As("inputEditUpdateTreatmentPlan")
    private SelenideElement inputEditUpdateTreatmentPlan = $("#edit-update-treatment-plan");

    @As("selectEditFieldMedicinesPlan")
    private SelenideElement selectEditFieldMedicinesPlan = $("#edit-field-medicines-trtment-plan-er-und--2");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    public CancelMedicineOrderPage clickOnLinkViewOfTransplant() {
        linkViewOfTransplant.shouldBe(visible).click();
        return this;
    }

    @As("patientID")
    private SelenideElement linkViewOfTransplant = $("#quicktabs-tabpage-patient_summary_pre_bmt-9 > div > div.view-content > table > tbody > tr > td.views-field.views-field-title > a");

    public CancelMedicineOrderPage captureThePatientID() {
        patientRegistrationIdForCancelMed = patientID.shouldBe(visible).getText();
        return this;
    }

    public CancelMedicineOrderPage clickOnCancelMedicineOrder() {
        String dateLocator = "#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(%d) > td.views-field.views-field-php";
        String linkLocator = "#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(%d) > td.views-field.views-field-edit-link > ul > li > a.flag.flag-action.flag-link-confirm";
        String timeLocator = "#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(%d) > td.views-field.views-field-field-trans-treatment-plan-time > span";
        String medicineNameLocator = "#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(%d) > td.views-field.views-field-field-treatment-plan-medicine > a";
        String quantityLocator = "#views-form-patient-treatment-plan-page > div > table > tbody > tr:nth-child(%d) > td.views-field.views-field-field-treatment-plan-dosage";

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        int maxRows = 30; // Assuming a maximum of 30 rows, adjust as needed

        int finalIndex = -1;

        while(finalIndex == -1) {
            for (int i = 1; i <= maxRows; i++) {
                String dynamicDateLocator = String.format(dateLocator, i);
                String dynamicTimeLocator = String.format(timeLocator, i);

                // Check if the row exists
                if (!Selenide.$(dynamicDateLocator).exists()) {
                    break;
                }

                String rowDateText = Selenide.$(dynamicDateLocator).shouldBe(visible).getText();

                // Parse the text content to a LocalDate object
                LocalDate rowDate = LocalDate.parse(rowDateText, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

                // Check if the rowDate is tomorrow
                if (rowDate.isEqual(tomorrow)) {
                    finalIndex = i;
                    break;
                }
            }


            if (finalIndex != -1) {
                String dynamicLinkLocator = String.format(linkLocator, finalIndex);
                String dynamicMedicineLocator = String.format(medicineNameLocator, finalIndex);
                String dynamicQuantityLocator = String.format(quantityLocator, finalIndex);

                // Use these locators to interact with the elements in the found row
                String time = Selenide.$(String.format(timeLocator, finalIndex)).shouldBe(visible).getText();
                String medicine = Selenide.$(dynamicMedicineLocator).shouldBe(visible).getText();
                String quantity = Selenide.$(dynamicQuantityLocator).shouldBe(visible).getText();
                Selenide.$(dynamicLinkLocator).shouldBe(visible).click();

                // Further testing with the extracted data
                drugOption = time + " - " + medicine + " - " + quantity;
                log.info(drugOption);
            } else {
                linkNextPage.shouldBe(visible).click();
            }
        }
        return this;
    }

    public CancelMedicineOrderPage enterTheReason(String reason) {
        inputEditFieldFlagReason.shouldBe(visible).setValue(reason);
        return this;
    }

    public CancelMedicineOrderPage clickOnConfirmCancelMedicineOrderButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public CancelMedicineOrderPage clickOnLinkCancelledMedicineOrder() {
        linkCancelledMedicineOrder.shouldBe(visible).click();
        Selenide.switchTo().window(3);
        return this;
    }

    public CancelMedicineOrderPage clickOnLinkOfCancelledMedicine() {
        linkOfCancelledMedicine.shouldBe(visible);
        return this;
    }

    public CancelMedicineOrderPage clickOnLinkPatients() {
        Selenide.switchTo().window(0);
        linkPatients.shouldBe(visible).click();
        return this;
    }

    public CancelMedicineOrderPage enterThePatientCode(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }

    public CancelMedicineOrderPage clickOnTheApplyButton() {
        inputEditSubmitPatients.shouldBe(visible).click();
        return this;
    }

    public CancelMedicineOrderPage clickOnLinkOfThePatient() {
        linkOfThePatient.shouldBe(visible).click();
        Selenide.switchTo().window(4);
        return this;
    }

    public CancelMedicineOrderPage clickLinkViewOfClinicalCourse() {
        linkViewOfClinicalCourse.shouldBe(visible).click();
        return this;
    }

    public CancelMedicineOrderPage clickLinkAdministerDrugNurses() {
        linkAdministerDrugNurses.shouldBe(visible).click();
        Selenide.switchTo().window(5);
        return this;
    }

    public CancelMedicineOrderPage enterTheMedicine(String medicinesMedicine) {
        inputEditFieldMedicinesMedicine.shouldBe(visible).setValue(medicinesMedicine);
        return this;
    }

    public CancelMedicineOrderPage enterTheMedicinesQuantity(int quantity) {
        inputEditFieldMedicinesQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }

    public CancelMedicineOrderPage clickOnUpdateTreatmentPlan() {
        inputEditUpdateTreatmentPlan.shouldBe(visible).click();
        return this;
    }

    public CancelMedicineOrderPage setSelectEditFieldMedicinesPlan(String MedicinePlan) {
        selectEditFieldMedicinesPlan.shouldNotBe(visible);
        return this;
    }
}