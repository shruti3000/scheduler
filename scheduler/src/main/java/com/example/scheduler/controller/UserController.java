package com.example.scheduler.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scheduler.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveMeet(@RequestBody User user) {
		return userService.saveMeet(user);
	}
	@GetMapping("/list")
	public List<User> getMeetByUsers(@RequestBody String username) {
		return userService.getMeetByUsers(username);
	}
	@GetMapping("/list")
	public List<User> getMeetByUsersAndDate(@RequestBody String username,  @RequestBody String date) {
		return userService.getMeetByUsersAndDate(username, date);
	}
	
	
	@PutMapping("/update/{user_id}")
	public User updateMeet(@PathVariable("user_id") Long meet_id, @RequestBody User user) {
		return userService.updateMeet(meet_id,user);
	}
	@PutMapping("/delete/{user_id}")
	public String deleteMeet(@PathVariable("user_id") Long meet_id) {
		 userService.deleteMeet(meet_id);
		 return "deleted";
	}

}
