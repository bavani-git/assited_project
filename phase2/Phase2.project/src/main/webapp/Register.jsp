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
<% String username=request.getParameter("username");
String flightno=request.getParameter("flightno");
int travelers=Integer.parseInt(request.getParameter("travelers"));
%>
<center>
<strong>Enter The User Details</strong>
<%-- <%=username %> --%>
<%-- <%String flightno=request.getParameter("flightno"); %>
<%=flightno %>
 --%><br><br><br><br><br>
<form action="review.jsp">
<center>
  Fullname: <input type="text" name ="name"><br><br>
  Address: <input type="text" name ="address"><br><br>
  age: <input type="number" name ="age"><br><br>
  Phone no: <input type="number" name ="pno"><br><br>
  Goverment proof:<select name="govproof" >
  <option value="Aadhar number">Aadhar number</option>
  <option value="Voter ID">Voter ID</option>
  <option value="Driving Licence">Driving Licence</option>
  <option value="Pan Card">Pan Card</option>
</select><br>
  Government value :<input type="text" name ="gidvalue"><br><br>
  Country :<input type="text" name ="country"><br><br><br>
  
  

<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "flightno" value ="${param.flightno}" />
<input type = "hidden" name = "travelers" value ="${param.travelers}" />
<button>Submit</button>
</form>

</body>
</html>