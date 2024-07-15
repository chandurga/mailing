package com.jagriti.bmtplus.pages.inventory.stockReports;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/stock-reports
public class CheckTheReportsPage extends Page<CheckTheReportsPage> {
    protected CheckTheReportsPage() {
        super(CheckTheReportsPage.class);
    }

    @As("selectEditCenter")
    private SelenideElement selectEditCenter = $("select[id='edit-stores']");

    @As("selectEditStockItems")
    private SelenideElement selectEditStockItems = $("select[id='edit-items']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkAcyclovir")
    private SelenideElement linkAcyclovir = $("a[target='blank']");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("inputEditFieldMinimumQuantity")
    private SelenideElement inputEditFieldMinimumQuantity = $("input[id='edit-field-item-threshold-quantity-und-0-value']");

    @As("divStatusMessage")
    private SelenideElement divStatusMessage = $("div[class^='messages status']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");
    
    
    

    public CheckTheReportsPage setSelectEditCenter(String center) {
        selectEditCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public CheckTheReportsPage setSelectEditStockItems(String stockItems) {
        selectEditStockItems.shouldBe(visible).selectOptionContainingText(stockItems);
        return this;
    }
    public CheckTheReportsPage clickOnTheApplyButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CheckTheReportsPage clickOnTheLinkAcyclovir() {
        linkAcyclovir.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public CheckTheReportsPage clickOnEditButton() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public CheckTheReportsPage setInputEditFieldMinimumQuantity(int quantity) {
        inputEditFieldMinimumQuantity.shouldBe(visible).clear();
        inputEditFieldMinimumQuantity.setValue(String.valueOf(quantity));
        return this;
    }
    public CheckTheReportsPage assertThatSuccessMessage() {
        divStatusMessage.shouldBe(visible).shouldHave(Condition.text("Item Acyclovir has been updated."));
        return this;
    }
    public CheckTheReportsPage assertErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Centres field is required."));
        return this;
    }

}