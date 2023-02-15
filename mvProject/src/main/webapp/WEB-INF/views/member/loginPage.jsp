<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인화면</h1>
<form action="./loginProcess" method="get">
아이디: <input type="text" name="mb_id"><br>
비밀번호: <input type="text" name="mb_pw"><br>
<input type="submit" value="로그인" class="btn btn-primary"><br>
</form>

<a href="./registerPage">회원가입</a>
</body>
</html>