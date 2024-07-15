package com.jagriti.bmtplus.pages.inventory.bloodProducts;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.DeliverMedicineToPatientPage;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/3754238
@Slf4j
public class AddTheCreatedBloodProductInTheTransactionPage extends Page<AddTheCreatedBloodProductInTheTransactionPage> {
    protected AddTheCreatedBloodProductInTheTransactionPage() {
        super(AddTheCreatedBloodProductInTheTransactionPage.class);
    }

    @As("patientLink")
    private SelenideElement patientLink = $x("(//*[@class=\"field-item even\"])[7]");

    @As("dateField")
    private SelenideElement dateField = $("td[class$='views-field-field-clin-course-date'] span[class='date-display-single']");

    @As("linkAddNewClinicalCourse")
    private SelenideElement linkAddNewClinicalCourse = $(byText("Add New Clinical Course"));

    @As("linkView")
    private SelenideElement linkView = $x("(//*[text()=\"View\"])[2]");

    @As("clickOnPatientLink")
    private SelenideElement clickOnPatientLink = $x("(//*[@class=\"field-item even\"])[2]");

    @As("linkOfBloodProduct")
    private SelenideElement linkOfBloodProduct = $(byText("[Link]"));

    @As("linkClickMarkTheTransaction")
    private SelenideElement linkClickMarkTheTransaction = $(("a[class*='flag-action']"));

    @As("divErrorMessageClinicalCourse")
    private SelenideElement divErrorMessageClinicalCourse=$("div[class^='messages error']");

    @As("linkInventory")
    private SelenideElement linkInventory=$("#menu-2552-1 > a");

    @As("linkBloodProducts")
    private SelenideElement linkBloodProducts=$("#block-menu-menu-menu-pth-links > div > div > ul > li.first.leaf.menu-depth-1.menu-item-11691 > a");

    @As("linkAddNewBloodProduct")
    public SelenideElement linkAddNewBloodProduct=$("#block-system-main > div > div.view-header > div:nth-child(1) > a");


    public AddTheCreatedBloodProductInTheTransactionPage moveToLinkInventory() {
        actions().moveToElement(linkInventory).build().perform();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage moveToLinkToBloodProducts() {
//        actions().moveToElement(linkBloodProducts).click().build().perform();
        linkBloodProducts.shouldBe(visible).click();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage clickOnLinkAddNewBloodProduct() {
        linkAddNewBloodProduct.shouldBe(visible).click();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage clickOnPatientLink() {
        patientLink.shouldBe(visible).click();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage checkAndCreateClinicalCourse() {
        Selenide.Wait().withTimeout(Duration.ofSeconds(6000));
        String dateOfClinicalCourse = dateField.shouldBe(visible).getText();
        if(dateOfClinicalCourse.equalsIgnoreCase(DateTimeUtils.getFormattedDateForConsentForm())){
            linkView.shouldBe(visible).click();
        }else{
            linkAddNewClinicalCourse.shouldBe(visible).click();
            DeliverMedicineToPatientPage deliver = new DeliverMedicineToPatientPage();
            deliver.createClinicalCourse();
        }
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage clickOnPatientLinkOfClinicalCourse() {
        clickOnPatientLink.shouldBe(visible).click();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage clickOnLinkOfBloodProduct() {
        linkOfBloodProduct.shouldBe(visible).click();
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage setLinkClickMarkTheTransaction() {
        String transaction = linkClickMarkTheTransaction.shouldBe(visible).getText();
        if(transaction.equalsIgnoreCase("Mark the transaction as verified ")){
            linkClickMarkTheTransaction.click();
        }else{
            String transactionOfBloodProduct = linkClickMarkTheTransaction.shouldBe(visible).getText();
            log.info(transactionOfBloodProduct);
        }
        return this;
    }
    public AddTheCreatedBloodProductInTheTransactionPage assertTheErrorMessage() {
        divErrorMessageClinicalCourse.shouldBe(visible).shouldHave(Condition.text("Clinical course is not available for the date of transfusion for Patient:TSA230522"));
        return this;
    }

}