package com.woxis.controller;

import com.woxis.model.domain.UserLogin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Robert on 06-Jan-17.
 */
@RestController
public class MainController {

    @PostConstruct
    private void init() {
        System.out.println("HELLO: MainController");
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home endpoint");
        return "home.jsp";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    private String hello() {
        return "hello";
    }

    @RequestMapping(path = "/adduser", method = RequestMethod.POST)
    private void addUser(@RequestBody UserLogin user) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

}
