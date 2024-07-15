package com.jagriti.bmtplus.pages.patients.patients.data;

public enum IsThePatientParticipatingInAClinicalTrial {
    NONE("_none"),
    YES("yes"),
    NO("no");

    private final String value;

    IsThePatientParticipatingInAClinicalTrial(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
