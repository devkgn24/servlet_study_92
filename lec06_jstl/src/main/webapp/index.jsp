<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
</head>
<body>
	<h1>1. EL의 내장객체</h1>
	<%
		pageContext.setAttribute("test", "페이지");
		request.setAttribute("test", "리퀘스트");
		session.setAttribute("test", "세션");
		application.setAttribute("test", "애플리케이션");
	%>
	<h2>(1) JSP 방식 => 특정 범주 내장객체 지정</h2>
	<p><%= pageContext.getAttribute("test") %></p>
	
	<h2>(2) EL 방식</h2>
	<!--1. ~Scope로 끝나는 내장객체 사용
		2. 내장객체 지정없이 key만 사용 : 가장 작은 범주부터 탐색 -->
	<p>${pageScope.test }</p>
	<p>${test }</p>
	
	<h1>2. EL로 객체 다루기</h1>
	<%@ page import="com.gn.dto.Person" %>
	<%
		Person p = new Person("김철수",77);
		request.setAttribute("person",p);
	%>
	<h2>(1) JSP 방식</h2>
	<%
		Person p1 = (Person)request.getAttribute("person");
	%>
	<p>이름 : <%=p1.getName() %></p>
	<p>나이 : <%=p1.getAge() %></p>
	
	<h2>(2) EL 방식</h2>
	<!-- EL 방식으로 객체 정보를 꺼내는 경우 : key값.필드명 
		private 필드 직접 꺼내는거 아님 !! getter 반드시 필요함 -->
	<p>이름 : ${person.name }</p>
	<p>나이 : ${person.age }</p>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>