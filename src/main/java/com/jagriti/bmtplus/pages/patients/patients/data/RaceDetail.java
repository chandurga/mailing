package com.jagriti.bmtplus.pages.patients.patients.data;

public enum RaceDetail {
    NONE("_none"),
    EASTERN_EUROPEAN("eastern european"),
    MIDDLE_EASTERN("middle eastern"),
    HAWAIIAN("hawaiian"),
    OTHER_PACIFIC_ISLANDER("other pacific islander");

    private final String value;

    RaceDetail(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
