package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum Technician {
//    NONE("-none-") Technician is mandatory. Thus selecting none is not allowed.
    NAGASHRUTHI("nagashruthi"),
    PRIYANKA_GK("PriyankaGK"),
    TECHNICIAN("technician"),
    STAFFNURSE("staffnurse"),
    TESTSEROLOGY("testserology");


    private String text;

    Technician(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
