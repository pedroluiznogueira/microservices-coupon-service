package com.github.pedroluiznogueira.microservices.couponservice.controller;

import com.github.pedroluiznogueira.microservices.couponservice.model.Coupon;
import com.github.pedroluiznogueira.microservices.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupons")
public class CouponRestController {

    @Autowired
    private CouponRepository couponRepository;

    @PostMapping("/create")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping("/find/code/{code}")
    public Coupon findCouponByCode(@PathVariable ("code") String code) {
        return couponRepository.findCouponByCode(code);
    }
}
