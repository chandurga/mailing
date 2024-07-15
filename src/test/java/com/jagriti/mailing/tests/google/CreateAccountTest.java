package com.jagriti.mailing.tests.google;

import com.jagriti.mailing.annotations.SmokeTest;
import com.jagriti.mailing.pages.LoginPage;
import com.jagriti.mailing.pages.google.CreateAccountPage;
import com.jagriti.mailing.tests.TestSetup;
import org.junit.jupiter.api.BeforeEach;

public class CreateAccountTest extends TestSetup {

    private CreateAccountPage createAccountPage;

    @BeforeEach
    public void setUp(){
        createAccountPage = LoginPage
                .openPath(CONFIG.getString("CREATE_ACCOUNT_PATH"))
                .shouldNavigateTo(CreateAccountPage.class)
                .then()
                .clickOnCreateAccount()
                .clickOnLinkPersonalUse()
                .setInputFirstName()
                .setInputLastName();
    }

    @SmokeTest
    void assertThatUserCanEnterNamesAndAssertNextPage(){
        createAccountPage
                .clickOnNext()
                .and()
                .assertThatBasicInformation();
    }

}
