package com.mindtree.bohorooms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int id;
	@Column(name = "userName",nullable = false)
	private String name;
	@Column(name = "userAge", nullable = false)
	private int age;
	@Column(name = "emailId",nullable = false)
	private String emailId;
	@Column(name = "password",nullable = false)
	private String password;
	@Column(name = "address",nullable = false)
	private String address;
	
	@OneToMany(mappedBy = "user")
	private List<Rooms> rooms;

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	
}
