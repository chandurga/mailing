package com.jagriti.bmtplus.user;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jagriti.bmtplus.config.TestEnvFactory;
import com.typesafe.config.Config;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class User {
    protected static final Config CONFIG = TestEnvFactory.getInstance().getConfig();

    @JsonProperty("name")
    private String username;

    @JsonProperty("pass")
    private String password;

    public User(Role role) {
        switch (role) {
            case SITE_ADMIN:
                setAsSiteAdmin();
                break;
            default:
                throw new IllegalStateException(String.format("%s role is not defined. Pick your roles from %s.", role, Role.values()));
        }
    }

    public void setAsSiteAdmin() {
        this.username = CONFIG.getString("SITE_ADMIN_USERNAME");
        this.password = CONFIG.getString("SITE_ADMIN_PASSWORD");
    }
}
