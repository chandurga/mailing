package com.jagriti.bmtplus.pages.inventory.items;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.items.data.Category;
import com.jagriti.bmtplus.pages.inventory.items.data.DrugListCategory;
import com.jagriti.bmtplus.pages.inventory.items.data.ItemTag;
import com.jagriti.bmtplus.pages.inventory.items.data.PreferredVendor;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.jagriti.bmtplus.pages.inventory.transactions.AddNewTransactionsPage.*;

// page_url = https://dev.bmtplus.com/node/add/item
public class AddNewItemPage extends Page<AddNewItemPage> {
    protected AddNewItemPage() {
        super(AddNewItemPage.class);
    }

    public static String ITEM_NAME;

    @As("inputEditName")
    private SelenideElement inputEditName = $("input[id='edit-title']");

    @As("selectEditFieldItemCategory")
    private SelenideElement selectEditFieldItemCategory = $("select[id='edit-field-item-category-und']");

    @As("selectEditFieldItemTag")
    private SelenideElement selectEditFieldItemTag = $("select[id='edit-field-item-tag-und']");

    @As("selectEditFieldDrugList")
    private SelenideElement selectEditFieldDrugList = $("select[id='edit-field-drug-list-category-und']");

    @As("inputEditFieldItemThreshold")
    private SelenideElement inputEditFieldItemThreshold = $("input[id='edit-field-item-threshold-quantity-und-0-value']");

    @As("inputEditFieldItemIdeal")
    private SelenideElement inputEditFieldItemIdeal = $("input[id='edit-field-item-ideal-stock-und-0-value']");

    @As("inputEditFieldItemUse")
    private SelenideElement inputEditFieldItemUse = $("input[id='edit-field-item-use-by-day-und-0-value']");

    @As("inputEditFieldItemExpected")
    private SelenideElement inputEditFieldItemExpected = $("input[id='edit-field-item-expected-cost-und-0-value']");

    @As("selectEditFieldItemPreferred")
    private SelenideElement selectEditFieldItemPreferred = $("select[id='edit-field-item-preferred-vendor-und']");

    @As("selectEditGroupRefUnd")
    private SelenideElement selectEditCentre = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages'] ul");

    @As("totalValue")
    private SelenideElement totalValue = $x("(//*[@class=\"views-field views-field-field-trans-item-amount\"])[3]");

    public AddNewItemPage enterInputEditName(String name) {
        inputEditName.shouldBe(visible).setValue(name);
        return this;
    }
    //For Negative scenario
    public AddNewItemPage enterInputEditName() {
        inputEditName.shouldBe(visible).clear();
        return this;
    }
    public AddNewItemPage setSelectEditFieldItemCategory(Category category) {
        selectEditFieldItemCategory.shouldBe(visible).selectOptionContainingText(category.getText());
        return this;
    }
    //For Negative scenario
    public AddNewItemPage setSelectEditFieldItemCategory(String category) {
        selectEditFieldItemCategory.shouldBe(visible).selectOptionContainingText(category);
        return this;
    }
    public AddNewItemPage setSelectEditFieldItemTag(ItemTag itemTag) {
        selectEditFieldItemTag.shouldBe(visible).selectOptionByValue(itemTag.getValue());
        return this;
    }
    public AddNewItemPage setSelectEditFieldDrugList(DrugListCategory drugList) {
        selectEditFieldDrugList.shouldBe(visible).selectOptionByValue(drugList.getValue());
        return this;
    }
    public AddNewItemPage setInputEditFieldItemThreshold(int threshold) {
        inputEditFieldItemThreshold.shouldBe(visible).setValue(String.valueOf(threshold));
        return this;
    }
    public AddNewItemPage setInputEditFieldItemIdeal(int itemIdeal) {
        inputEditFieldItemIdeal.shouldBe(visible).setValue(String.valueOf(itemIdeal));
        return this;
    }
    public AddNewItemPage setInputEditFieldItemUse(float itemUse) {
        inputEditFieldItemUse.shouldBe(visible).setValue(String.valueOf(itemUse));
        return this;
    }
    public AddNewItemPage setInputEditFieldItemExpected(int itemExpected) {
        inputEditFieldItemExpected.shouldBe(visible).setValue(String.valueOf(itemExpected));
        return this;
    }
    public AddNewItemPage setSelectEditFieldItemPreferred(PreferredVendor preferred) {
        selectEditFieldItemPreferred.shouldBe(visible).selectOptionContainingText(preferred.getText());
        return this;
    }
    public AddNewItemPage setSelectEditCentre(String centre) {
        selectEditCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public AddNewItemPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewItemPage assertThatItemCreateOrNot(ItemData item) {
        successMessage.shouldBe(visible).shouldHave(Condition.text(item.getName()));
        return this;
    }
    public AddNewItemPage getTheItemName() {
        ITEM_NAME = successMessage.shouldBe(visible).getText();
        return this;
    }
    public AddNewItemPage assertErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Item Name field is required.\n" +
                "Category field is required."));
        return this;
    }
    public AddNewItemPage openTransactionPage() {
        LoginPage.openPath(CONFIG.getString("ADD_TRANSACTIONS_PATH"));
        return this;
    }
    public void assertThatTotalValueWithDiscountValue() {
        int totalCost  = ITEM_COST *  QUANTITY;
        double  discountAmount  = totalCost  * ((double) DISCOUNT /100);
        double  discountedTotal  = totalCost  - discountAmount ;
        double  gstAmount  = discountedTotal  * ((double) GST /100);
        double  finalTotal = discountedTotal  + gstAmount ;
        String formattedTotal = String.format("INR %.2f", finalTotal);
        totalValue.shouldBe(visible).shouldHave(Condition.text(formattedTotal));
    }

    public ItemData item;

    public AddNewItemPage createItemAsDrug(){
        item = ItemData.getData();
        this.enterInputEditName(item.getName());
        this.setSelectEditFieldItemCategory(item.getCategory());
        this.setSelectEditFieldItemTag(item.getItemTag());
        this.setSelectEditFieldDrugList(item.getDrugListCategory());
        this.setInputEditFieldItemThreshold(3000);
        this.setInputEditFieldItemIdeal(2500);
        this.setInputEditFieldItemUse(0.5F);
        this.setInputEditFieldItemExpected(2500);
        this.setSelectEditFieldItemPreferred(item.getPreferredVendor());
        this.setSelectEditCentre("Test Centre (TSA)");
        this.setSelectEditFieldItemCategory("Drugs");
        this.clickOnSaveButton();
        this.assertThatItemCreateOrNot(item);
        return this;
    }
}