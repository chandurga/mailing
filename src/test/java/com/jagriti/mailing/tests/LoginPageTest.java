package com.jagriti.mailing.tests;

import com.jagriti.mailing.pages.HomePage;
import com.jagriti.mailing.pages.LoginPage;
import com.jagriti.mailing.pages.ResetPasswordPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.jagriti.mailing.user.Role.SITE_ADMIN;

@Disabled
class LoginPageTest extends TestSetup {
    LoginPage loginPage;

    @BeforeEach
    public void setup() {
        loginPage = LoginPage
                .openPath();
    }

    @Test
    void assertThatUserCanLoginWithValidUser() {
        loginPage
                .loginAs(SITE_ADMIN)
                .shouldNavigateTo(HomePage.class);
    }

   @Disabled
    void assertThatUserCanLoginWithValidSessionStorageToken() {
        loginPage
                .loginWithUserCookie()
                .shouldNavigateTo(HomePage.class);
    }

    @Test
    void assertThatUserCanNotLoginWithInValidUser() {
        loginPage
                .loginWith("dracula", "bla-bla-bla")
                .shouldNavigateTo(LoginPage.class);
    }

    @Test
    void assertThatUserCanAskToSendPasswordResetInstructions() {
        loginPage
                .clickOnLinkToSendPasswordResetInstructions()
                .shouldNavigateTo(ResetPasswordPage.class);
    }

}
