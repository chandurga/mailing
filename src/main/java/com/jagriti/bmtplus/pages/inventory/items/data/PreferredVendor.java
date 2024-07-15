package com.jagriti.bmtplus.pages.inventory.items.data;

public enum PreferredVendor {
    NONE("- None -"),

    TEST_SUPPLIER("Test Supplier"),

    TEST_ASSOCIATE("Test Associate");

    private final String text;

    PreferredVendor(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
