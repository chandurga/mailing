package com.jagriti.bmtplus.pages.patients.admissions.data;

public enum Reason2 {
    DRUG_TOXICITY("Drug Toxicity"),
    PROFOUND_CYTOPENIA("Profound cytopenia"),
    REJECTION("Rejection"),
    RESPIRATORY_DISTRESS("Respiratory distress"),
    PACKED_CELLS_TRANSFUSION_ANEMIA("Packed Cells Transfusion / Anemia"),
    FALLING_COUNTS_CHIMERISM("Falling counts/chimerism"),
    OTHER_EMERGENCIES("Other emergencies"),
    NEUROLOGICAL_DISTRESS("Neurological distress"),
    IVIG_INFUSION("IVIG infusion"),
    INFECTION("Infection"),
    GVHD("GVHD"),
    GASTROINTESTINAL_DISTRESS("Gastrointestinal distress");

    private final String text;

    Reason2(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
