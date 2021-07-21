package com.aman.springboot.web.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.aman.springboot.web.model.Todo;
import com.aman.springboot.web.service.LoginService;
import com.aman.springboot.web.service.TodoService;

@Controller
@SessionAttributes("productName")
public class TodoController {

	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		model.put("todos", service.retrieveTodos());
		
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model){
		model.addAttribute("todo",new Todo("egg",0,"",""));
		return "todo";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String addTodo(@RequestParam String productName){
		service.deleteTodo(productName);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model,@Valid Todo todo){
		service.addTodo(todo.getProductName(), todo.getNumberOfItemsAvailable(), todo.getDateOfManufacturing(), todo.getDateOfExpiry());
		return "redirect:/list-todos";
	}
	

	
	

}
