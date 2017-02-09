package com.woxis.service;

import com.woxis.dao.UserLoginDAO;
import com.woxis.model.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by robertz on 02/02/2017.
 */
@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginDAO userLoginDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserLogin loadUserByUsername(String username) {
        return userLoginDAO.findByUsername(username);
    }

    /* TODO check duplicates */
    public void addUser(UserLogin userLogin) {
        //throws WrongUserCredentialsException,DuplicatedCredentialsException
        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLoginDAO.save(userLogin);
    }

    public UserLogin getUser(long id) {
        return userLoginDAO.findOne(id);
    }

    /* TODO */
    public UserLogin updateUser(UserLogin userLogin) {

        //sessionFactory.getCurrentSession().update(userLogin);
        return getUser(userLogin.getId());
    }

    /* TODO */
    public boolean delete(long id) {
        // sessionFactory.getCurrentSession().delete(getUser(id));
        return true;
    }
}
