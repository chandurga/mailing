package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/tsa240002

@Slf4j
public class ImportOtherLabsHLAResultsPage extends Page<ImportOtherLabsHLAResultsPage> {
    public static String patientRegIDInImportHLAPage;

    protected ImportOtherLabsHLAResultsPage() {
        super(ImportOtherLabsHLAResultsPage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("patientLink")
    private SelenideElement patientLink = $x("(//*[@Class=\"field-item even\"])[2]");

    @As("liEdit")
    private SelenideElement liEdit = $(byText("Edit"));

    @As("linkBasicDetailsActiveTab")
    private SelenideElement linkBasicDetailsActiveTab = $("li[class*='horizontal-tab-button-1'] a");

    @As("textareaEditFieldPatientBarcode")
    private SelenideElement textareaEditFieldPatientBarcode = $("#edit-field-patient-barcode-und-0-value");

    @As("saveButton")
    private SelenideElement saveButton = $("#edit-submit");

    @As("statusMessage")
    private SelenideElement statusMessage = $("div[class$='status']");

    @As("linkPotentialDonor")
    private SelenideElement linkPotentialDonor = $("#quicktabs-tab-patient_summary_pre_bmt-3");

    @As("linkView")
    private SelenideElement linkView = $("td[class$='views-field-title'] a");

    @As("textareaOfBarCodeForFamilyMembers")
    private SelenideElement textareaOfBarCodeForFamilyMembers = $("#edit-field-family-members-barcode-und-0-value");

    @As("linkImportHla")
    private SelenideElement linkImportHla = $x("//a[@href='/node/add/import-content']");

    @As("selectEditFieldContentType")
    private SelenideElement selectEditFieldContentType = $("#edit-field-content-type-und");

    @As("selectEditFieldLaboratoryUnd")
    private SelenideElement selectEditFieldLaboratoryUnd = $("#edit-field-laboratory-und");

    @As("inputEditFieldImportFile")
    private SelenideElement inputEditFieldImportFile = $("#edit-field-import-file-und-0-upload");

    @As("selectCenter")
    private SelenideElement selectCenter = $("#edit-og-group-ref-und");

    @As("linkImportData")
    private SelenideElement linkImportData = $("a[rel='nofollow']");

    @As("linkTsaHla")
    private SelenideElement linkTsaHla = $("td[class$='views-field-title'] a");

    @As("sectionNameInline")
    private SelenideElement sectionNameInline = $("section[class*='field-name-field-hla-a-df']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("#messages > div.messages.error");



    public ImportOtherLabsHLAResultsPage captureThePatientID() {
        patientRegIDInImportHLAPage = patientID.shouldBe(visible).getText();
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnPatientLink() {
        patientLink.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnEditButton() {
        liEdit.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnLinkBasicDetailsActiveTab() {
        linkBasicDetailsActiveTab.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage enterThePatientBarcode(String barcode) {
        textareaEditFieldPatientBarcode.shouldBe(visible).sendKeys(barcode);
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnSaveButton() {
        saveButton.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage assertThatStatusMessageOfPatientHasBeenUpdated() {
        statusMessage.shouldBe(visible).shouldHave(Condition.text("Patient "+patientRegIDInImportHLAPage+" has been updated."));
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnLinkPotentialDonorInThePatientSummaryList() {
        linkPotentialDonor.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnLinkViewOfTheFamilyMember() {
        linkView.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage enterTheBarCodeForFamilyMembers(String barCodeForFamilyMembers) {
        textareaOfBarCodeForFamilyMembers.shouldBe(visible).sendKeys(barCodeForFamilyMembers);
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnLinkImportHla() {
        linkImportHla.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage setSelectEditFieldContentType(String contentType) {
        selectEditFieldContentType.shouldBe(visible).selectOptionContainingText(contentType);
        return this;
    }

    public ImportOtherLabsHLAResultsPage setSelectEditFieldLaboratoryUnd(String laboratoryUnd) {
        selectEditFieldLaboratoryUnd.shouldBe(visible).selectOptionContainingText(laboratoryUnd);
        return this;
    }

    public ImportOtherLabsHLAResultsPage importTheFile() {
        String excelFilePath = "src/main/java/com/jagriti/bmtplus/pages/miscellaneous/data/HLAReports for import labs.xlsx";
        // Read the content of the Excel file
        Workbook workbook = readExcelFile(excelFilePath);

        // Modify the Excel content (for example, update a cell value)
        modifyExcelContent(workbook);

        // Save the modified content back to the Excel file
        saveToExcelFile(workbook, excelFilePath);

        // Upload the modified Excel file
        inputEditFieldImportFile.shouldBe(visible).uploadFile(new File(excelFilePath));

        return this;
    }

    private static Workbook readExcelFile(String filePath) {
        try (InputStream fis = new FileInputStream(new File(filePath))) {
            return WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading Excel file", e);
        }
    }

    private static void modifyExcelContent(Workbook workbook) {
        // Your logic to modify the Excel content
        // For simplicity, let's say we update a cell value
        Sheet sheet = workbook.getSheetAt(0); // Assuming we modify the first sheet
        Row row = sheet.getRow(1); // Assuming we modify the second row
        Cell cell = row.getCell(1); // Assuming we modify the first cell
        cell.setCellValue(patientRegIDInImportHLAPage+"-P");
        Row row1 = sheet.getRow(2);
        Cell cell1 = row1.getCell(1);
        cell1.setCellValue(patientRegIDInImportHLAPage+"-UNK1-P");
    }

    private static void saveToExcelFile(Workbook workbook, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
            workbook.write(fos);
        } catch (IOException e) {
            throw new RuntimeException("Error saving Excel file", e);
        }
    }

    public ImportOtherLabsHLAResultsPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }

    public ImportOtherLabsHLAResultsPage assertThatStatusMessageOfHLAHasBeenUpdated() {
        statusMessage.shouldBe(visible).shouldHave(Condition.text("Import Content Import data for HLA has been created."));
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnTheButtonImportData() {
        linkImportData.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage clickOnLinkOfUpdatedHla() {
        linkTsaHla.shouldBe(visible).click();
        return this;
    }

    public ImportOtherLabsHLAResultsPage getTheSectionNameInline() {
        log.info(sectionNameInline.should(visible).getText());
        return this;
    }

    public ImportOtherLabsHLAResultsPage assertThatErrorMessage() {
        String ErrorMessage = errorMessage.shouldBe(visible).getText();
        log.info("HLA could not be updated for the following barcode members message "+ErrorMessage);
        return this;
    }
}