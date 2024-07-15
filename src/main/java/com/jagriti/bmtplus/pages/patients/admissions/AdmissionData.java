package com.jagriti.bmtplus.pages.patients.admissions;

import com.jagriti.bmtplus.pages.patients.admissions.data.DepartmentsVisited;
import com.jagriti.bmtplus.pages.patients.admissions.data.Reason2;
import com.jagriti.bmtplus.pages.patients.admissions.data.Reason3;
import com.jagriti.bmtplus.pages.patients.admissions.data.ReasonForAdmission;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class AdmissionData {
    private DepartmentsVisited departmentsVisited;
    private ReasonForAdmission reasonForAdmission;
    private Reason2 reason2;
    private Reason3 reason3;
    AdmissionData(){
        setData();
    }

    public static AdmissionData getData(){
        return new AdmissionData();
    }

    private AdmissionData setData() {
        this.departmentsVisited =(DepartmentsVisited) new RandomEnumGenerator(DepartmentsVisited.class).randomEnum();
        this.reasonForAdmission =(ReasonForAdmission) new RandomEnumGenerator(ReasonForAdmission.class).randomEnum();
        this.reason2 =(Reason2) new RandomEnumGenerator(Reason2.class).randomEnum();
        this.reason3 =(Reason3) new RandomEnumGenerator(Reason3.class).randomEnum();
        return this;
    }
}
