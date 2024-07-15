package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum ChelationTherapy {
    NONE("_none"),
    REGULAR("Regular"),
    IRREGULAR("Irregular"),
    UNKNOWN("Unknown");

    private final String value;

    ChelationTherapy(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
