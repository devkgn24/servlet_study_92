package com.gn.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/createSession")
public class CreateSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateSessionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 세션 객체 생성
		// -> 매개변수 default는 true : 세션이 없을때 만드는거 동의
		HttpSession session = request.getSession(true);
		// 2. 세션 속성값 지정
		// (1) 새로운 세션인지 확인하고 싶을때
		if(session.isNew()) {
			
		}
		// (2) 기존에 특정 key에 해당하는 값이 있는가
		if(session.getAttribute("member_id") == null) {
			
		}
		
		session.setAttribute("member_id", "user01");
		session.setMaxInactiveInterval(60 * 30);
		// 홈 화면 이동
		response.sendRedirect("/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
