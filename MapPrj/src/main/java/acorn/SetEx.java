package acorn;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setex")
public class  SetEx extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
	 
		// Set 객체를 생성하고 데이터를 추가합니다.
		Set<String> mySet = new HashSet<>();
		mySet.add("값1");
		mySet.add("값2");
		mySet.add("값3");

		// JSP 페이지로 Set 객체를 전달합니다.
		request.setAttribute("mySet", mySet);
		request.getRequestDispatcher("WEB-INF/views/view2.jsp").forward(request, resp);

	}

}
