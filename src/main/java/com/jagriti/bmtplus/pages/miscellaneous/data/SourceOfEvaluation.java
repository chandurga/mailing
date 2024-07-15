package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum SourceOfEvaluation {

    NONE("_none"),
    BYC2C("By C2C"),
    PREC2C("Pre C2C");

    private final String value;

    SourceOfEvaluation(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
