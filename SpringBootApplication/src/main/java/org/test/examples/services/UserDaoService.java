package org.test.examples.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.test.examples.models.User;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int CountId = 3;
	
	static {
		users.add(new User(1, "Jack", new Date()));
		users.add(new User(2, "Jhon", new Date()));
		users.add(new User(3, "Seena", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user){
		if(user.getId()==null) {
			user.setId(++CountId);;
		}
		users.add(user);
		
		return user;
	}
	
	public User findBOne(int Id) {
		
		for(User user:users) {
			if(user.getId() == Id) {
				return user;
			}
		}
		return null;
	}

}
