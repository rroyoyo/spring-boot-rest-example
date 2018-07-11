package io.royoyo.springboot.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		//return "All Topics";
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "This is an Advanced Course"),
				new Topic("Java", "Core Java", "This is an intermediate Course"),
				new Topic("DBMS", "SQL", "This course will teach you about Databases"),
				new Topic("Web Development", "HTML/CSS", "This course will familiarize you with Web Develpment tools")
				);
		//link to database or alternate class with topic objects
		//Spring MVC creates a JSON from the Array returned with key names corresponding to instance variables in the Topic Class 
	}

}
