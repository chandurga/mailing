package com.jagriti.bmtplus.pages.miscellaneous;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/update_patient_centre
public class UpdatePatientCentrePage extends Page<UpdatePatientCentrePage> {
    protected UpdatePatientCentrePage() {
        super(UpdatePatientCentrePage.class);
    }

    @As("inputEditCode")
    private SelenideElement inputEditCode = $("input[id='edit-code']");

    @As("selectEditContentType")
    private SelenideElement selectEditContentType = $("select[id='edit-content-type']");

    @As("selectEditCentre")
    private SelenideElement selectEditCentre = $("select[id='edit-centre']");

    @As("inputEditRemoveCentre")
    private SelenideElement inputEditRemoveCentre = $("input[id='edit-remove-centre']");

    @As("inputEditSubmit")
    private SelenideElement inputEditProcess = $("input[id='edit-submit']");

    @As("liTreatmentRegimenUpdatedPatient")
    private SelenideElement liTreatmentRegimenUpdatedPatient = $("div[class^='messages status'] >ul>li:first-of-type");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    
    

    public UpdatePatientCentrePage enterThePatientCode(String code) {
        inputEditCode.shouldBe(visible).setValue(code);
        return this;
    }
    public UpdatePatientCentrePage setSelectEditContentType(String type) {
        selectEditContentType.shouldBe(visible).selectOptionContainingText(type);
        return this;
    }
    public UpdatePatientCentrePage setSelectEditCentre(String centre) {
        selectEditCentre.shouldBe(visible).selectOptionContainingText(centre);
        return this;
    }
    public UpdatePatientCentrePage clickOnRadioButtonRemoveCentre() {
        inputEditRemoveCentre.shouldBe(visible).click();
        return this;
    }
    public UpdatePatientCentrePage clickOnProcessButton() {
        inputEditProcess.shouldBe(visible).click();
        return this;
    }
    public UpdatePatientCentrePage assertThatTreatmentRegimenUpdatedPatient() {
        liTreatmentRegimenUpdatedPatient.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Updating: TSA231099"));
        return this;
    }
    public UpdatePatientCentrePage assertThatErrorMessageIfMissingMandatoryFields() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Content Type field is required."));
        return this;
    }
    public UpdatePatientCentrePage assertThatErrorMessageForCenterAccess() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Users auth centre update value is not set\n" +
                "Please note that there is no centre access to update/remove for specified centre."));
        return this;
    }
}