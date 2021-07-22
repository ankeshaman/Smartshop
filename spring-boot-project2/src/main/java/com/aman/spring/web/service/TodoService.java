package com.aman.spring.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aman.spring.web.model.LogBook;

@Component
@Service
public class TodoService {
	private static List<String> todos = new ArrayList<String>();
	private static List<String> tods=new ArrayList<String>();
	
	 static {
	        todos.add("aman12");
	        todos.add("Annie");
	        todos.add("Black");
	        //todos.add(new LogBook(4321,"Biscuit",4));
	        //todos.add(new LogBook(3526,"Mixture",8));
	    }
	 
	 public boolean validate(String username,String petname,String color) {
		 System.out.println(username);
		 System.out.println(petname);
		 System.out.println(todos.get(0));
		 if(todos.get(0).equals(username) && todos.get(1).equals(petname) && todos.get(2).equals(color)) {
			 return true;
		 }
		 return false;
	 }
	 
	 public void addPassword(String pass) {
		 tods.add(pass);
	 }

}
