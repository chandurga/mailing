package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/
public class FindTheExistingPatientPage extends Page<FindTheExistingPatientPage> {
    protected FindTheExistingPatientPage() {
        super(FindTheExistingPatientPage.class);
    }
    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("inputEditFieldPatientName")
    private SelenideElement inputEditFieldPatientName = $("input[id='edit-field-patient-name-value']");

    @As("selectEditGroupRefTarget")
    private SelenideElement selectEditGroupRefTarget = $("select[id='edit-og-group-ref-target-id']");

    @As("inputEditSubmitPatients")
    private SelenideElement inputEditSubmitPatients = $("input[id='edit-submit-patients']");

    @As("linkOfPatientCode")
    private SelenideElement linkOfPatientCode = $("td[class$='views-field-field-patient-code'] a");

    @As("linkOfPatientInMenuBar")
    private SelenideElement linkOfPatientInMenuBar = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class='view-empty'] p");
    


    public FindTheExistingPatientPage enterThePatientCode(String patientCode) {
        inputEditTitle.shouldBe(visible).setValue(patientCode);
        return this;
    }
    /*For Negative scenario*/
    public FindTheExistingPatientPage enterTheInCorrectPatientID(String patientID) {
        inputEditTitle.shouldBe(visible).setValue(patientID);
        return this;
    }
    public FindTheExistingPatientPage enterFThePatientName(String patientName) {
        inputEditFieldPatientName.shouldBe(visible).setValue(patientName);
        return this;
    }
    public FindTheExistingPatientPage setSelectEditGroupRefTarget(String centre) {
        selectEditGroupRefTarget.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public FindTheExistingPatientPage clickOnApplyButton() {
        inputEditSubmitPatients.shouldBe(visible).click();
        return this;
    }
    public void assertThatPatientCode(UserData user) {
        linkOfPatientCode.shouldBe(visible).shouldHave(Condition.exactText(user.getPatientCode()));
    }
    public FindTheExistingPatientPage clickOnLinkOfPatientInMenuBar() {
        linkOfPatientInMenuBar.shouldBe(visible).click();
        return this;
    }
    public void assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.exactText("Sorry, there is nothing to display."));
    }
}