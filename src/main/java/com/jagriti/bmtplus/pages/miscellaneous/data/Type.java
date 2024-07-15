package com.jagriti.bmtplus.pages.miscellaneous.data;

import lombok.Getter;

@Getter
public enum Type {
    NONE("_none"),
    PRE_TRANSPLANT("Pre-Transplant"),
    DURING_TRANSPLANT("During Transplant"),
    POST_TRANSPLANT("Post Transplant"),
    ANNUAL_FOLLOWUP("Annual Followup"),
    NO_FOLLOW_UP("No Follow Up"),
    DAY_CARE("DayCare"),
    IN_PATIENT_OTHERS("InPatientOthers"),
    OUT_PATIENT_OTHERS("OutPatientOthers");

    private final String value;

    Type(String value) {
        this.value = value;
    }

}
