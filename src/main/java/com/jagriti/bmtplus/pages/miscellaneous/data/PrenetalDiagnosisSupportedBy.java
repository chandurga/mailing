package com.jagriti.bmtplus.pages.miscellaneous.data;

public enum PrenetalDiagnosisSupportedBy {
    NONE("- None -"),
    DKMS("DKMS"),
    PAKISTAN_BALT_UL_MAL("Pakistan Bait-ul-Mal"),
    RTD("RTD"),
    SELF("Self"),
    PIDSA("PIDSA"),
    RAJASTHAN_GOVERNMENT("Rajasthan government"),
    CURE_2_CHILDREN("Cure2Children"),
    HEARTFILE("Heartfile"),
    OTHER("Other");

    private final String text;

    PrenetalDiagnosisSupportedBy(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
