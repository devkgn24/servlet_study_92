package com.gn.common.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncryptorFilter extends HttpFilter implements Filter {
       
    public EncryptorFilter() {
        super();
    }

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PasswordEncryptorWrapper pew 
			= new PasswordEncryptorWrapper((HttpServletRequest)request);
		chain.doFilter(pew, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
