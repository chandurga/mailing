package com.jagriti.mailing.user;

public enum Role {
    SITE_ADMIN("Site admin"),
    CENTRE_ADMIN("Centre Admin"),
    TECHNICIAN("Technician"),
    DATA_ENTRY_OPERATOR("Data entry operator");

    Role(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
