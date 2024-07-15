package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Ethnicity {
    NONE("_none"),
    HISPANIC_OR_LATINO("hispanic or latino"),
    NOT_HISPANIC_OR_LATINO("not hispanic or latino"),
    NOT_APPLICABLE("not applicable"),
    UNKNOWN("unknown");

    private final String value;

    Ethnicity(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
