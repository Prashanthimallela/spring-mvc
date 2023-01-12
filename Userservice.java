package com.training.springmvc.service;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.training.springmvc.model.User;

public interface Userservice {
	
	public List<User> getUsers();
	//String AddData(@ModelAttribute("user") User user);
	boolean validate(String userName, String password);
}
