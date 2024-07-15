package com.jagriti.bmtplus.pages.miscellaneous.data;

import lombok.Getter;

@Getter
public enum Value {
//    UMOL("µmol/L"),
    MG("mg/dL");

    private final String value;

    Value(String value) {
        this.value = value;
    }
}
