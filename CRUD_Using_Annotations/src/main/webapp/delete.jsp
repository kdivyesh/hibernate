<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete data using hibernate</title>
</head>
<body>
<h3> enter id to delete Student </h3>
<form action="UpdateServlet" method="post">
Student ID:<input type="text" name="id"/>
<input type="submit" value="delete"/>
</form>
</body>
</html>