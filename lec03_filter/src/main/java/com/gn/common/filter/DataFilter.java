package com.gn.common.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

// @WebFilter(servletNames = "receiveDataServlet")
@WebFilter(urlPatterns = "/receive/data")
public class DataFilter extends HttpFilter implements Filter {
       
    public DataFilter() {
        super();
    }

	public void destroy() {
		// 필터가 소멸될 때 실행
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 요청과 응답 처리
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// 필터가 초기화될 때 실행
	}

}
