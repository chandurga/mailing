package com.jagriti.bmtplus.pages.inventory.bloodProducts.data;

public enum BloodComponent {
//    NONE("-None-"), It is a mandatory value
    BUFFY("Buffy Coat@Associate5138"),
    DONOR_LYMPHOCYTE_INFUSION_DLI_ASSOCIATE("Donor lymphocyte infusion (DLI)@Associate71"),
    DONOR_LYMPHOCYTE_INFUSION_DLI_Associate6509("Donor lymphocyte infusion (DLI)@Associate6509"),
    PRBC_IRRADIATED_ALIQUOTED_TEST_SUPPLIER("PRBC - IRRADIATED - ALIQUOTED@Test Supplier");

    private final String text;

    BloodComponent(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
