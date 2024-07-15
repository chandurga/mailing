package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum FamilyHistory {

//    NONE("_none"), Deliberately assigning the value for asserting
    POS("Pos"),
    NEG("Neg"),
    NOT_DONE("Not Done"),
    NOT_READABLE("Not Readable"),
    MISSING_DATA("Missing Data");

    private final String value;

    FamilyHistory(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
