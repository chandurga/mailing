package com.jagriti.bmtplus.pages.patients.admissions.data;

public enum ReasonForAdmission {
    DONOR_ADMISSION("Donor Admission"),
    EMERGENCY("Emergency"),
    PLANNED("Planned");

    private final String text;

    ReasonForAdmission(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
