package com.jagriti.bmtplus.pages.inventory.items.data;

public enum DrugListCategory {
    NONE("_none"),
    Routine("Routine"),
    CONTROLLE_DRUGS("Controlled Drugs"),
    CEASH_CART("Crash Cart"),
    NOT_TO_BE_USED("Not to be used"),
    STEP_DOWN("Step Down"),
    NOT_TO_STOCK("Not to Stock");

    private final String value;

    DrugListCategory(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
