package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Complication {
//    NONE It is a mandatory value
    AGVHD("aGVHD"),
    CGVHD("cGVHD"),
    TA_TMA("TA-TMA"),
    VOD_SOS("VOD/SOS"),
    INVASIVE_FUNGAL_DISEASE("Invasive Fungal Disease"),
    CMV("CMV"),
    VARICELLA_ZOSTER("Varicella-Zoster"),
    PARVOVIRUS_B("Parvovirus B19");

    private final String text;

    Complication(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
