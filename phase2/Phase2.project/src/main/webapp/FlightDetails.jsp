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

<% String dateoftravel=request.getParameter("dateoftravel");
String sourcecity =request.getParameter("sourcecity");
String destinationcity=request.getParameter("destinationcity");
int travelers=Integer.parseInt(request.getParameter("travelers"));
String username=request.getParameter("username");
%>
<strong>Select the Flight to Book</strong>
<%-- <%-- <%=dateoftravel %>
<%=sourcecity %>
<%=destinationcity %>
<%=travelers %>
<%=username %> --%>
<br><br><br><br>
<center>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" user="root" password="root"/>
<sql:query  dataSource="${db}"  var="rs">
select airlinename,flightno,depaturetime,arrivaltime,availableseats,price,type from flightdetails where sourcecity=(?) and destinationcity=(?) and dateoftravel=(?)  ;
<sql:param value="${param.sourcecity}"></sql:param>
<sql:param value="${param.destinationcity}"></sql:param>
<sql:param value="${param.dateoftravel}"></sql:param>
</sql:query>
<table border="1">
<tr><th>airlinename</th><th>flightno</th><th>depaturetime</th><th>arrivaltime</th><th>availableseats</th><th>price</th><th>type</tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airlinename}</td><td>${table.flightno}</td><td>${table.depaturetime}</td><td>${table.arrivaltime}</td><td>${table.availableseats}</td><td>${table.price}</td><td>${table.type}</td><td>
<form action="Register.jsp">
<input type = "hidden" name = "flightno" value = "${table.flightno}" />
<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "travelers" value ="${param.travelers}" />
<input type="submit" value="register"></td></tr>
</form>
</c:forEach>
</table>

</body>
</html>