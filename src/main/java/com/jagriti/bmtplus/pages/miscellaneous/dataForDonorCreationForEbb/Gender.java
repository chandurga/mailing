package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum Gender {

//    NONE("_none"),Gender is mandatory. Thus selecting none is not allowed.
    MALE("Male"),
    FEMALE("Female");

    Gender(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
