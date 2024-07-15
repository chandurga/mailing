package com.jagriti.bmtplus.pages.todo.data;

public enum Status {
    NONE("_none"),
    IN_PROGRESS("In Progress"),
    ON_HOLD("On Hold"),
    COMPLETE("Complete");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
