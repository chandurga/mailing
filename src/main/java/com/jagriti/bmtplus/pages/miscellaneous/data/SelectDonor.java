package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum SelectDonor {
    NONE("- None -"),
    YES("Yes");

    private final String text;

    SelectDonor(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
