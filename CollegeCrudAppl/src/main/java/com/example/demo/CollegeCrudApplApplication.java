package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.service.CollegeService;

@SpringBootApplication
public class CollegeCrudApplApplication {
	private final CollegeService collegeService;
	
	CollegeCrudApplApplication(CollegeService collegeService){
		this.collegeService =  collegeService;
	}
	
	
	  

	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(CollegeCrudApplApplication.class, args);
		
	}

}
