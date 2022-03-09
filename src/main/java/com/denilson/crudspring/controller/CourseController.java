package com.denilson.crudspring.controller;

import java.util.List;

import com.denilson.crudspring.model.Course;
import com.denilson.crudspring.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    @Autowired
    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {

        return courseRepository.findAll();
    } 
    
}
