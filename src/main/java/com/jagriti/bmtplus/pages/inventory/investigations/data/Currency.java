package com.jagriti.bmtplus.pages.inventory.investigations.data;

public enum Currency {
    NONE("_none"),
    AFN("AFN"),
    EUR("EUR"),
    EGP("EGP"),
    GHS("GHS"),
    INR("INR"),
    IQD("IQD"),
    PKR("PKR"),
    LKR("LKR"),
    USD("USD");

    private final String value;

    Currency(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
