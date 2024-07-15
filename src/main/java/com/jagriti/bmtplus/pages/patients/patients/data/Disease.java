package com.jagriti.bmtplus.pages.patients.patients.data;

public enum Disease {
//    SELECT_A_VALUE("- Select a value -"),
    ACUTE_LYMPHOBLASTIC_LEUKEMIA("Acute Lymphoblastic Leukemia"),
    ACUTE_MYELOID_LEUKEMIA("Acute Myeloid Leukemia"),
    BRAIN_TUMOR("Brain Tumor"),
    C_1_Q_DEFICIENCY("C1q Deficiency"),
    CHRONIC_GRANULOMATOUS_DISEASE("Chronic Granulomatous Disease"),
    CHRONIC_MYELOID_LEUKEMIA("Chronic Myeloid Leukemia"),
    CONGENITAL_AMEGAKARYOCYTIC_THROMBOCYTOPENIA("Congenital Amegakaryocytic Thrombocytopenia"),
    CONGENITAL_DYSERYTHROPOIETIC_ANEMIA("Congenital Dyserythropoietic Anemia"),
    WISKOTT_ALDRICH_SYNDROME("Wiskott-Aldrich Syndrome");

    private final String text;

    Disease(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
