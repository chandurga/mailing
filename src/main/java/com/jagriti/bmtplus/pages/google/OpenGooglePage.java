package com.jagriti.bmtplus.pages.google;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = http://google.com
public class OpenGooglePage extends Page<OpenGooglePage> {

    protected OpenGooglePage() {
        super(OpenGooglePage.class);
    }

    private String HEADER = "Create a Google Account";

    @As("linkGmail")
    private SelenideElement linkGmail = $("a[aria-label='Gmail ']");

    @As("divCreateAccount")
    private SelenideElement divCreateAccount = $("html > body > main > div:nth-of-type(1) > div > div > div > div > div:nth-of-type(3) > div:nth-of-type(1) > details > summary > div:nth-of-type(1)");

    @As("linkPersonalUse")
    private SelenideElement linkPersonalUse = $("html > body > main > div:nth-of-type(1) > div > div > div > div > div:nth-of-type(3) > div:nth-of-type(1) > details > div > a:nth-of-type(1)");

    @As("spanCreateGoogleAccount")
    private SelenideElement spanCreateGoogleAccount = $("#headingText span");


    public OpenGooglePage clickOnLinkGmail() {
        linkGmail.shouldBe(visible).click();
        return this;
    }

    public OpenGooglePage clickOnCreateAccount() {
        divCreateAccount.shouldBe(visible).click();
        return this;
    }

    public OpenGooglePage clickOnLinkPersonalUse() {
        linkPersonalUse.shouldBe(visible).click();
        return this;
    }

    public OpenGooglePage assertThatHeaderCreateGoogleAccount() {
        spanCreateGoogleAccount.shouldBe(visible).shouldHave(Condition.text(HEADER));
        return this;
    }

}