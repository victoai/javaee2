package mvc2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorHandle")

public class ErrorHandleServlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
	PrintWriter out =resp.getWriter();
	Integer code=	(Integer) req.getAttribute("javax.servlet.error.status_code");
	
	out.println( code);
	
	
	}

}
