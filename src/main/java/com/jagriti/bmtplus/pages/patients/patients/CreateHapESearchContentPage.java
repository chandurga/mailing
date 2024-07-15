package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.patients.patients.data.SearchReportType;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class CreateHapESearchContentPage extends Page<CreateHapESearchContentPage> {

    public static String LaboratoryForHapESearch;
    public static String patientRegIDForHaESearch;
    protected CreateHapESearchContentPage() {
        super(CreateHapESearchContentPage.class);
    }

    @As("laboratory")
    private SelenideElement laboratory = $("li[class$='even']");

    @As("linkAddNewClinicalCourse")
    private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

    @As("patientLink")
    private SelenideElement patientLink = $x("(//*[@class=\"field-item even\"])[2]");

    @As("patientLink")
    private SelenideElement patientLinkInGeneralEvaluationCreatedPage = $x("(//*[@class=\"field-item even\"])[1]");

    @As("spanHla")
    private SelenideElement spanHla = $(byText("HLA"));

    @As("spanHapSearch")
    private SelenideElement spanHapSearch = $(byText("Hap-E Search"));

    @As("linkAddNewHla")
    private SelenideElement linkAddNewHla = $(byText("Add New HLA"));

    @As("linkAddNewHapSearch")
    private SelenideElement linkAddNewHapSearch = $(byText("Add New HapE Search content"));

    @As("selectEditFieldHapeHla")
    private SelenideElement selectEditFieldHapeHla = $("#edit-field-hape-hla-report-und");

    @As("selectEditFieldHapeSearch")
    private SelenideElement selectEditFieldHapeSearch = $("select[id='edit-field-hape-search-report-type-und']");

    @As("inputEditFieldHapeHla")
    private SelenideElement inputEditFieldHapeHla = $("input[id='edit-field-hape-hla-typing-report-und-0-upload']");

    @As("inputEditFieldUploadButton")
    private SelenideElement inputEditFieldUploadButton = $("input[name*='upload']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("linkClickTransmitDataHap")
    private SelenideElement linkClickTransmitDataHap = $("a[class*='flag-action']");

    @As("successMessage")
    private SelenideElement successMessage = $("div[class='hape-success-button']");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");


    public CreateHapESearchContentPage captureThePatientID() {
        patientRegIDForHaESearch = patientID.shouldBe(visible).getText();
        return this;
    }
    public CreateHapESearchContentPage captureTheLaboratoryLaboratory() {
        LaboratoryForHapESearch = laboratory.shouldBe(visible).getText();
        return this;
    }
    public CreateHapESearchContentPage clickLinkAddNewClinicalCourse() {
        linkAddNewClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnPatientLinkInTheTestReportPage() {
        patientLink.scrollIntoView(false).shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnPatientLinkGeneralEvaluationPage() {
        patientLinkInGeneralEvaluationCreatedPage.scrollIntoView(true).shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnHLATab() {
        spanHla.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnHapSearchLinkInMenu() {
        spanHapSearch.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnLinkAddNewHla() {
        linkAddNewHla.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage setSelectEditFieldHapEHla(String hapeHla) {
        selectEditFieldHapeHla.shouldBe(visible).selectOptionContainingText(hapeHla);
        return this;
    }
    /*Negative scenario*/
    public CreateHapESearchContentPage setSelectEditFieldHapEHlaForNegativeScenario(String hapeHla) {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        selectEditFieldHapeHla.shouldBe(visible).selectOptionByValue(hapeHla);
        return this;
    }
    public CreateHapESearchContentPage clickOnLinkAddNewHapSearch() {
        linkAddNewHapSearch.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage setSelectEditFieldHapeSearch(SearchReportType search) {
        selectEditFieldHapeSearch.shouldBe(visible).selectOptionByValue(search.getValue());
        return this;
    }
    public CreateHapESearchContentPage uploadTheFileOfHapEHlaReport() {
        inputEditFieldHapeHla.shouldBe(visible).uploadFile(new File("src/main/java/com/jagriti/bmtplus/pages/patients/patients/data/TSA231718 HLA Reports.pdf"));
        return this;
    }
    public CreateHapESearchContentPage clickOnUploadButton() {
        inputEditFieldUploadButton.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage clickOnLinkClickTransmitDataToDKMS() {
        linkClickTransmitDataHap.shouldBe(visible).click();
        return this;
    }
    public CreateHapESearchContentPage assertThatSuccessMessage() {
        String message = successMessage.shouldBe(visible).getText();
        successMessage.shouldHave(Condition.text("Payload Data transmitted to DKMS HapE Search on: "+ DateTimeUtils.getFormattedDateForConsentForm()+" "+ DateTimeUtils.getFormattedTime()));
        log.info(message);
        return this;
    }
}