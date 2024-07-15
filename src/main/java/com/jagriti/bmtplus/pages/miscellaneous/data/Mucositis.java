package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Mucositis {

    NONE("- None -"),
    One("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4");

    private final String text;

    Mucositis(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
