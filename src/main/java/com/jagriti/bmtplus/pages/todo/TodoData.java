package com.jagriti.bmtplus.pages.todo;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.todo.data.Progress;
import com.jagriti.bmtplus.pages.todo.data.Status;
import com.jagriti.bmtplus.pages.todo.data.Type;
import com.jagriti.bmtplus.utils.DateTimeUtils;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class TodoData {
    private String title;
    private String date;
    private Status status;
    private Progress progress;
    private Type type;

    private TodoData(){
        setData();
    }

    public static TodoData getData(){
        return new TodoData();
    }

    private TodoData setData() {
        Faker faker = new Faker();
        this.title = faker.name().fullName();
        this.date = DateTimeUtils.getFormattedDate();
        this.status = (Status) new RandomEnumGenerator(Status.class).randomEnum();
        this.progress = (Progress) new RandomEnumGenerator(Progress.class).randomEnum();
        this.type= (Type) new RandomEnumGenerator(Type.class).randomEnum();
        return this;
    }
}
