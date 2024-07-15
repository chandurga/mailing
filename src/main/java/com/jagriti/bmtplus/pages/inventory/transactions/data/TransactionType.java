package com.jagriti.bmtplus.pages.inventory.transactions.data;

public enum TransactionType {
    // NONE("_none) It is a mandatory field
    PURCHASE("Purchase"),

    //CONSUME("Consume"),
    TRANSFER_IN("Transfer-In");
//    TRANSFER_OUT("Transfer-Out"),
//    DISCARD("Discard");

    private final String text;

    TransactionType(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
