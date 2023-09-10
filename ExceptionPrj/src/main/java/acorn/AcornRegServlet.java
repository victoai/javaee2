package acorn;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornReg")
public class AcornRegServlet  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 
	 AcornService s = new AcornService();	
	 try {
		s.registerCustomer(new Customer( "dy", "123" ,"테스트"));
		request.getRequestDispatcher("WEB-INF/views/regOk.jsp").forward(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();		
		request.getRequestDispatcher("WEB-INF/views/DBerr.jsp").forward(request, response);
		 
	}	 
	 
	
}
	 
}
