<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="get">
		<div>
			<label>Email</label> <input type="email" name="email">
		</div>
		<div>
			<label>Password</label> <input type="password" name="contact">
		</div>

		<div>
			<input type="submit" value="Register">
		</div>
	</form>
	<a href="register.jsp">Register</a>
	 <h6>${errorMsg}</h6>
</body>
</html>