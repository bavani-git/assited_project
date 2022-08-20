<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><strong>Booking details ......
<br>
<br>
<center>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" 
user="root" password="root"/>
<sql:query  dataSource="${db}"  var="rs">
select * from booking;
</sql:query>
<table border="1">
<tr><th>username</th><th> bookingid</th><th>flightno</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.username}</td><td>${table.bookingid}</td><td>${table.flightno}</td></tr>
</c:forEach>
</table>
</body>
</html>