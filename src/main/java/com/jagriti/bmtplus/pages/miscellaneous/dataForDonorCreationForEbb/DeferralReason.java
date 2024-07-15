package com.jagriti.bmtplus.pages.miscellaneous.dataForDonorCreationForEbb;

public enum DeferralReason {
    //_none Deferral reason is a mandatory field when we select deferral status as Permanently Deferred or Temporarily Deferred
    ON_MEDICATION("On Medication"),
    AILMENT_LEADING_TO_PERMANENT_DEFERRAL("Ailment leading to Permanent Deferral"),
    AILMENT_LEADING_TO_TEMPORARY_DEFERRAL("Ailment leading to Temporary Deferral"),
    MEDICALLY_UNFIT_ON_EXAMINATION("Medically Unfit on Examination"),
    SEXUAL_RISK_BEHAVIOR("Sexual Risk Behavior"),
    OTHERS("Others");

    DeferralReason(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
