package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.SetValueOptions.withText;
import static com.jagriti.bmtplus.pages.miscellaneous.AddNewDonorForEbbPage.donorCode;

// page_url = https://dev8.ebloodbanking.com/current-status?check_logged_in=1
@Slf4j
public class ScanTheBloodProductPage extends Page<ScanTheBloodProductPage> {

    public static String patientRegistrationID;
    public static String qrCodeData;
    public static String IpNumber;

    protected ScanTheBloodProductPage() {
        super(ScanTheBloodProductPage.class);
    }

    @As("patRegistrationID")
    public SelenideElement patRegistrationID = $("div[class*='field--name-field-patient-id'] div[class='field--item']");

    @As("collectionTabInMenuBar")
    private SelenideElement collectionTabInMenuBar =
            $("#block-ebbmainmenu > ul > li.expanded.dropdown.first > span");

    @As("addDonationRecordInTheList")
    private SelenideElement addDonationRecordInTheList = $(byText("Add New Donor"));

    @As("linkIssuePrintLabel")
    private SelenideElement linkIssuePrintLabel = $("#block-createcontentfooterlinksblock > a:nth-child(3)");

    @As("userNameInput")
    private SelenideElement userNameInput = $("input[id='edit-name']");

    @As("passwordInput")
    private SelenideElement passwordInput = $("input[id='edit-pass']");

    @As("submitButton")
    private SelenideElement submitButton = $("#edit-submit");

    @As("sendPasswordResetInstructionsLink")
    private SelenideElement sendPasswordResetInstructionsLink = $("a[class='request-password-link']");

    @As("qrCode")
    private SelenideElement qrCode = $("img[alt='QR Code']");

    @As("linkScanCodeAddNew")
    private SelenideElement linkScanCodeAddNew = $x("//a[@href='/scan-data']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("textareaEditDataProcess")
    private SelenideElement textareaEditDataProcess = $("#edit-data-to-process");

    @As("linkOfTheBloodProduct")
    private SelenideElement linkOfTheBloodProduct = $("div[class$='status'] a");

    @As("h1PageTitle")
    private SelenideElement h1PageTitle = $("#page-title");

    @As("divErrorMessageCannotCreate")
    private SelenideElement divErrorMessageCannotCreate = $("div[class$='error']");



    public ScanTheBloodProductPage setTextareaEditDataProcess(String data) {
        textareaEditDataProcess.shouldBe(visible).click();
        textareaEditDataProcess.setValue(data);
        return this;
    }

    private ScanTheBloodProductPage setUserName(String userName) {
        userNameInput.shouldBe(editable).setValue(withText(userName).sensitive());
        return this;
    }

    private ScanTheBloodProductPage setPassword(String password) {
        passwordInput.shouldBe(editable).setValue(withText(password).sensitive());
        return this;
    }

    private ScanTheBloodProductPage clickOnSubmitButton() {
        submitButton.shouldBe(visible).click();
        return this;
    }

    public ScanTheBloodProductPage loginWith(String username, String password) {
        return setUserName(username)
                .setPassword(password)
                .then()
                .clickOnSubmitButton();
    }

    public ScanTheBloodProductPage captureThePatientRegistrationID() {
        patientRegistrationID = patRegistrationID.shouldBe(visible).getText();
        return this;
    }

    public ScanTheBloodProductPage clickOnCollectionTabInMenuBar() {
        collectionTabInMenuBar.shouldBe(visible).click();
        return this;
    }

    public ScanTheBloodProductPage clickOnAddDonationRecordInTheList() {
        addDonationRecordInTheList.shouldBe(visible).click();
        return this;
    }

    public ScanTheBloodProductPage openTheIsuuedComponentOfEbb() {
        Selenide.open("https://dev8.ebloodbanking.com/node/add/patients");
        return this;
    }

    public ScanTheBloodProductPage clickOnIssuePrintLabelButton() {
        linkIssuePrintLabel.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    private String decodeQRCode(String imageUrl) throws IOException, NotFoundException {
        // Download the image data from the data URL
        String imageData = getImageDataFromDataURL(imageUrl);

        // Decode the Base64 image data to a BufferedImage
        byte[] decodedImageData = Base64.decodeBase64(imageData);
        ByteArrayInputStream bis = new ByteArrayInputStream(decodedImageData);
        BufferedImage image = ImageIO.read(bis);

        // Create a BinaryBitmap from the image
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));

        // Decode the QR code
        Result result = new MultiFormatReader().decode(binaryBitmap);

        // Return the decoded data
        return result.getText();
    }

    private String getImageDataFromDataURL(String dataUrl) {
        // Extract the Base64 image data from the data URL
        String[] parts = dataUrl.split(",");
        if (parts.length > 1) {
            return parts[1];
        } else {
            throw new IllegalArgumentException("Invalid data URL: " + dataUrl);
        }
    }

    public ScanTheBloodProductPage scanTheQrCodeOfBloodProductAndGetTheData() throws NotFoundException, IOException {
        qrCode.shouldBe(visible);
        String qrCodeImageUrl = qrCode.getAttribute("src");
        // Decode the QR code
        qrCodeData = decodeQRCode(qrCodeImageUrl);
        // Print the decoded data
        log.info(qrCodeData);
        String ipNum = qrCodeData.split("IP Number: ")[1].trim();
        IpNumber = ipNum.split("Patient Age")[0].trim();
        return this;
    }

    public ScanTheBloodProductPage openThePatientPathOfTheBMT() throws NotFoundException, IOException {
        Selenide.open("https://dev.bmtplus.com/node/add/patient");
        return this;
    }

    public ScanTheBloodProductPage clickOnTheScanQRCodeToAddNewBloodProductButton() {
        linkScanCodeAddNew.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    
    public ScanTheBloodProductPage switchBackToWindowOne() {
        Selenide.switchTo().window(1);
        return this;
    }

    public ScanTheBloodProductPage switchBackToWindowThree() {
        Selenide.switchTo().window(3);
        return this;
    }

    public ScanTheBloodProductPage clickOnTheScanQRCodeToAddNewBloodProductButtonForNegativeScenario() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        linkScanCodeAddNew.shouldBe(visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    public ScanTheBloodProductPage clickOnTheProcessButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public ScanTheBloodProductPage clickOnLinkOfTheBloodProduct() {
        linkOfTheBloodProduct.shouldBe(visible).click();
        return this;
    }

    public ScanTheBloodProductPage assertThatBloodProduct() {
        h1PageTitle.shouldBe(visible).shouldHave(Condition.text("FRESH FROZEN PLASMA - "+ donorCode +"-FFP"));
        return this;
    }

    public ScanTheBloodProductPage assertThatErrorMessageCannotCreate() {
        divErrorMessageCannotCreate.shouldBe(visible).shouldHave(Condition.text("Cannot create blood product. Record already available - FRESH FROZEN PLASMA - "+ donorCode +"-FFP"));
        return this;
    }

}