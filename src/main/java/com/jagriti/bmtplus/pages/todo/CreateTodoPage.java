package com.jagriti.bmtplus.pages.todo;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.todo.data.Progress;
import com.jagriti.bmtplus.pages.todo.data.Status;
import com.jagriti.bmtplus.pages.todo.data.Type;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/todo
public class CreateTodoPage extends Page<CreateTodoPage> {
    protected CreateTodoPage() {
        super(CreateTodoPage.class);
    }

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("inputEditStartDate")
    private SelenideElement inputEditStartDate = $("input[id='edit-field-todo-start-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldTodoAssigned")
    private SelenideElement inputEditFieldTodoAssigned = $("input[id='edit-field-todo-assigned-to-und-0-uid']");

    @As("clickOnResult")
    private SelenideElement clickOnResult = $x("//*[@id='autocomplete']");

    @As("inputEditFieldTodoAddAnother")
    private SelenideElement inputEditFieldTodoAddAnother = $("input[id='edit-field-todo-assigned-to-und-add-more']");

    @As("inputEditFieldTodoAssigned2")
    private SelenideElement inputEditFieldTodoAssigned2 = $("input[id='edit-field-todo-assigned-to-und-1-uid']");

    @As("inputEditFieldTodoAddAnother2")
    private SelenideElement inputEditFieldTodoAddAnother2 = $("input[id='edit-field-todo-assigned-to-und-add-more--2']");

    @As("inputEditFieldTodoAssigned3")
    private SelenideElement inputEditFieldTodoAssigned3 = $("input[id='edit-field-todo-assigned-to-und-2-uid']");

    @As("selectEditFieldTodoStatus")
    private SelenideElement selectEditFieldTodoStatus = $("select[id='edit-field-todo-status-und']");

    @As("selectEditFieldTodoProgress")
    private SelenideElement selectEditFieldTodoProgress = $("select[id='edit-field-todo-progress-und']");

    @As("selectEditFieldTodoType")
    private SelenideElement selectEditFieldTodoType = $("select[id='edit-field-todo-type-und']");

    @As("selectCentre")
    private SelenideElement selectCentre = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessage")
    private SelenideElement successMessage = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    

    public CreateTodoPage enterInputEditTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }
    /*For Negative scenario*/
    public CreateTodoPage removeTheInputEditTitle() {
        inputEditTitle.shouldBe(visible).clear();
        return this;
    }
    public CreateTodoPage setInputEditStartDate(String dateAsString) {
        inputEditStartDate.shouldBe(visible).setValue(dateAsString);
        inputEditStartDate.sendKeys(Keys.ENTER);
        return this;
    }
    public CreateTodoPage enterInputEditFieldTodoAssigned(String assigned) {
        inputEditFieldTodoAssigned.shouldBe(visible).setValue(assigned);
        return this;
    }
    public CreateTodoPage clickOnResultForTodoAssigned() {
        clickOnResult.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public CreateTodoPage clickOnTodoAddAnotherItemButton() {
        inputEditFieldTodoAddAnother.shouldBe(visible).click();
        return this;
    }
    public CreateTodoPage setInputEditFieldTodoAssigned2(String assigned2) {
        inputEditFieldTodoAssigned2.shouldBe(visible, Duration.ofSeconds(10)).setValue(assigned2);
        return this;
    }
    public CreateTodoPage clickOnTodoAddAnotherItemButton2() {
        inputEditFieldTodoAddAnother2.shouldBe(visible).click();
        return this;
    }
    public CreateTodoPage setInputEditFieldTodoAssigned3(String assigned3) {
        inputEditFieldTodoAssigned3.shouldBe(visible, Duration.ofSeconds(10)).setValue(assigned3);
        return this;
    }
    public CreateTodoPage setSelectEditFieldTodoStatus(Status status) {
        selectEditFieldTodoStatus.shouldBe(visible).selectOptionByValue(status.getValue());
        return this;
    }
    public CreateTodoPage setSelectEditFieldTodoProgress(Progress progress) {
        selectEditFieldTodoProgress.shouldBe(visible).selectOptionByValue(progress.getValue());
        return this;
    }
    public CreateTodoPage setSelectEditFieldTodoType(Type type) {
        selectEditFieldTodoType.shouldBe(visible).selectOptionByValue(type.getValue());
        return this;
    }
    public CreateTodoPage setSelectCentre(String centre) {
        selectCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public CreateTodoPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateTodoPage assertThatSuccessMessage(TodoData todoData) {
        successMessage.shouldBe(visible).shouldHave(Condition.text(todoData.getTitle()));
        return this;
    }
    public CreateTodoPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Title field is required."));
        return this;
    }
}