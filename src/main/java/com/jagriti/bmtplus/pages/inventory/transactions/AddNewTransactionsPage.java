package com.jagriti.bmtplus.pages.inventory.transactions;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.investigations.InvestigationData;
import com.jagriti.bmtplus.pages.inventory.investigations.data.Currency;
import com.jagriti.bmtplus.pages.inventory.transactions.data.TransactionType;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.Objects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.jagriti.bmtplus.pages.inventory.items.AddNewItemPage.ITEM_NAME;

// page_url = https://dev.bmtplus.com/node/add/transaction
public class AddNewTransactionsPage extends Page<AddNewTransactionsPage> {
    protected AddNewTransactionsPage() {
        super(AddNewTransactionsPage.class);
    }

    public static int QUANTITY;
    public static int ITEM_COST;
    public static int DISCOUNT;
    public static int GST;

    @As("inputFieldDate")
    private SelenideElement inputFieldDate = $("input[id='edit-field-transaction-date-und-0-value-datepicker-popup-0']");

    @As("selectEditFieldTransactionType")
    private SelenideElement selectEditFieldTransactionType = $("select[id='edit-field-transaction-type-und']");

    @As("inputEditFieldTransactionAssociate")
    private SelenideElement inputEditFieldTransactionAssociate = $("input[id='edit-field-transaction-associate-und-0-target-id']");

    @As("selectAssociate")
    private SelenideElement selectAssociate = $x("//*[@id='autocomplete']");

    @As("inputEditFieldTransactionBill")
    private SelenideElement inputEditFieldSerial = $("input[id='edit-field-transaction-bill-invoice-und-0-value']");

    @As("inputEditFieldTransactionDetails")
    private SelenideElement inputEditFieldTransactionDetails = $("input[id='edit-field-transaction-details-und-0-value']");

    @As("inputEditFieldTotalCost")
    private SelenideElement inputEditFieldTotalCost = $("input[id='edit-field-total-cost-und-0-value']");

    @As("selectCentre")
    private SelenideElement selectCentre = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    @As("linkAddNewItemYour")
    private SelenideElement linkAddNewItemYour = $x("//a[contains(@href, 'collection')]");

    @As("inputEditFieldTransItem")
    private SelenideElement inputEditFieldTransItem = $("input[id='edit-field-trans-item-part-number-und-0-target-id']");

    @As("inputEditFieldTransBatchNumber")
    private SelenideElement inputEditFieldTransBatchNumber = $("input[id='edit-field-trans-item-batch-serial-und-0-value']");

    @As("inputEditFieldTransQuantity")
    private SelenideElement inputEditFieldTransQuantity = $("input[id='edit-field-trans-item-quantity-und-0-value']");

    @As("inputEditFieldTransManufacturingDate")
    private SelenideElement inputEditFieldTransManufacturingDate = $("input[id='edit-field-trans-item-mfg-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldTransExpiryDate")
    private SelenideElement inputEditFieldTransExpiryDate = $("input[id='edit-field-trans-item-expiry-date-und-0-value-datepicker-popup-0']");

    @As("selectEditFieldTransCurrency")
    private SelenideElement selectEditFieldTransCurrency = $("select[id='edit-field-trans-item-currency-type-und']");

    @As("inputEditFieldTransPerItemCost")
    private SelenideElement inputEditFieldTransPerItemCost = $("#edit-field-per-item-cost-und-0-value");

    @As("inputEditFieldTranDiscount")
    private SelenideElement inputEditFieldTranDiscount = $("#edit-field-discount-und-0-value");

    @As("inputEditFieldTranGST")
    private SelenideElement inputEditFieldTranGST = $("#edit-field-trans-item-gst-und-0-value");

    @As("inputEditFieldTransItemMRP")
    private SelenideElement inputEditFieldTransItemMRP = $("input[id='edit-field-trans-item-labelled-price-und-0-value']");

    @As("tdItemDrug")
    private SelenideElement tdItemDrug = $x("(//*[@class=\"views-field views-field-field-trans-item-part-number\"])[3]");

    public AddNewTransactionsPage enterTheInputFieldDate(String dateAsString) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        inputFieldDate.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    // For Negative scenario
    public AddNewTransactionsPage enterTheInputFieldDate() {
        inputFieldDate.shouldBe(visible).clear();
        return this;
    }
    public AddNewTransactionsPage setSelectEditFieldTransactionType(String transactionType) {
        selectEditFieldTransactionType.shouldBe(visible).selectOptionByValue(transactionType);
        return this;
    }
    public AddNewTransactionsPage setSelectEditFieldTransactionType(TransactionType transactionType) {
        selectEditFieldTransactionType.shouldBe(visible).selectOptionContainingText(transactionType.getText());
        return this;
    }
    public AddNewTransactionsPage enterInputEditFieldTransactionAssociate(String associate) {
        inputEditFieldTransactionAssociate.shouldBe(visible).setValue(associate);
        return this;
    }
    public AddNewTransactionsPage clickOnSelectAssociate() {
        selectAssociate.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public AddNewTransactionsPage setInputEditFieldSerial(int serial) {
        inputEditFieldSerial.shouldBe(visible).setValue(String.valueOf(serial));
        return this;
    }
    public AddNewTransactionsPage setInputEditFieldTransactionDetails(String details) {
        inputEditFieldTransactionDetails.shouldBe(visible).setValue(details);
        return this;
    }
    public AddNewTransactionsPage setInputEditFieldTotalCost(int cost) {
        inputEditFieldTotalCost.shouldBe(visible).setValue(String.valueOf(cost));
        return this;
    }
    public AddNewTransactionsPage setSelectCentre(String centre) {
        selectCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public AddNewTransactionsPage clickOnSaveButton() {
        inputEditSubmit.scrollIntoView(true).shouldBe(visible).click();
        return this;
    }
    public AddNewTransactionsPage assertSuccessMessage() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        successMessage.shouldBe(visible).shouldHave(Condition.text("Purchase - 1"));
        return this;
    }
    public AddNewTransactionsPage assertSuccessMessage(TransactionsData transactionsData) {
        successMessage.shouldBe(visible).shouldHave(Condition.text(transactionsData.getTransactionType().getText()+" - 1"));
        return this;
    }
    public AddNewTransactionsPage assertErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Date field is required.\n" +
                "A valid date is required for Date.\n" +
                "Transaction Type field is required."));
        return this;
    }
    public AddNewTransactionsPage clickOnAddNewTransactionButton() {
        linkAddNewItemYour.scrollIntoView(true).shouldBe(visible).click();
        return this;
    }
    public AddNewTransactionsPage enterInputEditFieldTransItem(String item) {
        inputEditFieldTransItem.shouldBe(visible).setValue(item);
        return this;
    }
    public AddNewTransactionsPage enterInputEditFieldTransBatchNumber(int batch) {
        inputEditFieldTransBatchNumber.shouldBe(visible).setValue(String.valueOf(batch));
        return this;
    }
    public AddNewTransactionsPage enterInputEditFieldTransQuantity(int quantity) {
        inputEditFieldTransQuantity.shouldBe(visible).setValue(String.valueOf(quantity));
        return this;
    }
    public void getTheTransQuantity() {
        QUANTITY = Integer.parseInt(Objects.requireNonNull(inputEditFieldTransQuantity.shouldBe(visible).getValue()));
    }
    public AddNewTransactionsPage setInputEditFieldTransManufacturingDate(String dateAsString) {
        inputEditFieldTransManufacturingDate.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public AddNewTransactionsPage setInputEditFieldTransExpiryDate(String dateAsString) {
        inputEditFieldTransExpiryDate.shouldBe(visible).setValue(dateAsString).sendKeys(Keys.ENTER);
        return this;
    }
    public AddNewTransactionsPage setSelectEditFieldTransCurrency(Currency currency) {
        selectEditFieldTransCurrency.shouldBe(visible).selectOptionByValue(currency.getValue());
        return this;
    }
    public AddNewTransactionsPage setInputEditFieldTransPerItemCost(int itemCost) {
        inputEditFieldTransPerItemCost.shouldBe(visible).setValue(String.valueOf(itemCost));
        return this;
    }
    public void getTheTransPerItemCost() {
        ITEM_COST = Integer.parseInt(Objects.requireNonNull(inputEditFieldTransPerItemCost.shouldBe(visible).getValue()));
    }
    public AddNewTransactionsPage setInputEditFieldTranDiscount(int discount) {
        inputEditFieldTranDiscount.shouldBe(visible).setValue(String.valueOf(discount));
        return this;
    }
    public void getTheTranDiscount() {
        DISCOUNT = Integer.parseInt(Objects.requireNonNull(inputEditFieldTranDiscount.shouldBe(visible).getValue()));
    }
    public AddNewTransactionsPage setInputEditFieldTranGST(int gst) {
        inputEditFieldTranGST.shouldBe(visible).setValue(String.valueOf(gst));
        return this;
    }
    public void getTheTranGST() {
        GST = Integer.parseInt(Objects.requireNonNull(inputEditFieldTranGST.shouldBe(visible).getValue()));
    }
    public AddNewTransactionsPage setInputEditFieldTransItemMRP(int mrp) {
        inputEditFieldTransItemMRP.shouldBe(visible).setValue(String.valueOf(mrp));
        return this;
    }
    public AddNewTransactionsPage assertThatTransactionAdded() {
        tdItemDrug.shouldBe(visible).shouldHave(Condition.text("item as drug"));
        return this;
    }

    private TransactionsData transactionsData;
    private InvestigationData investigation;

    public AddNewTransactionsPage createTransaction(){
        transactionsData = TransactionsData.getData();
        investigation = InvestigationData.getData();
        this.enterTheInputFieldDate(transactionsData.getDate());
        this.enterInputEditFieldTransactionAssociate("Test Associate");
        this.clickOnSelectAssociate();
        this.setInputEditFieldSerial(1);
        this.setInputEditFieldTransactionDetails("Purchase Transaction");
        this.setInputEditFieldTotalCost(2500);
        this.setSelectCentre("Test Centre (TSA)");
        this.setSelectEditFieldTransactionType("Purchase");
        this.clickOnSaveButton();
        this.and();
        this.assertSuccessMessage();
        this.clickOnAddNewTransactionButton();
        this.enterInputEditFieldTransItem("Item as drug");
        this.clickOnSelectAssociate();
        this.enterInputEditFieldTransBatchNumber(transactionsData.getBatchNumber());
        this.enterInputEditFieldTransQuantity(transactionsData.getQuantity());
        this.setInputEditFieldTransManufacturingDate(transactionsData.getDate());
        this.setInputEditFieldTransExpiryDate(transactionsData.getExpiryDate());
        this.setSelectEditFieldTransCurrency(investigation.getCurrency());
        this.setInputEditFieldTransPerItemCost(transactionsData.getItemPerCost());
        this.setInputEditFieldTransItemMRP(transactionsData.getMrp());
        this.clickOnSaveButton();
        this.and();
        this.assertThatTransactionAdded();
        return this;
    }

    public AddNewTransactionsPage createTransactionForDiscount(){
        transactionsData = TransactionsData.getData();
        investigation = InvestigationData.getData();
        int DISCOUNT_ON_ITEM = 75;
        int GST = 17;
        this.enterTheInputFieldDate(transactionsData.getDate());
        this.enterInputEditFieldTransactionAssociate("Test Associate");
        this.clickOnSelectAssociate();
        this.setInputEditFieldSerial(1);
        this.setInputEditFieldTransactionDetails("Purchase Transaction");
        this.setInputEditFieldTotalCost(2500);
        this.setSelectCentre("Test Centre (TSA)");
        this.setSelectEditFieldTransactionType("Purchase");
        this.clickOnSaveButton();
        this.and();
        this.assertSuccessMessage();
        this.clickOnAddNewTransactionButton();
        this.enterInputEditFieldTransItem(ITEM_NAME);
        this.clickOnSelectAssociate();
        this.enterInputEditFieldTransBatchNumber(transactionsData.getBatchNumber());
        this.enterInputEditFieldTransQuantity(transactionsData.getQuantity());
        this.getTheTransQuantity();
        this.setInputEditFieldTransManufacturingDate(transactionsData.getDate());
        this.setInputEditFieldTransExpiryDate(transactionsData.getExpiryDate());
        this.setInputEditFieldTransPerItemCost(transactionsData.getItemPerCost());
        this.getTheTransPerItemCost();
        this.setInputEditFieldTranDiscount(DISCOUNT_ON_ITEM);
        this.getTheTranDiscount();
        this.setInputEditFieldTranGST(GST);
        this.getTheTranGST();
        this.setInputEditFieldTransItemMRP(transactionsData.getMrp());
        this.clickOnSaveButton();
        return this;
    }
}