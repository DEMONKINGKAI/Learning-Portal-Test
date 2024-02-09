package com.example.learningportal.dto;

public class FavoriteDTO {

    private Long id;
    private UserDTO user;
    private CourseDTO course;

    // Constructors, getters, setters, etc.

    public FavoriteDTO() {
    }

    public FavoriteDTO(Long id, UserDTO user, CourseDTO course) {
        this.id = id;
        this.user = user;
        this.course = course;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    // Additional methods if needed
}
