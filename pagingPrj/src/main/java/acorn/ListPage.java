package acorn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list.page")
public class ListPage extends HttpServlet{	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page ;
		
		if( request.getParameter("p") == null)
			page =1;
		else
		  page = Integer.parseInt(request.getParameter("p"));
		
		
	MemberDao  dao = new MemberDao();
	 ArrayList<Member> list =dao.getListPage(page);	 
	 
	 int totalCnt  = dao.getTotal();
	 //현제페이지 정보와 목록 정보 저장하기
	 request.setAttribute("list1", list);
	 request.setAttribute("p", page);	
	 request.setAttribute("totalCnt", totalCnt);
	 request.getRequestDispatcher("WEB-INF/views/listPage.jsp").forward(request, response);	 
	 
	}

}
