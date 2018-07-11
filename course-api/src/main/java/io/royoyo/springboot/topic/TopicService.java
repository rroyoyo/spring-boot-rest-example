package io.royoyo.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//this must be a business service
//Singletons : creates and registers instance to memory

@Service
public class TopicService {

	 List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring", "Spring Framework", "This is an Advanced Course"),
				new Topic("java", "Core Java", "This is an intermediate Course"),
				new Topic("dbms", "SQL", "This course will teach you about Databases"),
				new Topic("webd", "HTML/CSS", "This course will familiarize you with Web Development tools")
				));
	 public List<Topic> getAllTopics(){
		 return topics;
	 }
	 //URLs are case sensitive, keep ids simple and lowecase
	 
	 public Topic getTopic(String id) {
		 return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 }
	 
	 public void addTopic(Topic topic) {
		 topics.add(topic);
	 }

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
