package com.jagriti.bmtplus.pages.inventory.investigations;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.inventory.investigations.data.BMTStatus;
import com.jagriti.bmtplus.pages.inventory.investigations.data.Currency;
import com.jagriti.bmtplus.pages.inventory.investigations.data.Investigations;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/node/add/chargebles
public class AddNewInvestigationsPage extends Page<AddNewInvestigationsPage> {
    protected AddNewInvestigationsPage() {
        super(AddNewInvestigationsPage.class);
    }

    @As("selectEditFieldAssociate")
    private SelenideElement selectEditFieldAssociate = $("select[id='edit-field-chargebles-associate-und']");

    @As("selectEditFieldInvestigation")
    private SelenideElement selectEditFieldInvestigation = $("select[id='edit-field-chargebles-investigation-und-hierarchical-select-selects-0']");

    @As("selectEditFieldInvestigationCategory")
    public SelenideElement selectEditFieldInvestigationCategory = $("select[id='edit-field-chargebles-investigation-und-hierarchical-select-selects-1']");

    @As("inputEditFieldCost")
    private SelenideElement inputEditFieldCost = $("input[id='edit-field-chargebles-cost-und-0-value']");

    @As("selectEditFieldCurrencyUnd")
    private SelenideElement selectEditFieldCurrencyUnd = $("select[id='edit-field-currency-und']");

    @As("inputEditFieldTurnAroundTime")
    private SelenideElement inputEditFieldTurnAroundTime = $("input[id='edit-field-chargeables-tat-und-0-value']");

    @As("selectEditFieldBMTStatus")
    private SelenideElement selectEditFieldBMTStatus = $("select[id='edit-field-chargables-bmt-status-und']");

    @As("selectEditGroupCentre")
    private SelenideElement selectEditGroupCentre = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("divErrorMessageThisForm")
    private SelenideElement divErrorMessageThisForm = $("div[class^='messages error']");

    @As("inputEditFieldInvestigationLab")
    private SelenideElement inputEditFieldInvestigationLab = $("input[id='edit-field-investigation-lab-id-und-0-value']");

    
    
    public AddNewInvestigationsPage setSelectEditFieldAssociate(String associate){
        selectEditFieldAssociate.shouldBe(visible).selectOptionContainingText(associate);
        return this;
    }
    public AddNewInvestigationsPage setSelectEditFieldInvestigation(String investigation) {
        selectEditFieldInvestigation.shouldBe(visible).selectOptionContainingText(investigation);
        return this;
    }
    public AddNewInvestigationsPage setSelectEditFieldInvestigationCategory(Investigations investigations) {
        selectEditFieldInvestigationCategory.shouldBe(visible, Duration.ofSeconds(10)).selectOptionContainingText(investigations.getText());
        return this;
    }
    // For Negative scenario
    public AddNewInvestigationsPage setSelectEditFieldInvestigationCategory(String investigations) {
        selectEditFieldInvestigationCategory.shouldBe(visible, Duration.ofSeconds(10)).selectOptionByValue(investigations);
        return this;
    }
    public AddNewInvestigationsPage enterTheInputEditFieldCost(int cost) {
        inputEditFieldCost.shouldBe(visible).setValue(String.valueOf(cost));
        return this;
    }
    public AddNewInvestigationsPage setSelectEditFieldCurrencyUnd(Currency currency) {
        selectEditFieldCurrencyUnd.shouldBe(visible).selectOptionByValue(currency.getValue());
        return this;
    }
    public AddNewInvestigationsPage setInputEditFieldInvestigationLab(String labId) {
        inputEditFieldInvestigationLab.shouldBe(visible).setValue(labId);
        return this;
    }
    public AddNewInvestigationsPage enterInputEditFieldAroundTime(int preferredTime) {
        inputEditFieldTurnAroundTime.shouldBe(visible).setValue(String.valueOf(preferredTime));
        return this;
    }
    public AddNewInvestigationsPage setSelectEditFieldBMTStatus(BMTStatus bmtStatus) {
        selectEditFieldBMTStatus.shouldBe(visible).selectOptionContainingText(bmtStatus.getText());
        return this;
    }
    public AddNewInvestigationsPage setSelectEditGroupCentre(String centre) {
        selectEditGroupCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public AddNewInvestigationsPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public AddNewInvestigationsPage assertThatErrorMessage(InvestigationData investigationData) {
        divErrorMessageThisForm.shouldBe(visible).shouldHave(Condition.text("This form requires that the fields Associate, Investigation or Blood Product Type are a unique combination. The specified values are already used. Matches are found in the following content:\n" +
                investigationData.getInvestigations().getText()+"@Test Supplier"));
        return this;
    }
    public AddNewInvestigationsPage assertThatErrorMessageForMissingMandatoryFields() {
        divErrorMessageThisForm.shouldBe(visible).shouldHave(Condition.text("Associate field is required.\n" +
                "Please select the type under: Investigation"));
        return this;
    }

}