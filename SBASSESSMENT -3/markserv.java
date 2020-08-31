package com.attendance.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.Attendance;
import com.jdbc.Attendata;
import com.jdbc.Student;




@WebServlet("/markserv")
public class markserv extends HttpServlet {
	
 
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Attendata dao=new Attendata();
		
		int sem=Integer.parseInt(request.getParameter("semester"));
		ArrayList<Student> studentList=dao.getStudentsBySem(sem);
		
		for(Student p:studentList) {
			int studId=p.getSid();
			String studName=p.getSname();
			Date aDate=new Date();
			int semester=sem;
			String attendance="Absent";
			
			
			
			
			Attendance attend1= new Attendance(studId, studName, aDate, semester, attendance);
			dao.insertIntoAttendance(attend1);
		
		}
		
		HttpSession session=request.getSession();
		session.setAttribute("studentList", studentList);
		
		
		
		RequestDispatcher rd= request.getRequestDispatcher("dispstudents.jsp");
		rd.forward(request, response);
		
		
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	}

	
