package com.jagriti.bmtplus.pages.miscellaneous.data;

import lombok.Getter;

@Getter
public enum TransplantTypeForDonorWeight {
    //    NONE("_none"), TransplantType is mandatory field.
    RELATED("Related"),
    NMDP_UNRELATED("NMDP Unrelated"),
    UNRELATED("Unrelated");

    private final String value;

    TransplantTypeForDonorWeight(String value) {
        this.value = value;
    }
}
