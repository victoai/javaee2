package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//.do로 끝나면 모든 요청에 대해서 필터가 적용됨
@WebFilter("*.do")
public class Filter2 implements Filter {   //로그인 여부에 따른 페이지 

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		 System.out.println("login filter");		 
		 HttpServletRequest  h_request = (HttpServletRequest) request;
		 HttpSession session = h_request.getSession();
	 	  
		 if( session.getAttribute("id") == null) {
			 HttpServletResponse h_response = (HttpServletResponse) response;
			 
			 //로그인이 안되어 있다면  로그인을 요청함
			 h_response.sendRedirect("/filterPrj/login");
			 return ;
			 
		 }	
		 
		 // 원래흐름으로 연결해줌  이 부분이 빠지면 안됨 !!!		 		 
	 	  chain.doFilter(request, response);
		  
		 
		
		
	}

}
