package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum Compatibility {
    YES("Yes"),
    NA("NA"),
    NOT_DONE("Not Done");

    private String value;

    Compatibility(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
