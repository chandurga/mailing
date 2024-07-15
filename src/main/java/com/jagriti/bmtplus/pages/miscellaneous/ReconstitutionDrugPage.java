package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3755956
@Slf4j
public class ReconstitutionDrugPage extends Page<ReconstitutionDrugPage> {

    public static String NameOfTheItemTag;
    public static String ABarcode;
    public static String PBarcode;
    protected ReconstitutionDrugPage() {
        super(ReconstitutionDrugPage.class);
    }

    @As("itemName")
    private SelenideElement itemTag = $x("(//*[@class=\"field-items\"])[5]");

    @As("linkInventory")
    private SelenideElement linkInventory = $(byText("Inventory"));

    @As("linkTransactions")
    private SelenideElement linkTransactions = $(byText("Transactions"));

    @As("linkAddNewTransaction")
    private SelenideElement linkAddNewTransaction = $(byText("Add New Transaction"));

    @As("aBarcodeInTheTransaction")
    private SelenideElement aBarcodeInTheTransaction = $("td[class$='views-field-field-trans-item-barcode']");

    @As("linkStockReportsPerItem")
    private SelenideElement linkStockReportsPerItem = $("a[title*='Reports']");

    @As("selectEditCenter")
    private SelenideElement selectEditCenter = $("select[id='edit-stores']");

    @As("stockQuantity")
    private SelenideElement stockQuantity = $("span[class='red']");
    
    @As("selectEditItemTag")
    private SelenideElement selectEditItemTag = $("select[id='edit-item-tag']");

    @As("linkDeliverItemPatient")
    private SelenideElement linkDeliverItemPatient = $("li[id='menu-9289-1'] a[class$='menuparent']");

    @As("linkTransferItemPatientInventory")
    private SelenideElement linkTransferItemPatientInventory = $("li[id='menu-9290-1'] a[class='sf-depth-3']");

    @As("inputEditFieldMedicinesPatient")
    private SelenideElement inputEditFieldMedicinesPatient = $("input[id='edit-field-medicines-patient-barcode-und-0-value']");

    @As("inputEditFieldMedicinesMedicine")
    private SelenideElement inputEditFieldMedicinesMedicine = $("input[id='edit-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicinesQuantity")
    private SelenideElement inputEditFieldMedicinesQuantity = $("input[id='edit-field-medicines-quantity-und-0-value']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("pBarcodeName")
    private SelenideElement pBarcodeName = $("img[class^='barcode']");

    @As("linkReconsitututedDrugList")
    private SelenideElement linkReconsitututedDrugList=$("li[id='menu-13978-1'] a[class$='menuparent']");

    @As("linkIssueForReconstitution")
    private SelenideElement linkIssueForReconstitution=$("li[id='menu-13890-1'] a[class='sf-depth-3']");

    @As("inputEditFieldMedicinesPatient2")
    private SelenideElement inputEditFieldMedicinesPatient2=$("input[id='edit-field-medicines-patient-barcode-und-0-value']");

    @As("inputEditFieldMedicineBarcode")
    private SelenideElement inputEditFieldMedicineBarcode=$("input[id='edit-field-medicine-barcode-list-und-add-more-add-more-bundle-medicine-barcodes']");

    @As("inputEditFieldMedicineBarcode2")
    private SelenideElement inputEditFieldMedicineBarcode2=$("input[id='edit-field-medicine-barcode-list-und-0-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicineQuantity")
    private SelenideElement inputEditFieldMedicineQuantity =$("input[id='edit-field-medicine-barcode-list-und-0-field-medicines-quantity-und-0-value']");

    @As("inputAddMedicineBarcodeSecondTime")
    private SelenideElement inputAddMedicineBarcodeSecondTime =$("input[id='edit-field-medicine-barcode-list-und-add-more-add-more-bundle-medicine-barcodes--2']");

    @As("inputEditFieldMedicineBarcode3")
    private SelenideElement inputEditFieldMedicineBarcode3=$("input[id='edit-field-medicine-barcode-list-und-1-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicineBarcode4")
    private SelenideElement inputEditFieldMedicineBarcode4=$("input[id='edit-field-medicine-barcode-list-und-1-field-medicines-quantity-und-0-value']");

    @As("inputEditFieldPreparationDate")
    private SelenideElement inputEditFieldPreparationDate=$("input[id='edit-field-preparation-date-time-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldPreparationTime")
    private SelenideElement inputEditFieldPreparationTime=$("input[id='edit-field-preparation-date-time-und-0-value-timeEntry-popup-1']");

    @As("inputEditFieldExpiryDate")
    private SelenideElement inputEditFieldExpiryDate=$("input[id='edit-field-expiry-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldExpiryTime")
    private SelenideElement inputEditFieldExpiryTime=$("input[id='edit-field-expiry-date-und-0-value-timeEntry-popup-1']");

    @As("reconstitutionDrugCreated")
    private SelenideElement reconstitutionDrugCreated=$("img[class^='barcode']");



    public ReconstitutionDrugPage getTheItemName() {
        NameOfTheItemTag = itemTag.shouldBe(visible).getText();
        return this;
    }
    public ReconstitutionDrugPage setTheLinkInventory() {
        linkInventory.shouldBe(visible).scrollIntoView(true);
        actions().moveToElement(linkInventory).build().perform();
        return this;
    }
    public ReconstitutionDrugPage setLinkTransactions() {
        actions().moveToElement(linkTransactions.shouldBe(visible)).build().perform();
        return this;
    }
    public ReconstitutionDrugPage setLinkAddNewTransaction() {
        actions().moveToElement(linkAddNewTransaction.shouldBe(visible)).click().build().perform();
        return this;
    }
    public ReconstitutionDrugPage getTheABarcodeInTheTransaction() {
        ABarcode = aBarcodeInTheTransaction.shouldBe(visible).getText();
        return this;
    }
    public ReconstitutionDrugPage setLinkStockReportsPerItem() {
        actions().moveToElement(linkStockReportsPerItem).click().perform();
        return this;
    }
    public ReconstitutionDrugPage setSelectEditCenter(String center) {
        selectEditCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public ReconstitutionDrugPage getTheStockQuantity() {
        log.info(stockQuantity.shouldBe(visible).getText());
        return this;
    }
    public ReconstitutionDrugPage setSelectEditItemTag(String itemTag) {
        selectEditItemTag.shouldBe(visible).selectOptionContainingText(itemTag);
        return this;
    }
    public ReconstitutionDrugPage setLinkTheDeliverItemPatient() {
        actions().moveToElement(linkDeliverItemPatient.shouldBe(visible)).perform();
        return this;
    }
    public ReconstitutionDrugPage setTheTransferItemPatientInventory() {
        actions().moveToElement(linkTransferItemPatientInventory.shouldBe(visible)).click().perform();
        return this;
    }
    public ReconstitutionDrugPage enterInputEditFieldMedicinesPatient(String patient) {
        inputEditFieldMedicinesPatient.shouldBe(visible).setValue(patient);
        return this;
    }
    public ReconstitutionDrugPage enterTheMedicineBarcode(String medicineBarcode) {
        inputEditFieldMedicinesMedicine.shouldBe(visible).setValue(medicineBarcode);
        return this;
    }
    public ReconstitutionDrugPage enterTheMedicinesQuantity(int quantity) {
        inputEditFieldMedicinesQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public ReconstitutionDrugPage clickOnSubmit() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public ReconstitutionDrugPage getThePBarcodeName() {
        PBarcode = pBarcodeName.shouldBe(visible).getText();
        return this;
    }
    public ReconstitutionDrugPage setLinkReconstitutionDrugList() {
        actions().moveToElement(linkReconsitututedDrugList).perform();
        return this;
    }
    public ReconstitutionDrugPage setLinkIssueForReconstitution() {
        actions().moveToElement(linkIssueForReconstitution).click().perform();
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldMedicinesPatient2(String patient2) {
        inputEditFieldMedicinesPatient2.shouldBe(visible).setValue(patient2);
        return this;
    }
    public ReconstitutionDrugPage clickOnAddMedicineBarcodeButton() {
        inputEditFieldMedicineBarcode.shouldBe(visible).click();
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldMedicineBarcode2(String barcode2) {
        inputEditFieldMedicineBarcode2.shouldBe(visible).setValue(barcode2);
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldMedicineQuantity(int quantity) {
        inputEditFieldMedicineQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public ReconstitutionDrugPage clickOnAddMedicineBarcodeButtonAgain() {
        inputAddMedicineBarcodeSecondTime.shouldBe(visible).click();
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldMedicineBarcode3(String medicineBarcode3) {
        inputEditFieldMedicineBarcode3.shouldBe(visible).setValue(medicineBarcode3);
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldMedicineBarcode4(int quantity) {
        inputEditFieldMedicineBarcode4.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldPreparationDate(String dateAsString) {
        inputEditFieldPreparationDate.shouldBe(visible).setValue(dateAsString);
        inputEditFieldPreparationDate.sendKeys(Keys.ENTER);
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldPreparationTime(String time) {
        inputEditFieldPreparationTime.shouldBe(visible).setValue(time);
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldExpiryDate(String date) {
        inputEditFieldExpiryDate.shouldBe(visible).setValue(date);
        inputEditFieldExpiryDate.sendKeys(Keys.ENTER);
        return this;
    }
    public ReconstitutionDrugPage setInputEditFieldExpiryTime(String time) {
        inputEditFieldExpiryTime.shouldBe(visible).setValue(time);
        return this;
    }
    public ReconstitutionDrugPage setReconstitutionDrugCreated() {
        log.info(reconstitutionDrugCreated.shouldBe(visible).getText());
        return this;
    }

}