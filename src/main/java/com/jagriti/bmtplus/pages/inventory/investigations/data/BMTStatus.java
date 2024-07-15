package com.jagriti.bmtplus.pages.inventory.investigations.data;

public enum BMTStatus {
    NONE("- None -"),
    NOT_SET("Not set"),
    JUST_ENROLLED("Just enrolled"),
    CONSULTATION_ONLY("Consultation Only"),
    PROVISIONAL_BMT_CANDIDATE("Provisional BMT Candidate"),
    AWAITING_BMT("Awaiting BMT"),
    UNDERGOING_PREPARATION_FOR_BMT("Undergoing Preparation for BMT"),
    UNDERGOING_BMT("Undergoing BMT");

    private final String text;

    BMTStatus(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
