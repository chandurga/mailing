package com.jagriti.bmtplus.pages.miscellaneous.data;

import lombok.Getter;

@Getter
public enum TransplantType {

//    NONE("_none"), TransplantType is mandatory field.
    AUTOLOGOUS("Autologous"),
    UNKNOWN("Unknown"),
    UNSPECIFIED("Unspecified");

    private final String value;

    TransplantType(String value) {
        this.value = value;
    }

}
