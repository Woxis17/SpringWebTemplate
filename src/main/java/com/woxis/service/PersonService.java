package com.woxis.service;

import com.woxis.dao.PersonDAO;
import com.woxis.model.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Robert on 20-Jan-17.
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    public void insertPerson(Person person) {
        personDAO.insertPerson(person);
    }
}
