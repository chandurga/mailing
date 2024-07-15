package com.jagriti.bmtplus.pages;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.jagriti.bmtplus.cookie.CookieSingleton;
import com.jagriti.bmtplus.user.Role;
import com.jagriti.bmtplus.user.User;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.editable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.SetValueOptions.withText;
import static com.jagriti.bmtplus.user.Role.SITE_ADMIN;

@Slf4j
// page_url = https://dev.bmtplus.com/
public class LoginPage extends Page<LoginPage>  {
    private LoginPage() {
        super(LoginPage.class);
    }

    public static LoginPage getPage() {
        return page(LoginPage.class);
    }

    public static LoginPage openPath() {
        return open(CONFIG.getString("LOGIN_URL"), LoginPage.class);
    }

    public static LoginPage openPath(String resourcePath) {
        return open(CONFIG.getString("LOGIN_URL") + resourcePath, LoginPage.class);
    }

    @As("userNameInput")
    private SelenideElement userNameInput = $("input[id='edit-name']");

    @As("passwordInput")
    private SelenideElement passwordInput = $("input[id='edit-pass']");

    @As("submitButton")
    private SelenideElement submitButton = $("#edit-submit");

    @As("sendPasswordResetInstructionsLink")
    private SelenideElement sendPasswordResetInstructionsLink = $("#user-login-form > div > div.item-list > ul > li > a");

    private LoginPage setUserName(String userName) {
        userNameInput.shouldBe(editable).setValue(withText(userName).sensitive());
        return this;
    }

    private LoginPage setPassword(String password) {
        passwordInput.shouldBe(editable).setValue(withText(password).sensitive());
        return this;
    }

    private LoginPage clickOnSubmitButton() {
        submitButton.shouldBe(visible).click();
        return this;
    }

    /**
     * Facade methods to be used for positive testing by all other classes
     */
    public LoginPage loginAs(Role role) {
        switch (role) {
            case SITE_ADMIN:
                return loginWith(new User(SITE_ADMIN).getUsername(), new User(SITE_ADMIN).getPassword());
            default:
                throw new IllegalStateException(String.format("%s role is not defined. Pick your roles from %s.", role, Role.values()));
        }
    }

    /**
     * Facade methods to be used for negative testing in the login class 
     */
    public LoginPage loginWith(String username, String password) {
        return setUserName(username)
                .setPassword(password)
                .then()
                .clickOnSubmitButton();
    }

    public LoginPage loginWithUserCookie(){
        Cookie cookie = CookieSingleton.getInstance().getCookie();
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        Selenide.refresh();
        return this;
    }

    public LoginPage clickOnLinkToSendPasswordResetInstructions() {
        sendPasswordResetInstructionsLink.shouldBe(visible).click();
        return this;
    }
}

