package com.jagriti.bmtplus.pages.inventory.investigations.data;

public enum Investigations {
//    NONE("-None-"), It is a mandatory value
    OH_CHOLECALCIFEROL("25 OH Cholecalciferol (D2+D3)"),
    ABO_ISOHEMOAGGLUTININ_TITRE("ABO isohemoagglutinin (IHA) titre"),
    ACTIN_SMOOTH_MUSCLE_ANTIBODY("Actin smooth muscle antibody (SMA)");

    private final String text;

    Investigations(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
