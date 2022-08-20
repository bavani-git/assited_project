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
<strong>Flight Details....</strong>
<br>
<br>
<center>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" 
user="root" password="root"/>
<sql:query  dataSource="${db}"  var="rs">
select * from flightdetails;
</sql:query>
<table border="1">
<tr><th>airlinename</th><th>price</th><th>flightno</th><th>sourcecity</th><th>destinationcity</th><th>depaturetime</th><th>arrivaltime</th><th>totalseats</th><th>bookedseats</th><th>availableseats</th><th>dateoftravel</th><th>type</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airlinename}</td><td>${table.price}</td><td>${table.flightno}</td><td>${table.sourcecity}</td><td>${table.destinationcity}</td><td>${table.depaturetime}</td><td>${table.arrivaltime}</td><td>${table.totalseats}</td><td>${table.bookedseats}</td><td>${table.availableseats}</td><td>${table.dateoftravel}</td><td>${table.type}</td></tr>
</c:forEach>
</table>
</body>
</html>