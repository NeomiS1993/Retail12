package com.retail.springbootretailapplication.Model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bill_id;
   
    @OneToMany(targetEntity=OrderProduct.class, mappedBy="bill",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
    private List<OrderProduct> orderProductlist=new ArrayList<>();
    
    @ManyToOne()
    @JoinColumn(name="user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;
    
	public Bill(Long bill_id,List<OrderProduct> orderProductlist, User user) {
		this.bill_id = bill_id;
		this.orderProductlist = orderProductlist;
		this.user = user;
	}


	public Long getBill_id() {
		return bill_id;
	}


	public void setBill_id(Long bill_id) {
		this.bill_id = bill_id;
	}

	public List<OrderProduct> getOrderProductlist() {
		return orderProductlist;
	}
	public void setOrderProductlist(List<OrderProduct> orderProductlist) {
		this.orderProductlist = orderProductlist;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
    
}
