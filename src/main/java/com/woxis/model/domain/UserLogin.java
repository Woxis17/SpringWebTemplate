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
    private String authorities;

    public UserLogin() {}

    public UserLogin(String username, String password, String authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

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

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}
