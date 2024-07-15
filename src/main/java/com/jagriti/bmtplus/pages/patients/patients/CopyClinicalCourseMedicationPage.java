package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/clinical-course/3761559
public class CopyClinicalCourseMedicationPage extends Page<CopyClinicalCourseMedicationPage> {
    protected CopyClinicalCourseMedicationPage() {
        super(CopyClinicalCourseMedicationPage.class);
    }

    @As("inputEditFieldCopyPrev")
    private SelenideElement inputEditFieldCopyPrev = $("#edit-field-copy-prev-cc-medication-und");

    @As("pleaseWait")
    private SelenideElement pleaseWait = $x("//*[@class=\"form-checkbox ajax-processed progress-disabled\"]");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("divMedication")
    private SelenideElement divMedication = $("section[class*='field-name-field-clin-course-medications'] div[class='field-items']");

    
    
    public CopyClinicalCourseMedicationPage clickAndGetTheDataCopyPrev() {
        inputEditFieldCopyPrev.shouldBe(Condition.visible).click();
        return this;
    }
    public CopyClinicalCourseMedicationPage setPleaseWaitLoadingAsInvisibleState() {
        pleaseWait.shouldNot(visible);
        return this;
    }
    public CopyClinicalCourseMedicationPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(Condition.visible).click();
        return this;
    }
    public void assertThatCurrentMedication() {
        divMedication.shouldBe(visible).shouldHave(Condition.text("Medication"));
    }
}