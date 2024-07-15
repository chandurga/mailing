package com.jagriti.bmtplus.pages.patients.patients.data;

public enum HLAConfirmatoryTypingStatus {
    NONE("_none"),
    REQUIRED("Required"),
    PENDING("Pending"),
    DONE("Done");

    private final String value;

    HLAConfirmatoryTypingStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
