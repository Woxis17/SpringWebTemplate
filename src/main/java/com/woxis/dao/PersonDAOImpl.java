package com.woxis.dao;

import com.woxis.model.domain.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Robert on 05-Jan-17.
 */
@Repository
public class PersonDAOImpl implements PersonDAO{

    public Person findById() {
        return null;
    }

    public List<Person> findAll() {
        return null;
    }

    public List<Person> findByName() {
        return null;
    }

    public List<Person> findBySurname() {
        return null;
    }

    @Transactional
    public boolean insertPerson(Person person) {
        System.out.println("insertPerson starts...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PM");

        EntityManager em = emf.createEntityManager();
        em.persist(person);

        System.out.println("insertPerson ends...");
        return true;
    }

    public boolean updatePerson(Person person) {
        return false;
    }

    public boolean deletePerson(Person person) {
        return false;
    }

}
