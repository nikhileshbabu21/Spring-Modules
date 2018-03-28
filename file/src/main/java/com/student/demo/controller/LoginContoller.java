package com.student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.demo.service.LoginService;

@Controller
public class LoginContoller {
	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(value="/login.html",method = RequestMethod.GET)
	public String goToLoginPage(){
		
	
		
		return "login.jsp";
	}
	
	
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST )
	public String validateUser(@RequestParam("username") String username, @RequestParam("password") String password){
		
		Boolean status = loginService.isValidUser(username, password);
		
		
		if(status){
			return "dashboard.jsp";
		}else{
			return "login.jsp";
		}
		
		
		
	}
	
	
	

}
