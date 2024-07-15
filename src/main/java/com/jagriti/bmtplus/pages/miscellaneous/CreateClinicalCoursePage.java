package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/content/tsa230051?js=true
public class CreateClinicalCoursePage extends Page<CreateClinicalCoursePage> {
    protected CreateClinicalCoursePage() {
        super(CreateClinicalCoursePage.class);
    }

    @As("linkQuicktabsTabPatientSummary")
    private SelenideElement linkQuicktabsTabPatientSummary = $("#quicktabs-tab-patient_summary_pre_bmt-1");

    @As("linkClickGenerateClinicalCourse")
    private SelenideElement linkClickGenerateClinicalCourse = $(byText("Generate Clinical Course"));

    @As("linkClickAddNewGeneralEvaluation")
    private SelenideElement linkClickAddNewGeneralEvaluation = $(byText("Add New General Evaluations"));

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("divStatusMessageClinicalCourse")
    private SelenideElement divStatusMessageClinicalCourse = $("div[class^='messages status']");



    public CreateClinicalCoursePage clickOnGeneralEvaluation() {
        linkQuicktabsTabPatientSummary.shouldBe(visible).click();
        return this;
    }
    public CreateClinicalCoursePage clickOnLinkClickGenerateClinicalCourse() {
        linkClickGenerateClinicalCourse.shouldBe(visible).click();
        return this;
    }
    public CreateClinicalCoursePage clickLinkClickAddNewGeneralEvaluation() {
        linkClickAddNewGeneralEvaluation.shouldBe(visible).click();
        return this;
    }
    public CreateClinicalCoursePage clickOnGenerateClinicalCourse() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CreateClinicalCoursePage assertThatClinicalCourseAddedOrNot() {
        divStatusMessageClinicalCourse.shouldBe(visible).shouldHave(Condition.text("Clinical Course has been generated from General Evaluation: 439809994704700-General Evaluation\n"));
        return this;
    }

}