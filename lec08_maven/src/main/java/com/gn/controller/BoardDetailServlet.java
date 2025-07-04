package com.gn.controller;

import java.io.IOException;

import com.gn.dto.Attach;
import com.gn.dto.Board;
import com.gn.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/boardDetail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService service = new BoardService();

    public BoardDetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. no라는 이름의 게시글 pk값 전달받기
		int boardNo = Integer.parseInt(request.getParameter("no"));
		
		// 2. Board와 Attach 조회
		Board board = service.selectBoardOne(boardNo);
		Attach attach = service.selectAttachByBoardNo(boardNo);
		
		// 3. /views/board/detail.jsp로 보내주기
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
