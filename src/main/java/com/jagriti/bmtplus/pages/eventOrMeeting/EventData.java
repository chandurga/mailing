package com.jagriti.bmtplus.pages.eventOrMeeting;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.eventOrMeeting.data.Tags;
import com.jagriti.bmtplus.pages.inventory.transactions.data.TransactionType;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class EventData {
    private String title;
    private Tags tags;
    private String date;

    private EventData(){
        setData();
    }

    public static EventData getData(){
        return new EventData();
    }

    private EventData setData() {
        Faker faker = new Faker();
        this.title = faker.name().fullName();
        this.tags = (Tags) new RandomEnumGenerator(Tags.class).randomEnum();
        this.date = DateTimeUtils.getFutureDateForRecurringDate();
        return this;
    }
}
