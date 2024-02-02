package com.example.devtools.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Courses> retrieveAllCourses() {
	
	return Arrays.asList(
			new Courses(1,"Learn AWS","in28mins"),
			new Courses(2,"Learn DevOps","in28mins"),
			new Courses(3,"Learn Azure","in28mins"),
			new Courses(4,"Learn FullStack","in28mins"),
			new Courses(5,"Learn Salesfoce","in28mins")
			);

}
}
