package com.retail.springbootretailapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.retail.springbootretailapplication.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
