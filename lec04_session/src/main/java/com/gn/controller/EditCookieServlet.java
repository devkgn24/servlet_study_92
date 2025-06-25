package com.gn.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/editCookie")
public class EditCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditCookieServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// user_id 라는 name을 가진 쿠키의 value를 admin으로 수정
		Cookie cookie = new Cookie("user_id","user02");
		// 기존과 동일한 유지 시간 설정
		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);
		// => index.jsp화면에서 <쿠키 수정> 클릭후 새로고침했을 때 변경된 아이디 화면 노출
		// 브라우저가 새로운 요청을 다시 보내게 하는 메소드 : sendRedirect
		response.sendRedirect("/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
