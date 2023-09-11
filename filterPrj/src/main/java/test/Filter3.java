package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

// .test로 끝나면 모든 요청에 대해서 필터가 적용됨
@WebFilter("*.test")
public class Filter3  implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		 
		
		HttpServletRequest  request = (HttpServletRequest) req;		
		System.out.println(" test filter  작동");
		chain.doFilter(request, resp);
		
		 
		
	}

	 
}
