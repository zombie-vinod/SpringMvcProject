<%@page import="com.te.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome 

<%
	Student student=(Student)request.getAttribute("student");
	
%>

<%=student.getName() %>
<%=student.getId() %>
<%=student.getPassword() %>
<%=student.getMarks() %>

</body>
</html>