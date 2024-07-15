package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum TypingMethod {
    NONE("_none"),
    Serology("Serology"),
    DNA_typing("DNA typing"),
    DNA_Typing_HR("DNA_Typing_HR"),
    Both("Both"),
    Unspecified("Unspecified"),
    Unknown("Unknown");

    private final String value;

    TypingMethod(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
