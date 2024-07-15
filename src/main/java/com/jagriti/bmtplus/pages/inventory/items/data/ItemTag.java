package com.jagriti.bmtplus.pages.inventory.items.data;

public enum ItemTag {
    NONE("_none"),
    HAZARDOUS_MATERIAL("Hazardous material"),
    FLAMMABLE("Flammable"),
    CYTOTOXIC("Cytotoxic");

    private final String value;

    ItemTag(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
