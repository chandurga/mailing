package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum HBSwabSent {
    NONE("_none"),
    YES("Yes"),
    NO("No");

    private final String value;

    HBSwabSent(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
