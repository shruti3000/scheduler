package com.example.scheduler.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="meetDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	/**
	 * @param username
	 * @param date
	 * @param time
	 * @param title
	 * @param description
	 */
	@Id
	private String username;
	private String date;
	private String time;
	private String title;
	private String description;
	private long meet_id;
	
	public User(long meet_id, String username, String date, String time, String title, String description) {
		super();
		this.meet_id=meet_id;
		this.username = username;
		this.date = date;
		this.time = time;
		this.title = title;
		this.description = description;
		
	}
	
	public long getMeet_id() {
		return meet_id;
	}

	public void setMeet_id(long meet_id) {
		this.meet_id = meet_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
