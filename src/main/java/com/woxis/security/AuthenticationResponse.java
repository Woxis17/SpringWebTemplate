package com.woxis.security;

/**
 * Created by robertz on 03/02/2017.
 */
public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse() {}

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
