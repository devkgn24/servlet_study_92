<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String userPhone = (String)request.getAttribute("userPhone"); 
	String userEmail = (String)request.getAttribute("userEmail");
	int bookPrice = (int)request.getAttribute("bookPrice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서 대출 내역</h1>
	<h4>[고객 정보]</h4>
	<ul>
		<li>고객명: <%=request.getAttribute("userName") %></li>
		<li>전화번호: <%=userPhone %></li>
		<li>이메일: <%=userEmail %></li>
	</ul>
	
	<h4>[대출 정보]</h4>
	<ul>
		<li>도서 제목: OOO</li>
		<li>대출 기간: OOO일</li>
	</ul>
	
	<h3>대출 금액: OOO원</h3>
</body>
</html>