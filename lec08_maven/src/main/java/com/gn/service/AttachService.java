package com.gn.service;

import java.io.File;

public class AttachService {
	// 1. 업로드할 디렉토리 반환
	public static File getUploadDirectory() {
		String dirPath="C://upload/board";
		
		// 파일을 업로드할 디렉토리 생성
		File uploadDir = new File(dirPath);
		if(!uploadDir.exists()) {
			uploadDir.mkdirs();
		}
		return uploadDir;
	}
	
	// 2. 정보 중에서 파일 추출
	public static *** handleUploadFile(HttpServletRequest request,
			File uploadDir) throws Exception{
		
	}
	
	// 3. 파일 메타 데이터 추출
}
