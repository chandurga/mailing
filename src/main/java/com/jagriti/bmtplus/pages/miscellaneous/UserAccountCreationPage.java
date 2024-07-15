package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

// page_url = https://dev.bmtplus.com/bmtplus-support
@Slf4j
public class UserAccountCreationPage extends Page<UserAccountCreationPage> {

    protected UserAccountCreationPage() {
        super(UserAccountCreationPage.class);
    }

    final static String STATUS = "You are now masquerading as centeradmin.";
    final static String ERROR = "User creation not allowed. Please contact administrator.";

    @As("selectEditFieldAllowedUser")
    private SelenideElement selectEditFieldAllowedUser = $("#edit-field-allowed-users-und");

    @As("selectEditFieldCenterAdmin")
    private SelenideElement selectEditFieldCenterAdmin = $("#edit-field-allowed-user-creators-und option[selected='selected']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("inputEditMasqueradeUserField")
    private SelenideElement inputEditMasqueradeUserField = $("input[aria-autocomplete='list']");

    @As("selectAutoResult")
    private SelenideElement selectAutoResult = $("#autocomplete");

    @As("inputGoButton")
    private SelenideElement inputGoButton = $("#edit-submit--4");

    @As("divStatusMessageYouAre")
    private SelenideElement divStatusMessageYouAre = $("div[class$='status']");

    @As("linkSwitchBack")
    private SelenideElement linkSwitchBack = $("li[class^='odd'] a");

    @As("linkOfTheUserName")
    private SelenideElement linkOfTheUserName = $("a[class*='btn-outline-primary']");

    @As("linkTestCentreTsa")
    private SelenideElement linkTestCentreTsa = $(byText("Test Centre (TSA)"));

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("divErrorMessageYouAre")
    private SelenideElement divErrorMessageYouAre = $("div[class$='error']");


    public UserAccountCreationPage setSelectEditFieldAllowedUser(String user) {
        if (selectEditFieldAllowedUser.shouldBe(visible).isSelected()){
            log.info("center admin user was already selected");
        }else {
            selectEditFieldAllowedUser.shouldBe(visible).selectOptionContainingText(user);
        }
        return this;
    }
    public UserAccountCreationPage setDeSelectEditFieldCenterAdmin() {
        Actions actions = new Actions(getWebDriver());
        actions.keyDown(org.openqa.selenium.Keys.CONTROL);
        actions.click(selectEditFieldCenterAdmin);
        actions.keyUp(org.openqa.selenium.Keys.CONTROL);
        actions.build().perform();
        return this;
    }
    public UserAccountCreationPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage setInputEditMasqueradeUserField(String USER) {
        inputEditMasqueradeUserField.shouldBe(visible).setValue(USER);
        return this;
    }
    public UserAccountCreationPage setSelectAutoResult() {
        selectAutoResult.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage clickOnGoButton() {
        inputGoButton.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage assertThatMasqueradeMessage() {
        divStatusMessageYouAre.shouldBe(visible).shouldHave(Condition.text(STATUS));
        Selenide.open("https://dev.bmtplus.com/bmtplus-support");
        return this;
    }
    public UserAccountCreationPage clickOnLinkSwitchBackToLogInRole() {
        linkSwitchBack.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage clickOnLinkOfTheUserName() {
        linkOfTheUserName.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage clickOnLinkTestCentreTsa() {
        linkTestCentreTsa.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage clickOnLinkEdit() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public UserAccountCreationPage assertThatErrorMessageForCreatingNewUser() {
        divErrorMessageYouAre.shouldBe(visible).shouldHave(Condition.text(ERROR));
        return this;
    }
    public UserAccountCreationPage assertThatErrorMessageForCreatingNewUserForAnotherCenter() {
        divErrorMessageYouAre.shouldBe(visible).shouldHave(Condition.text(ERROR));
        return this;
    }
}