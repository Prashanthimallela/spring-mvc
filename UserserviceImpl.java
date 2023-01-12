package com.training.springmvc.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.training.springmvc.dao.UserDao;
import com.training.springmvc.dao.UserDaoImpl;
import com.training.springmvc.model.User;

@Service
public class UserserviceImpl implements Userservice {
		UserDao dao = new UserDaoImpl();
		@Override
		public boolean validate(String username, String password) {
			
			boolean isValid = false;
			List<User> userList = dao.getUsers();
			for (User user : userList) {
				if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
					isValid = true;
				}
			}
			return isValid;
		}

		@Override
		public List<User> getUsers() {
			List<User> userList = dao.getUsers();
			return userList;
		}
		
	
//		public String AddData(@ModelAttribute("user") User user)
//		{
//			Connection con = dao.conn();
//			PreparedStatement st;
//			try {
//				st = con.prepareStatement("insert into userlogin values(?,?)");
//				st.setString(1,user.getUserName());
//				st.setString(2,user.getPassword() ); 
//				st.executeUpdate();
//		
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//					
//			return "home";
//			
//			
//		}
	}



