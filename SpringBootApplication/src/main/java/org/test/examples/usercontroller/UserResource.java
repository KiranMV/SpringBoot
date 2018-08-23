package org.test.examples.usercontroller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.test.examples.models.User;
import org.test.examples.services.UserDaoService;

@RestController
public class UserResource {
	
	@Autowired 
	UserDaoService service;
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User retriveUser(@PathVariable int id) {
		User user = service.findBOne(id);
		if(user==null)
			throw new UserNotFoundException(null);
		return user;
		
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> CreateUser(@RequestBody User user) {
		User savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}

}
