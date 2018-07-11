package io.royoyo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//tell Spring that this is a Spring Boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//tell Spring Boot to start this application that is the course api app
		// and then create a servelet container and host the app in that container
		//call one static method to do all that!
		SpringApplication.run(CourseApiApp.class, args);
		// above command does the following:
		//sets up _default_ config (80% use case, convention over config), starts spring application context,
		//performs class path scan, starts tomcat server
		
		//Spring is a container for all the code that runs on the app server (business and data services, controllers)
		//This container is called an application context, all Spring Apps have it
		
		// The way to plug-in code into spring boot is to create your own custom classes and annotate them with the intent
		//For example to create a business service, you create a class and annotate it with 'add service annotation', same for a controller
		// Classes typically have metadata that tells how controller/services need to behave
		
		//controller: given a request, execute such and such code on the servelet container
		//these annotations marked in the class let Spring know what URL is being mapped and what should happen when the request comes
		//2 pieces of info needed: what URL, what method
		
		//create a controller | building REST API, we want the response tp be a simple JSON
		
	}

}
