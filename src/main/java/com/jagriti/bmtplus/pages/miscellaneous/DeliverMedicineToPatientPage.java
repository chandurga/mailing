package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


// page_url = https://dev.bmtplus.com/content/tsa230196
@Slf4j
public class
DeliverMedicineToPatientPage extends Page<DeliverMedicineToPatientPage> {
    public DeliverMedicineToPatientPage() {
        super(DeliverMedicineToPatientPage.class);
    }

    @As("transplantSummary")
    private SelenideElement transplantSummary = $("#quicktabs-tab-patient_summary_pre_bmt-9");

    @As("linkAddNewTransplantSummary")
    private SelenideElement linkAddNewTransplantSummary = $(byText("Add New Transplant Summary"));

    @As("linkImportTreatmentPlan")
    private SelenideElement linkImportTreatmentPlan = $("#block-jagriti-custom-ji-add-content > div > div > ul > li:nth-child(2) > a");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("liDayActiveIngredientPhenytoin")
    private SelenideElement liDayActiveIngredientPhenytoin = $("li.message-item");

    @As("clinicalCourseLink")
    private SelenideElement clinicalCourseLink = $(byText("Clinical Course"));

    @As("linkAddNewClinicalCourse")
    private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

    @As("titleOfTheClinicalCourse")
    private SelenideElement titleOfTheClinicalCourse = $("input[id='edit-field-clin-course-title-mig-und-0-value']");

    @As("followDate")
    private SelenideElement followDate = $("input[id='edit-field-next-follow-up-date-und-0-value-datepicker-popup-0']");

    @As("weightOfThePatient")
    private SelenideElement weightOfThePatient = $("input[id='edit-field-clin-course-weight-und-0-value']");

    @As("heightOfThePatient")
    private SelenideElement heightOfThePatient = $("input[id='edit-field-clin-course-height-und-0-value']");

    @As("linkAdministerDrugNurses")
    private SelenideElement linkAdministerDrugNurses = $(byText("Administer Drug (Nurses)"));

    @As("inputEditFieldMedicinesMedicine")
    private SelenideElement inputEditFieldMedicinesMedicine = $("input[id='edit-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicinesQuantity")
    private SelenideElement inputEditFieldMedicinesQuantity = $("input[id='edit-field-medicines-quantity-und-0-value']");

    @As("inputEditUpdateTreatmentPlan")
    private SelenideElement inputEditSelectMedicineOrder = $("#edit-update-treatment-plan");

    @As("selectEditFieldMedicinesPlan")
    private SelenideElement selectEditFieldTreatmentPlan = $("#edit-field-medicines-trtment-plan-er-und--2");

    @As("selectEditFieldMedDelivery")
    private SelenideElement selectEditFieldImportForm = $("#edit-field-med-delivery-imported-from-und");




    @As("tdPhenytoin")
    private SelenideElement tdPhenytoin = $("#block-qa-plus-medicine-delivery > div > div > table.sticky-enabled.tableheader-processed.sticky-table > tbody > tr.even > td:nth-child(6)");

    @As("editFieldClinicalCourseMedication")
    private SelenideElement editFieldClinicalCourseMedication = $("#edit-field-clin-course-medications-und-0-value_ifr");


    public DeliverMedicineToPatientPage clickOnLinkTransplantSummary() {
        transplantSummary.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToPatientPage clickOnLinkAddNewTransplantSummary() {
        linkAddNewTransplantSummary.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    public DeliverMedicineToPatientPage clickOnLinkImportTreatmentPlan() {
        linkImportTreatmentPlan.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }

    public DeliverMedicineToPatientPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToPatientPage getTheMedicineConfirmTreatmentRegimenCreateOrNot() {
        String day1 = liDayActiveIngredientPhenytoin.shouldBe(visible).getText();
        Selenide.switchTo().window(0);
        return this;
    }

    public DeliverMedicineToPatientPage clickOnClinicalCourseLink() {
        clinicalCourseLink.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToPatientPage clickOnLinkAddNewClinicalCourse() {
        linkAddNewClinicalCourse.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToPatientPage setTitleOfTheClinicalCourse(String title) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        titleOfTheClinicalCourse.shouldBe(visible).setValue(title);
        return this;
    }

    public DeliverMedicineToPatientPage setFollowDate(String dateAsString) {
        followDate.shouldBe(visible).sendKeys(dateAsString);
        return this;
    }

    public DeliverMedicineToPatientPage setWeightOfThePatient(String weight) {
        weightOfThePatient.shouldBe(visible).setValue(weight);
        return this;
    }

    public DeliverMedicineToPatientPage setHeightOfThePatient(String height) {
        heightOfThePatient.shouldBe(visible).setValue(height);
        return this;
    }

    public DeliverMedicineToPatientPage clickOnLinkAdministerDrugNurses() {
        linkAdministerDrugNurses.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    /*Negative scenario*/
    public void checkTheButtonOfAdministerDrugNurses() {
        if (linkAdministerDrugNurses.exists()) {
            linkAdministerDrugNurses.click();
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("A3361");
            inputEditFieldMedicinesQuantity.shouldBe(visible).setValue("1");
            inputEditSubmit.click();
            String medicine = tdPhenytoin.shouldBe(visible).getText();
            log.info(medicine);
        } else {
            log.info("Administer Drug Nurses button is not there");
        }
    }

    public DeliverMedicineToPatientPage enterInputEditFieldMedicinesMedicine() {

        String actualUrl = webdriver().driver().getCurrentFrameUrl();

        if (actualUrl.contains("https://uat-bmt.myfortishealthcare.com")) {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("A35312");

        } else if (actualUrl.contains("https://dev.bmtplus.com")) {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("A38240");
        }else {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("A35325");
        }
        return this;
    }

    public DeliverMedicineToPatientPage clickOnSelectMedicineOrderButton() {
        inputEditSelectMedicineOrder.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToPatientPage setSelectEditFieldTreatmentPlan(String treatmentPlan) {
        selectEditFieldTreatmentPlan.shouldBe(visible).selectOptionContainingText(treatmentPlan);
        return this;
    }

    public DeliverMedicineToPatientPage setSelectEditFieldImportForm(String importForm) {
        selectEditFieldImportForm.shouldBe(visible).selectOptionContainingText(importForm);
        return this;
    }

    public DeliverMedicineToPatientPage enterInputEditFieldMedicinesMedicine(String medicineBarcode) {
        inputEditFieldMedicinesMedicine.shouldBe(visible).setValue(medicineBarcode);
        return this;
    }

    public DeliverMedicineToPatientPage enterInputEditFieldMedicinesMedicineFForPBarcode() {

        String actualUrl = webdriver().driver().getCurrentFrameUrl();

        if (actualUrl.contains("https://uat-bmt.myfortishealthcare.com")) {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("P4");

        } else if (actualUrl.contains("https://dev.bmtplus.com")) {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("P208");
        }else {
            inputEditFieldMedicinesMedicine.shouldBe(visible).setValue("P6");
        }
        return this;
    }

    public DeliverMedicineToPatientPage enterInputEditFieldMedicinesQuantity(int quantity) {
        inputEditFieldMedicinesQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }

    public DeliverMedicineToPatientPage getTheMedicineInClinicalCourse() {
        String medicine = tdPhenytoin.shouldBe(visible).getText();
        log.info(medicine);
        return this;
    }

    public DeliverMedicineToPatientPage getTheCopyClinicalCourseMedication(String medication) {
        actions().moveToElement(editFieldClinicalCourseMedication).click().sendKeys(medication).build().perform();
        return this;
    }

    public UserData userData;

    public DeliverMedicineToPatientPage createClinicalCourse() {
        userData = UserData.getData();
        this.setTitleOfTheClinicalCourse("New clinical course");
        this.setFollowDate(DateTimeUtils.getFormattedFutureDate());
        this.setWeightOfThePatient(String.valueOf(userData.getWeight()));
        this.setHeightOfThePatient(String.valueOf(157));
        this.clickOnSaveButton();
        return this;
    }

}