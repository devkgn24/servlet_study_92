<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<script src="<c:url value='/resources/jquery-3.7.1.js'/>"></script>
</head>
<body>
    <h1>로그인 화면</h1>
    <%@ include file="/views/include/nav.jsp" %>
    <form id="memberLoginFrm">
        <input type="text" id="member_id" placeholder="아이디"><br>
        <input type="password" id="member_pw" placeholder="비밀번호"><br>
        <input type="submit" value="로그인">
    </form>
    <script>
    	$("#memberLoginFrm").submit(function(e){
    		e.preventDefault();
    		
    		// 1. 사용자가 입력한 값 가져오기
    		const memberId = $("#member_id").val();
    		const memberPw = $("#member_pw").val();
    		
    		// 2. 유효성 검사
    		if(!memberId){
    			alert("아이디를 입력하세요");
    		} else if(!memberPw){
    			alert("비밀번호를 입력하세요.");
    		} else{
    			// 3. ajax로 로그인 요청
    			$.ajax({
    				url : "/memberLogin",
    				type : "post",
    				data : {
    					memberId : memberId,
    					memberPw : memberPw
    				},
    				dataType : 'json',
    				success : function(data){
    					alert(data.res_msg);
    					if(data.res_code == 200){
    						location.href="<%=request.getContextPath() %>/";
    					}
    					
    				}
    				
    			})
    		}
    		
    	});
    </script>
</body>
</html>