package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum GrowthAndDevelopment {
    //NONE("_none"), Deliberately assigning the value for asserting
    NORMAL("Normal"),
    ABNORMAL("Abnormal"),
    NOT_DONE("Not Done"),
    NOT_READABLE("Not readable");

    private final String value;

    GrowthAndDevelopment(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
