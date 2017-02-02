package com.woxis.controller;

import com.woxis.model.domain.UserLogin;
import com.woxis.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robert on 06-Jan-17.
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> addUser() {
        UserLogin userLogin = userLoginService.getUser(2);
        return ResponseEntity.ok(userLogin);
    }


}
