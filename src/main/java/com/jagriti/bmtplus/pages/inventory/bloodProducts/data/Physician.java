package com.jagriti.bmtplus.pages.inventory.bloodProducts.data;

public enum Physician {
    NONE("- None -"),
    AMITSEDAI("amitsedai"),
    ANKITA("ankita"),
    LALITH("lalith");

    private final String text;

    Physician(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
