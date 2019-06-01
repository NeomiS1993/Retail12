package com.retail.springbootretailapplication.service;

import org.springframework.validation.annotation.Validated;


import com.retail.springbootretailapplication.Model.Product;

@Validated
public interface ProductService {
	Product getProduct(long id);
	
	Product save(Product product);
}
