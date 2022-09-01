package com.example.scheduler.service;

import java.util.List;

import org.apache.catalina.User;

public interface UserService {
	
	public User saveMeet(User user);
	public List<User>getMeetByUsers(String username);
	public List<User>getMeetByUsersAndDate(String username, String date);
	public User updateMeet(long meet_id, User user);
	public void deleteMeet(long meet_id);
}
