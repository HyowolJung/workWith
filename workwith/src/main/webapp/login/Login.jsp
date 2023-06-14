<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="Post"  name="loginForm" onsubmit="return validateForm(this);">
		아이디 : <input type="text" name="userId" required="required" /><br />
		패스워드 : <input type="password" name="userPw" required="required" /><br />
		<button type="submit">로그인하기</button>
	</form>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
	


</script>
</body>
</html>