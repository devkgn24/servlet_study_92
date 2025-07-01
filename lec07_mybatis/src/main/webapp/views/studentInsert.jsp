<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>
	<form action="<c:url value='/student/insert'/>" method="post">
		이름 : <input type="text" name="studentName"><br>
		나이 : <input type="number" name="studentAge"><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>