package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum NoteType {
    NONE("_none"),
    MEETING_SUMMARY("Meeting Summary"),
    EXTERNAL_CONSULT("External Consult");

    private final String value;

    NoteType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
