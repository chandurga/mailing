package com.jagriti.bmtplus.pages.inventory.investigations;


import com.jagriti.bmtplus.pages.inventory.investigations.data.BMTStatus;
import com.jagriti.bmtplus.pages.inventory.investigations.data.Currency;
import com.jagriti.bmtplus.pages.inventory.investigations.data.Investigations;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class InvestigationData {

    private Investigations investigations;
    private Currency currency;
    private BMTStatus bmtStatus;

    InvestigationData(){
        setData();
    }

    public static InvestigationData getData(){
        return new InvestigationData();
    }

    private InvestigationData setData() {
        this.investigations = (Investigations) new RandomEnumGenerator(Investigations.class).randomEnum();
        this.currency = (Currency) new RandomEnumGenerator(Currency.class).randomEnum();
        this.bmtStatus = (BMTStatus) new RandomEnumGenerator(BMTStatus.class).randomEnum();

        return this;
    }
}
