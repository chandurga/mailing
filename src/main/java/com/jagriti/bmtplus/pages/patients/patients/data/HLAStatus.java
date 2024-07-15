package com.jagriti.bmtplus.pages.patients.patients.data;

public enum HLAStatus {
    NONE("_none"),
    HLA_TYPING_JUSTIFIED("HLA typing justified"),
    HLA_TYPING_NOT_JUSTIFIED("HLA typing not justified"),
    HLA_TYPING_REQUESTED("HLA typing requested"),
    HLA_TYPING_PENDING("HLA typing pending"),
    HLA_FULLY_MATCHED_RELATED_DONOR("HLA fully matched related donor"),
    HLA_PARTIALLY_MATCHED_RELATED_DONOR("HLA partially matched related donor"),
    HLA_NO_PARTIALLY_OR_FULLY_MATCHED_RELATED_DONOR("HLA no partially or fully matched related donor"),
    HLA_FULLY_MATCHED_UNRELATED_DONOR("HLA fully matched unrelated donor"),
    HLA_PARTIALLY_MATCHED_UNRELATED_DONOR("HLA partially matched unrelated donor");

    private final String value;

    HLAStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
