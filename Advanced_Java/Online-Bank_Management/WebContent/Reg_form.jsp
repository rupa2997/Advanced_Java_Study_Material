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

<spr:form action="reg.htm" method="post" commandName="cust" >
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
				Gender:
			</td>
			<td>
				<spr:radiobutton path="gender" value="Male"/>Male
				<spr:radiobutton path="gender" value="Female"/>Female
			</td>
		</tr>
		
		<tr>
			<td>
				City:
			</td>
			
			<td>
				<spr:input path="city"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
				Account Type:
			</td>
			<td>
				<spr:radiobutton path="accType" value="Saving"/>Saving
				<spr:radiobutton path="accType" value="Current"/>Current
			</td>
		</tr>
		
		<tr>
			<td>
				Amount:
			</td>
			
			<td>
				<spr:input path="amt"/>
				minimum balance should be greater than 1000.<tr>
			
			</td>
			
			
		</tr>
			
		
		<tr>
			<td>
				<a href="login.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>


</body>
</html>