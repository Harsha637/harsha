package serveletsession;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import product.Product;


@WebServlet("/delservlet")
public class delservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("proid"));
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		ProductDao dao=new ProductDao();
		out.print(dao.deleteProduct(prodId));
	}

	}


