package ru.mail.park.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mail.park.generics.ResponseBody;
import ru.mail.park.info.UserSignupInfo;

@RestController
@RequestMapping(path = "/auth")
public class UserController {

    private HandlerService handlerService;

    @Autowired
    private UserService userService;

//    public UserController(UserService userService, HandlerService handlerService) {
//        this.userService = userService;
//        this.handlerService = handlerService;
//    }

    @GetMapping("/user")
    public String getUser() {
        return "{\"user\":\"user_name\"}";
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signupUser(@RequestBody UserSignupInfo userSignupInfo)//(@RequestParam String username, @RequestParam String email, @RequestParam String password, @RequestParam String passRepeated)
    {

        //UserSignupInfo userSignupInfo = new UserSignupInfo(username, email, password, passRepeated);
        if(userService.addUser(userSignupInfo))
            return new ResponseEntity<String>("OK", HttpStatus.OK);
        else
            return new ResponseEntity<String>("NOT OK", HttpStatus.FORBIDDEN);
    }

    @GetMapping("/users")
    public ResponseEntity<Integer> usersNumber() {
        return new ResponseEntity<Integer>(userService.getUserList().size(), HttpStatus.OK);
    }

}


