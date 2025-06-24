package com.gn.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bookReserveEnd")
public class BookReserveEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookReserveEndServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userName = request.getParameter("user_name");
		String userPhone = request.getParameter("user_phone");
		String userEmail = request.getParameter("user_email");
		String bookName = request.getParameter("book_name");
		int borrowPeriod = Integer.parseInt(request.getParameter("borrow_period"));
		
		System.out.println(userName);
		System.out.println(userPhone);
		System.out.println(userEmail);
		System.out.println(bookName);
		System.out.println(borrowPeriod);
		
		String bookTitle = "";
		int bookPrice = 0;
		
		switch(bookName) {
			case "1" : 
				bookTitle = "자바 프로그래밍 입문";
				bookPrice = 1500 + 500*(borrowPeriod-1);
				break;
			case "2" : 
				bookTitle = "웹 개발의 기초";
				bookPrice = 1800 + 500*(borrowPeriod-1);
				break;
			case "3" : 
				bookTitle = "데이터베이스 시스템";
				bookPrice = 2000 + 500*(borrowPeriod-1);
				break;
		}
		
		request.setAttribute("userName", userName);
		request.setAttribute("userPhone", userPhone);
		request.setAttribute("userEmail", userEmail);
		request.setAttribute("borrowPeriod", borrowPeriod);
		request.setAttribute("bookTitle", bookTitle);
		request.setAttribute("bookPrice", bookPrice);
		
		RequestDispatcher view 
			= request.getRequestDispatcher("views/book/confirm.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
