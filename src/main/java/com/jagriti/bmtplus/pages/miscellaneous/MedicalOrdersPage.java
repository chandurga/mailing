package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Slf4j
public class MedicalOrdersPage extends Page<MedicalOrdersPage> {
    public static String patientRegistrationId;
    public static String donorName;

    protected MedicalOrdersPage() {
        super(MedicalOrdersPage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkAddNewClinicalCourse")
    private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

    @As("patientLinkInTheClinicalCoursePage")
    private SelenideElement patientLinkInTheClinicalCoursePage = $x("(//*[@class=\"field-item even\"])[2]");

    @As("spanTransplantSummary")
    private SelenideElement spanTransplantSummary = $(byText("Transplant Summary"));

    @As("linkAddNewTransplantSummary")
    private SelenideElement linkAddNewTransplantSummary = $(byText("Add New Transplant Summary"));

    @As("linkImportTreatmentPlan")
    private SelenideElement linkImportTreatmentPlan = $("li[id='menu-9629-2'] a[class='sf-depth-1']");

    @As("linkPotentialDonors")
    private SelenideElement linkPotentialDonors = $("#quicktabs-tab-patient_summary_pre_bmt-3 span[class='link-badge-text']");

    @As("linkAddNewPotentialDonor")
    private SelenideElement linkAddNewPotentialDonor = $(byText("Add New Potential Donor"));

    @As("donorLink")
    private SelenideElement donorLink = $x("(//*[@class=\"field-item even\"])[2]");

    @As("linkOfTabMedicineOrders")
    private SelenideElement linkOfTabMedicineOrders = $(byText("Medicine Orders"));

    @As("linkAdministerDrugNurses")
    private SelenideElement linkAdministerDrugNurses = $(byText("Administer Drug (Nurses)"));

    @As("inputEditFieldMedicinesMedicine")
    private SelenideElement inputEditFieldMedicinesMedicine = $("input[id='edit-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicinesQuantity")
    private SelenideElement inputEditFieldMedicinesQuantity = $("input[id='edit-field-medicines-quantity-und-0-value']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkPatients")
    private SelenideElement linkPatients = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("inputEditSubmitPatients")
    private SelenideElement applyButton = $("input[id='edit-submit-patients']");

    @As("linkOfPatient")
    private SelenideElement linkOfPatient = $("td[class$='views-field-field-patient-code'] a");

    @As("linkViewOfDonor")
    private SelenideElement linkViewOfDonor = $x("(//*[text()=\"View\"])[3]");

    @As("medicineName")
    private SelenideElement medicineName = $("h1[id='page-title']");

    
    

    public MedicalOrdersPage captureThePatientID() {
        patientRegistrationId = patientID.shouldBe(visible).getText();
        return this;
    }
    public MedicalOrdersPage clickLinkAddNewClinicalCourse() {
        linkAddNewClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickOnPatientLinkInTheClinicalCoursePage() {
        patientLinkInTheClinicalCoursePage.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickOnSpanTransplantSummary() {
        spanTransplantSummary.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickLinkAddNewTransplantSummary() {
        linkAddNewTransplantSummary.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public MedicalOrdersPage clickLinkImportTreatmentPlan() {
        linkImportTreatmentPlan.scrollIntoView(true).click();
        return this;
    }
    public MedicalOrdersPage switchToMainPage() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        return this;
    }
    public MedicalOrdersPage clickLinkPotentialDonors() {
        linkPotentialDonors.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public MedicalOrdersPage clickLinkAddNewPotentialDonor() {
        linkAddNewPotentialDonor.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage setDonorLink() {
        donorName = donorLink.shouldBe(visible).getText();
        donorLink.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickLinkOfTabMedicineOrders() {
        linkOfTabMedicineOrders.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickLinkAdministerDrugNurses() {
        linkAdministerDrugNurses.scrollIntoView(true).click();
        return this;
    }
    public MedicalOrdersPage setInputEditFieldMedicinesMedicine(String MedicineBarcode) {
        inputEditFieldMedicinesMedicine.shouldBe(visible).setValue(MedicineBarcode);
        return this;
    }
    public MedicalOrdersPage setInputEditFieldMedicinesQuantity(int quantity) {
        inputEditFieldMedicinesQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public MedicalOrdersPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickLinkPatientsInMenuBar() {
        linkPatients.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage setInputEditTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }
    public MedicalOrdersPage clickOnApplyButton() {
        applyButton.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage clickOnLinkOfPatient() {
        linkOfPatient.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public MedicalOrdersPage clickLinkViewOfDonor() {
        linkViewOfDonor.shouldBe(visible).click();
        return this;
    }
    public MedicalOrdersPage getTheMedicineWhichWillTransferToDonor() {
        log.info(medicineName.scrollIntoView(true).getText());
        return this;
    }
}
