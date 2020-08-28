package serveletsession;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/servletpro")
public class servletpro extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao=new ProductDao();
		String prodName=request.getParameter("search");
		ArrayList<product.Product> searchList= dao.getAllsearch(prodName);

		HttpSession session= request.getSession();
		session.setAttribute("searchList", searchList);


		RequestDispatcher rd= request.getRequestDispatcher("search,jsp.jsp");
		rd.forward(request, response);

		}
	}


