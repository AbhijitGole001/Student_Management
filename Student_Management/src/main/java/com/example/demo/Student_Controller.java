package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	
	@PostMapping("addStudent")
	String addStudent(@RequestBody  Student s)

	
	{
		//logic
		
		return "student detail added in database and student Name is   "   +  s.getName();
		
	}

}





class Student  
{
	
	
	private String name;
	private String address;
	private String aadhar;
	private String email;
	private int age;
	private int roleNo;
	private int moNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(int roleNo) {
		this.roleNo = roleNo;
	}
	public int getMoNo() {
		return moNo;
	}
	public void setMoNo(int moNo) {
		this.moNo = moNo;
	}
	
	
	
	
}