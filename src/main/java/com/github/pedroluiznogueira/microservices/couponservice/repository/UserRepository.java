package com.github.pedroluiznogueira.microservices.couponservice.repository;

import com.github.pedroluiznogueira.microservices.couponservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}
