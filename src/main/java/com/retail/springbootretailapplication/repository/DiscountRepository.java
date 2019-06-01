package com.retail.springbootretailapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.retail.springbootretailapplication.Model.Discount;

@Repository
public interface DiscountRepository extends CrudRepository<Discount, Long>{

}
