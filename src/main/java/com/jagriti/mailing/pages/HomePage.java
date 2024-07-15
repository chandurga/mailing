package com.jagriti.mailing.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends Page<HomePage> {
    private static final SelenideElement linkAddNewPatientRequest = $("a[class='menu_icon menu-1060 sf-depth-1 menuparent']");

    private HomePage() {
        super(HomePage.class);
    }
}