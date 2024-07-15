package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum TaneerStage {
    NONE("- None -"),
    ONE("I"),
    TWO("II"),
    THREE("III"),
    FOUR("IV");

    private String text;

    TaneerStage(String text) {
        this.text = text;
    }
}
