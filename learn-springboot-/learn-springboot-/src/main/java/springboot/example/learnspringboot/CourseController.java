package springboot.example.learnspringboot;
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
			new Courses(2,"Learn DevOps","in28mins")
			);
	
	

}
}
