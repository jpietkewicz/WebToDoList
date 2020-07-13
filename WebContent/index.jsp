<%@page import="sql.ToDoListControl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To-Do List</title>
</head>
<body>
<% ToDoListControl tdl = new ToDoListControl(); %>
<h1>To-Do List</h1>
<form name="listForm" action="list.jsp" method="post">
	<table>
		<tbody>
			<input type="submit" value="Print List"/><br>
			<input type="text" name="item" /><br>
			<input type="button" value="Add Item" action="index.jsp" />
			<input type="button" value="Delete Item" action="index.jsp"/>
		</tbody>
	</table>
</form>

	
</body>
</html>