package com.jagriti.bmtplus.pages.patients.admissions.data;

public enum Reason3 {
    TRANSPLANT("Transplant"),
    CHEMOTHERAPY("Chemotherapy"),
    OTHER_PLANNED_REASON("Other planned reason");

    private final String text;

    Reason3(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
