package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/import-content
public class ImportHLAPage extends Page<ImportHLAPage> {

  protected ImportHLAPage() {
    super(ImportHLAPage.class);
  }

  @As("selectEditFieldContentType")
  private SelenideElement selectEditFieldContentType = $("#edit-field-content-type-und");

  @As("selectEditFieldLaboratoryUnd")
  private SelenideElement selectEditFieldLaboratoryUnd = $("#edit-field-laboratory-und");

  @As("inputEditFieldImportFile")
  private SelenideElement inputEditFieldImportFile = $("#edit-field-import-file-und-0-upload");

  @As("inputEditFieldRemoveFile")
  private SelenideElement inputEditFieldRemoveFile =
      $("#edit-field-import-file-und-0-remove-button");

  @As("inputEditFieldImportFile2")
  private SelenideElement inputEditFieldImportFile2 =
      $("#edit-field-import-file-und-0-upload-button");

  @As("selectEditGroupRefUnd")
  private SelenideElement selectEditCentre = $("#edit-og-group-ref-und");

  @As("inputEditSubmit")
  private SelenideElement inputEditSubmit = $("#edit-submit");

  @As("divStatusMessageImportContent")
  private SelenideElement divStatusMessageImportContent = $("div[class$='status']");

  @As("divStatusMessageForDataImported")
  private SelenideElement divWarningMessageForDataImported = $("div[class$='warning']");

  @As("linkImportData")
  private SelenideElement linkImportData = $("a[rel='nofollow']");

  @As("divErrorMessageHlaCould")
  private SelenideElement divErrorMessageHlaCould = $("div[class$='error']");

  public ImportHLAPage setSelectEditFieldContentType(String contentType) {
    selectEditFieldContentType.shouldBe(visible).selectOptionContainingText(contentType);
    return this;
  }

  public ImportHLAPage setSelectEditFieldLaboratoryUnd(String laboratoryUnd) {
    selectEditFieldLaboratoryUnd.shouldBe(visible).selectOptionContainingText(laboratoryUnd);
    return this;
  }

  public ImportHLAPage setInputEditFieldImportFileWithHLAOfPatient() {
    inputEditFieldImportFile
        .shouldBe(visible)
        .uploadFile(
            new File("src/main/java/com/jagriti/bmtplus/pages/miscellaneous/data/import.txt"));
    return this;
  }

  public ImportHLAPage setInputEditFieldImportFileWithoutHLAOfPatient() {
    inputEditFieldImportFile
        .shouldBe(visible)
        .uploadFile(
            new File(
                "src/main/java/com/jagriti/bmtplus/pages/miscellaneous/data/import HLA for non HLA patient.txt"));
    return this;
  }

  public ImportHLAPage setRemoveButtonAsVisible() {
    inputEditFieldRemoveFile.shouldBe(visible);
    return this;
  }

  public ImportHLAPage clickOnUploadButton() {
    inputEditFieldImportFile2.shouldBe(visible).click();
    return this;
  }

  public ImportHLAPage setSelectCentre(String centre) {
    selectEditCentre.shouldBe(visible).selectOptionContainingText(centre);
    return this;
  }

  public ImportHLAPage clickOnSaveButton() {
    inputEditSubmit.shouldBe(visible).click();
    return this;
  }

  public ImportHLAPage assertThatWarningMessageForDataImported(String dataImported) {
    divWarningMessageForDataImported.shouldBe(visible).shouldHave(Condition.text(dataImported));
    return this;
  }

  public ImportHLAPage assertThetStatusMessageImportContent(String successMessage) {
    divStatusMessageImportContent.shouldBe(visible).shouldHave(Condition.text(successMessage));
    return this;
  }

  public ImportHLAPage clickOnImportFileButton() {
    linkImportData.shouldBe(visible).click();
    return this;
  }

  public ImportHLAPage assertThatErrorMessage(String errorMessage) {
    divErrorMessageHlaCould.shouldBe(visible).shouldHave(Condition.text(errorMessage));
    return this;
  }
}
