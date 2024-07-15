package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.FamilyHistory;
import com.jagriti.bmtplus.pages.miscellaneous.data.Laboratory;
import com.jagriti.bmtplus.pages.miscellaneous.data.TypingMethod;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

// page_url = https://dev.bmtplus.com/content/tsa230872
public class HLAReportPage extends Page<HLAReportPage> {
    public static String patientRegId;

    protected HLAReportPage() {
        super(HLAReportPage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkHLATabPatientSummary")
    private SelenideElement linkHLATabPatientSummary = $("#quicktabs-tab-patient_summary_pre_bmt-4");

    @As("linkAddNewHla")
    private SelenideElement linkAddNewHla = $(byText("Add New HLA"));

    @As("inputRadioButtonHlaForPatient")
    private SelenideElement inputRadioButtonHlaForPatient = $("input[id='edit-field-hla-for-whom-und-patient']");

    @As("inputEditFieldHlaLaboratory")
    private SelenideElement inputEditFieldHlaLaboratory = $("input[id='edit-field-hla-laboratory-id-und-0-value']");

    @As("selectEditFieldHlaLaboratory")
    private SelenideElement selectEditFieldHlaLaboratory = $("select[id='edit-field-hla-laboratory-und']");

    @As("selectEditFieldHlaLaboratory")
    private SelenideElement dateSentByCenterOrFamily = $("input[id='edit-field-hla-date-sent-und-0-value-datepicker-popup-0']");

    @As("inputDateReceived")
    private SelenideElement inputDateReceived = $("input[id='edit-field-hla-date-recieved-at-hg-und-0-value-datepicker-popup-0']");

    @As("inputDateReported")
    private SelenideElement inputDateReported = $("input[id='edit-field-hla-date-und-0-value-datepicker-popup-0']");

    @As("inputEditFieldHlaPaid")
    private SelenideElement inputEditFieldHlaPaid = $("input[id='edit-field-hla-paid-und-yes']");

    @As("selectEditFieldHlaTyping")
    private SelenideElement selectEditFieldHlaTyping = $("select[id='edit-field-hla-typing-method-und']");

    @As("inputEditFieldHlaUnd")
    private SelenideElement inputEditFieldHlaUnd = $("input[id='edit-field-hla-a-df-und-0-first']");

    @As("inputEditFieldHlaBlood")
    private SelenideElement inputEditFieldHlaBlood = $("input[id='edit-field-hla-blood-group-und-0-value']");

    @As("selectEditFieldCMV")
    private SelenideElement selectEditFieldCMV = $("select[id='edit-field-family-cmv-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkAddNewHla2")
    private SelenideElement linkAddNewHla2 = $("a[class*='btn-primary']");

    @As("inputEditFieldHlaForPotentialDonor")
    private SelenideElement radioButtonHlaForPotentialDonor = $("input[id='edit-field-hla-for-whom-und-family-members']");

    @As("selectEditFieldHlaFamily")
    private SelenideElement selectEditFieldHlaFamily = $("select[id='edit-field-hla-family-member-und']");

    @As("patientLink")
    private SelenideElement patientLink = $x("(//*[@class=\"field-item even\"])[2]");

    @As("linkClickUpdatePatientHla")
    private SelenideElement linkClickUpdatePatientHla = $(byText("Update HLA Status"));

    @As("linkOfPatient")
    private SelenideElement linkOfPatient = $("td[class$='views-field-field-patient-code'] a");

    @As("linkConsentTabPatientSummary")
    private SelenideElement linkConsentTabPatientSummary = $("#quicktabs-tab-patient_summary_pre_bmt-8");

    @As("linkAddNewConsentForm")
    private SelenideElement linkAddNewConsentForm = $(byText("Add New Consent/Form"));

    @As("selectEditFieldConsentFamily")
    private SelenideElement selectEditFieldConsentFamily = $("select[id='edit-field-consent-family-member-und']");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("h1[id='page-title']");


    public HLAReportPage captureThePatientID() {
        patientRegId = patientID.shouldBe(visible).getText();
        return this;
    }
    public HLAReportPage switchingToMainWindows(){
        Selenide.switchTo().window(0);
        return this;
    }
    public HLAReportPage clickLinkHLATabPatientSummary() {
        linkHLATabPatientSummary.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickLinkAddNewHla() {
        linkAddNewHla.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickInputRadioButtonHlaForPatient() {
        inputRadioButtonHlaForPatient.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage setInputEditFieldHlaLaboratory(String laboratory) {
        inputEditFieldHlaLaboratory.shouldBe(visible).setValue(laboratory);
        return this;
    }
    public HLAReportPage setSelectEditFieldHlaLaboratory(Laboratory laboratory) {
        selectEditFieldHlaLaboratory.shouldBe(visible).selectOptionContainingText(laboratory.getText());
        return this;
    }
    public HLAReportPage setDateSentByCenterOrFamily(String dateAsString) {
        dateSentByCenterOrFamily.shouldBe(visible).setValue(dateAsString);
        return this;
    }
    public HLAReportPage setDateReceived(String dateReceived) {
        inputDateReceived.shouldBe(visible).setValue(dateReceived).pressEnter();
        return this;
    }
    public HLAReportPage setInputDateReported(String dateReported) {
        inputDateReported.shouldBe(visible).setValue(dateReported).pressEnter();
        return this;
    }
    public HLAReportPage clickRadioButtonHlaPaid() {
        inputEditFieldHlaPaid.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage setSelectEditFieldHlaTyping(TypingMethod typing) {
        selectEditFieldHlaTyping.shouldBe(visible).selectOptionByValue(typing.getValue());
        return this;
    }
    public HLAReportPage setInputEditFieldHlaUnd(int a) {
        inputEditFieldHlaUnd.shouldBe(visible).setValue(String.valueOf(a));
        return this;
    }
    public HLAReportPage setInputEditFieldHlaBlood(String blood) {
        inputEditFieldHlaBlood.shouldBe(visible).setValue(blood);
        return this;
    }
    public HLAReportPage setSelectEditFieldCMV(FamilyHistory familyHistory) {
        selectEditFieldCMV.shouldBe(visible).selectOptionByValue(familyHistory.getValue());
        return this;
    }
    public HLAReportPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickLinkAddNewHla2() {
        linkAddNewHla2.shouldBe(visible).click();
        Selenide.switchTo().window(3);
        return this;
    }
    public HLAReportPage clickRadioButtonHlaForPotentialDonor() {
        radioButtonHlaForPotentialDonor.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage setSelectEditFieldHlaFamily(String family) {
        selectEditFieldHlaFamily.shouldBe(visible).selectOptionContainingText(family);
        return this;
    }
    public HLAReportPage clickOnPatientLink() {
        patientLink.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickLinkClickUpdatePatientHla() {
        linkClickUpdatePatientHla.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickOnLinkOfPatient() {
        linkOfPatient.shouldBe(visible).click();
        Selenide.switchTo().window(4);
        return this;
    }
    public HLAReportPage clickLinkConsentTabPatientSummary() {
        linkConsentTabPatientSummary.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage clickLinkAddNewConsentForm() {
        linkAddNewConsentForm.shouldBe(visible).click();
        return this;
    }
    public HLAReportPage setDirectlyContacted(String family) {
        selectEditFieldConsentFamily.shouldBe(visible).setValue(family);
        return this;
    }
    public HLAReportPage assertThatConsentFormCreatedOrNot() {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text("Discharge Summary (TEST CENTRE)@"+patientRegId));
        return this;
    }
}