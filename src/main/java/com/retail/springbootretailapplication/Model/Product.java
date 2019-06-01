package com.retail.springbootretailapplication.Model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long product_id;
	    private String code;
	    private double price;
	    private boolean discount;
	    @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "product")
	    private OrderProduct orderProduct;

	    public Product(Long product_id, String code, double price, boolean discount) {
			this.product_id = product_id;
			this.code = code;
			this.price = price;
			this.discount = discount;
			
		}
	    
		public OrderProduct getOrderProduct() {
			return orderProduct;
		}

		public void setOrderProduct(OrderProduct orderProduct) {
			this.orderProduct = orderProduct;
		}

		public String getCode() {
			return code;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public boolean isDiscount() {
			return discount;
		}
		public void setDiscount(boolean discount) {
			this.discount = discount;
		} 
	
	
}
