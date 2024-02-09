package com.example.learningportal.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String fullName;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole role;

	// Add more fields as needed

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Enrollment> enrollments;

	@ManyToMany
	@JoinTable(name = "user_favorite_courses", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> favoriteCourses;

	// Constructors, getters, and setters

	// Additional methods if needed

	public enum UserRole {
		ADMIN("Administrator"), AUTHOR("Course Author"), LEARNER("Learner");

		private final String displayName;

		UserRole(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}
	}
}
