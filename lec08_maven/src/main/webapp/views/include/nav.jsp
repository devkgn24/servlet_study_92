<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<nav>
	<ul>
		<c:choose>
			<c:when test="${empty loginMember }">
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
			</c:when>
			<c:otherwise>
				<li>
					<a href="<c:url value='/boardList'/>">
						게시판
					</a>
				</li>
				<li>
					<a href="<c:url value='/memberLogout'/>">
						로그아웃
					</a>
				</li>
			</c:otherwise>
		</c:choose>
	</ul>
</nav>