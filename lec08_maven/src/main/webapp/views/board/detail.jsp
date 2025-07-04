<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세 보기</title>
</head>
<body>
	<p>제목 : ${board.boardTitle }</p>
	<p>작성자 : ${board.memberId } </p>
	<p>내용 : ${board.boardContent } </p>
	<p>작성일 : ${board.regDate } </p>
	
	<c:if test="${not empty attach }">
	    <h4>첨부파일</h4>
	    <img src="<c:url value='/filePath?no=${attach.attachNo }'/>"><br>
	    <a href="<c:url value='/fileDownload?no=${attach.attachNo }'/>">다운로드</a>
	    
	    
	    
	    
	    
	    
	    
	</c:if>
</body>
</html>
