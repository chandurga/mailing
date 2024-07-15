package com.jagriti.mailing.pages.google;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.mailing.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://www.google.com/intl/en-US/gmail/about/
public class CreateAccountPage extends Page<CreateAccountPage> {

    protected CreateAccountPage() {
        super(CreateAccountPage.class);
    }

    private String INFO = "Basc information";

    @As("divCreateAccount")
    private SelenideElement divCreateAccount = $("html > body > main > div:nth-of-type(1) > div > div > div > div > div:nth-of-type(3) > div:nth-of-type(1) > details > summary > div:nth-of-type(1)");

    @As("linkPersonalUse")
    private SelenideElement linkPersonalUse = $("html > body > main > div:nth-of-type(1) > div > div > div > div > div:nth-of-type(3) > div:nth-of-type(1) > details > div > a:nth-of-type(1)");

    @As("inputFirstName")
    private SelenideElement inputFirstName = $("input[aria-label$='name']");

    @As("inputLastName")
    private SelenideElement inputLastName = $("input[aria-label^='Last']");

    @As("spanNext")
    private SelenideElement spanNext = $("span[jsname='V67aGc']");

    @As("spanBasicInformation")
    private SelenideElement spanBasicInformation = $("#headingText span");
    
    public CreateAccountPage clickOnCreateAccount() {
        divCreateAccount.shouldBe(visible).click();
        return this;
    }

    public CreateAccountPage clickOnLinkPersonalUse() {
        linkPersonalUse.shouldBe(visible).click();
        return this;
    }

    public CreateAccountPage setInputFirstName() {
        inputFirstName.shouldBe(visible).setValue("Name");
        return this;
    }

    public CreateAccountPage setInputLastName() {
        inputLastName.shouldBe(visible).setValue("LastName");
        return this;
    }

    public CreateAccountPage clickOnNext() {
        spanNext.shouldBe(visible).click();
        return this;
    }

    public CreateAccountPage assertThatBasicInformation() {
        spanBasicInformation.shouldBe(visible).shouldHave(Condition.text(INFO));
        return this;
    }

}