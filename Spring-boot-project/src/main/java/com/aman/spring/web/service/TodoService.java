package com.aman.spring.web.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aman.spring.web.model.UserPointsInformation;

@Service
@Component
public class TodoService {
	private static List<UserPointsInformation> todos=new ArrayList<UserPointsInformation>();
	
	static {
		todos.add(new UserPointsInformation(1231, "user1", 40000));
		todos.add(new UserPointsInformation(4352, "user2", 31000));
		todos.add(new UserPointsInformation(5214, "user3", 50000));
	}
	
	public List<UserPointsInformation> retrieveItems(){
		return todos;
	}
	
	public void deleteTodo(int id,int points) {
        Iterator<UserPointsInformation> iterator = todos.iterator();
        while (iterator.hasNext()) {
            UserPointsInformation todo = iterator.next();
            if (todo.getUserId()==id) {
            	int point=todo.getPoint();
            	System.out.println(point);
            	int newpoint=point-points;
            	System.out.println(newpoint);
                todo.setPoint(newpoint);
            }
        }
    }

}
