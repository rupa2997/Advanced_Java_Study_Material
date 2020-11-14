<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spr:form action="login.htm" method="post" commandName="cust" >
	<table align="center" >
		<tr>
			<td>
				Customer Name:
			</td>
			<td>
				<spr:input path="custName"/>
			</td>
		</tr>
		<tr>
			<td>
				Customer Password:
			</td>
			<td>
				<spr:password path="custPass"/>
			</td>
		</tr>
		
		<tr>
			<td>
			<input type="submit"  value="Login" >
			</td>
		</tr>
		</table>
		</spr:form>

</body>
</html>