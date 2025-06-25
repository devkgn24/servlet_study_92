package com.gn.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/receive/msg")
public class ReceiveMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReceiveMsgServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==== 요청 확인 =====");
		String msg = request.getParameter("msg");
		System.out.println(msg);
		
		// 화면단 경로는 반드시 /로 시작 
		// /없이 화면 설정 -> /receive/views/msgShow.jsp
		RequestDispatcher view 
						//	= request.getRequestDispatcher("/views/msgShow.jsp");
							= getServletContext().getRequestDispatcher("/views/msgShow.jsp");
		request.setAttribute("msg", msg);
		view.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
