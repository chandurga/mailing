package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.utils.DateTimeUtils;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3771448/edit
public class GranulocyteMapOnDashboardPage extends Page<GranulocyteMapOnDashboardPage> {

    protected GranulocyteMapOnDashboardPage() {
        super(GranulocyteMapOnDashboardPage.class);
    }

    public static String patientRegID;

    final String ERROR_MESSAGE = "Expiry period should be not more than 24 hours from collection date.";

    @As("inputDateOfClinicalCourse")
    private SelenideElement inputDateOfClinicalCourse = $("#edit-field-clin-course-date-und-0-value-datepicker-popup-0");

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("linkOfBloodProductIssuedTo")
    private SelenideElement linkOfBloodProductIssuedTo = $x("(//*[@class=\"field-item even\"])[7]");

    @As("divErrorMessageExpiryPeriod")
    private SelenideElement divErrorMessageExpiryPeriod = $("div[class$='error']");


    public GranulocyteMapOnDashboardPage enterInputDateOfClinicalCourse(String date) {
        inputDateOfClinicalCourse.shouldBe(Condition.visible).setValue(date);
        return this;
    }

    public GranulocyteMapOnDashboardPage captureThePatientID() {
        patientRegID = patientID.shouldBe(visible).getText();
        return this;
    }

    public GranulocyteMapOnDashboardPage clickOnBloodProductIssuedToLink() {
        linkOfBloodProductIssuedTo.shouldBe(visible).click();
        return this;
    }

    public GranulocyteMapOnDashboardPage assertThatClinicalCourseTransfusionAsGranulocyte() {
        String dateLocator = "(//*[@class=\"views-field views-field-field-clin-course-date\"])[%d]";
        String transfusionLocator = "(//*[@class=\"views-field views-field-field-clin-course-transfusions\"])[%d]";
        int maxRows = 2; // Assuming you have a fixed number of rows to iterate through
        String requiredDate = DateTimeUtils.getFormattedPastDate(); // Get the required date

        for (int i = 1; i <= maxRows; i++) {
            String dynamicDateLocator = String.format(dateLocator, i);
            String dynamicTransfusionLocator = String.format(transfusionLocator, i);

            // Get the text content of the date in the current row
            String currentDate = $x(dynamicDateLocator).getText();

            // Check if the current row's date matches the required date
            if (currentDate.equals(requiredDate)) {
                // If the date matches, assert the transfusion in the same row
                $x(dynamicTransfusionLocator).shouldBe(visible).shouldHave(Condition.text("Granulocyte"));
            }
        }
        return this;
    }

    public GranulocyteMapOnDashboardPage assertErrorMessageExpiryPeriod() {
        divErrorMessageExpiryPeriod.shouldBe(visible).shouldHave(Condition.text(ERROR_MESSAGE));
        return this;
    }

}