package io.royoyo.springboot.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	//dependency injected by @Autowired, when TopicController created by Spring, TopicService created as well 
	 
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		//return "All Topics";
		
		return topicService.getAllTopics();
		
		//link to database or alternate class with topic objects
		//Spring MVC creates a JSON from the Array returned with key names corresponding to instance variables in the Topic Class 
	}  

	// variable tokenized with the help of {}
	//path variable ensures that "id" in URL is passed through the method
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	//Postman lets you make REST API calls and modify each and every aspect of the call
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	//Make a GET request to /topics (root URL) to get all Topics, 
	//GET request to individual element /topic/id (gets particular topic)
	// POST /topics (create a new topic)
	// PUT /topics/id (updates topic)
	// DELETE /topic/id (deletes topic)
}
