package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logOut")
public class LogOut   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
			boolean loginOk =  true;   // false
		
	 
			HttpSession session  =request.getSession();
			session.invalidate();
			
			response.sendRedirect("/filterPrj/home");
		 
	}

}
