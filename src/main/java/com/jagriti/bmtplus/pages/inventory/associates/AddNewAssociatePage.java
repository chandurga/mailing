package com.jagriti.bmtplus.pages.inventory.associates;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/node/add/associate
public class AddNewAssociatePage extends Page<AddNewAssociatePage> {
    protected AddNewAssociatePage() {
        super(AddNewAssociatePage.class);
    }

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("inputEditFieldAssociateType")
    private SelenideElement inputEditFieldAssociateType = $("input[id='edit-field-associate-type-und-customer']");

    @As("inputEditFieldAssociateContact")
    private SelenideElement inputEditFieldAssociateContact = $("input[id='edit-field-associate-contact-number-und-0-value']");

    @As("inputEditFieldAssociateEmail")
    private SelenideElement inputEditFieldAssociateEmail = $("input[id='edit-field-associate-email-und-0-email']");

    @As("selectEditFieldAssociateAddress")
    private SelenideElement selectEditFieldAssociateAddress = $("select[id='edit-field-associate-address-und-0-country']");

    @As("associateName")
    private SelenideElement associateName = $("h1[id='page-title']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class$='error']");



    public AddNewAssociatePage enterTheAssociateTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }
    //For negative scenario
    public AddNewAssociatePage enterTheAssociateTitle() {
        inputEditTitle.shouldBe(visible).clear();
        return this;
    }
    public AddNewAssociatePage selectTheInputEditFieldAssociateType() {
        inputEditFieldAssociateType.shouldBe(visible).click();
        return this;
    }
    public AddNewAssociatePage enterInputEditFieldAssociateContact(String contact) {
        inputEditFieldAssociateContact.shouldBe(visible).setValue(contact);
        return this;
    }
    public AddNewAssociatePage setInputEditFieldAssociateEmail(String email) {
        inputEditFieldAssociateEmail.shouldBe(visible).setValue(email);
        return this;
    }
    //For negative scenario
    public AddNewAssociatePage removeTheEmailId() {
        inputEditFieldAssociateEmail.shouldBe(visible).clear();
        return this;
    }
    public AddNewAssociatePage setSelectEditFieldAssociateAddress(String country) {
        selectEditFieldAssociateAddress.shouldBe(visible).selectOptionContainingText(country);
        return this;
    }
    public AddNewAssociatePage assertAssociateName(AssociateData associate) {
        associateName.shouldBe(visible).shouldHave(Condition.text(associate.getName()));
        return this;
    }
    public AddNewAssociatePage clickOnSaveBitton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewAssociatePage assertErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Name field is required.\n" +
                "Type field is required."));
        return this;
    }
    public AddNewAssociatePage assertErrorMessageForEmailId() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Error message\n" +
                "\"duplicate.com\" is not a valid email address"));
        return this;
    }
}