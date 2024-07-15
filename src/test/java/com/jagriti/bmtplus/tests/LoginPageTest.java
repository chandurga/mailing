package com.jagriti.bmtplus.tests;

import com.jagriti.bmtplus.pages.HomePage;
import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.pages.ResetPasswordPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.jagriti.bmtplus.user.Role.SITE_ADMIN;


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
