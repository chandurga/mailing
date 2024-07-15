package com.jagriti.bmtplus.pages.inventory.items;

import com.github.javafaker.Faker;
import com.jagriti.bmtplus.pages.inventory.items.data.Category;
import com.jagriti.bmtplus.pages.inventory.items.data.DrugListCategory;
import com.jagriti.bmtplus.pages.inventory.items.data.ItemTag;
import com.jagriti.bmtplus.pages.inventory.items.data.PreferredVendor;
import com.jagriti.bmtplus.utils.RandomEnumGenerator;
import lombok.Data;

@Data
public class ItemData {

    private String name;
    private Category category;
    private ItemTag itemTag;
    private DrugListCategory drugListCategory;
    private PreferredVendor preferredVendor;

    private ItemData(){
        setData();
    }

    public static ItemData getData(){
        return new ItemData();
    }

    private ItemData setData() {
        Faker fakerData = new Faker();
        this.name = fakerData.name().fullName();

        this.category = (Category) new RandomEnumGenerator(Category.class).randomEnum();
        this.itemTag = (ItemTag) new RandomEnumGenerator(ItemTag.class).randomEnum();
        this.drugListCategory = (DrugListCategory) new RandomEnumGenerator(DrugListCategory.class).randomEnum();
        this.preferredVendor = (PreferredVendor) new RandomEnumGenerator(PreferredVendor.class).randomEnum();

        return this;
    }
}
