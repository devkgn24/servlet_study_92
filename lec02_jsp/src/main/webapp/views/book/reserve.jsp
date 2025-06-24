<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 대출 정보</title>
</head>
<body>
	<h2>도서 대출</h2>
	<form action="/bookReserveEnd" method="post">
		<fieldset>
			<legend>고객 정보</legend>
			<label for="user_name">고객명 : </label>
			<input type="text" id="user_name" name="user_name"><br>
			<label for="user_phone">전화번호 : </label>
			<input type="text" id="user_phone" name="user_phone"><br>
			<label for="user_email">E-mail : </label>
			<input type="email" id="user_email" name="user_email">
		</fieldset>
		<fieldset>
			<legend>도서 선택</legend>
			<label for="book_name">도서 : </label>
			<select id="book_name" name="book_name">
				<option value="1">자바 프로그래밍 입문</option>
				<option value="2">웹 개발의 기초</option>
				<option value="3">데이터베이스 시스템</option>
			</select>
		</fieldset>
		<fieldset>
			<legend>대출 기간</legend>
			<label for="borrow_period">대출 기간 (일) : </label>
			<input type="number" id="borrow_period" name="borrow_period" 
			min="1" max="30" step="1">
		</fieldset>
		<button type="submit">대출하기</button>
	</form>
</body>
</html>