package com.vinay.springBoot.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// URL : http://localhost:8080/another-hello-world
	@RequestMapping(method = RequestMethod.GET, path = "/another-hello-world")
	public String anotherHelloWorld() {
		return "Greetings, Another Hello World !!";
	}

	// URL : http://localhost:8080/hello-world
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Greetings, Hello World !!";
	}

	// URL : http://localhost:8080/hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Greetings from Bean, Hello World !!");
	}

	// URL : http://localhost:8080/hello-world/path-variable/AnanyaChauhan
	@GetMapping(path = "/hello-world/path-variable/{userName}")
	public HelloWorldBean helloWorldThroughPathVariable(@PathVariable String userName) {
		return new HelloWorldBean(String.format("Hello, %s", userName));
	}

	/**
	 * If pathVariable is not in synch with URI then we will get following
	 * exception:- Resolved exception caused by handler execution:
	 * org.springframework.web.bind.MissingPathVariableException: Missing URI
	 * template variable '<<XXX>>' for method parameter of type String
	 */

}
