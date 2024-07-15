package com.jagriti.bmtplus.pages.inventory.bloodProducts.data;

public enum Investigations {
    NONE("_none"),
    COMPLETE_BLOOD_COUNT("Complete blood count"),
    PLASMA_HUB("Plasma Hub"),
    URINE_HB("Urine Hb"),
    COAGULATION_SCREEN("Coagulation screen");

    private final String value;

    Investigations(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
