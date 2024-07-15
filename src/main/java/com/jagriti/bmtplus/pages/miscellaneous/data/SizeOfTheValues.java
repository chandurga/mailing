package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum SizeOfTheValues {
    MMOL_L("mmol/L"),
    G_DL("g/dL");

    private final String value;

    SizeOfTheValues(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
