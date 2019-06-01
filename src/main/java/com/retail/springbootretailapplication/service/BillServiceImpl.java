package com.retail.springbootretailapplication.service;
import org.springframework.transaction.annotation.Transactional;
import com.retail.springbootretailapplication.Exception.ResourceNotFoundException;
import com.retail.springbootretailapplication.Model.Bill;
import com.retail.springbootretailapplication.Model.Discount;
import com.retail.springbootretailapplication.Model.OrderProduct;
import com.retail.springbootretailapplication.Model.User;
import com.retail.springbootretailapplication.repository.BillRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;




@Transactional
@Service
public class BillServiceImpl implements BillService {
	private BillRepository billRepository;
	private DiscountService discountService;
	public BillServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
	
	@Override
    public Bill getBill(long id) {
        return billRepository
        		.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Product not found"));
          
   
    }
	   @Override
	    public Bill save(Bill bill) {
	        return billRepository.save(bill);
	    }
	   
	    public double getNetAmount(Bill bill) {
	    User user= bill.getUser();
	    int discountPercentage=0;
	    
	    /*Total amount after applying percentage based discount on products other than grocery*/
	    double totalAmount=0;
	    double netAmount=0;
	    
	    Iterable<Discount> discount=discountService.getAllDiscount();
	    for (Discount d : 	discount)
	    {
	    	if(d.getUserType().equalsIgnoreCase(user.getType()))
	    		discountPercentage=d.getPercentage();
	    }
	    
	    
	    List<OrderProduct> orderProducts=bill.getOrderProductlist();
        for (OrderProduct orderProduct:orderProducts)
        {
        	/*Checking whether discount is applicable for product. eg : for grocery no discount*/
        	if(orderProduct.getProduct().isDiscount())
        	{
        		double discountAmount=(orderProduct.getTotalPrice()*discountPercentage)/100;
        		totalAmount=totalAmount+(orderProduct.getTotalPrice()-discountAmount);
        	}
        		
        	else
        	{
        		totalAmount=totalAmount+orderProduct.getTotalPrice();
        	}
          }
           
	       if((totalAmount/100)>0)
	       {
	    	   int count=(int)(totalAmount/100);
	    	   double discountAmount=5.00*count;
	    	   netAmount=totalAmount-discountAmount;
	    	   
	       }
	    	   
       return netAmount;
	    } 
}  


