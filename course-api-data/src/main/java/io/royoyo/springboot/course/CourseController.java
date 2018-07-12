package io.royoyo.springboot.course;

import org.springframework.web.bind.annotation.RestController;

import io.royoyo.springboot.topic.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	//dependency injected by @Autowired, when courseController created by Spring, courseService created as well 
	 
	@RequestMapping("topics/{id}/courses")
	public List<Course> getAllcourses(@PathVariable String id) {
		//return "All courses";
		
		return courseService.getAllCourses(id);
		
		//link to database or alternate class with course objects
		//Spring MVC creates a JSON from the Array returned with key names corresponding to instance variables in the course Class 
	}  

	// variable tokenized with the help of {}
	//path variable ensures that "id" in URL is passed through the method
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	//Postman lets you make REST API calls and modify each and every aspect of the call
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deletecourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
	//Make a GET request to /courses (root URL) to get all courses, 
	//GET request to individual element /course/id (gets particular course)
	// POST /courses (create a new course)
	// PUT /courses/id (updates course)
	// DELETE /course/id (deletes course)
}
