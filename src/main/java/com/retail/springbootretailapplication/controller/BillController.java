package com.retail.springbootretailapplication.controller;

import com.retail.springbootretailapplication.service.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/billamount")
public class BillController {
	//@Autowired
	private BillService billService;
	
	
	 public BillController(BillService billService) { 
		 this.billService =billService; }
	 

	    @GetMapping(value = { "", "/{id}" })
	   // public double getNetAmountOfBill( @RequestParam("id") String id) {
	    public double getNetAmountOfBill( @PathVariable("id") String id) {
	    	Long ids=Long.parseLong(id);
	    	System.out.println("ID......"+ids);
	    	try {
	    	double netAmount= billService.getNetAmount(billService.getBill(ids));
	    	System.out.println("Net amount : "+netAmount);}
	    	catch (Exception e)
	    	{e.printStackTrace();}
	    	
	        return 0;
	    }
}
