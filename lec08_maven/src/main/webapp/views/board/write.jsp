<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
<script src="<c:url value='/resources/jquery-3.7.1.js'/>"></script>
</head>
<body>
	<h1>게시글 등록</h1>
	<%@ include file="/views/include/nav.jsp" %>
	<form id="createBoardFrm">
		<input type="hidden" name="boardWriter" value="${loginMember.memberNo }">
	    <label>제목:</label><br>
	    <input type="text" name="boardTitle" required><br><br>
	    
	    <label>내용:</label><br>
	    <textarea name="boardContent" rows="5" cols="40" required></textarea><br><br>
	    
	    <label>파일첨부:</label><br>
	    <input type="file" name="boardFile" ><br><br>
	    
	    <input type="submit" value="등록">
	</form>
	<script>
		$("#createBoardFrm").submit(function(e){
			e.preventDefault();
			
			const form = document.getElementById("createBoardFrm");
			const formData = new FormData(form);
			// 유효성 검사
			
			$.ajax({
				url : "/boardWrite",
				type : "post",
				data : formData,
				enctype : "multipart/form-data",
				contentType : false,
				processType : false,
				cache : false,
				dataType : "json",
				success : function(data){
					alert(data.res_msg);
					if(data.res_code == 200){
						location.href = "<%=request.getContextPath() %>/boardList";
					}
				}
			})
		})
		
		
		
		
		
		
		
	</script>
</body>
</html>