package com.retail.springbootretailapplication.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retail.springbootretailapplication.Exception.ResourceNotFoundException;
import com.retail.springbootretailapplication.Model.Product;
import com.retail.springbootretailapplication.repository.ProductRepository;

@Transactional
@Service
public class ProductServiceImpl implements ProductService{
private ProductRepository productRepository;
	
	@Override
	public Product getProduct(long id) {
        return productRepository
        		.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
          
   
    }
	@Override
	   public Product save(Product product) {
	        return productRepository.save(product);
	      
}

	
}