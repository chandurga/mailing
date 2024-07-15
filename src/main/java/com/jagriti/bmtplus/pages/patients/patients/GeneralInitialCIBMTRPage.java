package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/
@Slf4j
public class GeneralInitialCIBMTRPage extends Page<GeneralInitialCIBMTRPage> {

    protected GeneralInitialCIBMTRPage() {
        super(GeneralInitialCIBMTRPage.class);
    }

    @As("inputEditTitle")
    private SelenideElement inputEditTitle = $("input[id='edit-title']");

    @As("inputEditSubmitPatients")
    private SelenideElement inputEditSubmitPatients = $("input[id='edit-submit-patients']");

    @As("patientLink")
    private SelenideElement patientLink = $("td[class$='views-field-field-patient-code'] a");

    @As("spanSubmissions")
    private SelenideElement spanSubmissions = $("#quicktabs-tab-patient_summary_pre_bmt-18 span[class='link-badge-text']");

    @As("linkGenerateInitialForms")
    private SelenideElement linkGenerateInitialForms = $("span[class*='flag-generate-initial-cibmtr-forms'] a[class*='flag-action']");

    @As("tdFormInitialPatientRegistration")
    private SelenideElement tdFormInitialPatientRegistration = $("tr[class$='views-row-first'] td[class$='views-field-field-submission-form-id']");

    
    
    
    public GeneralInitialCIBMTRPage setInputEditTitle(String title) {
        inputEditTitle.shouldBe(visible).setValue(title);
        return this;
    }
    public GeneralInitialCIBMTRPage clickOnApplyButton() {
        inputEditSubmitPatients.shouldBe(visible).click();
        return this;
    }
    public GeneralInitialCIBMTRPage clickOnPatientLink() {
        patientLink.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public GeneralInitialCIBMTRPage clickOnPatientLinkForInvestigations() {
        patientLink.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public GeneralInitialCIBMTRPage clickOnCIBMTRSubmissions() {
        spanSubmissions.shouldBe(visible).click();
        return this;
    }
    public GeneralInitialCIBMTRPage clickOnLinkGenerateInitialForms() {
        linkGenerateInitialForms.shouldBe(visible).click();
        return this;
    }
    public GeneralInitialCIBMTRPage getTheFormInitialPatientRegistration() {
        log.info(tdFormInitialPatientRegistration.shouldBe(visible).getText());
        return this;
    }
}