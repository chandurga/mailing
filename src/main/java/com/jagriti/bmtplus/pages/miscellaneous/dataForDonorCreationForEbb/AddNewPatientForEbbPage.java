package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

import com.codeborne.selenide.As;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.miscellaneous.DonorData;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = about:blank
public class AddNewPatientForEbbPage extends Page<AddNewPatientForEbbPage> {
    protected AddNewPatientForEbbPage() {
        super(AddNewPatientForEbbPage.class);
    }

    @As("patientNameInputField")
    private SelenideElement patientNameInputField = $("input[id='edit-field-patient-name-0-value']");
    @As("patientRequestId")
    private SelenideElement patientRequestId = $("input[id='edit-field-patient-id-0-value']");
    @As("hospitalInputField")
    private SelenideElement hospitalInputField = $("input[id='edit-field-hospital-id-0-target-id']");
    @As("ipNumberInputField")
    private SelenideElement ipNumberInputField = $("input[id='edit-field-ip-number-0-value']");
    @As("genderSelectDropdown")
    private SelenideElement genderSelectDropdown = $("select[id='edit-field-patient-gender']");
    @As("aboSelectDropdown")
    private SelenideElement aboSelectDropdown = $("select[id='edit-field-abo']");
    @As("rhSelectDropdown")
    private SelenideElement rhSelectDropdown = $("select[id='edit-field-rh']");
    @As("submitButton")
    private SelenideElement submitButton = $("button[id='edit-submit']");

    public AddNewPatientForEbbPage addPatientName(String name) {
        patientNameInputField.shouldBe(visible).setValue(name);
        return this;
    }

    public AddNewPatientForEbbPage addPatientRequestId(String patientID) {
        patientRequestId.shouldBe(visible).setValue(patientID);
        return this;
    }

    public AddNewPatientForEbbPage addHospitalName(Hospital hospitalName) {
        hospitalInputField.shouldBe(visible).setValue(hospitalName.getValue());
        return this;
    }

    public AddNewPatientForEbbPage addIPNumber(int ipNumber) {
        ipNumberInputField.shouldBe(visible).setValue(String.valueOf(ipNumber));
        return this;
    }

    public AddNewPatientForEbbPage selectGender(Gender gender) {
        genderSelectDropdown.shouldBe(visible).selectOptionByValue(gender.getValue());
        return this;
    }

    public AddNewPatientForEbbPage selectBloodGroup(String abo) {
        aboSelectDropdown.shouldBe(visible).selectOptionByValue(abo);
        return this;
    }

    public AddNewPatientForEbbPage selectRhFactor(String rh) {
        rhSelectDropdown.shouldBe(visible).selectOptionByValue(rh);
        return this;
    }

    public AddNewPatientForEbbPage savePatient() {
        submitButton.shouldBe(visible).click();
        return this;
    }


    public AddNewPatientForEbbPage createPatient(){
        DonorData donor = DonorData.getData();

        this.addPatientName(donor.getName());
        this.addPatientRequestId(donor.getUniquePatientRequestID());
        this.addHospitalName(donor.getHospital());
        this.addIPNumber(donor.getIpNumber());
        this.selectGender(donor.getGender());
        this.selectBloodGroup("A1");
        this.selectRhFactor("Pos");
        this.savePatient();
        return this;
    }
}