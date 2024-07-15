package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum Hospital {
    TEST_HOSPITAL_1("test (15430)"),
    TEST_HOSPITAL_2("TestingHospital (285)");

    Hospital(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
