package com.jagriti.bmtplus.pages.login;

import com.codeborne.selenide.WebDriverRunner;
import com.jagriti.bmtplus.config.TestEnvFactory;
import com.jagriti.bmtplus.user.Role;
import com.jagriti.bmtplus.user.User;
import com.typesafe.config.Config;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Cookie;

@Slf4j
public class LoginAPI {
    private static final Config CONFIG = TestEnvFactory.getInstance().getConfig();

    public static Response getResponse(User user) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri(CONFIG.getString("LOGIN_URL"))
                .body(user)
                .log().ifValidationFails()
                .when()
                .post("/user/login?_format=json")
                .then()
                .log().ifError().extract().response();
    }

    public static Cookie getCookie(Role role) {
        log.info("Cookies before login: {}", WebDriverRunner.getWebDriver().manage().getCookies());

        User user = new User(role);
        Response response = getResponse(user);

        String userCookieName = CONFIG.getString(role.toString() + "_COOKIE");
        return new Cookie(userCookieName, response.cookie(userCookieName));
    }
}
