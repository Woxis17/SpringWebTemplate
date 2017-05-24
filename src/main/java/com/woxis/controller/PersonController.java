package com.woxis.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robert on 05-Jan-17.
 */
@RestController
@RequestMapping("/api")
public class PersonController {


    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public String hello() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        System.out.println("##### username: " + name);

        return "hello";
    }

    @RequestMapping(path = "/nothing", method = RequestMethod.GET)
    public String nothing() {

        return "nothing";
    }


}
