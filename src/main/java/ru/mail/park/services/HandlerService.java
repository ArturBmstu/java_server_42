package ru.mail.park.services;

import org.springframework.stereotype.Service;

@Service
public class HandlerService {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
