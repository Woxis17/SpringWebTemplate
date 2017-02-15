package com.woxis.service;

import com.woxis.repository.UserLoginRepository;
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
    private UserLoginRepository userLoginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserLogin loadUserByUsername(String username) {
        return userLoginRepository.findByUsername(username);
    }

    public void addUser(UserLogin userLogin) throws DuplicateUsernameException{
        UserLogin ul = loadUserByUsername(userLogin.getUsername());
        if (ul != null) {
            throw new DuplicateUsernameException("This username arleady exist in database");
        }
        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLoginRepository.save(userLogin);
    }

    public UserLogin getUser(long id) {
        return userLoginRepository.findOne(id);
    }

    public UserLogin updateUser(UserLogin userLogin) {
        userLoginRepository.save(userLogin);
        return getUser(userLogin.getId());
    }


    public void delete(long id) {
        userLoginRepository.delete(getUser(id));
    }
}
