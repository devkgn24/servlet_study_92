package com.gn.controller;

import java.io.IOException;
import java.util.List;

import com.gn.dto.Student;
import com.gn.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService service = new StudentService();
       
    public StudentListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		3. Service에 정보 전달
		List<Student> list = service.getStudentList();
//		4. DAO에 데이터베이스 연결 요청
//		5. Mapper에 있는 쿼리 실행 
//		=> 학생 정보 목록 조회
//		6. /views/studentList.jsp로 보내기
		request.setAttribute("list", list);
		request.getRequestDispatcher("/views/studentList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
