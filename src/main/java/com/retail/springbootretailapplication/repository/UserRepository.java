package com.retail.springbootretailapplication.repository;

import org.springframework.data.repository.CrudRepository;
import com.retail.springbootretailapplication.Model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
