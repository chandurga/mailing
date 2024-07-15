package com.jagriti.bmtplus.pages.inventory.items.data;

public enum Category {
//    NONE("- None -"), It is a mandatory field
    CLEANING_HOUSEKEEPING("Cleaning/Housekeeping"),
    CSSD_ITEMS("CSSD Items"),
    LINEN("Linen"),
    STATIONARY("Stationary"),
    DRUGS("Drugs"),
    CONSUMABLES("Consumables"),
    EQUIPMENTS("Equipments");

    private final String text;

    Category(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
