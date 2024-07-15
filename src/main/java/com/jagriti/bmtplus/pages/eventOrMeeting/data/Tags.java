package com.jagriti.bmtplus.pages.eventOrMeeting.data;

public enum Tags {
//    NONE("- Select a value -") It is a mandatory field.
    ADMINISTRATION("Administration"),
    GROUP_MEETING("Group Meeting"),
    INVENTORY("Inventory"),
    IT_MEETING("IT Meeting"),
    JOURNAL_CLUB("Journal Club"),
    MORTALITY_MORBIDITY_REVIEW("Mortality/Morbidity Review"),
    NURSING_MEETINGS("Nursing Meetings"),
    OTHERS("Others"),
    PATIENT_INTERACTION("Patient Interaction"),
    POLICIES_PROCEDURES("Policies & procedures"),
    WEEKLY_TEAM_MEETING("Weekly Team Meeting");

    private final String text;

    Tags(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
