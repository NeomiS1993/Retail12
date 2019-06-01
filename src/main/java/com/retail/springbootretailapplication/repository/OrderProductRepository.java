package com.retail.springbootretailapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.retail.springbootretailapplication.Model.OrderProduct;;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Long>{

}
