<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page..</title>
</head>
<body>

	<h1>You are Welcome ${user.username}</h1>
	<h1>Your Email Address is ${user.email }</h1>
	<h1>Your Password is ${user.password }</h1>

	<h2>Registration Form</h2>
	<h2>${Header}</h2>
	<h2>${Desc}</h2>

</body>
</html>