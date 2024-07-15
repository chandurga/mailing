package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum Shift {
    //_none - Shift is a mandatory field

    MORNING_SHIFT("Morning Shift"),
    EVENING_SHIFT("Evening Shift"),
    NIGHT_SHIFT("Night Shift");

    private final String value;

    Shift(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
