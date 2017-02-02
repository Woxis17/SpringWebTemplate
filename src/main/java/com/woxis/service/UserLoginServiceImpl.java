package com.woxis.service;

import com.woxis.model.domain.UserLogin;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by robertz on 02/02/2017.
 */
@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private SessionFactory sessionFactory;

    public UserLogin loadUserByUsername(String username) {
        return (UserLogin) sessionFactory.getCurrentSession()
                .createCriteria(UserLogin.class)
                .add(Restrictions.eq("username", username))
                .uniqueResult();
    }

    public void addUser(UserLogin userLogin) {
        sessionFactory.getCurrentSession().save(userLogin);
    }

    public UserLogin getUser(long id) {
        return sessionFactory.getCurrentSession().get(UserLogin.class, id);
    }

    public UserLogin updateUser(UserLogin userLogin) {
        sessionFactory.getCurrentSession().update(userLogin);
        return getUser(userLogin.getId());
    }

    public boolean delete(long id) {
        sessionFactory.getCurrentSession().delete(getUser(id));
        return true;
    }
}
