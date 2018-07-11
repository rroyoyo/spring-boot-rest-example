package io.royoyo.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//class = rest controller means methods in this class can map to URL requests 
	
	//tells Spring to call method when /hello URL accessed
	//Request Mapping maps to all HTTP methods, get, post, put, delete
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	//Spring Framework will scan class path no need for linking it to the other class
	
	//Embedded Tomcat server
	//reasons: -convenience (no download, no installation, no deployment hassle)
	//-Servlet container config steps now taken care of in application config
	//-Standalone application easy to deploy, run and develop
	//-useful for microservices architecture, no need for multiple deployments
	
	
	
}
