package com.jagriti.bmtplus.tests.google;

import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.annotations.SmokeTest;
import com.jagriti.bmtplus.pages.google.OpenGooglePage;
import com.jagriti.bmtplus.tests.TestSetup;
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
