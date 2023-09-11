package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex1")
public class ExceptionEx  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 
	    String str= req.getParameter("str");	
		int len = str.length();		
		resp.getWriter().println( len);
		
		/*
		 * web.xml 오류정보 등록함, 오류가 발생하면 등록해 놓은 오류가 발생하면  지정한 location에 지정된페이지로 이동
		 * <error-page>
			<exception-type>java.lang.Exception</exception-type>
			<location>/errorHandle</location>
			</error-page>
		 */
	}

}
