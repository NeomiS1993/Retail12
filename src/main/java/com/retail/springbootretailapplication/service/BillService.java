package com.retail.springbootretailapplication.service;


import org.springframework.validation.annotation.Validated;

import com.retail.springbootretailapplication.Model.Bill;



@Validated
public interface BillService {

Bill getBill(long id);
double getNetAmount(Bill bill);
Bill save(Bill bill);


}
