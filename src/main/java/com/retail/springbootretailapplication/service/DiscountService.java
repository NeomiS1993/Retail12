package com.retail.springbootretailapplication.service;

import org.springframework.validation.annotation.Validated;

import com.retail.springbootretailapplication.Model.Discount;

@Validated
public interface DiscountService {
Discount getDiscount(long id);
public Iterable<Discount> getAllDiscount();	
public Discount save(Discount discount);
}
