<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- onsubmit="return validateForm(this);" -->
	<form action="login.do" name="loginForm" method="post">
		아이디 : <input type="text" name="userId" required="required" /><br />
		패스워드 : <input type="password" name="userPw" required="required" /><br />
		<input type="submit">로그인하기
	</form>



</body>
</html>