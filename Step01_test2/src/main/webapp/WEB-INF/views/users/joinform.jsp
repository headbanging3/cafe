<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h3>회원가입 폼입니다.</h3>
	<form action="signup.do" method="post">
		<div class="form-group has-feedback">
			<label class="control-label" for="id">아이디</label>
			<input class="form-control" type="text" 
				id="id" name="id"/>
			<p class="help-block">사용할 수 없는 아이디 입니다.</p>
			<span class="glyphicon form-control-feedback"></span>
		</div>
		<div class="form-group">
			<label class="control-label" for="pwd">비밀번호</label>
			<input class="form-control" type="text" 
				id="pwd" name="pwd"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="email">이메일</label>
			<input class="form-control" type="text" 
				id="email" name="email"/>
		</div>
		<button type="submit">가입</button>
	</form>
</div>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.2.0.js"></script>
</body>
</html>