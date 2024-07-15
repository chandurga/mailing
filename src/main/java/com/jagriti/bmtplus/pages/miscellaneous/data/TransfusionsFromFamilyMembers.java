package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum TransfusionsFromFamilyMembers {
    NONE("_none"),
    YES("yes"),
    NO("no");

    private final String value;

    TransfusionsFromFamilyMembers(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
