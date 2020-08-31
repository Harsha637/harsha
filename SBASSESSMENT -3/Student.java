package com.jdbc;

public class Student {
	
	private int sid;
	private String sname;
	private int sem;
	private String city;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Student(int sid, String sname, int sem, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sem = sem;
		this.city = city;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sem=" + sem + ", city=" + city + "]";
	}
	public Student()
	{
		
	}
	public Student(int studId, String studName, String city) {
		
		this.sid = sid;
		this.sname = sname;
		this.city = city;
	}

}
