package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class MemberList extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("UTF-8");		
		//response.setContentType("text/html;charset=utf-8");
		
		String id =request.getParameter("id");
		PrintWriter out  = response.getWriter();
		out.print(id );
		out.print("display====" );
		out.print("고객 목록 조회");
	}

}
