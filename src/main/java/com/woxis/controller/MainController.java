package com.woxis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robert on 06-Jan-17.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello";
    }



}
