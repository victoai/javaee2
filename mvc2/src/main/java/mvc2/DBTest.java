package mvc2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db")
public class DBTest  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		MemberDAO dao = new MemberDAO();		
		try {
			dao.insert();
			req.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			req.setAttribute("errmsg", "db 오류. 담당자 222-1111  죄송합니다");
			req.getRequestDispatcher("WEB-INF/views/errorView.jsp").forward(req, resp)	;		 
		}		
		
		 
	}

}
