package com.gn.mapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/joinMember")
public class SendGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SendGetServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user_name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("user_age"));	
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println("이름 : "+name);
		if(gender.equals("1")) {
			System.out.println("남자");
		}else if(gender.equals("2")) {
			System.out.println("여자");
		}
		System.out.println("나이 : "+age);
		
		if(hobby == null || hobby.length == 0) {
			System.out.println("취미 없음");
		} else {
			System.out.println("===== 취미 목록 =====");
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("1", "야구");
			map.put("2", "농구");
			map.put("3", "축구");
			
			for(int i = 0 ; i < hobby.length ; i++) {
				String temp = map.get(hobby[i]);
				System.out.println(temp);
			}
			
		}
		
		// 1. 응답 형식 지정
		response.setContentType("text/html; charset=UTF-8");
		
		// 2. 응답하고자 하는 사용자와의 연결통로 생성
		PrintWriter out = response.getWriter();
		
		// 3. HTML 구문 한줄씩 쌓기
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>회원가입 결과화면</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>"+name+"님, 환영합니다</h1>");
		out.println("<h2>앞으로도 자주 와주실꺼죠?</h2>");
		out.println("<a href='/'>홈페이지로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		
		// 4. 쌓여있는 데이터 밀어내기
		out.flush();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
