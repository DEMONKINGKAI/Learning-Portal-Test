package com.example.learningportal.dto;

import com.example.learningportal.entity.User.UserRole;

public class UserDTO {

	private Long id;
	private String username;
	private String fullName;
	private UserRole role;

	// Constructors, getters, setters, etc.

	public UserDTO() {
	}

	public UserDTO(Long id, String username, String fullName, UserRole role) {
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.role = role;
	}

	// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	// Additional methods if needed
}
