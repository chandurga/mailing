package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://dev.bmtplus.com/content/tsb23004
@Slf4j
public class BasicMedicineDeliveryPage extends Page<BasicMedicineDeliveryPage> {
    protected BasicMedicineDeliveryPage() {
        super(BasicMedicineDeliveryPage.class);
    }

    @As("spanTransplantSummary")
    private SelenideElement spanTransplantSummary = $(byText("Transplant Summary"));

    @As("linkView")
    private SelenideElement linkView = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div > div > section > div:nth-of-type(2) > div > div > div > div > div > div > div:nth-of-type(4) > div > div > div > section:nth-of-type(3) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(1) > table > tbody > tr > td:nth-of-type(1) > a");

    @As("linkAddNewTransplantSummary")
    private SelenideElement linkAddNewTransplantSummary = $(byText("Add New Transplant Summary"));

    @As("linkAdministerMedicine")
    private SelenideElement linkAdministerMedicine = $(byText("Administer Medicine"));

    @As("medicineDeliveryByName")
    private SelenideElement medicineDeliveryByName = $("#block-qa-plus-medicine-delivery > div > div > table.sticky-enabled.tableheader-processed.sticky-table > tbody > tr:nth-child(1) > td:nth-child(5)");

    
    
    public BasicMedicineDeliveryPage clickOnTransplantSummaryLink() {
        spanTransplantSummary.shouldBe(visible).click();
        return this;
    }
    public BasicMedicineDeliveryPage clickOnLinkView() {
        linkView.shouldBe(visible).click();
        return this;
    }
    public BasicMedicineDeliveryPage clickOnLinkAddNewTransplantSummary() {
        linkAddNewTransplantSummary.shouldBe(visible, Duration.ofSeconds(10)).click();
        Selenide.switchTo().window(1);
        return this;
    }
    public BasicMedicineDeliveryPage switchingToMainWindow(){
        Selenide.switchTo().window(0);
        return this;
    }
    public BasicMedicineDeliveryPage clickLinkAdministerMedicine() {
        linkAdministerMedicine.shouldBe(visible).click();
        Selenide.refresh();
        return this;
    }
    public BasicMedicineDeliveryPage setMedicineDeliveryByName() {
        String medicineDelivered = medicineDeliveryByName.shouldBe(visible).getText();
        log.info(medicineDelivered);
        return this;
    }

}