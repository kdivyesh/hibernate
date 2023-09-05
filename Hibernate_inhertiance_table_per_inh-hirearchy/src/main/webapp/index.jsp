<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertion using table per inheritance hirearchy</title>
</head>
<body>
<h1>Hibernate-Inheritance-Single-Table</h1>
<h1>Data for Employee-Super class</h1>
<form action="AddServlet" method="get">
EmployeeName:<input type="text" name="t1"/><br/>
<h1>Data for RegularEmployee-subclass</h1>
Regular EmployeeName:<input type="text" name="t2"/><br/>
Regular Employee Salary:<input type="text" name="t3"/><br/>
Regular EmployeeBonus Amount:<input type="text" name="t4"/><br/>
<h1>Data for Contract Employee-subclass</h1>
Contract EmployeeName:<input type="text" name="t5"/><br/>
Contract Employee pay_per_hour:<input type="text" name="t6"/><br/>
Contract Employee Contrct_period:<input type="text" name="t7"/><br/>
<input type="submit" value="INSERT"><br/>
</form>
</body>
</html>