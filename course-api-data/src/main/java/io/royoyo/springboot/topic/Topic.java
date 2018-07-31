package io.royoyo.springboot.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity annotation lets spring know that we want the data base 
//to contain rows with these objects (topic instances)
@Entity 
@Table(name = "topic")
public class Topic {

	@Id
	@Column(name = "tid")
	private String id;
	@Column(name = "tname")
	private String name;
	@Column(name = "tdesc")
	private String description;
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Topic() {
		
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
	
	
}
