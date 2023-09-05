<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update data using hibernate</title>
</head>
<body>
<h3>enter update data</h3>
<form action="UpdateServlet" method="get">
<p>Student ID: <input type="text" name="t1" /> </p>
		<p>Student Name: <input type="text" name="t2" /> </p>
		<p>Student Dep: <input type="text" name="t3" /> </p>
		<input type="submit" value="Update"/>

</form>

</body>
</html>