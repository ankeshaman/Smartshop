package com.aman.springboot.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.aman.springboot.web.service.LoginService;
import com.aman.springboot.web.service.TodoService;

@Controller
@SessionAttributes("productName")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@Autowired
	TodoService service1;
	
	//Model
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name,@RequestParam String password){
		boolean isValidator=service.validateUser(name, password);
		if(!isValidator) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put(" User Name", name);
		model.put("password", password);
		
		return "welcome";
	}
	
	
	

}