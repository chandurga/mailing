package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum HLATypingStatus {
    NONE("_none"),
    FULL("Full"),
    PARTIAL("Partial"),
    UNKNOWN("Unknown"),
    NOT_APPLICABLE("Not Applicable");

    private final String value;

    HLATypingStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
