package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.data.Relationship;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class DonorBarcodeEditPage extends Page<DonorBarcodeEditPage> {

    protected DonorBarcodeEditPage() {
        super(DonorBarcodeEditPage.class);
    }
    
    public static String RELATION;

    @As("imageBarcodeNone")
    private SelenideElement imageBarcodeNone = $("img[class*='barcode']");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("selectEditFieldFamilyRelationship")
    private SelenideElement selectEditFieldFamilyRelationship = $("#edit-field-family-relationship-und");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("relationship")
    private SelenideElement relationship = $("section[class*='field-name-field-family-relationship'] div[class='field-items']");

    @As("textareaEditFieldFamilyMembers")
    private SelenideElement textareaEditFieldFamilyMembers = $("#edit-field-family-members-barcode-und-0-value");


    public DonorBarcodeEditPage getTheRelationship() {
        RELATION = relationship.shouldBe(visible).getText();
        log.info(RELATION);
        return this;
    }
    public DonorBarcodeEditPage grabAndPrintTheImageBarcode() {
        String barcode = imageBarcodeNone.shouldBe(visible).getText();
        log.info(barcode);
        return this;
    }
    public DonorBarcodeEditPage clickOnLinkEdit() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public DonorBarcodeEditPage setTextareaEditFieldFamilyMembers() {
        String BARCODE = textareaEditFieldFamilyMembers.shouldBe(visible).getText();
        log.info(BARCODE);
        switch (RELATION) {
            case "Father":
                textareaEditFieldFamilyMembers.shouldBe(visible).shouldHave(Condition.text("802554374309-F"));
                break;
            case "Mother":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-M"));
                break;
            case "Sibling":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-S1"));
                break;
            case "Husband":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-Husband"));
                break;
            case "Wife":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-Wife"));
                break;
            case "Son":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-Son"));
                break;
            case "Daughter":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-Daughter"));
                break;
            case "Paternal aunt":
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-PA1"));
                break;
            default:
                textareaEditFieldFamilyMembers.shouldHave(Condition.text("802554374309-PU1"));
                break;
        }

        return this;
    }
    public DonorBarcodeEditPage setSelectEditFieldFamilyRelationship(Relationship relationship) {
        selectEditFieldFamilyRelationship.shouldBe(visible).selectOptionByValue(relationship.getValue());
        return this;
    }
    public DonorBarcodeEditPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
}
