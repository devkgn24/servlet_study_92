package com.gn.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.gn.dto.Attach;
import com.gn.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/filePath")
public class FilePathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BoardService service = new BoardService();   
	
    public FilePathServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int attachNo = Integer.parseInt(request.getParameter("no"));
		Attach attach = service.selectAttachByAttachNo(attachNo);
		// attach_no, board_no, ori_name, re_name
		
		// 1. 파일의 경로 지정
		String filePath = "C:\\upload\\board\\"+attach.getReName();
		
		// 2. 파일 정보가 없는 경우 에러 발생
		if(filePath == null || filePath.trim().equals("")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		
		// 3. 파일이 존재하는지 확인
		File file = new File(filePath);
		if(!file.exists()) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		// 4. 파일 타입 지정
		String mimeType = getServletContext().getMimeType(filePath);
		if(mimeType == null) mimeType = "application/octet-stream";
		response.setContentType(mimeType);
		
		// 5. 파일 정보 브라우저에게 전송
		try(FileInputStream fis = new FileInputStream(file);
			OutputStream out = response.getOutputStream();){
			byte[] buffer = new byte[1024];
			int byteRead;
			while((byteRead = fis.read(buffer)) != -1) {
				out.write(buffer,0,byteRead);
			}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
