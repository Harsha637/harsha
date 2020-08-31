package com.attendance.serv;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.Attendance;
import com.jdbc.Attendata;




@WebServlet("/markaserv")
public class markaserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Attendata dao=new Attendata();
		
		String[] data=request.getParameterValues("status");
		//PrintWriter out=response.getWriter();
		for(String datum:data) {
			int stId=Integer.parseInt(datum);
			
			Attendance attend=new Attendance(stId);
			dao.updateAttendance(attend);
		}
		/*PrintWriter out=response.getWriter();
		out.print("Successful");*/
		
		RequestDispatcher rd= request.getRequestDispatcher("Marked attend.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

