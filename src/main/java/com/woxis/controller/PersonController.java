package com.woxis.controller;

import com.woxis.model.domain.Person;
import com.woxis.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Robert on 05-Jan-17.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

        /* TODO add logger */
    /* TODO use services */

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST)
    public void insertPerson(@RequestBody Person p) {
        System.out.println("Wywołano insertPerson REST ");
        personService.insertPerson(p);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPerson() {
        return "getting person";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updatePerson() {
        return "updating person";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deletePerson() {
        return "deleting person";
    }


}
