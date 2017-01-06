package com.woxis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by Robert on 06-Jan-17.
 */
@Controller
public class MainController {

    @PostConstruct
    private void init() {
        System.out.println("HELLO: MainController");
    }

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    private String hello() {
        return "hello";
    }

}
