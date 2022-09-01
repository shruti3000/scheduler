package com.example.scheduler.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Long> {
	
	public List<User>findMeetByUsers(String username);
	public List<User>findMeetByUsersAndDate(String username, String date);
}
