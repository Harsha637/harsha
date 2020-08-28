package serveletsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serv3
 */
@WebServlet("/serv3")
public class serv3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		HttpSession session= request.getSession();
		//String data=(String)session.getAttribute("sVar");

		String data=session.getAttribute("sVar").toString();



		out.print("servlet 3");
		out.print(data);
	}

}
