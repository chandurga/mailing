package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Referral {
    NONE("_none"),
    C2C_Referral("C2C Referral"),
    DIRECT_REFERRAL("Direct Referral");

    private final String value;

    Referral(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
