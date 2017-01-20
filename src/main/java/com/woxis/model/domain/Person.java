package com.woxis.model.domain;

import com.woxis.model.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by Robert on 05-Jan-17.
 */
@Entity
public class Person extends BaseEntity{

    private String name;
    private String surname;

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
