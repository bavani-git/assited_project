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
<br>
<center><strong>Flight Ticket Booking Welcome.....</strong></center>
<br>
<br>
<br>
<form action="search.jsp">
<center> 


email: <input type="text" name="username"  maxlength=40><br>
<br>
Password: <input type="password" name="password" maxlength="10"><br>
<br>
   <button>Submit</button>
</center>
</form>
 
<form action="Admin.jsp">
<input type="submit" value=" Enter as Admin">
 </form>  
</body>
</html>