package com.github.pedroluiznogueira.microservices.couponservice.security;

import com.github.pedroluiznogueira.microservices.couponservice.model.User;
import com.github.pedroluiznogueira.microservices.couponservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    // will be used by AuthenticationProvider
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(username);
        if (user == null) throw new UsernameNotFoundException("User not found for email " + username);

        // spring security User
        return new org.springframework.security.core.userdetails.User(
                username,
                user.getPassword(),
                user.getRoles()
        );
    }
}
