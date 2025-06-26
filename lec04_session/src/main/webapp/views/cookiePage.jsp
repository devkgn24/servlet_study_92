<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		1. 사용자 닉네임 입력
		2. 쿠키에 저장
		3. 쿠키 삭제 
	 -->
	 <form action="/saveNick" method="post">
	 	<input type="text" name="user_nick">
	 	<button>닉네임 저장</button>
	 </form>
	 <%
	 	String userNick = null;
	 	Cookie[] cookies = request.getCookies();
	 	if(cookies != null){
	 		for(Cookie c : cookies){
	 			if("user_nick".equals(c.getName())){
	 				userNick = c.getValue();
	 			}
	 		}
	 	}
	 %>
	 <p>닉네임 : <%=userNick == null ? "_____" : userNick %></p>
	 <form action="/removeNick" method="post">
	 	<button>닉네임 삭제</button>
	 </form>
</body>
</html>