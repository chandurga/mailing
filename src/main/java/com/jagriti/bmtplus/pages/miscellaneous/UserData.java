package com.jagriti.bmtplus.pages.miscellaneous;

import com.jagriti.bmtplus.pages.miscellaneous.data.*;
import com.jagriti.bmtplus.pages.patients.patients.data.CMVorHIV;
import com.jagriti.bmtplus.utils.NumberUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import com.github.javafaker.Faker;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import lombok.Data;

@Data
public class UserData {
    private String patientCode;

    private String patientName;

    private String centre;

    private SourceOfEvaluation sourceOfEvaluation;

    private FamilyHistory familyHistory;

    private GrowthAndDevelopment growthAndDevelopment;

    private OtherRelevantMedicalProblems otherRelevantMedicalProblems;

    private int weight;

    private int systolic;

    private int diastolic;

    private TannerStage tannerStage;

    private SizeOfTheValues size;

    private BloodType bloodType;

    private String title;

    private String dateForDisease;

    private SpontaneousHb spontaneousHb;

    private FacialChanges facialChanges;

    private TransfusionsFromFamilyMembers transfusionsFromFamilyMembers;

    private ChelationTherapy chelationTherapy;

    private Shift shift;

    private Mucositis mucositis;

    private Drugs drugs;

    private String date;

    private Gender gender;

    private Relationship relationship;

    private HBSwabSent hbSwabSent;

    private SelectDonor selectDonor;

    private CarrierState carrierState;

    private PrenetalDiagnosisSupportedBy prenetalDiagnosisSupportedBy;

    private Laboratory laboratory;

    private DonorRelationship donorRelationship;

    private NoteType noteType;

    private FamilyMember familyMember;

    private String dateOfConsent;

    private TypingMethod typingMethod;

    private TransplantType transplantType;

    private TransplantTypeForDonorWeight transplantTypeForDonorWeight;

    private HLATypingStatus hlaTypingStatus;

    private OldTreatmentPlan oldTreatmentPlan;

    private CellSource cellSource;

    private String dateForBMT;

    private String futureDateFollowUp;

    private String todayDate;

    private String presentTime;

    private int wbc;

    private int anc;

    private int alc;

    private int amc;

    private int hb;

    private int mcv;

    private int platelets;

    private double reticulocyte;

    private String hlaLaboratory;

    private String expiryDateForDrug;

    private CMVorHIV cmVorHIV;

    private String userName;

    private Role role;

    private String email;

    private Type type;

    private Value value;

    private int sodium;

    private int potassium;

    private int calcium;

    private int sgptalt;

    private int totalBilirubin;

    private int creatinine;

    private int crp;

    private int cyclosporinLevelPeak;

    private int cyclosporineLevelTrough;

    private int tacrolimusPeakLevel;

    private int liver;

    private String pastDate;

    private String pastDateForBloodProduct;

    private UserData() {
        setData();
    }

    private UserData setData() {
        final int MIN_ELIGIBLE_WEIGHT = 45;
        final int MAX_ELIGIBLE_WEIGHT = 110;
        final int MIN_ELIGIBLE_SYSTOLIC = 80;
        final int MAX_ELIGIBLE_SYSTOLIC = 110;
        final int MIN_ELIGIBLE_DIASTOLIC = 60;
        final int MAX_ELIGIBLE_DIASTOLIC = 80;
        final int MIN_ELIGIBLE_WBC = 4500;
        final int MAX_ELIGIBLE_WBC = 11000;
        final int MIN_ELIGIBLE_ANC = 2500;
        final int MAX_ELIGIBLE_ANC = 6000;
        final int MIN_ELIGIBLE_ALC = 1000;
        final int MAX_ELIGIBLE_ALC = 4000;
        final int MIN_ELIGIBLE_AMC = 200;
        final int MAX_ELIGIBLE_AMC = 950;
        final int MIN_ELIGIBLE_HB = 13;
        final int MAX_ELIGIBLE_HB = 17;
        final int MIN_ELIGIBLE_MCV = 80;
        final int MAX_ELIGIBLE_MCV = 100;
        final int MIN_ELIGIBLE_PLATELETS = 150000;
        final int MAX_ELIGIBLE_PLATELETS = 450000;
        final int MIN_ELIGIBLE_RETICULOCYTE = (int) 0.5;
        final int MAX_ELIGIBLE_RETICULOCYTE = (int) 1.5;
        final int MIN_SODIUM = 135;
        final int MAX_SODIUM = 145;
        final int MIN_POTASSIUM = (int) 3.6;
        final int MAX_POTASSIUM = (int) 5.2;
        final int MIN_CALCIUM = (int) 8.5;
        final int MAX_CALCIUM = (int) 10.5;
        final int MIN_SGPTALT = 29;
        final int MAX_SGPTALT = 33;
        final int MIN_TOTALBILIRUBIN = (int) 0.1;
        final int MAX_TOTALBILIRUBIN = (int) 1.2;
        final int MIN_CREATININE = (int) 0.7;
        final int MAX_CREATININE = (int) 1.3;
        final int MIN_CRP = (int) 0.3;
        final int MAX_CRP = (int) 1.0;
        final int MIN_CYCLOSPORINLEVELPEAK = 800;
        final int MAX_CYCLOSPORINLEVELPEAK = 1400;
        final int MIN_CYCLOSPORINLEVELTROUGH = 100;
        final int MAX_CYCLOSPORINLEVELTROUGH = 400;
        final int MIN_TACROLIMUS = (int) 5.0;
        final int MAX_TACROLIMUS = (int) 30.0;
        final int MIN_LIVER = (int) 7;
        final int MAX_LIVER = (int) 10.5;

        Faker fakeData = new Faker();

        this.title = fakeData.name().title();
        this.userName = fakeData.name().username();
        this.email = fakeData.name().firstName();

        this.patientCode = "446525106662800";
        this.patientName = "Lindsay Halvorson V";
        this.centre = "Test Centre (TSA)";
        this.dateForDisease = DateTimeUtils.getFormattedDate();

        this.sourceOfEvaluation = (SourceOfEvaluation) new RandomEnumGenerator(SourceOfEvaluation.class).randomEnum();
        this.familyHistory = (FamilyHistory) new RandomEnumGenerator(FamilyHistory.class).randomEnum();
        this.growthAndDevelopment = (GrowthAndDevelopment) new RandomEnumGenerator(GrowthAndDevelopment.class).randomEnum();
        this.otherRelevantMedicalProblems = (OtherRelevantMedicalProblems) new RandomEnumGenerator(OtherRelevantMedicalProblems.class).randomEnum();
        this.tannerStage = (TannerStage) new RandomEnumGenerator(TannerStage.class).randomEnum();
        this.size = (SizeOfTheValues) new RandomEnumGenerator(SizeOfTheValues.class).randomEnum();
        this.bloodType = (BloodType) new RandomEnumGenerator(BloodType.class).randomEnum();
        this.spontaneousHb = (SpontaneousHb) new RandomEnumGenerator(SpontaneousHb.class).randomEnum();
        this.facialChanges = (FacialChanges) new RandomEnumGenerator(FacialChanges.class).randomEnum();
        this.transfusionsFromFamilyMembers = (TransfusionsFromFamilyMembers) new RandomEnumGenerator(TransfusionsFromFamilyMembers.class).randomEnum();
        this.chelationTherapy = (ChelationTherapy) new RandomEnumGenerator(ChelationTherapy.class).randomEnum();
        this.gender = (Gender) new RandomEnumGenerator(Gender.class).randomEnum();
        this.relationship = (Relationship) new RandomEnumGenerator(Relationship.class).randomEnum();
        this.hbSwabSent = (HBSwabSent) new RandomEnumGenerator(HBSwabSent.class).randomEnum();
        this.selectDonor = (SelectDonor) new RandomEnumGenerator(SelectDonor.class).randomEnum();
        this.carrierState = (CarrierState) new RandomEnumGenerator(CarrierState.class).randomEnum();
        this.prenetalDiagnosisSupportedBy = (PrenetalDiagnosisSupportedBy) new RandomEnumGenerator(PrenetalDiagnosisSupportedBy.class).randomEnum();
        this.laboratory = (Laboratory) new RandomEnumGenerator(Laboratory.class).randomEnum();
        this.donorRelationship = (DonorRelationship) new RandomEnumGenerator(DonorRelationship.class).randomEnum();
        this.shift = (Shift) new RandomEnumGenerator(Shift.class).randomEnum();
        this.mucositis = (Mucositis) new RandomEnumGenerator(Mucositis.class).randomEnum();
        this.drugs = (Drugs) new RandomEnumGenerator(Drugs.class).randomEnum();
        this.noteType = (NoteType) new RandomEnumGenerator(NoteType.class).randomEnum();
        this.cmVorHIV = (CMVorHIV) new RandomEnumGenerator(CMVorHIV.class).randomEnum();
        this.type = (Type) new RandomEnumGenerator(Type.class).randomEnum();
        this.value = (Value) new RandomEnumGenerator(Value.class).randomEnum();

        weight = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_WEIGHT, MAX_ELIGIBLE_WEIGHT);
        systolic = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_SYSTOLIC, MAX_ELIGIBLE_SYSTOLIC);
        diastolic = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_DIASTOLIC, MAX_ELIGIBLE_DIASTOLIC);
        wbc = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_WBC, MAX_ELIGIBLE_WBC);
        anc = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_ANC, MAX_ELIGIBLE_ANC);
        alc = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_ALC, MAX_ELIGIBLE_ALC);
        amc = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_AMC, MAX_ELIGIBLE_AMC);
        hb = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_HB, MAX_ELIGIBLE_HB);
        mcv = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_MCV, MAX_ELIGIBLE_MCV);
        mcv = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_PLATELETS, MAX_ELIGIBLE_PLATELETS);
        mcv = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_RETICULOCYTE, MAX_ELIGIBLE_RETICULOCYTE);
        sodium = NumberUtils.getRandomNumberInARange(MIN_SODIUM, MAX_SODIUM);
        potassium = NumberUtils.getRandomNumberInARange(MIN_POTASSIUM, MAX_POTASSIUM);
        calcium = NumberUtils.getRandomNumberInARange(MIN_CALCIUM, MAX_CALCIUM);
        sgptalt = NumberUtils.getRandomNumberInARange(MIN_SGPTALT, MAX_SGPTALT);
        totalBilirubin = NumberUtils.getRandomNumberInARange(MIN_TOTALBILIRUBIN, MAX_TOTALBILIRUBIN);
        creatinine = NumberUtils.getRandomNumberInARange(MIN_CREATININE, MAX_CREATININE);
        crp = NumberUtils.getRandomNumberInARange(MIN_CRP, MAX_CRP);
        cyclosporinLevelPeak = NumberUtils.getRandomNumberInARange(MIN_CYCLOSPORINLEVELPEAK, MAX_CYCLOSPORINLEVELPEAK);
        cyclosporineLevelTrough = NumberUtils.getRandomNumberInARange(MIN_CYCLOSPORINLEVELTROUGH, MAX_CYCLOSPORINLEVELTROUGH);
        tacrolimusPeakLevel = NumberUtils.getRandomNumberInARange(MIN_TACROLIMUS, MAX_TACROLIMUS);
        liver = NumberUtils.getRandomNumberInARange(MIN_LIVER, MAX_LIVER);

        this.shift = (Shift) new RandomEnumGenerator(Shift.class).randomEnum();
        this.mucositis = (Mucositis) new RandomEnumGenerator(Mucositis.class).randomEnum();
        this.drugs = (Drugs) new RandomEnumGenerator(Drugs.class).randomEnum();
        this.familyMember = (FamilyMember) new RandomEnumGenerator(FamilyMember.class).randomEnum();
        this.typingMethod = (TypingMethod) new RandomEnumGenerator(TypingMethod.class).randomEnum();
        this.transplantType = (TransplantType) new RandomEnumGenerator(TransplantType.class).randomEnum();
        this.transplantTypeForDonorWeight = (TransplantTypeForDonorWeight) new RandomEnumGenerator(TransplantTypeForDonorWeight.class).randomEnum();
        this.hlaTypingStatus = (HLATypingStatus) new RandomEnumGenerator(HLATypingStatus.class).randomEnum();
        this.oldTreatmentPlan = (OldTreatmentPlan) new RandomEnumGenerator(OldTreatmentPlan.class).randomEnum();
        this.cellSource = (CellSource) new RandomEnumGenerator(CellSource.class).randomEnum();
        this.role = (Role) new RandomEnumGenerator(Role.class).randomEnum();

        this.date = DateTimeUtils.getMinimumDate();
        this.dateOfConsent = DateTimeUtils.getFormattedDateForConsentForm();
        this.dateForBMT = DateTimeUtils.getFutureDateForBMT();
        this.futureDateFollowUp = DateTimeUtils.getFormattedFutureDate();
        this.todayDate = DateTimeUtils.getFormattedDate();
        this.presentTime = DateTimeUtils.getFormattedTime();
        this.expiryDateForDrug = DateTimeUtils.getFutureDate();
        this.hlaLaboratory = String.valueOf(System.nanoTime());
        this.pastDate = DateTimeUtils.getFormattedPastDate();
        this.pastDateForBloodProduct = DateTimeUtils.getFormattedPastDateForBloodProduct();

        return this;
    }

    public static UserData getData() {
        return new UserData();
    }
}
