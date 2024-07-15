package com.jagriti.bmtplus.pages.patients.patients.data;

public enum RegistrationComplete {
    NONE("_none"),
    YES("Yes"),
    NO("No");

    private final String value;

    RegistrationComplete(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
