package com.gn.controller;

import java.io.IOException;

import com.gn.dto.Account;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 사용자 아이디 -> admin, 비밀번호 -> admin1234일때 정상
		String correctId = "admin";
		String correctPw = "admin1234";
		String name = "관리자";
		
		String inputId = request.getParameter("account_id");
		String inputPw = request.getParameter("account_pw");
		
		if(inputId.equals(correctId) && inputPw.equals(correctPw)) {
			HttpSession session = request.getSession(true);
			// 이름은 account이고, Account 객체 
			Account account = new Account(inputId,name);
			
			session.setAttribute("account", account);
			session.setMaxInactiveInterval(60*30);
		}
		
		response.sendRedirect("/");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
