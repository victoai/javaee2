package acorn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/errorHandle2")
public class ErrorHandleServlet2  extends HttpServlet {	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
	 
		req.getRequestDispatcher("WEB-INF/views/err404.jsp").forward(req, resp);
	
	}

}
