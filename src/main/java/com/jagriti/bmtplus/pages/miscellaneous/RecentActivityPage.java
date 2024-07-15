package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/recent-activity
@Slf4j
public class RecentActivityPage extends Page<RecentActivityPage> {

    protected RecentActivityPage() {
        super(RecentActivityPage.class);
    }

    final String CENTRE = "Test Centre (TSA)";
    final String USER = "Durgaprasad";
    final int ITEMS = 100;

    @As("selectEditCenter")
    private SelenideElement selectEditCenter = $("#edit-og-group-ref-target-id");

    @As("inputEditUser")
    private SelenideElement inputEditUser = $("#edit-uid");

    @As("userResults")
    private SelenideElement userResults = $("#autocomplete");

    @As("inputEditDateFilterValue")
    private SelenideElement inputEditDateFilterValue = $("#edit-date-filter-value-datepicker-popup-0");

    @As("selectEditItemsPerPage")
    private SelenideElement selectEditItemsPerPage = $("#edit-items-per-page");

    @As("selectEditType")
    private SelenideElement selectEditType = $("#edit-type");

    @As("inputEditApplyButton")
    private SelenideElement inputEditApplyButton = $("#edit-submit-recent-activity");

    @As("inputTableFormOfCheckbox")
    private SelenideElement inputTableFormOfCheckbox = $("input[class='vbo-table-select-all form-checkbox']");

    @As("selectEditOperation")
    private SelenideElement selectEditOperation = $("#edit-operation");

    @As("inputEditExecuteButton")
    private SelenideElement inputEditExecuteButton = $("#edit-submit--2");

    @As("inputEditConfirmButton")
    private SelenideElement inputEditConfirmButton = $("#edit-submit");

    @As("divStatusMessagePerformedDelete")
    public SelenideElement divStatusMessagePerformedDelete = $("div[class^='messages']");

    public RecentActivityPage setSelectEditCenter() {
        selectEditCenter.shouldBe(visible).selectOptionContainingText(CENTRE);
        return this;
    }

    public RecentActivityPage enterTheUserName() {
        inputEditUser.shouldBe(visible).setValue(USER);
        return this;
    }

    public RecentActivityPage clickOnUserResults() {
        userResults.shouldBe(visible).click();
        return this;
    }

    public RecentActivityPage enterThePostDateValue(String dateFilterValue) {
        inputEditDateFilterValue.shouldBe(visible).sendKeys(dateFilterValue);
        return this;
    }

    public RecentActivityPage setSelectEditItemsPerPage() {
        selectEditItemsPerPage.shouldBe(visible).selectOptionContainingText(String.valueOf(ITEMS));
        return this;
    }

    public RecentActivityPage setSelectEditType(String type) {
        selectEditType.shouldBe(visible).selectOptionContainingText(type);
        return this;
    }

    public RecentActivityPage clickOnApplyButton() {
        inputEditApplyButton.shouldBe(visible).click();
        return this;
    }

    public RecentActivityPage clickOnTableFormOfCheckbox() {
        inputTableFormOfCheckbox.shouldBe(visible).click();
        return this;
    }

    public RecentActivityPage setSelectEditOperation(String operation) {
        selectEditOperation.shouldBe(visible).selectOptionContainingText(operation);
        return this;
    }

    public RecentActivityPage clickOnExecuteButton() {
        inputEditExecuteButton.shouldBe(visible).click();
        return this;
    }

    public RecentActivityPage clickOnConfirmButton() {
        inputEditConfirmButton.shouldBe(visible).click();
        return this;
    }

    public void getTheStatusOfDeletedContent() {
        String STATUS = divStatusMessagePerformedDelete.shouldBe(visible).getText();
        log.info(STATUS);
    }

}