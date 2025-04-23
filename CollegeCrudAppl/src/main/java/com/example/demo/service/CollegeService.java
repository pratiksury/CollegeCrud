package com.example.demo.service;

import java.util.List;


import com.example.demo.model.College;

public interface CollegeService {
	
	 public void add(College c);
	 public List<College>display();
	 public void delete(Integer id);
	 public void update(College c , Integer id);
	 
}
