<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>
	<h3>로그인 페이지 입니다.</h3>
	
	<form action="sign.do">
		<label for="id">아이디</label>
		<input type="text" name="id" />
		<label for="pwd">비밀번호</label>
		<input type="text" name="pwd" />
		<button type="submit">확인</button>
	</form>
	
	
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.2.0.js"></script>
</body>
</html>