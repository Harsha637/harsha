package serveletsession;
import java.serveletsession;;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ProductDao;
import com.myserv.model.Product;


@WebServlet("/Search")
public class Search extends HttpServlet {
private static final long serialVersionUID = 1L;
       
   
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ProductDao dao=new ProductDao();
String prodname=request.getParameter("search");
ArrayList<Product> searchList= dao.getAllsearch(prodname);
HttpSession session= request.getSession();
session.setAttribute("searchList", searchList);
        RequestDispatcher rd=  request.getRequestDispatcher("SearchDisplay.jsp");
rd.forward(request, response);

}

}