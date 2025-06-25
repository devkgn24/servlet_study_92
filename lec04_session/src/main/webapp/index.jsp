<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키, 세션</title>
</head>
<body>
	<h1>Cookie🍪</h1>
	<ul>
		<li>
			<a href="/makeCookie">쿠키 생성</a>
		</li>
	</ul>
	<h2>현재 쿠키 값 확인</h2>
	<%
		// 1. 클라이언트가 보낸 쿠키 배열 가져오기
		Cookie[] cookies = request.getCookies();
	
		// 2. 쿠키 배열에서 원하는 쿠키 찾기
		if(cookies != null){
			for(Cookie c : cookies){
				if(c.getName().equals("user_id")){
					String userId = c.getValue();
				}
			}
		}
	%>
	
	
	
	
	
	
</body>
</html>