package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum OldTreatmentPlan {

    TMC_AML_BU_CY("TMC-AML-BU-CY"),
    TMC_AML_BU_ETO_CY("TMC-AML-BU-ETO-CY"),
    TMC_AML_FLU_MEL("TMC-AML-FLU-MEL");

    private final String text;

    OldTreatmentPlan(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
