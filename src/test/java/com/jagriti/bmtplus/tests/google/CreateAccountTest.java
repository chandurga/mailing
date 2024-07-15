package com.jagriti.bmtplus.tests.google;

import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.annotations.SmokeTest;
import com.jagriti.bmtplus.pages.google.CreateAccountPage;
import com.jagriti.bmtplus.tests.TestSetup;
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
