package com.example.learningportal.dto;

public class CourseDTO {

    private Long id;
    private String name;
    private String description;
    private CategoryDTO category;

    // Constructors, getters, setters, etc.

    public CourseDTO() {
    }

    public CourseDTO(Long id, String name, String description, CategoryDTO category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    // Additional methods if needed
}
