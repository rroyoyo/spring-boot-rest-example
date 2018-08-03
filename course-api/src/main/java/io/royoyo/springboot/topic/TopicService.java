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
				new Topic("1","Hytech_Professionals", "This is an Advanced Course"),
				new Topic("2","RVS_IT_Consulting", "This is an intermediate Course"),
				new Topic("3","MCN_Solution", "This course will teach you about Databases"),
				new Topic("4","C#_Corner", "This course will familiarize you ASP.NET WEB APIs"),
				new Topic("5","Birla_sunlife", "This course will familiarize you with Web Development tools"),
				new Topic("6","Global_Logic", "This course will familiarize you Pyhtong and Data Science")
				));
	 public List<Topic> getAllTopics(){
		 return topics;
	 }
	 //URLs are case sensitive, keep ids simple and lowercase
	 
	 public List<Topic> getTopic(String id) {
		 List< Topic > to = new ArrayList< Topic >();
		 for (int i = 0; i< topics.size(); i++) {
				Topic t = topics.get(i);
				if(t.getName().contains(id)) {
					to.add(t);
				}
			}
		 return to;
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
