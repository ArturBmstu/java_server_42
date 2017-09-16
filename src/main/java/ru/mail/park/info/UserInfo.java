package ru.mail.park.info;

public class UserInfo {
    private String username;
    private String email;
    private String password;

    public UserInfo(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
