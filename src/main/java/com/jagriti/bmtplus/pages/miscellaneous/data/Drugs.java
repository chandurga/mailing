package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Drugs {
    NONE("- None -"),
    WAY_CONECTOR("3 way conector"),
    ABDOMINAL_SPONG("abdominal spong 10*10"),
    ACYCLOVIR_OINTMENT("Acyclovir 50mg Ointment"),
    ADERNALINE("Adernaline"),
    ALCOHOL_SWAB_FULL_PACK("Alcohol Swab Full Pack"),
    ALCOHOL_SEABS("Alcohol swabs"),
    AMOXICILLIN("Amoxicillin"),
    ARTEM_NEBULIZER_AMPULE("Artem Nebulizer Ampule");

    private final String text;

    Drugs(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
