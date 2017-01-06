package com.woxis.controller;

import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by Robert on 05-Jan-17.
 */
@Controller
public class PersonService {


    @PostConstruct
    private void init() {
        System.out.println("HELLO: PersonService");
    }
}
