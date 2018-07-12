package io.royoyo.springboot.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//this must be a business service
//Singletons : creates and registers instance to memory

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	 public List<Course> getAllCourses(String id){
		 
		 List<Course> courses = new ArrayList<>();
		 //lambda expressions | go through Java 8 course
		 //find all gets topics, forEach topics add adds them to the topic list created
		 courseRepository.findByTopicId(id)
		 .forEach(courses::add);
		 return courses;
	 }
	 //URLs are case sensitive, keep ids simple and lowecase
	 
	 public Optional<Course> getCourse(String id) {
		 //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		 return courseRepository.findById(id);
	 }
	 
	 public void addCourse(Course course) {
		 courseRepository.save(course);
	 }

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}

//Data Service needs to have methods that deal with DB operations
//so that topic service can connect to the DB and run the commands (save/create, read, update topics)
