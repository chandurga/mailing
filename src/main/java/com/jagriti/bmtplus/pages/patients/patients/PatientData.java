package com.jagriti.bmtplus.pages.patients.patients;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.patients.patients.data.*;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class PatientData {
    private Country country;
    private Ethnicity ethnicity;
    private HLAStatus hlaStatus;
    private HLAConfirmatoryTypingStatus hlaConfirmatoryTypingStatus;
    private IsThePatientParticipatingInAClinicalTrial isThePatientParticipatingInAClinicalTrial;
    private Race race;
    private RaceDetail raceDetail;
    private Referral referral;
    private RegistrationComplete registrationComplete;
    private Religion religion;
    private RiskGroup riskGroup;
    private Disease disease;
    private String name;
    private String uhid;
    private String dateOfBirth;
    private String dateForProposed;
    private Complication complication;
    private String dateForComplication;
    private BloodProductType bloodProductType;
    private SubmissionID submissionID;
    private SearchReportType searchReportType;
    private String futureDateAsDateOfBirth;
    private String title;
    private TreatmentIssues treatmentIssues;
    private String primaryCauseOfDeath;
    private String secondCauseOfDeath;
    private String centre;
    private StudyCategory studyCategory;

    PatientData() {
        setData();
    }

    public static PatientData getData() {
        return new PatientData();
    }

    private PatientData setData() {
        Faker fakeData = new Faker();
        String fullNameWithDots = fakeData.name().fullName();
        this.name = fullNameWithDots.replaceAll("\\.", "");
        this.title = fakeData.name().title();

        this.uhid = String.valueOf(System.nanoTime());
        this.primaryCauseOfDeath = "Other Cause";
        this.secondCauseOfDeath = "Other Cause";
        this.centre = "Test Centre (TSA)";

        this.disease = (Disease) new RandomEnumGenerator(Disease.class).randomEnum();
        this.country = (Country) new RandomEnumGenerator(Country.class).randomEnum();
        this.ethnicity = (Ethnicity) new RandomEnumGenerator(Ethnicity.class).randomEnum();
        this.hlaStatus = (HLAStatus) new RandomEnumGenerator(HLAStatus.class).randomEnum();
        this.hlaConfirmatoryTypingStatus = (HLAConfirmatoryTypingStatus) new RandomEnumGenerator(HLAConfirmatoryTypingStatus.class).randomEnum();
        this.isThePatientParticipatingInAClinicalTrial = (IsThePatientParticipatingInAClinicalTrial) new RandomEnumGenerator(IsThePatientParticipatingInAClinicalTrial.class).randomEnum();
        this.race = (Race) new RandomEnumGenerator(Race.class).randomEnum();
        this.raceDetail = (RaceDetail) new RandomEnumGenerator(RaceDetail.class).randomEnum();
        this.referral = (Referral) new RandomEnumGenerator(Referral.class).randomEnum();
        this.registrationComplete = (RegistrationComplete) new RandomEnumGenerator(RegistrationComplete.class).randomEnum();
        this.religion = (Religion) new RandomEnumGenerator(Religion.class).randomEnum();
        this.riskGroup = (RiskGroup) new RandomEnumGenerator(RiskGroup.class).randomEnum();
        this.complication = (Complication) new RandomEnumGenerator(Complication.class).randomEnum();
        this.bloodProductType = (BloodProductType) new RandomEnumGenerator(BloodProductType.class).randomEnum();
        this.submissionID = (SubmissionID) new RandomEnumGenerator(SubmissionID.class).randomEnum();
        this.searchReportType = (SearchReportType) new RandomEnumGenerator(SearchReportType.class).randomEnum();
        this.treatmentIssues = (TreatmentIssues) new RandomEnumGenerator(TreatmentIssues.class).randomEnum();
        this.studyCategory = (StudyCategory) new RandomEnumGenerator(StudyCategory.class).randomEnum();

        this.dateOfBirth = DateTimeUtils.getMinimumDate();
        this.dateForProposed = DateTimeUtils.getFormattedFutureDate();
        this.dateForComplication = DateTimeUtils.getFormattedDateForConsentForm();
        this.futureDateAsDateOfBirth = DateTimeUtils.getFormattedFutureDateForPatient();

        return this;
    }
}
