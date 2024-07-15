package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum FamilyMember {
    NONE("- None -");
//    TSA_230160_HUSBAND_TEST_GENERAL("TSA230160-Husband-test general");

    private final String text;

    FamilyMember(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
