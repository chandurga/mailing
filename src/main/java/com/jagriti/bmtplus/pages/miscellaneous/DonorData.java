package com.jagriti.bmtplus.pages.miscellaneous;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb.*;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.DateTimeUtilsForEbb;
import com.jagriti.bmtplus.utils.NumberUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

import static com.jagriti.bmtplus.pages.miscellaneous.ScanTheBloodProductPage.patientRegistrationID;

@Data
// @Builder
public class DonorData {

  private String donorTypeForPartial;

  private String donorTypeForFull;

  private String donorTypeAsNull;

  private ComponentToBePrepared component;

  private String componentToBePrepared;

  private String componentToPreparedForBagChange;

  private TypeOfDonor typeOfDonor;

  private String uniqueDonorRegistrationID;

  private String name;

  private BloodGroupType bloodGroupType;

  private String bloodGroup;

  private DonationLocation donationLocation;

  private Gender gender;

  private NumberOfDonations numberOfDonations;

  private int weightOfDonor;

  private String dateOfBloodCollection;

  private int ageOfDonor;

  private int inEligibleAge;

  private int BloodPressureOfDonor;

  private String timeOfBloodCollection;

  private int systolic;

  private int diastolic;

  private int inEligibleSystolic;

  private int inEligibleDiastolic;

  private TypeOfBag typeOfBag;

  private Occupation occupation;

  private String district;

  private State state;

  private String mobile;

  private String dateOfDiscard;

  private Technician technician;

  private String bloodGroupForReusableDonor;

  private String bagNumber;

  private String email;

  private String street;

  private String city;

  private int pinCode;

  private String segmentNumber;

  private int serumProteinLevel;

  private int WBCDifferentialCount;

  private int HCT;

  private int plateletCount;

  private int neutrophilsCount;

  private DeferralReason deferralReason;

  private String patientForNegativeScript;

  private Compatibility compatibility;

  private String uniquePatientRequestID;

  private int ipNumber;

  private Hospital hospital;

  DonorData() {
    setData();
  }

  public static DonorData getData() {
    return new DonorData();
  }

  private DonorData setData() {
    Faker fakeData = new Faker();

    final int MIN_ELIGIBLE_WEIGHT = 45;
    final int MAX_ELIGIBLE_WEIGHT = 110;
    final int MIN_ELIGIBLE_AGE = 18;
    final int MAX_ELIGIBLE_AGE = 60;
    final int MIN_INELIGIBLE_AGE = 60;
    final int MAX_INELIGIBLE_AGE = 100;
    final int MIN_ELIGIBLE_SYSTOLIC = 110;
    final int MAX_ELIGIBLE_SYSTOLIC = 150;
    final int MIN_ELIGIBLE_DIASTOLIC = 60;
    final int MAX_ELIGIBLE_DIASTOLIC = 90;
    final int MIN_INELIGIBLE_SYSTOLIC = 150;
    final int MAX_INELIGIBLE_SYSTOLIC = 200;
    final int MIN_INELIGIBLE_DIASTOLIC = 90;
    final int MAX_INELIGIBLE_DIASTOLIC = 110;

    final int MIN_SERUM_PROTEIN_LEVEL = 6;
    final int MAX_SERUM_PROTEIN_LEVEL = 8;
    final int MIN_WBC_DIFFERENTIAL_COUNT = 4000;
    final int MAX_WBC_DIFFERENTIAL_COUNT = 10000;
    final int MIN_HCT = 41;
    final int MAX_HCT = 48;
    final int MIN_PLATELET_COUNT = 150000;
    final int MAX_PLATELET_COUNT = 450000;
    final int MIN_NEUTROPHILS_COUNT = 2500;
    final int MAX_NEUTROPHILS_COUNT = 7000;
    final int MIN_INTEGER_COUNT = 10000;
    final int MAX_INTEGER_COUNT = 90000;

    final String BLOOD_GROUP_FOR_REUSABLE_DONOR = "A1 Pos";
    final String DONOR_TYPE_FOR_PARTIAL = "Partial";
    final String DONOR_TYPE_FOR_FULL = "Full";
    final String DONOR_TYPE_AS_NULL = "_none";
    final String COMPONENT_TO_BE_PREPARED = "WB";
    final String BLOOD_GROUP = "_none";
    final String EMAIL = "sample@gmail.com";
    final String PATIENT_FOR_NEGATIVE_SCRIPT = patientRegistrationID;

    this.donorTypeForPartial = DONOR_TYPE_FOR_PARTIAL;
    this.donorTypeForFull = DONOR_TYPE_FOR_FULL;
    this.donorTypeAsNull = DONOR_TYPE_AS_NULL;
    this.componentToBePrepared = COMPONENT_TO_BE_PREPARED;
    this.bloodGroup = BLOOD_GROUP;
    this.bloodGroupForReusableDonor = BLOOD_GROUP_FOR_REUSABLE_DONOR;
    this.email = EMAIL;
    this.pinCode = 533436;

    this.patientForNegativeScript = PATIENT_FOR_NEGATIVE_SCRIPT;
    this.uniquePatientRequestID = String.valueOf(System.nanoTime());
    this.ipNumber = NumberUtils.getRandomNumberInARange(MIN_INTEGER_COUNT,MAX_INTEGER_COUNT);


    this.typeOfDonor = (TypeOfDonor) new RandomEnumGenerator(TypeOfDonor.class).randomEnum();
    this.name = fakeData.name().fullName();
    this.street = fakeData.address().streetName();
    this.city = fakeData.address().cityName();
    this.uniqueDonorRegistrationID = String.valueOf(System.nanoTime());
    this.bagNumber = String.valueOf(System.nanoTime());
    this.gender = (Gender) new RandomEnumGenerator(Gender.class).randomEnum();
    this.bloodGroupType =
        (BloodGroupType) new RandomEnumGenerator(BloodGroupType.class).randomEnum();
    this.donationLocation =
        (DonationLocation) new RandomEnumGenerator(DonationLocation.class).randomEnum();
    this.numberOfDonations =
        (NumberOfDonations) new RandomEnumGenerator(NumberOfDonations.class).randomEnum();
    this.typeOfBag = (TypeOfBag) new RandomEnumGenerator(TypeOfBag.class).randomEnum();
    this.occupation = (Occupation) new RandomEnumGenerator(Occupation.class).randomEnum();
    this.state = (State) new RandomEnumGenerator(State.class).randomEnum();
    this.district = fakeData.address().cityName();
    String randomNumbers = RandomStringUtils.randomNumeric(9);
    this.mobile = 9 + randomNumbers;
    this.segmentNumber = String.valueOf(System.nanoTime());
    this.technician = (Technician) new RandomEnumGenerator(Technician.class).randomEnum();
    this.component =
        (ComponentToBePrepared) new RandomEnumGenerator(ComponentToBePrepared.class).randomEnum();
    this.deferralReason = (DeferralReason) new RandomEnumGenerator(DeferralReason.class).randomEnum();
    this.compatibility = (Compatibility) new RandomEnumGenerator(Compatibility.class).randomEnum();
    this.hospital = (Hospital) new RandomEnumGenerator(Hospital.class).randomEnum();

    weightOfDonor = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_WEIGHT, MAX_ELIGIBLE_WEIGHT);
    ageOfDonor = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_AGE, MAX_ELIGIBLE_AGE);
    inEligibleAge = NumberUtils.getRandomNumberInARange(MIN_INELIGIBLE_AGE, MAX_INELIGIBLE_AGE);
    dateOfBloodCollection = DateTimeUtilsForEbb.getFormattedDate();
    timeOfBloodCollection = DateTimeUtilsForEbb.getFormattedTime();
    systolic = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_SYSTOLIC, MAX_ELIGIBLE_SYSTOLIC);
    diastolic = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_DIASTOLIC, MAX_ELIGIBLE_DIASTOLIC);
    inEligibleSystolic =
        NumberUtils.getRandomNumberInARange(MIN_INELIGIBLE_SYSTOLIC, MAX_INELIGIBLE_SYSTOLIC);
    inEligibleDiastolic =
        NumberUtils.getRandomNumberInARange(MIN_INELIGIBLE_DIASTOLIC, MAX_INELIGIBLE_DIASTOLIC);
    serumProteinLevel =
        NumberUtils.getRandomNumberInARange(MIN_SERUM_PROTEIN_LEVEL, MAX_SERUM_PROTEIN_LEVEL);
    WBCDifferentialCount =
        NumberUtils.getRandomNumberInARange(MIN_WBC_DIFFERENTIAL_COUNT, MAX_WBC_DIFFERENTIAL_COUNT);
    HCT =
        NumberUtils.getRandomNumberInARange(MIN_HCT, MAX_HCT);
    plateletCount =
        NumberUtils.getRandomNumberInARange(MIN_PLATELET_COUNT, MAX_PLATELET_COUNT);
    neutrophilsCount =
        NumberUtils.getRandomNumberInARange(MIN_NEUTROPHILS_COUNT, MAX_NEUTROPHILS_COUNT);
    dateOfDiscard = DateTimeUtils.getFormattedDate();
    return this;
  }
}
