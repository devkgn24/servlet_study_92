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
	<form method="get" action="<c:url value='/boardList'/>">
		<input type="text" name="keyword" placeholder="제목 또는 작성자" value="${paging.keyword }">
		<input type="submit" valued="검색">
	</form>
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
				<tr onclick="location.href='<c:url value="/boardDetail?no=${b.boardNo }"/>'">
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
				<a href="<c:url value='/boardList?nowPage=${paging.pageBarStart-1 }&keyword=${paging.keyword }'/>">
					&laquo;
				</a>
			</c:if>
			<c:forEach var="i" begin="${paging.pageBarStart }" end="${paging.pageBarEnd }">
				<a href="<c:url value='/boardList?nowPage=${i }&keyword=${paging.keyword }'/>">
					${i }
				</a>
			</c:forEach>
			<c:if test="${paging.next }">
				<a href="<c:url value='/boardList?nowPage=${paging.pageBarEnd+1 }&keyword=${paging.keyword }'/>">
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