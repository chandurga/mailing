package com.jagriti.bmtplus.pages.patients.patients.data;

public enum RiskGroup {
    NONE("- None -"),
    NOT_SET("Not Set"),
    LOW("Low"),
    INTERMEDIATE("Intermediate"),
    HIGH("High");

    private final String text;

    RiskGroup(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
