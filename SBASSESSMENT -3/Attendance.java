package com.jdbc;

import java.util.Date;

public class Attendance {
	
	private int sid;
	private String sname;
	private Date atdate;
	private int sem;
	private String attend;
	@Override
	public String toString() {
		return "Attendance [sid=" + sid + ", sname=" + sname + ", atdate=" + atdate + ", sem=" + sem + ", attend="
				+ attend + "]";
	}
	public Attendance(int sid, String sname, Date atdate, int sem, String attend) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.atdate = atdate;
		this.sem = sem;
		this.attend = attend;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getAtdate() {
		return atdate;
	}
	public void setAtdate(Date atdate) {
		this.atdate = atdate;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getAttend() {
		return attend;
	}
	public void setAttend(String attend) {
		this.attend = attend;
	}
	public Attendance(int studId, String studName, String attendance)
	{
		this.sid = sid;
		this.sname = sname;
		
		
		this.attend = attend;
		
	}
	public Attendance(int stId) {
		this.sid = sid;
		
	}
	
}