package com.retail.springbootretailapplication.service;

import org.springframework.validation.annotation.Validated;

import com.retail.springbootretailapplication.Model.User;

@Validated
public interface UserService {
	User getUser(long ID);
	User save(User user);
}
