<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd"> <html> <head> <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> <title>Insert title here</title>
</head> <body>Edit  Information <form:form method="POST" action="/Practice_Project_1/editsave"
modelAttribute="emp">
id: <form:input type="number" path="eid" />
<br>
name: <form:input path="name" />
<br>
designation: <form:input path="designation" />
<br>
salary: <form:input type="number" path="salary" />
<br> <input type="submit" value="Save changes">
</form:form>
${emp.eid} ${emp.name} ${emp.designation} ${emp.salary}
</body>
</html>