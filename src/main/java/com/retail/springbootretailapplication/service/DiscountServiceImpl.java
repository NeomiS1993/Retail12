package com.retail.springbootretailapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retail.springbootretailapplication.Exception.ResourceNotFoundException;
import com.retail.springbootretailapplication.Model.Discount;
import com.retail.springbootretailapplication.repository.DiscountRepository;

@Transactional
@Service
public class DiscountServiceImpl implements DiscountService{
	private DiscountRepository discountRepository;
	@Override
	public Discount getDiscount(long id) {
        return discountRepository
        		.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
   
    }
	@Override
	   public Discount save(Discount discount) {

	        return discountRepository.save(discount); 
}
	@Override
	public Iterable<Discount> getAllDiscount() {
        return discountRepository
        		.findAll();
   
    }
}
