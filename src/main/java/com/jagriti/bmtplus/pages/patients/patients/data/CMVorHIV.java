package com.jagriti.bmtplus.pages.patients.patients.data;

public enum CMVorHIV {
    POS("Pos"),
    NEG("Neg");

    private final String value;

    CMVorHIV(String value) {
        this.value = value;
    }

    public String getvalue(){
        return value;
    }
}
