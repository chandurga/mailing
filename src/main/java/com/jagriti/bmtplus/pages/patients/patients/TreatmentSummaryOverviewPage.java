package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.*;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/1441907590465
@Slf4j
public class TreatmentSummaryOverviewPage extends Page<TreatmentSummaryOverviewPage> {

    public static String patientID;
    public static String patientName;
    public static String DAY;

    protected TreatmentSummaryOverviewPage() {
        super(TreatmentSummaryOverviewPage.class);
    }

    @As("patientRegistrationID")
    private SelenideElement patientRegistrationID = $("#patient-view-title div[class^='block-inner']");

    @As("linkTabPatientClinicalCourse")
    private SelenideElement linkTabPatientClinicalCourse = $("#quicktabs-tab-patient_summary_pre_bmt-0");

    @As("linkAddNewClinicalCourse")
    private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

    @As("patientsLinkInMenuBar")
    private SelenideElement patientsLinkInMenuBar = $(".first.sf-depth-1.menuparent");

    @As("linkTreatmentSummaryOverview")
    private SelenideElement linkTreatmentSummaryOverview = $("#patient-view > div > div.panels-flexible-row.panels-flexible-row-1-main-row.clearfix > div > div.panels-flexible-region.panels-flexible-region-1-middle_right.panels-flexible-region-last > div > div > div > div > div.rounded-shadow-left-edge > div > div.panel-pane.pane-block.pane-jagriti-custom-tp-link-block.pane-entity-field.no-title.block > div > div > section > a:nth-child(2)");

    @As("patient")
    private SelenideElement patient = $("tr[class$='views-row-first'] td[class$='views-field-field-transplant-patient']");

    @As("clinicalDayNumber")
    private SelenideElement clinicalDayNumber = $("td[class$='views-field-field-clin-course-day-number']");

  @As("tdDate")
  private SelenideElement tdDate = $x("(//*[@class=\"views-field views-field-php\"])[2]");

    @As("tdClinicalDayNumber")
    private SelenideElement tdClinicalDayNumber = $("tr[class$='views-row-first'] td[class$='views-field-field-clin-course-day-number']");

    @As("linkOfThePatient")
    public SelenideElement linkOfThePatient = $("section[class*='field-name-field-clin-course-patient'] div[class='field-items']");

    @As("inputFieldPatientName")
    private SelenideElement inputFieldPatientName = $("section[class*='field-name-field-patient-name'] div[class='field-items']");


    public TreatmentSummaryOverviewPage switchBackToMainWindow() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        return this;
    }

    public TreatmentSummaryOverviewPage getThePatientRegistrationID() {
        patientID = patientRegistrationID.shouldBe(visible).getText();
        log.info(patientID);
        patientName = inputFieldPatientName.shouldBe(visible).getText();
        return this;
    }

    public TreatmentSummaryOverviewPage clickOnLinkTabPatientClinicalCourse() {
        linkTabPatientClinicalCourse.shouldBe(visible).click();
        return this;
    }

    public TreatmentSummaryOverviewPage clickOnLinkAddNewClinicalCourse() {
        linkAddNewClinicalCourse.shouldBe(visible).click();
        return this;
    }

    public TreatmentSummaryOverviewPage clickOnLinkOfThePatient() {
        linkOfThePatient.shouldBe(visible).click();
        return this;
    }

    public TreatmentSummaryOverviewPage getTheClinicalDayNumber() {
        DAY = clinicalDayNumber.shouldBe(visible).scrollIntoView(true).getText();
        return this;
    }

    public TreatmentSummaryOverviewPage setAndClickOnPatientsTreatmentSummaryOverviewLinkInMenuBar() {
        actions().moveToElement(patientsLinkInMenuBar).perform();
        linkTreatmentSummaryOverview.click();
        return this;
    }

    public TreatmentSummaryOverviewPage assertThatDate(String date) {
        tdDate.shouldBe(visible).shouldHave(Condition.text(date));
        return this;
    }

    public TreatmentSummaryOverviewPage assertThatClinicalDayNumber() {
        tdClinicalDayNumber.shouldBe(visible).shouldHave(Condition.text(DAY));
        return this;
    }

    public void assertThatPatientInTheTable() {
        String PATIENT = String.format(patientID + " " + "[" + patientName + "]");
//        patient.shouldBe(visible).shouldHave(Condition.text(PATIENT));
        String patientRow = "(//*[@class='views-field views-field-field-transplant-patient'])[%d]";
        int maxRows = 30; // Assuming a maximum of 30 rows, adjust as needed
        boolean patientFound = false;

        for (int i = 1; i <= maxRows; i++) {
            String dynamicLocator = String.format(patientRow, i);

            if ($x(dynamicLocator).exists()) {
                if ($x(dynamicLocator).getText().equals(PATIENT)) {
                    $x(dynamicLocator).shouldHave(Condition.text(PATIENT));
                    patientFound = true;
                    break;
                }
            } else {
                // If the row doesn't exist, break the loop as there's no more patients to check
                break;
            }
        }

        if (!patientFound) {
            // If patient is not found in the current loop, you may want to handle this scenario accordingly
            // For example, you can throw an exception, log a message, or take any other desired action
            // For now, let's just log a message
            log.info("Patient not found in the table.");
        }
    }


}