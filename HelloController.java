package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/hello") // no http method , By default  only the get method will be called 
	public String soyti() {
		return "Hi";
	}
	

}
