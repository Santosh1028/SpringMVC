<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<body>
	<h1>This is home page</h1>
	<h1>Called by Home Controller</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>

	<h1>
		Name is
		<%=name%></h1>

	<h1>
		Id is
		<%=id%></h1>

	<%
	for (String s : friends) {
	%>

	<h1><%=s %></h1>

	<%
	}
	%>
</body>

</body>
</html>