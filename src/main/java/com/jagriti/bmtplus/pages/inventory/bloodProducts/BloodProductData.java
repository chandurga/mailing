package com.jagriti.bmtplus.pages.inventory.bloodProducts;

import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.BloodComponent;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.BloodType;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.Investigations;
import com.jagriti.bmtplus.pages.inventory.bloodProducts.data.Physician;
import com.jagriti.bmtplus.pages.patients.patients.data.BloodProductType;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.NumberUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class BloodProductData {

    private String uniqueBloodProductNumber;
    private BloodComponent bloodComponent;
    private String bloodComponentForGranulocyte;
    private String receivedDateOfBloodProduct;
    private int nucleatedCellCount;
    private BloodType bloodType;
    private Investigations investigations;
    private Physician physician;
    private String futureDate;
    private String tomorrowDate;
    private String currentDate;
    private String currentTime;
    private String endTime;
    private BloodProductType bloodProductType;
    private String dateForBloodProduct;
    private String statusAsAvailable;
    private String statusAsUsed;
    private String bloodProductTypeForBoneMarrow;
    private String patientMode;
    private String center;
    private String sign;
    private String sign2;
    private String irradiationCenter;
    private int height;
    private String remarks;
    private int units;
    private long patientForBloodProduct;
    private String bloodProductTypeForDonorBoneMarrow;
    BloodProductData(){
        setData();
    }

    public static BloodProductData getData(){
        return new BloodProductData();
    }

    private BloodProductData setData() {
        final int MIN_ELIGIBLE_NUCLEATED = 4000;
        final int MAX_ELIGIBLE_NUCLEATED = 10000;

        this.uniqueBloodProductNumber = String.valueOf(System.nanoTime());

        this.statusAsAvailable = "Available";
        this.statusAsUsed = "Used";
        this.bloodComponentForGranulocyte = "Granulocyte - Irradiated@BMT Plus Dev Associate";
        this.bloodProductTypeForBoneMarrow = "BM Backup";
        this.patientMode = "Patient family";
        this.center = "Test Centre (TSA)";
        this.sign = "Arrhythmias";
        this.sign2 = "Circulatory";
        this.irradiationCenter = "test";
        this.height = 157;
        this.remarks = "Creating the order through clinical course";
        this.units = 10;
        this.patientForBloodProduct = 420677831389500L;
        this.bloodProductTypeForDonorBoneMarrow = "Stem Cell Boost BM";

        this.bloodComponent = (BloodComponent)new RandomEnumGenerator(BloodComponent.class).randomEnum();
        this.bloodType = (BloodType) new RandomEnumGenerator(BloodType.class).randomEnum();
        this.investigations = (Investigations) new RandomEnumGenerator(Investigations.class).randomEnum();
        this.physician = (Physician) new RandomEnumGenerator(Physician.class).randomEnum();
        this.bloodProductType = (BloodProductType) new RandomEnumGenerator(BloodProductType.class).randomEnum();

        this.receivedDateOfBloodProduct = DateTimeUtils.getFormattedDate();
        this.futureDate = DateTimeUtils.getFutureDate();
        this.currentDate = DateTimeUtils.getFormattedDate();
        this.currentTime = DateTimeUtils.getFormattedTimeForTransfusion();
        this.endTime = DateTimeUtils.getFormattedTimeForTransfusion();
        this.dateForBloodProduct = DateTimeUtils.getFormattedDateForConsentForm();
        this.tomorrowDate = DateTimeUtils.getFormattedTomorrowDate();

        this.nucleatedCellCount = NumberUtils.getRandomNumberInARange(MIN_ELIGIBLE_NUCLEATED, MAX_ELIGIBLE_NUCLEATED);

        return this;
    }
}
