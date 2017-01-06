package com.woxis.factory;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Robert on 05-Jan-17.
 */
@Service
public class PersonFactory {

    @PostConstruct
    private void init() {
        System.out.println("HELLO: PersonFactory");
    }
}
