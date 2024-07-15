package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum DonationLocation {

//    CAMP("Camp"),
    In_house("In-house");

    DonationLocation(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }

}
