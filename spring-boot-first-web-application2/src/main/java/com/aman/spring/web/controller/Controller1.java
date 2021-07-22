package com.aman.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controller1 {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "view";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String radioName){
		//model.put("name", name);
		//return "stationary";
		
		System.out.println(radioName);
		//String a = "Stationary";
		if(radioName.equalsIgnoreCase("Stationary")) {
            return "tods";
		}
		else if(radioName.equalsIgnoreCase("Sports")) {
			return "tods2";
		}
		else {
			return "clothes";
		}
	}

}
