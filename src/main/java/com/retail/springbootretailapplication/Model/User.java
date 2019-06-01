package com.retail.springbootretailapplication.Model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long user_id;
	 private String name;
	 private String type;
       @OneToMany(targetEntity=Bill.class, mappedBy="user",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
	    private List<Bill> billList=new ArrayList<>();
	
	    public User(Long user_id, String name, String type) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.type = type;
	}
	    
	public List<Bill> getBillList() {
			return billList;
		}

		public void setBillList(List<Bill> billList) {
			this.billList = billList;
		}

	
	public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
}
