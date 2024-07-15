package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.utils.DateTimeUtils;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/869693898810
public class ClinicalCourseAttachmentPage extends Page<ClinicalCourseAttachmentPage> {
  protected ClinicalCourseAttachmentPage() {
    super(ClinicalCourseAttachmentPage.class);
  }

  @As("dateField")
  private SelenideElement dateField =
      $("td[class$='views-field-field-clin-course-date'] span[class='date-display-single']");

  @As("linkView")
  private SelenideElement linkView = $x("(//*[text()=\"View\"])[2]");

  @As("linkAddNewClinicalCourse")
  private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

  @As("linkAddNewDocument")
  private SelenideElement linkAddNewDocument = $("div[class$='btn-default'] a");

  @As("inputEditTitle")
  public SelenideElement inputEditTitle = $("#edit-title");

  @As("selectEditFieldDocumentCategory")
  public SelenideElement selectEditFieldDocumentCategory = $("#edit-field-document-category-und");

  @As("inputEditFieldDocumentFile")
  public SelenideElement inputEditFieldDocumentFile = $("#edit-field-document-file-und-0-upload");

  @As("inputEditFieldDocumentFile2")
  private SelenideElement inputEditFieldDocumentFile2 =
          $("#edit-field-document-file-und-0-upload-button");

  @As("inputEditSubmit")
  private SelenideElement inputEditSubmit = $("#edit-submit");

  @As("removeButton")
  private SelenideElement removeButton = $("#edit-field-document-file-und-0-remove-button");

  @As("divStatusMessageDocumentTest")
  private SelenideElement divStatusMessageDocumentTest = $("div[class$='status']");

  @As("patientLink")
  private SelenideElement patientLink =
      $("section[class*='field-name-field-clin-course-patient'] div[class='field-items']");

  @As("linkAttachedDocuments")
  private SelenideElement linkAttachedDocuments =
      $(
          "#block-jagriti-custom-jc-display-clinical-course-tab > div > div > div > div.view-content > table.views-table.sticky-enabled.cols-21.tableheader-processed.sticky-table > tbody > tr.odd.views-row-first > td:nth-child(21) > a");

  @As("tdDocumentTitle")
  public SelenideElement tdDocumentTitle = $("td[class$='views-field-title']");

  public ClinicalCourseAttachmentPage checkAndCreateClinicalCourse() {
    Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
    String dateOfClinicalCourse = dateField.shouldBe(visible).getText();
    if (dateOfClinicalCourse.equalsIgnoreCase(DateTimeUtils.getFormattedDateForConsentForm())) {
      linkView.shouldBe(visible).click();
    } else {
      linkAddNewClinicalCourse.shouldBe(visible).click();
      DeliverMedicineToPatientPage deliver = new DeliverMedicineToPatientPage();
      deliver.createClinicalCourse();
    }
    return this;
  }

  public ClinicalCourseAttachmentPage clickonAddNewDocumentButton() {
    linkAddNewDocument.shouldBe(visible).click();
    return this;
  }

  public ClinicalCourseAttachmentPage enterTheInputEditTitle(String title) {
    inputEditTitle.shouldBe(visible).setValue(title);
    return this;
  }

  public ClinicalCourseAttachmentPage setInputEditFieldDocumentFile() {
    inputEditFieldDocumentFile
        .shouldBe(visible)
        .uploadFile(
            new File(
                "src/main/java/com/jagriti/bmtplus/pages/patients/patients/data/TSA231718 HLA Reports.pdf"));
    return this;
  }

  public ClinicalCourseAttachmentPage clickOnUploadButton() {
    inputEditFieldDocumentFile2.shouldBe(visible).click();
    return this;
  }

  public ClinicalCourseAttachmentPage clickOnSaveButton() {
    inputEditSubmit.shouldBe(visible).click();
    return this;
  }

  public ClinicalCourseAttachmentPage assertThatRemoveButtonAfterUploadingTheDocument() {
    removeButton.shouldBe(visible);
    return this;
  }

  public ClinicalCourseAttachmentPage assertThatUserCanUploadTheDocument(UserData userData) {
    divStatusMessageDocumentTest.shouldBe(visible).shouldHave(Condition.text("Document "+userData.getTitle()+" has been created."));
    return this;
  }

  public ClinicalCourseAttachmentPage clickOnPatientLinkOnTheClinicalCOursePage() {
    patientLink.shouldBe(visible).click();
    return this;
  }

  public ClinicalCourseAttachmentPage clickOnLinkAttachedDocumentsOfTheClinicalCourse() {
    linkAttachedDocuments.shouldBe(visible).click();
    Selenide.switchTo().window(1);
    return this;
  }

  public ClinicalCourseAttachmentPage assertThetTitleOfTheDocument(UserData userData) {
    tdDocumentTitle.shouldBe(visible).shouldHave(Condition.text(userData.getTitle()));
    return this;
  }
}
