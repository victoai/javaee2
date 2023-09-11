package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//모든 요청을 처리하는 url 패턴 

@WebFilter("/*")
public class Filter1 implements Filter {   //한글성정 하는 필터

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("encoding filter");
		
		request.setCharacterEncoding("UTF-8");	 
		response.setContentType("text/html;charset=UTF-8");
		
		
		// 이 부분이 빠지면 안됨
		chain.doFilter(request, response);
		
		
	}

}