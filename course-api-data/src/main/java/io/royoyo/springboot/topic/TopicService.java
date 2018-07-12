package io.royoyo.springboot.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//this must be a business service
//Singletons : creates and registers instance to memory

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	 public List<Topic> getAllTopics(){
		 
		 List<Topic> topics = new ArrayList<>();
		 //lambda expressions | go through Java 8 course
		 //find all gets topics, forEach topics add adds them to the topic list created
		 topicRepository.findAll()
		 .forEach(topics::add);
		 return topics;
	 }
	 //URLs are case sensitive, keep ids simple and lowecase
	 
	 public Optional<Topic> getTopic(String id) {
		 //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		 return topicRepository.findById(id);
	 }
	 
	 public void addTopic(Topic topic) {
		 topicRepository.save(topic);
	 }

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}

//Data Service needs to have methods that deal with DB operations
//so that topic service can connect to the DB and run the commands (save/create, read, update topics)
