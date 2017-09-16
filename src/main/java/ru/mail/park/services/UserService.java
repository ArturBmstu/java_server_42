package ru.mail.park.services;

import org.springframework.stereotype.Service;
import ru.mail.park.info.UserInfo;
import ru.mail.park.info.UserSignupInfo;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public ArrayList<UserInfo> userList;

    public UserService() {
        userList = new ArrayList<UserInfo>();
    }

    public String getHello() {
        return "HELLO";
    }

    public ArrayList<UserInfo> getUserList() {
        return userList;
    }

    public boolean addUser(UserSignupInfo userSignupInfo) {
        UserInfo userInfo = new UserInfo(
                userSignupInfo.getUsername(),
                userSignupInfo.getEmail(),
                userSignupInfo.getPassword()
        );
        userList.add(userInfo);
        return true;
    }
}
