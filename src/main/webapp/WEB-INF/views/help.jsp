<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is help page</title>
</head>
<body>

	<h1>This is help page</h1>

	<%
	/* String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("rollno");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>
		My name is:
		<%-- <%=name%> --%>
		${name }
	</h1>

	<h1>
		My rollno is:
		<%-- <%=rollno%> --%>
		${rollno }
	</h1>

	<h1>
		The Date and Time is:
		<%-- <%=time.toString()%> --%>
		${time }
	</h1>

	<hr>

	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>



	</c:forEach>

</body>
</html>