package com.aman.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aman.spring.web.model.UserPointsInformation;
import com.aman.spring.web.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showList(ModelMap model) {
		model.put("todos",service.retrieveItems());
		return "list";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo",new UserPointsInformation(0,"",2));
		return "form";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.POST)
	public String addTodoPage(ModelMap model,@Valid UserPointsInformation todo) {
		System.out.println(todo.getUserId());
		System.out.println(todo.getPoint());
		service.deleteTodo(todo.getUserId(),todo.getPoint());
		return "redirect:/list-todos";
	}
	
	/*@RequestMapping(value="/delete-todo",method=RequestMethod.GET)
	public String deleteTodoPage(@RequestParam int id) {
		service.deleteTodo(id, point)
		return "redirect:/list-todos";
	}*/

}
