package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Race {
//    NONE("_none"), It is mandatory for HapE search content test script
    white("white"),
    BLACK_OR_AFRICAN_AMERICAN("black or african american"),
    ASIAN("asian"),
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("american indian or alaska native"),
    NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("Native hawaiian or other pacific islander"),
    NOT_REPORTED("not reported");

    private final String value;

    Race(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
