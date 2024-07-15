package com.jagriti.bmtplus.pages.inventory;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://dev.bmtplus.com/reconsitututed-drug-list
public class ReconstitutedDrugListPage extends Page<ReconstitutedDrugListPage> {
    protected ReconstitutedDrugListPage() {
        super(ReconstitutedDrugListPage.class);
    }

    @As("selectEditMedicineVerified")
    private SelenideElement selectEditMedicineVerified = $("#edit-flagged");

    @As("inputEditSubmitReconsitututedDrug")
    private SelenideElement inputEditSubmitReconsitututedDrug = $("#edit-submit-reconsitututed-drug-list");

    @As("linkView")
    private SelenideElement linkView = $(byText("view"));

    @As("linkResetVerifyMedicine")
    private SelenideElement linkResetVerifyMedicine = $("span[class*='flag-verify-medicine'] a[rel='nofollow']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    public ReconstitutedDrugListPage setSelectEditMedicineVerified(String medicineVerified) {
        selectEditMedicineVerified.shouldBe(visible).selectOptionContainingText(medicineVerified);
        return this;
    }

    public ReconstitutedDrugListPage clickOnApplyButton() {
        inputEditSubmitReconsitututedDrug.shouldBe(visible).click();
        Selenide.Wait().withTimeout(Duration.ofSeconds(2));
        return this;
    }

    public ReconstitutedDrugListPage clickOnLinkView() {
        linkView.shouldBe(visible).click();
        return this;
    }

    public ReconstitutedDrugListPage clickLinkResetVerifyMedicine() {
        linkResetVerifyMedicine.shouldBe(visible).click();
        return this;
    }

    public ReconstitutedDrugListPage clickOnTheConfirmButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public ReconstitutedDrugListPage makeVerifyButtonVisible() {
        linkResetVerifyMedicine.shouldBe(visible);
        return this;
    }
}