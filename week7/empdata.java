package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class empdata {
	@Id
	private int empid;
	private String empname;
	private String city;
	private int age;
	private String dept;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "empdata [empid=" + empid + ", empname=" + empname + ", city=" + city + ", age=" + age + ", dept=" + dept
				+ "]";
	}
	public empdata(int empid, String empname, String city, int age, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.city = city;
		this.age = age;
		this.dept = dept;
	}
	public empdata() {
		
	}
	

}
