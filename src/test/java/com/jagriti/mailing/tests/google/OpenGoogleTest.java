package com.jagriti.mailing.tests.google;

import com.jagriti.mailing.annotations.SmokeTest;
import com.jagriti.mailing.pages.LoginPage;
import com.jagriti.mailing.pages.google.OpenGooglePage;
import com.jagriti.mailing.tests.TestSetup;
import org.junit.jupiter.api.BeforeEach;

public class OpenGoogleTest extends TestSetup {

    private OpenGooglePage openGooglePage;

    @BeforeEach
    public void setUp(){
        openGooglePage = LoginPage
                .openPath(CONFIG.getString("HOME_PAGE_PATH"))
                .shouldNavigateTo(OpenGooglePage.class)
                .then()
                .clickOnLinkGmail()
                .clickOnCreateAccount()
                .clickOnLinkPersonalUse();
    }

    @SmokeTest
    void assertThatUserCanAbleToAccessTheCreateGmailPage(){
        openGooglePage
                .and()
                .assertThatHeaderCreateGoogleAccount();
    }

}
