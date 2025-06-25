<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>필터</title>
</head>
<body>
	<h1>1. 필터 공부하기</h1>
	<form action="/receive/data" method="post">
		<input type="text" name="test_data">
		<input type="submit" value="데이터 보내기">
	</form>
	<form action="/receive/msg" method="post">
		<textarea rows="3" cols="20" name="msg"></textarea>
		<button>보내기</button>
	</form>
	<form action="/board/write" method="post">
	    <input type="text" name="title" placeholder="제목 입력">
	    <input type="submit" value="작성">
	</form>
</body>
</html>