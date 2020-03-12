package io.sheena.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rest controller takes http request and sends back the response
@RestController  
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi there!";
	}
}
