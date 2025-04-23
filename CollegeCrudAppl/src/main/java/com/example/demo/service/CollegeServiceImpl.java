package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.College;
import com.example.demo.repository.CollegeRepository;
@Service
public class CollegeServiceImpl implements CollegeService {

	
	@Autowired
	private CollegeRepository cr;
	
	@Override
	public void add(College c) {
		// TODO Auto-generated method stub
		cr.save(c);

	}

	@Override
	public List<College> display() {
		// TODO Auto-generated method stub
		
		return cr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);

	}

	@Override
	public void update(College c, Integer id) {
		// TODO Auto-generated method stub
		c.setId(id);
		cr.save(c);

	}

}
