package com.woxis.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Created by Robert on 05-Jan-17.
 */
@Repository
public class PersonDAOImpl {

    @PostConstruct
    private void init() {
        System.out.println("HELLO: PersonDAOImpl");
    }


}
