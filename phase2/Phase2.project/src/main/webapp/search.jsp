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
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
//request.setAttribute("username",username);
%>
<%-- <%=username %> --%>
<sql:update dataSource="${db}" var="rows">
insert into login values(?,?);
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.password}"></sql:param>
</sql:update>


<form action="FlightDetails.jsp">
<br><br><br><br>
<center>
date of travel<input type="date" name="dateoftravel"><br><br>
source city<input type="text" name="sourcecity"><br><br>
destination city<input type="text" name="destinationcity"><br><br>
number of person<input type="number" name="travelers"><br><br>
<input type = "hidden" name = "username" value ="${param.username}" />
<input type="submit" name="filter">
</center>
</form>  

</body>
</html>