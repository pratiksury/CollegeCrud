package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private float fees;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}



	public College(int id, String name, String email, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fees = fees;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public float getFees() {
		return fees;
	}



	public void setFees(float fees) {
		this.fees = fees;
	}
	
	

}
