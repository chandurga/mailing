package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Gender {
    // _none - Gender is a mandatory value

    MALE("Male"),
    FEMALE("Female"),
    NOT_KNOWN("Not known");

    private final String value;

    Gender(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
