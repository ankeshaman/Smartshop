package com.aman.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aman.spring.web.model.Sports;
import com.aman.spring.web.model.Stationary;
import com.aman.spring.web.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.put("todos",service.retrieveItems());
		return "stationary";
	}
	
	@RequestMapping(value="/list-todos1",method=RequestMethod.GET)
	public String showTodos2(ModelMap model) {
		model.put("todos1",service.retrieveItems2());
		return "sports";
	}
	
	@RequestMapping(value="/list-todos2",method=RequestMethod.GET)
	public String showTodos3(ModelMap model) {
		model.put("todos2",service.retrieveItems3());
		return "clothes";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo",new Stationary(0,"",2));
		return "form";
	}
	
	@RequestMapping(value="/add-todo1",method=RequestMethod.GET)
	public String showAddTodoPage1(ModelMap model) {
		model.addAttribute("todo1",new Sports(1,"",2));
		return "form1";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.POST)
	public String addTodoPage(ModelMap model,@Valid Stationary todo) {
		service.addTodo(todo.getProductCode(), todo.getProductName(), todo.getNumberOfItemsAvailable());
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/add-todo1",method=RequestMethod.POST)
	public String addTodoPage1(ModelMap model,@Valid Sports todo1) {
		service.addTodo(todo1.getProductCode(), todo1.getProductName(), todo1.getNumberOfItemsAvailable());
		return "redirect:/list-todos1";
	}
	
	@RequestMapping(value="/delete-todo",method=RequestMethod.GET)
	public String deleteTodoPage(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/delete-todo1",method=RequestMethod.GET)
	public String deleteTodoPage1(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos1";
	}

}
