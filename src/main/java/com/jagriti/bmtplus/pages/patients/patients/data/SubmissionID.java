package com.jagriti.bmtplus.pages.patients.patients.data;

public enum SubmissionID {
    FORM_2400_PRE_TRANSPLANT_ESSENTIAL_DATA("-Form 2400 – Pre-Transplant Essential Data"),
    FORM_2006_HCT_INFUSION("-Form 2006 – HCT Infusion");

    private final String text;

    SubmissionID(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
