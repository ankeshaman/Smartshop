package com.aman.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aman.spring.web.model.LogBook;
import com.aman.spring.web.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showPage(ModelMap model) {
		model.addAttribute("todo",new LogBook("abd", "ygf", "vfh"));
		return "form";
	}
	
	@RequestMapping(value="/list-todos",method=RequestMethod.POST)
	public String recoveryPage(ModelMap model,@Valid LogBook todo) {
		System.out.println(todo.getPetName());
		boolean a= service.validate(todo.getUserId(),todo.getPetName(),todo.getColor());
		System.out.println(a);
		if(a) {
			return "form2";
		}
		return "form3";
	}
	
	@RequestMapping(value="/add-todos",method=RequestMethod.GET)
	public String passwordRecovery(ModelMap model) {
		return "form4";
	}
	
	
	
	@RequestMapping(value="/add-todos",method=RequestMethod.POST)
	public String passwordRecovery1(ModelMap model,@RequestParam String password) {
		System.out.println(password);
		service.addPassword(password);
		model.put("Message", "Password updated successfully");
		return "redirect:/update";
	}

}
