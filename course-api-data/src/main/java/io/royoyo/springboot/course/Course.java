package io.royoyo.springboot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Table;
import io.royoyo.springboot.topic.Topic;

//@Entity annotation lets spring know that we want the data base 
//to contain rows with these objects (topic instances)
@Entity 
@Table(name = "course")
public class Course {

	@Id
	@Column(name = "cid")
	private String id;
	@Column(name = "cname")
	private String name;
	@Column(name = "cdesc")
	private String description;
	@ManyToOne
	private Topic topic;
	//relationship betwwen course and topic many to one, hence the annotation
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	
	public Course() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
