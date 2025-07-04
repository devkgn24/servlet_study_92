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
					<td>${b.memberId }</td>
					<td>${b.regDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${not empty boardList }">
		<div>
			<c:if test="${paging.prev }">
				<a href="<c:url value='/boardList?nowPage=${paging.pageBarStart-1 }'/>">
					&laquo;
				</a>
			</c:if>
			<c:forEach var="i" begin="${paging.pageBarStart }" end="${paging.pageBarEnd }">
				<a href="<c:url value='/boardList?nowPage=${i }'/>">
					${i }
				</a>
			</c:forEach>
			<c:if test="${paging.next }">
				<a href="<c:url value='/boardList?nowPage=${paging.pageBarEnd+1 }'/>">
					&raquo;
				</a>
			</c:if>
		</div>
	</c:if>
	<a href="<c:url value='/boardWrite'/>">
		게시글 등록
	</a>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>