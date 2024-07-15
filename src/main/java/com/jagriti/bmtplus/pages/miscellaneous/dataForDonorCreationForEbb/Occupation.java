package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum Occupation {
    NONE("- None -"),
    ATTENDERS("Attenders"),
    BUSINESSMAN("Businessman"),
    DOCTORS("Doctors"),
    FARMER("Farmer"),
    SOFTWARE("Software");

    public String text;
    Occupation(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
