package com.jagriti.bmtplus.pages.inventory.transactions;

import com.jagriti.bmtplus.pages.inventory.transactions.data.TransactionType;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

import java.util.Random;

@Data
public class TransactionsData {
    private String date;
    private TransactionType transactionType;
    private int batchNumber;
    private int quantity;
    private String expiryDate;
    private int itemPerCost;
    private int mrp;

    private TransactionsData(){
        setData();
    }

    public static TransactionsData getData(){
        return new TransactionsData();
    }

    private TransactionsData setData() {
        Random random = new Random();
        this.batchNumber = random.nextInt(50);
        this.quantity = (int) (Math.random()*(2500-3000)) + 2500;
        this.itemPerCost = (int) (Math.random()*(15-27)) + 15;
        this.mrp = (int) (Math.random()*(30-37)) + 35;
        this.date = DateTimeUtils.getFormattedDate();

        this.transactionType = (TransactionType) new RandomEnumGenerator(TransactionType.class).randomEnum();

        this.expiryDate = DateTimeUtils.getFutureDate();
        return this;
    }
}
