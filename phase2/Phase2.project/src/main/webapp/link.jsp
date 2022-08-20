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
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" 
user="root" password="root"/> 
     
<sql:update dataSource="${db}" var="rows">
update  admin 
set npassword=(?),cpassword=npassword
where uname=(?);
<sql:param value="${param.npassword}"></sql:param>
<sql:param value="${param.uname}"></sql:param>
</sql:update>
<form action="Admin.jsp">

Updated <input type="submit" value="return to Login">
</form>
</body>
</html>