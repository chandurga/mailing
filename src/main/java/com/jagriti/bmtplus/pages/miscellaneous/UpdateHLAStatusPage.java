package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/content/tsa230191
public class UpdateHLAStatusPage extends Page<UpdateHLAStatusPage> {
    protected UpdateHLAStatusPage() {
        super(UpdateHLAStatusPage.class);
    }

    @As("linkQuickTabsOfHLA")
    private SelenideElement linkQuickTabsOfHLA = $("#quicktabs-tab-patient_summary_pre_bmt-4");

    @As("linkClickUpdatePatientHla")
    private SelenideElement linkClickUpdatePatientHla = $("a[title*='Update']");

    @As("statusMessagePatientHla")
    private SelenideElement statusMessagePatientHla = $("div[class^='messages']");
    


    public UpdateHLAStatusPage clickOnLinkQuickTabsOfHLA() {
        linkQuickTabsOfHLA.shouldBe(visible).click();
        return this;
    }
    public UpdateHLAStatusPage clickOnLinkClickUpdatePatientHla() {
        linkClickUpdatePatientHla.shouldBe(visible).click();
        return this;
    }
    public UpdateHLAStatusPage assertThatStatusMessagePatientHla() {
        statusMessagePatientHla.shouldBe(visible).shouldHave(Condition.text("Patient HLA Status has been updated"));
        return this;
    }
}