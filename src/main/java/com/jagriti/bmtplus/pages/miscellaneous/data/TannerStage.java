package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum TannerStage {
    NONE("- None -"),
    I("I"),
    II("II"),
    III("III"),
    IV("IV"),
    V("V");

    private final String text;

    TannerStage(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
