package com.aman.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aman.springboot.web.model.Todo;

@Service
@Component
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static List<Todo> todos2 = new ArrayList<Todo>();
    private static List<Todo> todos3 = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo("Bread", 3,"15-07-2021","19-07-2021"));
        todos.add(new Todo("Whey Protein", 4, "15-07-2021", "15-07-2022"));
        todos.add(new Todo("Peanut Butter", 2, "15-07-2021","15-07-2022"));
    }
    
    

     public List<Todo> retrieveTodos() {
       /*List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }*/
        return todos;
    }

    public void addTodo(String ProductName, int NumberOfItemsAvailable, String DateOfManufacturing,String DateOfExpiry) {
        todos.add(new Todo(ProductName, NumberOfItemsAvailable, DateOfManufacturing, DateOfExpiry));
    }

    public void deleteTodo(String productName) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getProductName().equalsIgnoreCase(productName)) {
                iterator.remove();
            }
        }
    }
}