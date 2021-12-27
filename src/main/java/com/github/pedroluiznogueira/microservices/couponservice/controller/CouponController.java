package com.github.pedroluiznogueira.microservices.couponservice.controller;

import com.github.pedroluiznogueira.microservices.couponservice.model.Coupon;
import com.github.pedroluiznogueira.microservices.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/showCreateCoupon")
    public String showCreateCoupon() {
        return "createCoupon";
    }

    @PostMapping("/saveCoupon")
    public String saveCoupon(Coupon coupon) {
        couponRepository.save(coupon);
        return "createResponse";
    }
}
