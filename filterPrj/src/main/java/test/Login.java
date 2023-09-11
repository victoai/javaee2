package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		 
		
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id  = request.getParameter("id");
		String pw  = request.getParameter("pw");
		
		
	    boolean result  =	isValid( id, pw);		 
		 		
		if( result) {
			HttpSession session  =request.getSession();
			session.setAttribute("id", "hong1");
			response.sendRedirect("/filterPrj/home");
		}else {
			response.sendRedirect("/filterPrj/login");
		}
	}
	
	
	
	private boolean isValid(String id, String pw) {
	    boolean result;
		if( id.equals(pw)) result =true;
		else result=false;
		return result;
	}
	
	
	
	
	
	

}
