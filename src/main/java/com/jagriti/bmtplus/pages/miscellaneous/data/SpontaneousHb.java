package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum SpontaneousHb {
    NONE("_none"),
    UNKNOWN("Unknown"),
    NOT_AVAILABLE("Not available"),
    LESS_THAN("Less than 7 g/dL"),
    TO("7 to 9 g/dL");

    private final String value;

    SpontaneousHb(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
