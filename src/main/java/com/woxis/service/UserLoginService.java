package com.woxis.service;

import com.woxis.model.domain.UserLogin;

/**
 * Created by robertz on 02/02/2017.
 */
public interface UserLoginService {

    UserLogin loadUserByUsername(String username);

    void addUser(UserLogin userLogin) throws DuplicateUsernameException;

    UserLogin getUser(long id);

    UserLogin updateUser(UserLogin userLogin);

    void delete(long id);

}
