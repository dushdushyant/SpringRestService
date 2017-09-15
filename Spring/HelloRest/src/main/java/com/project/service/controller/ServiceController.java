package com.project.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/services")
public class ServiceController {
	
	@RequestMapping(value="/hello",method = RequestMethod.GET,headers="Accept=application/json")
	public List<String> sayHello(){
		List<String> retList= new ArrayList<String>();
		retList.add("One");
		retList.add("Two");
		retList.add("Three");
		return retList;
	}

	@GetMapping("/greet")
	public String greet(){
		return "Hello Greet!!";
	}
	
	@GetMapping("/greet/{name}")
	public String sayHello(@PathVariable("name") String name){
		return "Hello: "+name;
		
	}
	
	@PostMapping(value = "/posteg")
	public String postData(@RequestBody String input){
		System.out.println("Post IP: "+input);
		return "Ok";
	}
	
}
