package com.training.springmvc.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//import org.springframework.web.bind.annotation.ModelAttribute;

import com.training.springmvc.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	 Connection con = null;
	public List<User> getUsers() {
		
		 List<User> userList = new ArrayList<>();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "root@123";
	        con = DriverManager.getConnection(url,user,pass);
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from userlogin  ");
	        while(rs.next()) {
	        	userList.add(new User(rs.getString(1), rs.getString(2)));
	        	
	        }
	       
		 }  
	        catch (Exception e) {
				
				e.printStackTrace();
			}  
		
		
		
		
		if(con!=null)
		{
			System.out.println("iam in");
		}
		else
		{
			System.out.println("not in");
		}
		return userList;
	}



//public Connection conn()
//{
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/infinite";
//        String user = "root";
//        String pass = "root@123";
//        con = DriverManager.getConnection(url,user,pass);
//	}
//	 catch (Exception e) {
//			
//			e.printStackTrace();
//		}  
//	
//	return con;
	
	
//}
}
