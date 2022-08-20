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
<%String cpassword=request.getParameter("cpassword");%>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world" 
user="root" password="root"/> 
     
<sql:query  dataSource="${db}"  var="rs">
select uname from admin where cpassword=(?) and uname=(?);
<sql:param value="${param.cpassword}"></sql:param>
<sql:param value="${param.uname}"></sql:param>
</sql:query>


<tr><th>INVALID login</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<!-- <tr><td>Invalid Login</td></tr> -->
<%response.sendRedirect("distable.jsp"); %>

</c:forEach>
</body>
</html>