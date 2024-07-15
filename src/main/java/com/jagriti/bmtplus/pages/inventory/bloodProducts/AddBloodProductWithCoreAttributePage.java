package com.jagriti.bmtplus.pages.inventory.bloodProducts;

import co.elastic.clients.util.DateTime;
import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import org.apache.commons.math3.analysis.function.Add;

import javax.swing.*;

import static com.codeborne.selenide.Condition.editable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AddBloodProductWithCoreAttributePage extends Page<AddBloodProductWithCoreAttributePage> {
    
    protected AddBloodProductWithCoreAttributePage() {
        super(AddBloodProductWithCoreAttributePage.class);
    }

    @As("divCoreAttribute")
    private SelenideElement divCoreAttribute = $("section[class*='field-name-field-bp-core-attributes'] div[class='field-items']");

    @As("liEdit")
    private SelenideElement liEdit = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(5) > div > div > div > div > div > section > div:nth-of-type(1) > ul > li:nth-of-type(2)");

    @As("selectEditFieldCoreAttributes")
    private SelenideElement selectEditFieldCoreAttributes = $("#edit-field-bp-core-attributes-und");

    @As("liAdd")
    private SelenideElement liAdd = $("ul[class$='action-links-field-collection-add'] li");

    @As("selectEditFieldModCore")
    private SelenideElement selectEditFieldModCore = $("#edit-field-bp-mod-core-attribute-und");

    @As("textareaEditFieldModDetails")
    private SelenideElement textareaEditFieldModDetails = $("#edit-field-bp-mod-details-und-0-value");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("tdRoomTemperatureReduced")
    private SelenideElement tdRoomTemperatureReduced = $("td[class$='views-field-field-bp-mod-core-attribute']");

    @As("linkApproveModification")
    private SelenideElement linkApproveModification = $("a[class^='flag']");

    @As("spanApprovedDurgaprasadJul")
    private SelenideElement spanApprovedDurgaprasadJul = $("div[class$='flag-outer-approve-bp-core-attribute-mod'] span");

    @As("linkAdd")
    private SelenideElement linkAdd = $("a[class='button']");

    public AddBloodProductWithCoreAttributePage assertThatCoreAttributeMust80C(String attribute) {
        divCoreAttribute.shouldBe(visible).shouldHave(Condition.text(attribute));
        return this;
    }

    public AddBloodProductWithCoreAttributePage clickOnEditLink() {
        liEdit.shouldBe(visible).click();
        return this;
    }

    public AddBloodProductWithCoreAttributePage assertThatCoreAttributesShouldNotBeEditable() {
        selectEditFieldCoreAttributes.shouldBe(visible).shouldNotBe(editable);
        return this;
    }

    public AddBloodProductWithCoreAttributePage clickOnAddButton() {
        liAdd.shouldBe(visible).click();
        return this;
    }

    public AddBloodProductWithCoreAttributePage setSelectEditFieldCoreAttribute(String core) {
        selectEditFieldModCore.shouldBe(visible).selectOptionContainingText(core);
        return this;
    }

    public AddBloodProductWithCoreAttributePage setTextareaEditFieldModDetails(String details) {
        textareaEditFieldModDetails.shouldBe(visible).setValue(details);
        return this;
    }

    public AddBloodProductWithCoreAttributePage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public AddBloodProductWithCoreAttributePage assertThatRoomTemperatureReducedAttributeCreated(String room) {
        tdRoomTemperatureReduced.shouldBe(visible).shouldHave(Condition.text(room));
        return this;
    }

    public AddBloodProductWithCoreAttributePage clickOnLinkApproveModification() {
        linkApproveModification.shouldBe(visible).click();
        return this;
    }

    public AddBloodProductWithCoreAttributePage assertThatTextApprovedBy() {
        String formattedText = "Approved by durgaprasad at "+ DateTimeUtils.getFormattedDateForCoreAttribute();
        spanApprovedDurgaprasadJul.shouldBe(visible).text().contains(formattedText);
        return this;
    }

    public AddBloodProductWithCoreAttributePage clickOnAddButton2ndTime() {
        linkAdd.shouldBe(visible).click();
        return this;
    }

}