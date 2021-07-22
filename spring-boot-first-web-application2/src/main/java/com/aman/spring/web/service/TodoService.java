package com.aman.spring.web.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aman.spring.web.model.Clothes;
import com.aman.spring.web.model.Sports;
import com.aman.spring.web.model.Stationary;


@Service
@Component
public class TodoService {
	private static List<Stationary> todos = new ArrayList<Stationary>();
    private static List<Sports> todos1 = new ArrayList<Sports>();
    private static List<Clothes> todos2 = new ArrayList<Clothes>();
    private static int todoCount = 3;

    static {
        todos.add(new Stationary(1234,"soap",5));
        todos.add(new Stationary(4321,"Biscuit",4));
        todos.add(new Stationary(3526,"Mixture",8));
    }
    
    static {
        todos1.add(new Sports(5362,"Racket",10));
        todos1.add(new Sports(5382,"Bat",15));
        todos1.add(new Sports(7473,"Football",11));
    }
    
    static {
        todos2.add(new Clothes(3826,"T-Shirts",50));
        todos2.add(new Clothes(5382,"Trousers",30));
        todos2.add(new Clothes(7473,"Cap",60));
    }
    
    public List<Stationary> retrieveItems(){
    	return todos;
    }
    
    public List<Sports> retrieveItems2(){
    	return todos1;
    }
    public List<Clothes> retrieveItems3(){
    	return todos2;
    }
    
    public void addTodo(int id,String productName,int productsavailable) {
    	todos.add(new Stationary(id,productName,productsavailable));
    }
    
    public void deleteTodo(int id) {
        Iterator<Stationary> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Stationary todo = iterator.next();
            if (todo.getProductCode()==id) {
                iterator.remove();
            }
        }
    }

}
