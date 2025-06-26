package com.gn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getTextAjax")
public class GetTextAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetTextAjaxServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		// 1. HTML 형태로 응답
		// (1) 어떤 형식으로 정보를 보내줄 것인가
		response.setContentType("text/html; charset=utf-8");
		// (2) 연결 통로(스트림) 생성
		PrintWriter out = response.getWriter();
		// (3) 통로로 정보 내보내기
		int leng = userId.length();
		out.println("<p>아이디 : "+userId+"("+leng+"글자)</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
