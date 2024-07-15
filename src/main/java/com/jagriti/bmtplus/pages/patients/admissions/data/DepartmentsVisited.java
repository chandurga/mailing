package com.jagriti.bmtplus.pages.patients.admissions.data;

public enum DepartmentsVisited {
    NONE("- None -"),
    SANKALP_DAY_CARE("Sankalp Day Care"),
    THALASSEMIA_DAY_CARE("Thalassemia Day Care");

    private final String text;

    DepartmentsVisited(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
