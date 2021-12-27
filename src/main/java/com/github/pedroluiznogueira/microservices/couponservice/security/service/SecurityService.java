package com.github.pedroluiznogueira.microservices.couponservice.security.service;

public interface SecurityService {

    boolean login(String userName, String password);
}
