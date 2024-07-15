package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Laboratory {
//    NONE("- None -"), It is a mandatory field
    AFIP_RAWALPINDI("AFIP, Rawalpindi (PK)"),
    AFIT_RAWALPINDI("AFIT, Rawalpindi (PK)"),
    BANGALORE_MEDICAL_COLLEGE("Bangalore Medical College"),
    DKMS_GERMANY("DKMS Germany"),
    MED_GENOME("MedGenome"),
    HISTO_GENETICS_USA("HistoGenetics USA"),
    OTHER("Other");

    private final String text;

    Laboratory(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
