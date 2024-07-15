package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum State {
//    NONE("- None -"),
    ANDAMAN_AND_NICOBAR_ISLANDS("Andaman and Nicobar Islands"),
    ANDHRA_PRADESH("Andhra Pradesh"),
    BIHAR("Bihar"),
    KARNATAKA("Karnataka");

    private String value;

    State(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
