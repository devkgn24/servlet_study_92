package com.gn.mapping;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InputNameServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public InputNameServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트가 Get방식으로 요청을 보냈을때 요청을 받는 메소드
		System.out.println("Get방식 요청");
		String userName = req.getParameter("user_name");
		System.out.println("너의 이름은 : "+userName);
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	

}