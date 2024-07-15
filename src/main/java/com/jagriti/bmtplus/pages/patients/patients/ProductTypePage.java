package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProductTypePage extends Page<ProductTypePage> {

    public static String patientRegistrationId;
    protected ProductTypePage() {
        super(ProductTypePage.class);
    }

    @As("patientID")
    private SelenideElement patientID = $("#patient-view-title > div > div");

    @As("patientLinkInClinicalCoursePage")
    private SelenideElement patientLinkInClinicalCoursePage = $x("(//*[@class = \"field-item even\"])[2]");

    @As("linkInventory")
    private SelenideElement linkInventory = $("a[class='menu_icon menu-2552 sf-depth-1 menuparent']");

    @As("linkBloodProducts")
    private SelenideElement linkBloodProducts = $x("(//*[text()=\"Blood Products\"])[2]");

    @As("linkAddNewBloodProduct")
    private SelenideElement linkAddNewBloodProduct = $(byText("Add New Blood Products"));

    @As("linkView")
    private SelenideElement linkView = $x("(//*[text()=\"View\"])[3]");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("selectEditFieldPrimaryProduct")
    private SelenideElement selectEditFieldPrimaryProduct = $("select[id='edit-field-ts-primary-product-und']");

    @As("selectEditFieldAdditionalProduct")
    private SelenideElement selectEditFieldAdditionalProduct = $("select[id='edit-field-ts-additional-product-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("patientLink")
    private SelenideElement patientLink = $x("(//*[@class=\"field-item even\"])[1]");

    @As("linkCINMTRSubmissions")
    private SelenideElement linkCINMTRSubmissions = $("#quicktabs-tab-patient_summary_pre_bmt-18 span[class='link-badge-text']");

    @As("linkAddNewSubmission")
    private SelenideElement linkAddNewSubmission = $("a[class$='button']");

    @As("linkGenerateFormQuestions")
    private SelenideElement linkGenerateFormQuestions = $("span[class*='flag-generate-cibmtr-form-questions'] a[class*='flag-action']");

    @As("questionTextValue")
    private SelenideElement questionTextValue = $(byText("Pbsc"));

    
    
    

    public ProductTypePage captureThePatientID() {
        patientRegistrationId = patientID.shouldBe(visible).getText();
        return this;
    }
    public ProductTypePage clickOnPatientLinkInClinicalCoursePage() {
        patientLinkInClinicalCoursePage.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage moveToElementOfInventory() {
        actions().moveToElement(linkInventory).perform();
        return this;
    }
    public ProductTypePage clickOnBloodProductsLinkInTheMenuLink() {
        linkBloodProducts.scrollIntoView(true).shouldBe(visible).click();
        return this;
    }
    public ProductTypePage clickOnButtonAddNewBloodProduct() {
        linkAddNewBloodProduct.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage backToMainPatientWindow() {
        Selenide.switchTo().window(0);
        Selenide.refresh();
        return this;
    }
    public ProductTypePage clickOnViewLinkOfTransplantSummary() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage clickOnEditButton() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage setSelectEditFieldPrimaryProduct(String primaryProduct) {
        selectEditFieldPrimaryProduct.shouldBe(visible).selectOptionContainingText(primaryProduct);
        return this;
    }
    public ProductTypePage setSelectEditFieldAdditionalProduct(String additionalProduct) {
        selectEditFieldAdditionalProduct.shouldBe(visible).selectOptionContainingText(additionalProduct);
        return this;
    }
    public ProductTypePage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage clickOnPatientLink() {
        patientLink.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage clickOnLinkCINMTRSubmissions() {
        linkCINMTRSubmissions.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage clickLinkAddNewSubmission() {
        linkAddNewSubmission.shouldBe(visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
    public ProductTypePage clickOnLinkGenerateFormQuestions() {
        linkGenerateFormQuestions.shouldBe(visible).click();
        return this;
    }
    public ProductTypePage assertThatQuestionTextValue() {
        questionTextValue.shouldBe(visible, Duration.ofSeconds(50)).shouldHave(Condition.text("Pbsc"));
        return this;
    }
}