package com.jagriti.bmtplus.pages.inventory.deliverItemToPatient;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/admin/structure/entity-type/patient_medicines/patient_inventory/add
@Slf4j
public class TransferItemToPatientInventoryPage extends Page<TransferItemToPatientInventoryPage> {
    protected TransferItemToPatientInventoryPage() {
        super(TransferItemToPatientInventoryPage.class);
    }

    @As("inputEditFieldMedicinesPatient")
    private SelenideElement inputEditFieldMedicinesPatient = $("input[id='edit-field-medicines-patient-barcode-und-0-value']");

    @As("inputEditFieldMedicinesMedicine")
    private SelenideElement inputEditFieldMedicinesMedicine = $("input[id='edit-field-medicines-medicine-barcode-und-0-value']");

    @As("inputEditFieldMedicinesQuantity")
    private SelenideElement inputEditFieldMedicinesQuantity = $("input[id='edit-field-medicines-quantity-und-0-value']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("imageBarcodeNone")
    private SelenideElement imageBarcodeNone = $("img[class^='barcode']");

    @As("linkInventory")
    private SelenideElement linkInventory = $(byText("Inventory"));

    @As("linkTransactions")
    private SelenideElement linkTransactions = $x("//a[@href='/transactions']");

    @As("selectEditFieldTransactionType")
    private SelenideElement selectEditFieldTransactionType = $("select[id='edit-field-transaction-type-value']");

    @As("inputEditAssociate")
    private SelenideElement inputEditAssociate = $("input[id='edit-title']");

    @As("inputEditApplyButton")
    private SelenideElement inputEditApplyButton = $("input[id='edit-submit-transactions']");

    @As("linkView")
    private SelenideElement linkView = $(byText("View"));

    @As("divErrorMessage")
    private SelenideElement divErrorMessage = $("div[class^='messages error']");



    public TransferItemToPatientInventoryPage setInputEditFieldMedicinesPatient(String patientCode) {
        inputEditFieldMedicinesPatient.shouldBe(visible).setValue(patientCode);
        return this;
    }
    public TransferItemToPatientInventoryPage setInputEditFieldMedicinesMedicine(String medicine) {
        inputEditFieldMedicinesMedicine.shouldBe(visible).setValue(medicine);
        return this;
    }
    public TransferItemToPatientInventoryPage setInputEditFieldMedicinesQuantity(int quantity) {
        inputEditFieldMedicinesQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public TransferItemToPatientInventoryPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public TransferItemToPatientInventoryPage getThePBarCodeName() {
        log.info("PBarcode: "+imageBarcodeNone.shouldBe(visible).getText());
        return this;
    }
    public TransferItemToPatientInventoryPage setLinkInventory() {
        actions().moveToElement(linkInventory).perform();
        return this;
    }
    public TransferItemToPatientInventoryPage setLinkTransactions() {
        linkTransactions.shouldBe(visible).click();
        return this;
    }
    public TransferItemToPatientInventoryPage setSelectEditFieldTransactionType(String transactionType) {
        selectEditFieldTransactionType.shouldBe(visible).selectOptionContainingText(transactionType);
        return this;
    }
    public TransferItemToPatientInventoryPage enterInputEditAssociate(String associate) {
        inputEditAssociate.shouldBe(visible).setValue(associate);
        return this;
    }
    public TransferItemToPatientInventoryPage clickOnInputEditApplyButton() {
        inputEditApplyButton.shouldBe(visible).click();
        return this;
    }
    public TransferItemToPatientInventoryPage setLinkView() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public TransferItemToPatientInventoryPage assertDivErrorMessage() {
        divErrorMessage.shouldBe(visible).shouldHave(Condition.text("Quantity field is required.\n" +
                "Medicine Barcode field is required.\n" +
                "The medicine barcode is invalid or the barcode does not exist in your centre. Please try again"));
        return this;
    }
}