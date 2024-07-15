package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum CellSource {

    NONE("_none"),
    BONE_MARROW("Bone marrow"),
    PERIPHERAL_BLOOD("Peripheral blood"),
    CORD_BLOOD("Cord blood"),
    UNSPECIFIED("Unspecified"),
    UNKNOWN("Unknown");

    private final String value;

    CellSource(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
