package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum ComponentToBePrepared {
    //("-none") component to be prepared field is mandatory for component generations purpose
    PC_FFP("PC, FFP"),
    PC_FFP_PLT("PC, FFP, Plt");

    public String text;
    ComponentToBePrepared(String text) {
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
