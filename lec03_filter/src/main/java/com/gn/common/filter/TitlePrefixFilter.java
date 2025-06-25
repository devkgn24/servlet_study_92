package com.gn.common.filter;

import java.io.IOException;

import com.gn.common.wrapper.TitlePrefixWrapper;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;


@WebFilter("/board/write")
public class TitlePrefixFilter extends HttpFilter implements Filter {
       
    public TitlePrefixFilter() {
        super();
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		if(request instanceof HttpServletRequest) {
			HttpServletRequest httpReq = (HttpServletRequest)request;
			TitlePrefixWrapper wrapper = new TitlePrefixWrapper(httpReq);
			chain.doFilter(wrapper, response);	
		} else {
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
