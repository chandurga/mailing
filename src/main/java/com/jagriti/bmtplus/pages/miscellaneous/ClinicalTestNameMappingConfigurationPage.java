package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3752878
@Slf4j
public class ClinicalTestNameMappingConfigurationPage extends Page<ClinicalTestNameMappingConfigurationPage> {

    public static String patientRegIDForMappingTheData;
    protected ClinicalTestNameMappingConfigurationPage() {
        super(ClinicalTestNameMappingConfigurationPage.class);
    }

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("textareaEditFieldOfFerritinTestName")
    private SelenideElement textareaEditFieldOfFerritinTestName = $("#edit-field-test-name-alias-mapping-und-23-field-alias-names-und-0-value");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkPatients")
    private SelenideElement linkPatients = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    @As("linkAddNewPatient")
    private SelenideElement linkAddNewPatient = $(byText("Add New Patient"));

    @As("linkOrderNewTest")
    private SelenideElement linkOrderNewTest = $(byText("Order New Test"));

    @As("textareaEditFieldHLADataUnd")
    private SelenideElement textareaEditFieldHLADataUnd = $("textarea[id='edit-field-tr-hl7-data-und-0-value']");

    @As("linkView")
    private SelenideElement linkView = $(byText("view"));

    @As("linkHideInfectiousDiseases")
    private SelenideElement linkHideInfectiousDiseases = $("section[class*='field-type-number-decimal'] h2[class='field-label']");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkViewOfClinicalCourse")
    private SelenideElement linkViewOfClinicalCourse = $("td[class$='views-field-title'] a");

    @As("divStatusMessageAssociateFor")
    private SelenideElement divStatusMessageAssociateFor=$("div[class^='messages']");

    @As("patientLinkInTheClinicalCoursePage")
    private SelenideElement patientLinkInTheClinicalCoursePage=$x("(//*[@class=\"field-item even\"])[2]");




    public ClinicalTestNameMappingConfigurationPage captureThePatientID() {
        patientRegIDForMappingTheData = patientID.shouldBe(visible).getText();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnEditButton() {
        linkEdit.scrollIntoView(false).shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clearTextareaEditFieldOfFerritinTestNameAliasName() {
        textareaEditFieldOfFerritinTestName.shouldBe(visible).clear();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage enterFerritinTestNameAliasName() {
        textareaEditFieldOfFerritinTestName.shouldBe(visible).setValue("Serum thyroxine T4(Free T4);FREE T4, SERUM;\n" +
                "THYROID STIMULATING HORMONE, SERUM");
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnLinkPatients() {
        linkPatients.shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage goBackToTheMainWindow() {
        Selenide.switchTo().window(0);
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnLinkAddNewPatient() {
        linkAddNewPatient.shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnLinkOrderNewTest() {
        linkOrderNewTest.shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage setTextareaEditFieldHLADataUnd() {
        textareaEditFieldHLADataUnd.shouldBe(visible).setValue("{\"patientName\":\"AJAY ROKADE UHID 998\",\"patientId\":\"998\",\"clinicalDetails\":[{\"clinicalTestName\":\"Free T4, serum\",\"clinicalTestValue\":\"0.99\",\"clinicalTestUnit\":\"\",\"clinicalTestRange\":\"0.99 - 1.62\",\"clinicalTestDateTime\":\"20230724131952\"},{\"clinicalTestName\":\"Thyroid Stimulating Hormone, serum\",\"clinicalTestValue\":\"2.44\",\"clinicalTestUnit\":\"\",\"clinicalTestRange\":\"0.27 - 4.204.20 to 10.0 is considered as a result and may be due to physiological factors. Clinical correlation is suggested.\",\"clinicalTestDateTime\":\"20230724131952\"}],\"status\":null,\"reportPath\":\"public://lims_reports/998_486_1690205461.pdf\",\"review_date\":\"2023-07-24T01:19:52\",\"sample_collection_date\":\"2023-07-24T11:10:35\",\"investigation_name\":\"FREE T4/ TSH\",\"investigation_id\":\"FT4/TSH\",\"investigations\":[{\"investigation_id\":\"FT4/TSH\",\"investigation_name\":\"FREE T4/ TSH\"}],\"fileObject\":{},\"request_id\":\"10232050333\",\"associate_id\":\"3964507\"}\n");
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnViewLinkOfCreatedTest() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage checkTheLinkInfectiousDiseases() {
        linkHideInfectiousDiseases.shouldNotBe(visible);
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage getTheLinkInfectiousDiseases() {
        String TestName = linkHideInfectiousDiseases.shouldBe(visible).shouldHave(Condition.text("Serum thyroxine T4(Free T4):")).getText();
        log.info(TestName);
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage openAssociatePath() {
        Selenide.open("https://dev.bmtplus.com/node/3752878");
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnLinkViewOfClinicalCourse() {
        linkViewOfClinicalCourse.shouldBe(visible).click();
        Selenide.refresh();
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage assertThatStatusMessageAssociateFor() {
        divStatusMessageAssociateFor.shouldBe(visible).shouldHave(Condition.text("Associate Associate for alias field name mapping has been updated."));
        return this;
    }
    public ClinicalTestNameMappingConfigurationPage clickOnPatientLinkInTheClinicalCoursePage() {
        patientLinkInTheClinicalCoursePage.scrollIntoView(false).shouldBe(visible).click();
        return this;
    }
}