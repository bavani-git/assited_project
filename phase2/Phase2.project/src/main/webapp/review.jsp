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
String name=request.getParameter("name");
String address=request.getParameter("address");
int age=Integer.parseInt(request.getParameter("age"));
int pno=Integer.parseInt(request.getParameter("pno"));
String username=request.getParameter("username");
String govproof=request.getParameter("govproof");
String gidvalue=request.getParameter("gidvalue");
String country=request.getParameter("country");
int travelers=Integer.parseInt(request.getParameter("travelers"));
%>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/> 
     
<sql:update dataSource="${db}" var="rows">
insert into registerdetails values(?,?,?,?,?,?,?,?);
<sql:param value="${param.name}"></sql:param>
<sql:param value="${param.address}"></sql:param>
<sql:param value="${param.age}"></sql:param>
<sql:param value="${param.pno}"></sql:param>
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.govproof}"></sql:param>
<sql:param value="${param.gidvalue}"></sql:param>
<sql:param value="${param.country}"></sql:param>
</sql:update>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" user="root" password="root"/>
<sql:query  dataSource="${db}"  var="rs">
select airlinename,flightno,depaturetime,arrivaltime,availableseats,price,type from flightdetails where flightno=(?)  ;
<sql:param value="${param.flightno}"></sql:param>

</sql:query>
<br><br>
<br><br>
<center>
<strong>Please press pay to proceed processing</strong>
<table border="1">
<tr><th>airlinename</th><th>flightno</th><th>depaturetime</th><th>arrivaltime</th><th>availableseats</th><th>price</th><th>type</tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airlinename}</td><td>${table.flightno}</td><td>${table.depaturetime}</td><td>${table.arrivaltime}</td><td>${table.availableseats}</td><td>${table.price}</td><td>${table.type}</td>
<td>
<br>

<form action="dummy.jsp">
<input type = "hidden" name = "price" value ="${table.price}" />
<input type = "hidden" name = "travelers" value ="${param.travelers}" />
<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "flightno" value ="${param.flightno}" />
<input type="submit" value="pay"></td>

</tr>
</form>

</c:forEach>
</table>
<!-- 
<img src="https://www.istockphoto.com/photos/qr-code" width="200" height="200" style="text-align:center;">
 -->
<sql:update dataSource="${db}" var="rows">
UPDATE flightdetails
SET bookedseats =bookedseats+(?), availableseats =totalseats-bookedseats
WHERE flightno = (?);
<sql:param value="${param.travelers}"></sql:param>
<sql:param value="${param.flightno}"></sql:param>
</sql:update>

</body>
</html>