package com.jagriti.mailing.cookie;

import com.jagriti.mailing.pages.login.LoginAPI;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Cookie;

import static com.jagriti.mailing.user.Role.SITE_ADMIN;


/**
 * Env configuration once loaded, is to remain constant for all classes using it. Thus we will
 * follow Singleton design pattern here. For future reference on this topic:
 * https://github.com/lightbend/config
 */
@Slf4j
public class CookieSingleton {
    /**
     * With this approach, we are relying on JVM to create the unique instance of TestEnvFactory when
     * the class is loaded. The JVM guarantees that the instance will be created before any thread
     * accesses the static uniqueInstance variable. This code is thus guaranteed to be thread safe.
     */
    private static final CookieSingleton UNIQUE_INSTANCE = new CookieSingleton();
    private Cookie cookie;

    /** Convenience method using SITE_ADMIN **/
    private CookieSingleton() {
        cookie = (Cookie) LoginAPI.getCookie(SITE_ADMIN);
    }

    public static CookieSingleton getInstance() {
        return UNIQUE_INSTANCE;
    }

    public Cookie getCookie() {
        return cookie;
    }
}
