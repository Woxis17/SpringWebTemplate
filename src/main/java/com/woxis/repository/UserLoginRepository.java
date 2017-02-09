package com.woxis.repository;

import com.woxis.model.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Robert on 09-Feb-17.
 */
public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

    UserLogin findByUsername(String username);

}
