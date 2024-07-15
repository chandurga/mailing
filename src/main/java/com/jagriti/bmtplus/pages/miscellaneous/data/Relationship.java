package com.jagriti.bmtplus.pages.miscellaneous.data;

import lombok.Getter;

@Getter
public enum Relationship {
    //_none Relationship is a mandatory value

    FATHER("Father"),
    MOTHER("Mother"),
    SIBLING("Sibling"),
    HUSBAND("Husband"),
    WIFE("Wife"),
    SON("Son"),
    DAUGHTER("Daughter"),
    PATERNAL_AUNT("Paternal aunt"),
    PATERNAL_UNCLE("Paternal uncle");

    private final String value;

    Relationship(String value) {
        this.value = value;
    }

}
