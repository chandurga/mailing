package com.jagriti.bmtplus.pages.QMTools.logs;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/log-entities
public class SyncLabIdAccessPage extends Page<SyncLabIdAccessPage> {
    protected SyncLabIdAccessPage() {
        super(SyncLabIdAccessPage.class);
    }

    @As("linkOfTheLogTitle")
    private SelenideElement linkOfTheLogTitle = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div > div > section > div > div > div > div > div > div > div:nth-of-type(3) > div > form > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(1) > a");

    @As("linkTestReport")
    private SelenideElement linkTestReport = $("td[class$='views-field-title'] a");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("inputEditFieldLabUnd")
    private SelenideElement inputEditFieldLabUnd = $("#edit-field-tr-lab-id-und-0-value");

    @As("inputEditMasqueradeUserField")
    private SelenideElement inputEditMasqueradeUserField = $("#edit-masquerade-user-field");

    @As("clickOnUserName")
    private SelenideElement clickOnUserName = $("#autocomplete");

    @As("inputEditGo")
    private SelenideElement inputEditGo = $("#edit-submit--3");

    @As("linkSwitchBack")
    private SelenideElement linkSwitchBack = $("li[class^='odd'] a");

    
    
    public SyncLabIdAccessPage clickOnLinkOfTheLogTitle() {
        linkOfTheLogTitle.shouldBe(visible).click();
        return this;
    }
    public SyncLabIdAccessPage clickOnLinkTestReport() {
        linkTestReport.shouldBe(visible).click();
        return this;
    }
    public SyncLabIdAccessPage clickOnLinkEdit() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public SyncLabIdAccessPage assertThatLabIdInputFieldIsEnabled() {
        inputEditFieldLabUnd.shouldBe(Condition.enabled);
        return this;
    }
    public SyncLabIdAccessPage assertThatLabIdInputFieldIsDisabled() {
        inputEditFieldLabUnd.shouldBe(Condition.disabled);
        return this;
    }
    public SyncLabIdAccessPage enterTheUserNameForMasquerade(String User) {
        inputEditMasqueradeUserField.shouldBe(visible).setValue(User);
        return this;
    }
    public SyncLabIdAccessPage setClickOnUserName() {
        clickOnUserName.shouldBe(visible).click();
        return this;
    }
    public SyncLabIdAccessPage clickOnGoLink() {
        inputEditGo.shouldBe(visible).click();
        return this;
    }
    public SyncLabIdAccessPage clickOnLinkSwitchBack() {
        linkSwitchBack.shouldBe(visible).click();
        return this;
    }
}