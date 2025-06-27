package com.gn.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ScoreAjaxServlet
 */
@WebServlet("/scoreAjax")
public class ScoreAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 데이터 인코딩
		request.setCharacterEncoding("utf-8");
		
		// 2. 파라미터 수집
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		// 3. 연산 처리 : 총점, 평균, 합격여부
		int total = kor + eng + math;
		double avg = total / 3.0;
		String avgStr = String.format("%.2f", avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		
		// 4. 응답 설정
		response.setContentType("text/plain; charset=utf-8");
		response.getWriter().write("총점 : "+total+", 평균 : "+avgStr+", 결과 : "+result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
