package com.woxis.model.domain;

import com.woxis.model.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by robertz on 12/01/2017.
 */
@Entity
public class UserLogin extends BaseEntity {

    private String username;
    private String password;

    public UserLogin() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
