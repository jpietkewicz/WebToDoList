<%@ page import="sql.ToDoListControl, java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To-Do List</title>
</head>
<body>
	<p>Here's your list!</p><br><br>
	<% ToDoListControl tdl = new ToDoListControl();
		ResultSet rs = tdl.printList();
		out.println("<table>");
		while (rs.next()) {
			out.println("<tr>");
			out.println("<td>- " + rs.getString("entry") + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		%>
</body>
</html>