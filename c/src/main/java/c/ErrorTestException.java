package c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorTest1")
public class ErrorTestException extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
	resp.setContentType("text/html;charset=utf-8");
	PrintWriter out = resp.getWriter();
	
	String  getquery = req.getQueryString();
 
	out.println( getquery);
	out.println( getquery.length());
	out.close();
	 
	 
	}

}
