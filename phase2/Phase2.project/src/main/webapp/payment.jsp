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
<%
String flightno=request.getParameter("flightno");
String username=request.getParameter("username");
%>

<center><img src=https://media.istockphoto.com/photos/green-checkmark-picture-id503451933?k=20&m=503451933&s=612x612&w=0&h=5X5bKop-YhMgPI5YgPOvroGXlbRX1shmtsGUM948cZo= width="400" height="400">
<center>
<center>
<center><h2>payment successful..!!!</h2>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/> 
     
<sql:update dataSource="${db}" var="rows">
 insert into booking(username,flightno)select username ,flightno from login,flightdetails where username=(?) and flightno=(?);
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.flightno}"></sql:param>

</sql:update>
</body>
</html>