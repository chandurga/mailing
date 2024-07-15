package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum BloodType {
//    NONE("- None -"), It is mandatory for HapE search content test script
    A_POS("A pos"),
    B_POS("B pos"),
    AB_POS("AB pos"),
    O_POS("O pos"),
    A_NEG("A neg"),
    B_NEG("B neg"),
    AB_NEG("AB neg"),
    O_NEG("O neg");

    private final String text;

    BloodType(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
