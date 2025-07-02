<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<c:url value='/resources/jquery-3.7.1.js'/>">
</script>
</head>
<body>
	<h1>회원가입</h1>
	<%@ include file="/views/include/nav.jsp" %>
	<form id="createMemberFrm">
		<input type="text" id="member_id" placeholder="아이디"> <br>
		<input type="password" id="member_pw" placeholder="비밀번호"> <br>
		<input type="password" id="member_pw_check" placeholder="비밀번호 확인"> <br>
		<input type="submit" value="회원가입"> 
	</form>
	<script>
		$("#createMemberFrm").submit(function(e){
			e.preventDefault();
			
			// 1. 사용자 입력값 가져오기
			const memberId = $('#member_id').val();
			const memberPw = $('#member_pw').val();
			const memberPwCheck = $("#member_pw_check").val();
			
			// 2. 유효성 검사(비어있는값이 아닐것, 정규식을 통과할 것 등)
			const idReg = /^[a-zA-Z0-9]{4,12}$/;
			
			if(!memberId){
				alert("아이디를 입력하세요");
			} else if(!idReg.test(memberId)){
				alert("아이디는 영문 또는 숫자로 4~12자리만 가능합니다");
			}
			
			
			// 3. ajax로 회원가입 요청
			
		});
	</script>
	
	
	
	
	
	
	
	
	
	
</body>
</html>