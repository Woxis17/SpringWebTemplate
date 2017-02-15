package com.woxis.service;

/**
 * Created by robertz on 15/02/2017.
 */
public class DuplicateUsernameException extends Exception {
    public DuplicateUsernameException(String msg) {
        super(msg);
    }
}
