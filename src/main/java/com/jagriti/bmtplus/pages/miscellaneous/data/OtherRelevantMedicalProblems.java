package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum OtherRelevantMedicalProblems {
    NONE("_none"),
    YES("Yes"),
    NO("No"),
    MISSING_DATA("Missing Data"),
    NOT_APPLICABLE("Not Applicable");

    private final String value;

    OtherRelevantMedicalProblems(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
