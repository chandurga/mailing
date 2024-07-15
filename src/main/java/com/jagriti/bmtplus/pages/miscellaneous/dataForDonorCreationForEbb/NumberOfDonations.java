package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum NumberOfDonations {
    //    NONE("_none"), //NumberOfDonations is mandatory. Thus selecting none is not allowed.

    FIRST_TIME("FirstTime"),

    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10");



    NumberOfDonations(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
