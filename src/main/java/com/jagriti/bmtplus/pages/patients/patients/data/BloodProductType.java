package com.jagriti.bmtplus.pages.patients.patients.data;

public enum BloodProductType {
    STEM_CELL_BOOST_BM("Stem Cell Boost BM"),
    STEM_CELL_BOOST_PBSC("Stem Cell Boost PBSC");

    private final String value;

    BloodProductType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
