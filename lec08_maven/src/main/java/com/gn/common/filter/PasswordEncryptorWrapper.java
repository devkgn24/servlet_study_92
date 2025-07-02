package com.gn.common.filter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class PasswordEncryptorWrapper extends HttpServletRequestWrapper{

	public PasswordEncryptorWrapper(HttpServletRequest request) {
		super(request);
	}
	
//	@Override
//	public String getParameter(String name) {
//		String result = super.getParameter(name);
//		if(name.contains("memberPw")) {
//			
//		}
//		
//		return result;
//	}
//	// 단방향 암호화 메소드
//	private String getSHA512(String oriVal) {
//		
//	}

}
