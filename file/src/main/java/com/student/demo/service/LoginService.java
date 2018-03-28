package com.student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.dao.UserDao;
import com.student.demo.pojo.User;

@Service
public class LoginService {
	
	@Autowired
	private UserDao userDao;
	
	
	public Boolean isValidUser(String username,String password){
		
		
		User user = userDao.findByUsernameAndPassword(username, password);
		
		if(user == null){
			return false;
		}else{
			return true;
		}
		
	}
	
	

}
