package com.example.scheduler.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;


import com.example.scheduler.repository.UserRepository;
import com.songs.exceptions.ResourceNotFoundException;

public class UserServiceImplementaion implements UserService {
	
	private UserRepository userRepo;
	@Override
	public User saveMeet(User user) {
		// TODO Auto-generated method stub
		
		return userRepo.save(user);
		
	}

	@Override
	public List<User> getMeetByUsers(String username ) throws java.util.NoSuchElementException  {
		List<User> meet =userRepo.findMeetByUsers(username);
		if(!meet.isEmpty()) {
			return meet;
		}
		else {
			throw new ResourceNotFoundException("username not found");
		}
	
	}

	@Override
	public List<User> getMeetByUsersAndDate(String username, String date) {
		
		return userRepo.findMeetByUsersAndDate(username, date);
	}

	
	@Override
	public User updateMeet(long meet_id, User user) {
		
		Optional<User> findById=userRepo.findById(meet_id);
		if(findById.isPresent()) {
			User userEntity=findById.get();
			userEntity.setUsername(user.getUsername());
			userEntity.setDate(user.getDate());
			userEntity.setTime(user.getTime());
			userEntity.setTitle(user.getTitle());
			userEntity.setDescription(user.getDescription());
			return userRepo.save(userEntity);
			
		}
		return null;
	}

	@Override
	public void deleteMeet(long meet_id) {
		
		userRepo.deleteById(meet_id);
		
	}

}
