package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Religion {
    NONE("_none"),
    BUDDHISM("Buddhism"),
    CHRISTIANITY("Christianity"),
    HINDUISM("Hinduism"),
    OTHERS("Others");

    private final String value;

    Religion(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
