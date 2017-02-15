package com.woxis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robert on 06-Jan-17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
