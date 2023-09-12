package acorn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mapex")
public class MapEx  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		 
	 

		// ArrayList<Member> 객체를 생성하고 데이터를 추가합니다.
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member("test1" ,"0000"));
		memberList.add(new Member("test2" ,"1234"));

		 
		Map<String, Object> myMap = new HashMap<>();
		myMap.put("memberList", memberList);

		// JSP 페이지로 Map 객체를 전달합니다.
		request.setAttribute("myMap", myMap);
		request.getRequestDispatcher("WEB-INF/views/view1.jsp").forward(request, resp);

	}

}
