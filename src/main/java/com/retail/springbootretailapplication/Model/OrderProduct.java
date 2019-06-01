package com.retail.springbootretailapplication.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class OrderProduct {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    
    
    
    
    @Column(nullable = false) 
    private Integer quantity;

    @ManyToOne()
    @JoinColumn(name="bill_id", referencedColumnName = "bill_id", insertable = false, updatable = false) 
    private Bill bill;
    
	public Bill getBill() {
		return bill;
	}


	public void setBill(Bill bill) {
		this.bill = bill;
	}


	public OrderProduct(Long id, Product product,Integer quantity) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
	   @Transient
	    public Double getTotalPrice() {
	        return getProduct().getPrice() * getQuantity();
	    }
    
}
