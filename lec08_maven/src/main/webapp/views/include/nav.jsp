<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<nav>
	<ul>
		<li>
			<a href="<c:url value='/memberLogin'/>">
				로그인
			</a>
		</li>
		<li>
			<a href="<c:url value='/memberCreate'/>">
				회원가입
			</a>
		</li>
		<li>
			<a href="<c:url value='/memberLogout'/>">
				로그아웃
			</a>
		</li>
	</ul>
</nav>