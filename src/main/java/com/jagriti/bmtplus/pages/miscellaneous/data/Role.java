package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Role {
    //    NONE("- None -"), It is mandatory for HapE search content test script
    PHYSICIAN("Physician"),
    NURSE("Nurse"),
    NURSE_IN_CHARGE("Nurse In Charge"),
    COORDINATOR("Coordinator"),
    PHARMACIST("Pharmacist"),
    INVENTORY_MANAGER("Inventory Manager"),
    HOUSE_KEEPING("House Keeping"),
    DATA_MANAGER("Data Manager"),
    EXTERNAL_CONSULTANT("External Consultant"),
    ADVANCE_PRACTICE_PROFESSIONALS("Advance Practice Professionals"),
    CHEMOTHERAPY_NURSE("Chemotherapy Nurse");

    private final String text;

    Role(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
