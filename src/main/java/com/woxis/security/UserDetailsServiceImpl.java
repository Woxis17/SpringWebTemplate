package com.woxis.security;

import com.woxis.model.domain.UserLogin;
import com.woxis.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by robertz on 03/02/2017.
 */
@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserLoginService userLoginService;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLogin userLogin = userLoginService.loadUserByUsername(username);

        System.out.println("### userLoginService + userLogin: " + userLogin + " ###");

        if(userLogin == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s", username));
        } else {
            System.out.println("### userLoginService + userLogin: " + userLogin + " ###");
            return new SpringSecurityUser(
                    userLogin.getId(),
                    userLogin.getUsername(),
                    userLogin.getPassword(),
                    null,
                    null,
                    AuthorityUtils.commaSeparatedStringToAuthorityList(userLogin.getAuthorities())
            );
        }
    }
}
