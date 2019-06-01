package com.retail.springbootretailapplication.repository;
import org.springframework.data.repository.CrudRepository;

import com.retail.springbootretailapplication.Model.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {
}

