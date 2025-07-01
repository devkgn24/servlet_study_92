<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보</title>
</head>
<body>
	<p>번호 : ${student.studentNo }</p>
	<p>이름 : ${student.studentName }</p>
	<p>나이 : ${student.studentAge }</p>
	<a href="<c:url value='/student/update?no=${student.studentNo }'/>">
		수정
	</a>
	<a href="<c:url value='/student/delete?no=${student.studentNo }'/>">
		삭제
	</a>
</body>
</html>