package com.jagriti.bmtplus.pages.inventory.bloodProducts;

import com.codeborne.selenide.*;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.data.BloodProductType;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3765001
@Slf4j
public class AddBloodProductInTheClinicalCoursePage extends Page<AddBloodProductInTheClinicalCoursePage> {
    public static String lastElementOfBloodProduct;
    public static String dayNum;
    protected AddBloodProductInTheClinicalCoursePage() {
        super(AddBloodProductInTheClinicalCoursePage.class);
    }

    public AddBloodProductInTheClinicalCoursePage captureTheDayNumber() {
        dayNum = dayNumber.shouldBe(visible).getText();
        log.info(dayNum);
        return this;
    }

    @As("dayNumber")
    private SelenideElement dayNumber = $("section[class*='field-name-field-clin-course-day-number'] div[class='field-items']");

    @As("linkAddNewOrder")
    private SelenideElement linkAddNewOrder = $("#block-views-blood-product-orders-block > div > div > div > div > div > a");

    @As("selectEditFieldBloodProduct")
    private SelenideElement selectEditFieldBloodProduct = $("#edit-field-blood-product-type-und");

    @As("units")
    private SelenideElement inputEditFieldUnits = $("#edit-field-no-of-units-und-0-value");

    @As("textareaEditFieldRemarkUnd")
    private SelenideElement textareaEditFieldRemarkUnd = $("#edit-field-remark-und-0-value");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("selectEditFieldBloodProductOrder")
    private SelenideElement selectEditFieldBloodProductOrder = $("#edit-field-blood-product-order-und");

    @As("tdOrdersDeliveredPending")
    private SelenideElement tdOrdersDeliveredPending = $("td[class$='views-field-field-remark-1']");

    @As("linkOfTheBloodComponent")
    private SelenideElement linkOfTheBloodComponent = $("section[class*='field-name-field-bp-blood-component'] div[class='field-items']");

    @As("linkOfTheInvestigationOrBloodProductType")
    private SelenideElement linkOfTheInvestigationOrBloodProductType = $("section[class*='field-name-field-chargebles-investigation'] div[class='field-items']");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("selectEditFieldBloodProductInTheCreatedBloodProduct")
    private SelenideElement selectEditFieldBloodProductInTheCreatedBloodProduct = $("#edit-field-blood-product-types-und");

    @As("liView")
    private SelenideElement liView = $("html > body > div:nth-of-type(2) > ul > li:nth-of-type(1)");

    @As("linkViewOfTheIssuedBloodProduct")
    private SelenideElement linkViewOfTheIssuedBloodProduct = $("td[class$='views-field-view-node'] a");

    @As("divErrorMessageBloodProduct")
    private SelenideElement divErrorMessageBloodProduct = $("div[class$='error']");

    @As("statusMessageInvestigationBlood")
    private SelenideElement statusMessageInvestigationBlood = $("div[class$='status']");


    public AddBloodProductInTheClinicalCoursePage clickOnLinkAddNewOrder() {
        linkAddNewOrder.scrollIntoView(false);
        linkAddNewOrder.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage setSelectEditFieldBloodProduct(BloodProductType bloodProduct) {
        selectEditFieldBloodProduct.shouldBe(visible).selectOptionByValue(bloodProduct.getValue());
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage enterTheUnits(int units) {
        inputEditFieldUnits.shouldBe(visible).setValue(String.valueOf(units));
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage enterTheRemarks(String remarks) {
        textareaEditFieldRemarkUnd.shouldBe(visible).setValue(remarks);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage setSelectEditFieldBloodProductOrder(String bloodProductOrder) {
        selectEditFieldBloodProductOrder.shouldBe(visible).selectOptionContainingText(bloodProductOrder);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage printTheCreatedBloodProductType() {
        ElementsCollection bloodProductTypeElements = $$(".views-field.views-field-field-blood-product-type");

        // Print information about the last row
        if (!bloodProductTypeElements.isEmpty()) {
            lastElementOfBloodProduct = bloodProductTypeElements.last().text();
            log.info("Text content of the last element: " + lastElementOfBloodProduct);
            // Add additional actions or information printing as needed
        } else {
            log.info("No elements found with the common locator.");
        }

        return this;
    }
    public AddBloodProductInTheClinicalCoursePage assertThatOrdersPending() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        tdOrdersDeliveredPending.shouldBe(visible).getText().contains("Order Pending");
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage assertThatOrdersDelivered() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        tdOrdersDeliveredPending.shouldBe(visible).getText().contains("Orders Delivered");
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnLinkOfTheBloodComponentToView() {
        Selenide.switchTo().window(1);
        linkOfTheBloodComponent.shouldBe(visible).click();
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnLinkOfTheInvestigationOrBloodProductTypeToView() {
        linkOfTheInvestigationOrBloodProductType.shouldBe(visible).click();
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnEditButton() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage setSelectEditFieldBloodProductInTheCreatedBloodProduct(String bloodProduct) {
        selectEditFieldBloodProductInTheCreatedBloodProduct.shouldBe(visible).selectOptionContainingText(bloodProduct);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnViewButton() {
        liView.shouldBe(visible).click();
        Selenide.switchTo().window(0);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnLinkViewOfTheIssuedBloodProductInFirstWindow() {
        Selenide.refresh();
        linkViewOfTheIssuedBloodProduct.shouldBe(visible).click();
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage clickOnLinkViewOfTheIssuedBloodProduct() {
        Selenide.refresh();
        linkViewOfTheIssuedBloodProduct.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage assertThatErrorMessageOfTheBloodProductMisMatch() {
        divErrorMessageBloodProduct.shouldBe(visible).shouldHave(Condition.text("Blood Product type is not matching with the selected blood component"));
        return this;
    }
    public AddBloodProductInTheClinicalCoursePage switchToFirstWindow() {
        Selenide.switchTo().window(0);
        return this;
    }
    
    public AddBloodProductInTheClinicalCoursePage switchToSecondWindow() {
        Selenide.switchTo().window(1);
        return this;
    }

    public AddBloodProductInTheClinicalCoursePage getStatusMessageInvestigationBlood() {
        log.info(statusMessageInvestigationBlood.shouldBe(visible).getText());
        return this;
    }

}