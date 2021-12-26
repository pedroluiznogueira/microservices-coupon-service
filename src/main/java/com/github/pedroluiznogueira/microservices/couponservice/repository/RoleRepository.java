package com.github.pedroluiznogueira.microservices.couponservice.repository;

import com.github.pedroluiznogueira.microservices.couponservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
