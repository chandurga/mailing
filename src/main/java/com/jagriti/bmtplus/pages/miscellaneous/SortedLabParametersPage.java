package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/110459/edit
@Slf4j
public class SortedLabParametersPage extends Page<SortedLabParametersPage> {
    public static String patientId;

    final static String labParameters = "Sorted Lab Parameters";
    final static String allDetails = "All Details";

    protected SortedLabParametersPage() {
        super(SortedLabParametersPage.class);
    }

    @As("liAdminSettings")
    private SelenideElement liAdminSettings = $("li[class$='last']");

    @As("inputEditFieldCentreCustom")
    private SelenideElement inputEditFieldCentreCustom = $("#edit-field-centre-custom-settings-und-redirect-to-sorted-lab-parameters");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("#edit-submit");

    @As("linkPatients")
    private SelenideElement linkPatients = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    @As("linkOfThePatient")
    private SelenideElement linkOfThePatient = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > div > div > section > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(2) > table:nth-of-type(2) > tbody > tr:nth-of-type(1) > td:nth-of-type(1) > a");

    @As("inputButtonOfLabBrowser")
    private SelenideElement inputButtonOfLabBrowser = $("a[class$='lab-browser']");

    @As("linkSortedLabParametersActive")
    private SelenideElement linkSortedLabParametersActive = $("li[class='active'] a");

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));


    public SortedLabParametersPage clickOnLiAdminSettings() {
        liAdminSettings.shouldBe(Condition.visible).click();
        return this;
    }

    public SortedLabParametersPage clickOnTheCheckboxOfSortedLabParametersCentreToSelect() {
        if (inputEditFieldCentreCustom.shouldBe(Condition.visible).isSelected()) {
            log.info("Redirect to the sorted lab parameters checkbox already selected.");
        } else {
            inputEditFieldCentreCustom.shouldBe(Condition.visible).click();
        }
        return this;
    }

    public SortedLabParametersPage clickOnTheCheckboxOfSortedLabParametersCentreToDeselect() {
        if (inputEditFieldCentreCustom.shouldBe(Condition.visible).isSelected()) {
            inputEditFieldCentreCustom.shouldBe(Condition.visible).click();
        } else {
            log.info("Redirect to the sorted lab parameters checkbox deselected.");
        }
        return this;
    }

    public SortedLabParametersPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(Condition.visible).click();
        return this;
    }

    public SortedLabParametersPage clickOnLinkPatientsInMenuBar() {
        linkPatients.shouldBe(Condition.visible).click();
        return this;
    }

    public SortedLabParametersPage clickOnLinkOfThePatientInTheList() {
        linkOfThePatient.shouldBe(Condition.visible).click();
        switchTo().window(1);
        return this;
    }

    public SortedLabParametersPage clickOnTheLabBrowserButton() {
        inputButtonOfLabBrowser.shouldBe(Condition.visible).click();
        switchTo().window(2);
        return this;
    }

    public SortedLabParametersPage assertThatLinkSortedLabParametersActive() {
        linkSortedLabParametersActive.shouldBe(Condition.visible).shouldHave(Condition.text(labParameters));
        log.info("Sorted Lab Parameters tab is clicked as expected");
        Selenide.closeWindow();
        return this;
    }

    public SortedLabParametersPage assertThatLinkAllDetailsActive() {
        linkSortedLabParametersActive.shouldBe(Condition.visible).shouldHave(Condition.text(allDetails));
        log.info("All Details tab is clicked as expected");
        return this;
    }

    public SortedLabParametersPage clickOnEditLink() {
        Selenide.switchTo().window(0);
        Selenide.back();
        linkEdit.shouldBe(Condition.visible).click();
        return this;
    }

    public SortedLabParametersPage moveToLabBrowserPage() {
        Selenide.switchTo().window(1);
        Selenide.refresh();
        inputButtonOfLabBrowser.shouldBe(Condition.visible).click();
        Selenide.switchTo().window(2);
        return this;
    }
}