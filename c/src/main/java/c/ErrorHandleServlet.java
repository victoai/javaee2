package c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/errorHandle")
public class ErrorHandleServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 resp.setContentType("text/html;charset=utf-8");
		 PrintWriter out = resp.getWriter();
		 
		 Integer code =(Integer)req.getAttribute("javax.servlet.error.status_code");
		 String message =(String)req.getAttribute("javax.servlet.error.message");
		 Object type = req.getAttribute("javax.servlet.error.exception_type");
		 Throwable exception  =  (Throwable) req.getAttribute("javax.servlet.error.exception");
		 String uri  = (String)req.getAttribute("javax.servlet.error.request_uri");
		 
		 
		 out.println(  code);
		 out.println( message);
		 out.println( type);
		 out.println( exception );
		 out.println( uri);
		 
		 
	}
	
 
}
