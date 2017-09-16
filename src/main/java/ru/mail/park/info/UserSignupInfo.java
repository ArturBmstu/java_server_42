package ru.mail.park.info;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSignupInfo {
    private final String username;
    private final String email;
    private final String password;
    private final String passRepeated;

    @JsonCreator
    public UserSignupInfo(
            @JsonProperty(value = "username", required = true) String username,
            @JsonProperty(value = "email", required = true) String email,
            @JsonProperty(value = "password", required = true) String password,
            @JsonProperty(value = "passRepeated", required = true) String passRepeated
    )
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passRepeated = passRepeated;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPassRepeated() {
        return passRepeated;
    }
}
