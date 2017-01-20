package com.woxis.dao;

import com.woxis.model.domain.Person;

import java.util.List;

/**
 * Created by Robert on 05-Jan-17.
 */
public interface PersonDAO {

    Person findById();
    List<Person> findAll();
    List<Person> findByName();
    List<Person> findBySurname();

    boolean insertPerson(Person person);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
}
