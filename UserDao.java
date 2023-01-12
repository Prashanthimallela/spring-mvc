package com.training.springmvc.dao;

import java.sql.Connection;
import java.util.List;

import com.training.springmvc.model.User;


public interface UserDao {
	public  List<User> getUsers();	
	

}
