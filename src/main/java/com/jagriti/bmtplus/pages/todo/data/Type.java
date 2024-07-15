package com.jagriti.bmtplus.pages.todo.data;

public enum Type {
    NONE("_none"),
    CLINICAL("Clinical"),
    NURSING("Nursing"),
    ADMINISTRATIVE("Administrative"),
    DATA_MANAGEMENT("Data Management"),
    QUALITY_MANAGEMENT("Quality Management"),
    QUALITY_MANAGEMENT_AUDITS("Quality Management Audits"),
    SYSTEM_ALERTS("System Alerts"),
    PATIENT_COORDINATION("Patient Coordination"),
    EXTERNAL_CONSULTATION("External Consultation"),
    DONOR_SELECTION("Donor Selection"),
    HLA("HLA"),
    STUDY_QUERY("Study Query"),
    OTHERS("Others"),
    FACILITIES("Facilities");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
