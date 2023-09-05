<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert data</title>
</head>
<body>
<form action="AddServlet" method="get">
		<p>Student ID: <input type="text" name="s1" /> </p>
		<p>Student Name: <input type="text" name="s2" /> </p>
		<p>Student Dep: <input type="text" name="s3" /> </p>
		<input type="submit" value="Insert"/>
	</form><br>
	
	<form action="ReadServlet" method="get">
	<input type="submit" value="Read" />
	</form><br>
	
	<a href="update.jsp">click here to update data</a><br>
	<a href="delete.jsp">delete student </a>
</body>
</html>