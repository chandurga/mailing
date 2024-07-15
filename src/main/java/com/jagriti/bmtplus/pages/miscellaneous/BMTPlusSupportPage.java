package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.Role;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/bmtplus-support
@Slf4j
public class BMTPlusSupportPage extends Page<BMTPlusSupportPage> {
    public static String Username;
    public static String Password;

    protected BMTPlusSupportPage() {
        super(BMTPlusSupportPage.class);
    }

    @As("selectEditSupportType")
    private SelenideElement selectEditSupportType = $("#edit-support-type");

    @As("inputEditUserName")
    private SelenideElement inputEditUserName = $("#edit-user-name");

    @As("inputEditUserEmail")
    private SelenideElement inputEditUserEmail = $("#edit-user-email");

    @As("inputEditUser")
    private SelenideElement inputEditUser = $("#edit-user-pwd");

    @As("selectEditUserRoles")
    private SelenideElement selectEditUserRoles = $("#edit-user-roles");

    @As("selectEditCentre")
    private SelenideElement selectEditCentre = $("#edit-centre-id");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("selectEditUser")
    private SelenideElement selectEditUser = $("#edit-user-id");

    @As("statusMessagePasswordReset")
    private SelenideElement statusMessagePasswordReset = $("div[class$='status']");

    @As("statusMessageUserCreation")
    private SelenideElement statusMessageUserCreation = $("#messages > div > ul > li:nth-child(2) > a");

    @As("linkLogout")
    private SelenideElement linkLogout = $("a[class$='btn-info']");

    @As("username")
    private SelenideElement username = $("a[class*='btn-outline-primary']");

    @As("divErrorMessageSorryUnrecognized")
    private SelenideElement divErrorMessageSorryUnrecognized = $("div[class$='error']");


    public BMTPlusSupportPage setSelectEditSupportType(String supportType) {
        selectEditSupportType.shouldBe(Condition.visible).selectOptionByValue(supportType);
        return this;
    }

    public BMTPlusSupportPage enterInputEditUserName(String userName) {
        inputEditUserName.shouldBe(Condition.visible).setValue(userName);
        log.info("user " + userName);
        return this;
    }

    public BMTPlusSupportPage enterInputEditUserEmail(String userEmail) {
        inputEditUserEmail.shouldBe(Condition.visible).setValue(userEmail);
        return this;
    }

    public BMTPlusSupportPage enterTheUserPassword(String password) {
        inputEditUser.shouldBe(Condition.visible).setValue(password);
        Password = password;
        log.info("Pass " + Password);
        return this;
    }

    public BMTPlusSupportPage setSelectEditUserRoles(Role role) {
        selectEditUserRoles.shouldBe(Condition.visible).selectOptionContainingText(role.getText());
        return this;
    }

    public BMTPlusSupportPage setSelectEditCentre(String centre) {
        selectEditCentre.shouldBe(Condition.visible).selectOptionContainingText(centre);
        return this;
    }

    public BMTPlusSupportPage clickOnSubmit() {
        inputEditSubmit.shouldBe(Condition.visible).click();
        return this;
    }

    public BMTPlusSupportPage setSelectEditUser(String user) {
        selectEditUser.shouldBe(Condition.visible).selectOptionContainingText(user);
        return this;
    }

    public BMTPlusSupportPage refreshThePage() {
        Selenide.refresh();
        return this;
    }

    public BMTPlusSupportPage assertStatusMessageForUserCreation() {
        Username = statusMessageUserCreation.shouldBe(Condition.visible).getText();
        statusMessageUserCreation.shouldBe(Condition.visible).shouldHave(Condition.text(Username));
        return this;
    }

    public void assertStatusMessagePasswordReset() {
        statusMessagePasswordReset.shouldBe(Condition.visible).shouldHave(Condition.text("Password reset is done successfully."));
    }

    public void assertStatusMessageForBlockTheUser() {
        statusMessagePasswordReset.shouldBe(Condition.visible).shouldHave(Condition.text("User is blocked successfully."));
    }

    public BMTPlusSupportPage clickOnLogoutButton() {
        linkLogout.shouldBe(Condition.visible).click();
        return this;
    }

    public BMTPlusSupportPage assertThePageTitleAfterLogIn() {
        username.shouldBe(Condition.visible).shouldHave(Condition.text(Username));
        return this;
    }

    public BMTPlusSupportPage assertThatErrorMessageSorryUnrecognized() {
        divErrorMessageSorryUnrecognized.shouldBe(Condition.visible).shouldHave(Condition.text("Sorry, unrecognized username or password. Have you forgotten your password?"));
        return this;
    }
}