package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// tells Spring that this code describes an endpoint that should be made available over the web.
@SpringBootApplication
@RestController
public class DemoApplication 
{
  	
	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}
	// use our hello() method to answer requests sent to the http://localhost:8080/hello.
 	// take a String parameter called name, combines parameter with the word "Hello" ex. “Hello James".
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
		return String.format("Hello %s!", name);
	}
  
}

