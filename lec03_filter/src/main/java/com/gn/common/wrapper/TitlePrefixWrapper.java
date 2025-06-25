package com.gn.common.wrapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class TitlePrefixWrapper extends HttpServletRequestWrapper{
	
	public TitlePrefixWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		// key가 title인 경우 원래 값 앞에 "[공지]" 문자열 추가
		if(name.equals("title")) {
			return "[공지]"+super.getParameter(name);
		}
		return super.getParameter(name);
	}

}
