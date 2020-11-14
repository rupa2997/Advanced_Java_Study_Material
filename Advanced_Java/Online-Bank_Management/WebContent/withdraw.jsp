<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spr:form action="withdraw.htm" method="post" commandName="cust" >
	<table align="center" >
		<tr>
			<td>
				Amount:
			</td>
			<td>
				<spr:input path="amt"/>
			</td>
		</tr>
		
		<tr>
			<td>
			<input type="submit"  value="Withdraw" >
			</td>
		</tr>
		</table>
		</spr:form>

</body>
</html>