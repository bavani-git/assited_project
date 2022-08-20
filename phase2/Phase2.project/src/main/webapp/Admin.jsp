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
<form action="valid.jsp">
<center>
<br>
<br>
<br>
<br>
Admin userID: <input type="text" name="uname"><br>
<br>
Password: <input type="password" name="cpassword"><br>
<input type="submit" value="summit">
</center>
</form>

<form action="change.jsp">
<input type="submit" value="CHANGE PASSWORD">
</form>
</body>
</html>