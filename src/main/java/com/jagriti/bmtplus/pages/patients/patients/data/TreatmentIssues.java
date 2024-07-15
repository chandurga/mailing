package com.jagriti.bmtplus.pages.patients.patients.data;

public enum TreatmentIssues {
    LONG_TERM_COMPLICATIONS("Long term complications"),
    ABO_MISMATCH_AND_RH("ABO mismatch and Rh"),
    HYPERTENSION("Hypertension"),
    POSITVE_SURVAILLANCE_RECTAL_SWAB("Positve survaillance rectal swab");

    private final String text;

    TreatmentIssues(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
