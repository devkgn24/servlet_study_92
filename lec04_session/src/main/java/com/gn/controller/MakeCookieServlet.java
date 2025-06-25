package com.gn.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/makeCookie")
public class MakeCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MakeCookieServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 쿠키 객체 생성
		// key가 중복되면 value를 덮어씀 -> key값 이름 정할때 조심!!
		Cookie c = new Cookie("user_id","user01");
		
		// 2. 쿠키 유지 시간 설정(초 단위)
		c.setMaxAge(60 * 60 * 24); // 1일 유지
		
		// 3. 응답에 쿠키 추가하여 브라우저에 전달
		response.addCookie(c);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
