package com.jagriti.bmtplus.tests.todo;

import com.jagriti.bmtplus.pages.LoginPage;
import com.jagriti.bmtplus.pages.todo.CreateTodoPage;
import com.jagriti.bmtplus.pages.todo.TodoData;
import com.jagriti.bmtplus.tests.TestSetup;
import com.jagriti.bmtplus.user.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateTodoTest extends TestSetup {
    private CreateTodoPage createTodoPage;
    private TodoData todoData;

    @BeforeEach
    void setUp(){
        todoData = TodoData.getData();
        createTodoPage = LoginPage
                .openPath(CONFIG.getString("Add_NEW_TODO_PATH"))
                .loginAs(Role.SITE_ADMIN)
                .shouldNavigateTo(CreateTodoPage.class)
                .then()
                .enterInputEditTitle(todoData.getTitle())
                .setInputEditStartDate(todoData.getDate())
                .enterInputEditFieldTodoAssigned("Durgaprasad")
                .clickOnResultForTodoAssigned()
                .clickOnTodoAddAnotherItemButton()
                .setInputEditFieldTodoAssigned2("Gokul")
                .clickOnResultForTodoAssigned()
                .clickOnTodoAddAnotherItemButton2()
                .setInputEditFieldTodoAssigned3("amit")
                .clickOnResultForTodoAssigned()
                .setSelectEditFieldTodoStatus(todoData.getStatus())
                .setSelectEditFieldTodoProgress(todoData.getProgress())
                .setSelectEditFieldTodoType(todoData.getType());
    }

    @Test
    void createATodoWithMultipleAssignee(){
        createTodoPage
                .setSelectCentre("Test Centre (TSA)")
                .clickOnSaveButton()
                .and()
                .assertThatSuccessMessage(todoData);
    }

    @Test
    void assertThatErrorMessageIfMissingMandatoryFields(){
        createTodoPage
                .removeTheInputEditTitle()
                .setSelectCentre("Test Centre (TSA)")
                .clickOnSaveButton()
                .and()
                .assertThatErrorMessage();
    }
}
