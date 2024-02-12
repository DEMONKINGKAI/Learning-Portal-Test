package com.example.learningportal.service;

import com.example.learningportal.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    List<CourseDTO> getAllCourses();

    CourseDTO getCourseById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    CourseDTO updateCourse(Long id, CourseDTO courseDTO);

    void deleteCourse(Long id);
}
