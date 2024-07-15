package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum DonorRelationship {
    NONE("_none"),
    SYNGENEIC("syngeneic (monozygotic twin)"),
    HLA_IDENTICAL_SIBLING("hla-identical sibling (may include non-monozygotic twin)"),
    HLA_MATCHED_OTHER_RELATIVE("hla-matched other relative"),
    HLA_MISMATCHED_RELATIVE("hla-mismatched relative");

    private final String value;

    DonorRelationship(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
