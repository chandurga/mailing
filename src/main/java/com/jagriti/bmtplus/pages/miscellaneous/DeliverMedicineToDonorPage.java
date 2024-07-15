package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3753298
@Slf4j
public class DeliverMedicineToDonorPage extends Page<DeliverMedicineToDonorPage> {
    protected DeliverMedicineToDonorPage() {
        super(DeliverMedicineToDonorPage.class);
    }

    @As("linkImportTreatmentPlan")
    private SelenideElement linkImportTreatmentPlan = $("li[id='menu-9629-2'] a[class='sf-depth-1']");

    @As("linkQuickTabForMedicineOrders")
    private SelenideElement linkQuickTabForMedicineOrders = $("a[id$='quicktab-1']");

    @As("linkAdministerDrugNurses")
    private SelenideElement linkAdministerDrugNurses = $(byText("Administer Drug (Nurses)"));

    @As("selectEditFieldMedDonor")
    private SelenideElement selectEditFieldMedDonor = $("select[id='edit-field-med-donor-treatment-plan-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");

    @As("divErrorMessageQuantityField")
    private SelenideElement divErrorMessageQuantityField = $("div[class^='messages error']");

    @As("spanPotentialDonors")
    private SelenideElement spanPotentialDonors = $("#quicktabs-tab-patient_summary_pre_bmt-3 span[class='link-badge-text']");

    @As("viewLinkOfThePotentialDonor")
    private SelenideElement viewLinkOfThePotentialDonor = $("#quicktabs-tabpage-patient_summary_pre_bmt-3 > div > div.view-content > table.views-table.sticky-enabled.cols-13.tableheader-processed.sticky-table > tbody > tr > td.views-field.views-field-title > a");




    public DeliverMedicineToDonorPage clickLinkImportTreatmentPlan() {
        linkImportTreatmentPlan.scrollIntoView(true).click();
        return this;
    }

    public DeliverMedicineToDonorPage importTreatmentPlanInNewWindow() {
        linkImportTreatmentPlan.contextClick();
        executeJavaScript("window.open();");
        switchTo().window(1);
        Selenide.open("https://dev.bmtplus.com/treatment_plan_batch_migration");
        return this;
    }

    public DeliverMedicineToDonorPage clickOnLinkQuickTabForMedicineOrders() {
        linkQuickTabForMedicineOrders.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToDonorPage clickOnLinkAdministerDrugNurses() {
        linkAdministerDrugNurses.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToDonorPage setTheTreatmentPlanForDeliverMedicine(String treatmentPlan) {
        selectEditFieldMedDonor.shouldBe(visible).selectOptionContainingText(treatmentPlan);
        return this;
    }

    public DeliverMedicineToDonorPage clickOnSaveButton() {
        inputEditSubmit.scrollIntoView(true).click();
        return this;
    }

    public void getTheDonorNameAfterDeliverMedicine() {
        String donorName = h1PageTitle.shouldBe(visible).getText();
        log.info(donorName);
    }

    public void assertThatErrorMessageMissingMandatoryFields() {
        divErrorMessageQuantityField.shouldBe(visible).shouldHave(Condition.text("Quantity field is required."));
    }

    public void assertThatErrorMessageGiveWrongTreatmentPlan() {
        divErrorMessageQuantityField.shouldBe(visible).shouldHave(Condition.text("An incident report has been generated.\n" +
                "The medicine to be issued has expired. An incident report will be created."));
    }

    public void assertThatErrorMessageGiveInvalidMedicineBarcode() {
        divErrorMessageQuantityField.shouldBe(visible).shouldHave(Condition.text("The medicine barcode is invalid or the barcode does not exist in your centre. Please try again"));
    }

    public DeliverMedicineToDonorPage clickOnPotentialDonorsInMenuBar() {
        Selenide.switchTo().window(0);
        spanPotentialDonors.shouldBe(visible).click();
        return this;
    }

    public DeliverMedicineToDonorPage clickOnViewLinkOfThePotentialDonor() {
        viewLinkOfThePotentialDonor.shouldBe(visible).click();
        return this;
    }
}