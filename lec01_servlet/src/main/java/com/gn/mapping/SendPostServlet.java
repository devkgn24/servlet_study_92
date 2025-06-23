package com.gn.mapping;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/loginMember")
public class SendPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SendPostServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 2. 사용자가 입력한 값 꺼내오기
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		// 3. 출력하기
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		
		// 앞으로 출력할 문서 형태 선언
		response.setContentType("text/html; charset=UTF-8");
		// 응답하고자 하는 사용자와의 연결통로(스트림) 
		PrintWriter out = response.getWriter();
		// 스트림을 통해 HTML 구문을 한줄씩 쌓기
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>로그인 결과화면</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>반가워요 "+id+"님</h1>");
		out.println("<h2>비밀번호가 "+pw+"이시네요~</h2>");
		out.println("<a href='/'>홈페이지로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		// 쌓아놓은 데이터 내보내기
		out.flush();
	}

}
