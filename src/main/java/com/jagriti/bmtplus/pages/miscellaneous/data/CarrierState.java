package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum CarrierState {
    YES("Yes"),
    NO("No"),
    MISSING_DATA("Missing Data"),
    NOT_APPLICABLE("Not Applicable");

    private final String value;

    CarrierState(String value) {
        this.value = value;
    }

    public String getvalue(){
        return value;
    }
}
