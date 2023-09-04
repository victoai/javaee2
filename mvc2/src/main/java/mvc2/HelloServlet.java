package mvc2;

import java.io.IOException;
import java.util.logging.LogManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list.do")
public class HelloServlet  extends HttpServlet{

 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		RequestDispatcher  r = req.getRequestDispatcher("WEB-INF/views/list.jsp");
		r.forward(req, resp);
		
	}
	 

}
