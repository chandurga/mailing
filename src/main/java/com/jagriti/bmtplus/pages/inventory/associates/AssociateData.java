package com.jagriti.bmtplus.pages.inventory.associates;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.miscellaneous.UserData;
import lombok.Data;

@Data
public class AssociateData {
    private String name;

    private AssociateData(){
        setData();
    }

    public static AssociateData getData(){
        return new AssociateData();
    }

    private AssociateData setData(){
        Faker fakerData = new Faker();
        this.name = fakerData.name().fullName();

        return this;
    }
}
