package com.jagriti.bmtplus.pages.todo.data;

public enum Progress {
    NONE("_none"),
    ZERO("0%"),
    TEN("10%"),
    TWENTY("20%"),
    THIRTY("30%"),
    FOURTY("40%"),
    FIFTY("50%"),
    SIXTY("60%"),
    SEVENTY("70%"),
    EIGHTY("80%"),
    NINETY("90%"),
    HUNDRED("100%");

    private final String value;

    Progress(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
