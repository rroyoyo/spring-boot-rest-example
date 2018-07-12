package io.royoyo.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	 
	//get all topics
	
	//get topic given id
	
	//update topic, takes arguments
	
	//delete topics given id
	
	//mostly build same methods connected to the DB, get, update, delete
	
	//public List<Course> findByName(String name);
	//public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);

	
}
