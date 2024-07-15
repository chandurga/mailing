package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Country {
    AU("AU"),
    IN("IN"),
    SG("SG"),
    ZW("ZW");

    private final String value;

    Country(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
