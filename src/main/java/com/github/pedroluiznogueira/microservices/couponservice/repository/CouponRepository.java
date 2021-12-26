package com.github.pedroluiznogueira.microservices.couponservice.repository;

import com.github.pedroluiznogueira.microservices.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Coupon findCouponByCode(String code);
}
