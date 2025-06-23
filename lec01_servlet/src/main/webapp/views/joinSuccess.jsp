<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과화면</title>
</head>
<body>
	<!-- 4. JSP에서 값을 꺼내 쓰기 -->
	<h1><%= request.getAttribute("name") %>님, 환영합니다</h1>
	<h2>앞으로도 자주 와주실꺼죠?</h2>
	<a href="/">홈페이지로 이동</a>
</body>
</html>