<%@page import="java.util.ArrayList"%>
<%@page import="com.te.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student Details</h3>
<%Student student = (Student)request.getAttribute("student"); 


%>
Student name: <%=student.getName() %> <br>
Student id: <%=student.getId() %> <br>
Student password: <%=student.getPassword() %> <br>
Student Marks: <%=student.getMarks() %> <br>

<a href="./logout">Log out</a>
</body>


</html>