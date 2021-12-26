package com.github.pedroluiznogueira.microservices.couponservice.security.config;

import com.github.pedroluiznogueira.microservices.couponservice.security.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // manager component
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // provider component
        auth.userDetailsService(userDetailsService);
    }

    // configure how and wich urls access api
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http
            .authorizeRequests()
            .mvcMatchers(HttpMethod.GET, "/coupons/find/{code}")
            .hasAnyRole("USER", "ADMIN")
            .mvcMatchers(HttpMethod.POST, "/coupons/create")
            .hasRole("ADMIN")
            .and()
            .csrf()
            .disable();
    }
}