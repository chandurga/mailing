package com.jagriti.bmtplus.pages.QMTools.logs.data;

public enum LogStatus {
    IN_USE("In Use"),
    Not_Working("Not Working"),
    DISCARDED("Discarded"),
    DISPOSED("Disposed"),
    TRANSFERRED("Transferred"),
    SOLD("Sold"),
    LOST("Lost"),
    MERGED("Merged");

    private final String value;

    LogStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
