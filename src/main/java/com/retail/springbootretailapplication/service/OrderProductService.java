package com.retail.springbootretailapplication.service;

import org.springframework.validation.annotation.Validated;

import com.retail.springbootretailapplication.Model.OrderProduct;

@Validated
public interface OrderProductService {
OrderProduct getOrderProduct(long id);
	
	OrderProduct save(OrderProduct orderProduct);
}
