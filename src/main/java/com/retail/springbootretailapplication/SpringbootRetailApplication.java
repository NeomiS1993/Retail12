package com.retail.springbootretailapplication;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.retail.springbootretailapplication.service.BillService;
import com.retail.springbootretailapplication.service.DiscountService;
import com.retail.springbootretailapplication.service.OrderProductService;
import com.retail.springbootretailapplication.service.ProductService;
import com.retail.springbootretailapplication.service.UserService;
import com.retail.springbootretailapplication.Model.Bill;
import com.retail.springbootretailapplication.Model.Discount;
import com.retail.springbootretailapplication.Model.OrderProduct;
import com.retail.springbootretailapplication.Model.Product;
import com.retail.springbootretailapplication.Model.User;
import com.retail.springbootretailapplication.repository.DiscountRepository;;

@SpringBootApplication
public class SpringbootRetailApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootRetailApplication.class, args);
		
	}

	@Bean
    CommandLineRunner runner(ProductService productService,UserService userService,DiscountService discountService,OrderProductService orderProductService,BillService billService) {
        return args -> {	
        	/*Inserting discount data
        	Discount discount1=new Discount("d1","Employee",30);
        	Discount discount2=new Discount("d1","Affliate",10);
        	Discount discount3=new Discount("d1","Active Customer",5);
        	Discount discount4=new Discount("d1","General Customer",0);
        	discountService.save(discount1);
        	discountService.save(discount2);
        	discountService.save(discount3);
        	discountService.save(discount4);*/
        	
        	/*Inserting product data
        	Product product1=new Product(1L,"prdt1",100.00,true);
        	Product product2=new Product(2L,"grocery1",200.00,false);
        	Product product3=new Product(3L,"prdt2",300.00,true);
            productService.save(product1); 
            productService.save(product2);
			productService.save(product3);*/
        	
        	/*Inserting user data
        	User u1=new User(1L,"Ram","Employee");
        	userService.save(u1);*/
        	
        	/*Inserting order and bill data
        	OrderProduct orderProduct1=new OrderProduct(1L,productService.getProduct(1L),2);
        	OrderProduct orderProduct2=new OrderProduct(2L,productService.getProduct(2L),2);
        	OrderProduct orderProduct3=new OrderProduct(3L,productService.getProduct(3L),3);
        	orderProductService.save(orderProduct1);
        	orderProductService.save(orderProduct2);
        	orderProductService.save(orderProduct3);
        	
        	ArrayList<OrderProduct> p= new ArrayList<OrderProduct>();
        	p.add(orderProduct1);
        	p.add(orderProduct2);
        	p.add(orderProduct3);
        	
            billService.save(new Bill(1L,p,u1));*/

        };
    }
}
