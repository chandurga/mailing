package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum FacialChanges {
    NONE("_none"),
    YES("Yes"),
    NO("No");

    private final String value;

    FacialChanges(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
