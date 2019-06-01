package com.retail.springbootretailapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retail.springbootretailapplication.Exception.ResourceNotFoundException;
import com.retail.springbootretailapplication.Model.OrderProduct;
import com.retail.springbootretailapplication.repository.OrderProductRepository;

@Transactional
@Service
public class OrderProductServiceImpl implements OrderProductService{
	private OrderProductRepository orderProductRepository;
	@Override
	public OrderProduct getOrderProduct(long id) {
        return orderProductRepository
        		.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
          
   
    }
	@Override
	   public OrderProduct save(OrderProduct orderProduct) {
	        return orderProductRepository.save(orderProduct);
	      
}

}
