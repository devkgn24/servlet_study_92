package com.gn.common.wrapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class MsgRequestWrapper extends HttpServletRequestWrapper{

	public MsgRequestWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		// return super.getParameter(name);
		String value = super.getParameter(name);
		if(name.equals("msg") && value != null) {
			return value.replaceAll("shit", "***");
		}
		return value;
	}

}
