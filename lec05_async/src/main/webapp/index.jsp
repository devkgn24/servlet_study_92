<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기 연습하기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<h1>1. 텍스트 데이터</h1>
	<h2>(1) GET 방식</h2>
	<input type="text" name="user_id" id="user_id">
	<input type="button" value="아이디 길이 구하기" id="ajax_get_btn">
	<div id="ajax_get_div"></div>
	<script>
		$(document).ready(function(){
			$("#ajax_get_btn").click(function(){
				const userId = $("#user_id").val();
				$.ajax({
					url : "/getTextAjax?userId="+userId,
					type : "get",
					success : function(data){
						// data => <p>아이디 : OOO (n글자)</p>
						$("#ajax_get_btn").html(data);
					},
					error : function(){
						alert("요청 실패!!");
					}
				});
			});
		});
	</script>
	
	
	
	
	
	
	
	
	
	
</body>
</html>