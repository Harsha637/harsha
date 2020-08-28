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
 * Servlet implementation class serv1
 */
@WebServlet("/serv1")
public class serv1 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("servlet1");
		response.setContentType("text/html");
		String var= request.getParameter("somedata");
		out.print(var);

		HttpSession session= request.getSession();
		session.setAttribute("sVar", var);


		out.print("<form action='serv2'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");


	}

}
