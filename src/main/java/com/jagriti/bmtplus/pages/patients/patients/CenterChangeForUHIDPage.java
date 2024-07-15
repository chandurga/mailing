package com.jagriti.bmtplus.pages.patients.patients;

import com.codeborne.selenide.As;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class CenterChangeForUHIDPage extends Page<CenterChangeForUHIDPage> {
    protected CenterChangeForUHIDPage() {
        super(CenterChangeForUHIDPage.class);
    }

    @As("linkEdit")
    private SelenideElement linkEdit = $(byText("Edit"));

    @As("selectCenter")
    private SelenideElement selectCenter = $("select[id='edit-og-group-ref-und']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("patientID")
    private SelenideElement patientID = $("div.block-content");

    
    
    public CenterChangeForUHIDPage clickOnEditButton() {
        linkEdit.shouldBe(visible).click();
        return this;
    }
    public CenterChangeForUHIDPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }
    public CenterChangeForUHIDPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }
    public CenterChangeForUHIDPage captureThePatientID() {
        log.info(patientID.shouldBe(visible).getText());
        return this;
    }
}
