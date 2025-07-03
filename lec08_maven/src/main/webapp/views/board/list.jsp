<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<script src="<c:url value='/resources/jquery-3.7.1.js'/>"></script>
</head>
<body>
	<h1>게시판</h1>
	<%@ include file="/views/include/nav.jsp" %>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="b" items="${boardList }">
				<tr>
					<td>${b.boardNo }</td>
					<td>${b.boardTitle }</td>
					<td>${b.boardWriter }</td>
					<td>${b.regDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/boardWrite'/>">
		게시글 등록
	</a>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>