<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>LOGIN PAGE</h1>
	
	<h2 style="color: red;">${ message }</h2>
	<hr>
	
	User Name: ${ UserModel.userName } <br>
	PassWord:  ${ UserModel.passWord } <br>
	<hr>
	
		<form action="trang-chu" method="POST">
			<label>User Name: </label> <input type="text" name="username"> <br>
			<label>PassWord: </label> <input type="password" name="password"><br>
			<button type="submit">Dang Nhap</button>
		</form>
	
</body>
</html>