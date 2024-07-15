package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum TypeOfDonor {

    //None ("_none") Type of donor is not mandatory but have to specify when the setting is enabled
    FULL ("Full"),
    PARTIAL ("Partial");

    private String value;

    TypeOfDonor(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
