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
<%String price=request.getParameter("price");
double a= Double.parseDouble(price);
int travelers=Integer.parseInt(request.getParameter("travelers"));
String flightno=request.getParameter("flightno");
String username=request.getParameter("username");
%>
<%-- <%=flightno %>
<%=username %> --%>
<center><h2>Scan to pay</h2>
 <!-- <img src=https://www.pngall.com/wp-content/uploads/5/Online-Payment-PNG-Image.png width="500" height="500"><td>
 -->	<center><img src=https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/QR_code_for_mobile_English_Wikipedia.svg/800px-QR_code_for_mobile_English_Wikipedia.svg.png  width="400" height="400">
<form action="payment.jsp">
<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "flightno" value ="${param.flightno}" />
 <center><input type="submit" value="pay">
</form>

</body>
</html>