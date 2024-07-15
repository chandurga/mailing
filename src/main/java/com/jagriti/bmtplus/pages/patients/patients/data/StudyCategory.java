package com.jagriti.bmtplus.pages.patients.patients.data;

import lombok.Getter;

@Getter
public enum StudyCategory {

    ALPHA_BETA_DEPLETION_CANDIDATE("Alpha Beta Depletion Candidate"),

    CELL_DOSE_TIITRATION_BASED_UPON_CD_COUNTS("Cell Dose Tiitration based upon CD counts."),

    HAPLOIDENTICAL_BMT("Haploidentical BMT"),
    HEALTH_RELATED_QUALITY_OF_LIFE_POST_BMT("Health-Related Quality of Life post-BMT");

    private final String text;

    StudyCategory(String text) {
        this.text = text;
    }

}
