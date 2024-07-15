package com.jagriti.bmtplus.pages.patients.patients.data;

import lombok.Getter;

@Getter
public enum SearchReportType {
    BRIEF("Brief"),
    WMDA("WMDA");

    private final String value;

    SearchReportType(String value) {
        this.value = value;
    }

}
