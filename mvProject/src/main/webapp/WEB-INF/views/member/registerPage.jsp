<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1><br>
<form action="./registerProcess" method="post">
ID: <input type="text" id="id" name="mb_id"><br>
PW: <input type="text" id="pw" name="mb_pw"><br>
닉네임: <input type="text" id="nick" name="mb_nick"><br>
핸드폰: <input type="text" id="phone" name="mb_phone"><br>
E-mail: <input type="text" id="email" name="mb_email"><br>
<input value="회원가입" type="submit" class="btn btn-primary">
</form>



</body>
</html>