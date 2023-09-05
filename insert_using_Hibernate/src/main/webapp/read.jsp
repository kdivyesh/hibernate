<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>reading data</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>
<% @SuppressWarnings("unchecked") List<Student> list = (List<Student>) request.getAttribute("slist"); %>
<table border="2">
<tr>
<th>Student ID</th>
<th>Student Name</th>
<th>Student Dept</th>
</tr>
<tr>
<% for(Student s : list) { %>
		<tr>
			<td> <%=s.getSid() %> </td>
			<td> <%=s.getSname() %> </td>
			<td> <%=s.getSdept() %> </td>
		</tr>
	<%} %>
</tr>
</table>



</body>
</html>