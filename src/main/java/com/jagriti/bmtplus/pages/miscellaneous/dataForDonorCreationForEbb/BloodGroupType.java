package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum BloodGroupType {
   // NONE("_none"), BloodGroupType is mandatory. Thus selecting none is not allowed.
    A1_POS("A1 Pos"),
    A1_NEG("A1 Neg"),
    A2_POS("A2 Pos"),
    A2_NEG("A2 Neg"),
    B_POS("B Pos"),
    B_NEG("B Neg"),
    O_POS("O Pos"),
    O_NEG("O Neg"),
    A1B_POS("A1B Pos"),
    A1B_NEG("A1B Neg"),
    A2B_POS("A2B Pos"),
    A2B_Neg("A2B Neg"),
    O_BOMBAY_POS("O Bombay Pos"),
    O_BOMBAY_NEG("O Bombay Neg");

    BloodGroupType(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
