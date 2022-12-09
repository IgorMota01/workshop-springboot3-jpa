package com.coursejpa.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursejpa.course.entities.User;

@RestController
@RequestMapping(value = "/users") //mapeando direcionamento de site
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Lorrany", "lorrany@gmail.com", "985660255", "41253");
		
		return ResponseEntity.ok().body(u);
	}
}
