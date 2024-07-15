package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum TypeOfBag {
//    NONE("_none"), TypeOfBag is mandatory for future needs


    ML_DOUBLE_CPDA("350 ml Double CPDA"),
    DOUBLE_CPDA_350_ML_SAGM("Double CPDA 350 ml SAGM"),
    DOUBLE_CPDA_SDGM("Double CPDA SAGM");


    TypeOfBag(String text){
        this.text = text;
    }

    private String text;

    public String getText(){
        return text;
    }
}
