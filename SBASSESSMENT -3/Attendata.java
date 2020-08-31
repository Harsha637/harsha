package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;



public class Attendata {
	public ArrayList<Student> getStudentsBySem(int sem){
		try {
			Connection connection=DBConnection.getconnection();
			String sql="select * from student where sem=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setInt(1, sem);
			
			ResultSet rs=stat.executeQuery();
			ArrayList<Student> studentList=new ArrayList<>();
			
			while(rs.next()) {
				int studId=rs.getInt("sid");
				String studName=rs.getString("sname");
				String city=rs.getString("city");
				Student students=new Student(studId, studName, city);
				
				studentList.add(students);
			}
			return studentList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String insertIntoAttendance(Attendance attendance) {
		try {
			Connection con=DBConnection.getconnection();
			String sql="insert into attendance values(?,?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setInt(1, attendance.getSid());;
			stat.setString(2, attendance.getSname());
			stat.setDate(3, new java.sql.Date(attendance.getAtdate().getTime()));
			stat.setInt(4, attendance.getSem());
			stat.setString(5, attendance.getAttend());
			
			int res=stat.executeUpdate();
			if(res>0)
				return "Mark the Attendance";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Invalid Credentials";
	}
	
	public String updateAttendance(Attendance attendance) {
		try {
			Connection con=DBConnection.getconnection();
			String sql="update attendance set attendance='Present' where stud_id=?";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setInt(1, attendance.getSid());;
			
			int res=stat.executeUpdate();
			if(res>0)
				return "Updated the Attendance";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Invalid Credentials";
	}
	
	public ArrayList<Attendance> searchResult(int sem,Date date){
		try {
			Connection connection=DBConnection.getconnection();
			String sql="select * from attendance where sem=? and ADate=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setInt(1, sem);
			stat.setDate(2, new java.sql.Date(date.getTime()));
			
			ResultSet rs=stat.executeQuery();
			ArrayList<Attendance> attendanceList=new ArrayList<>();
			
			if(rs.next() == false) {
				return null;
			}
			else {
			do{
				int studId=rs.getInt(1);
				String studName=rs.getString(2);
				String attendance=rs.getString(5);
				Attendance attend=new Attendance(studId, studName, attendance);
				
				attendanceList.add(attend);
			}while(rs.next());
			}
			return attendanceList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
