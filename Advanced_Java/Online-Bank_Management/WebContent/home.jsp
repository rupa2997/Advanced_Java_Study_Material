<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="user" class="com.bank.dto.Customer" scope="session" ></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to CDAC Bank</h1>
	
	<table>
		<tr>
			<td>
				<a href="withdrawl.htm" >Withdraw Ammount</a>
			</td>
			
		</tr>
		<tr>
			<td>
				<a href="deposite.htm" >Deposite Amount</a>
			</td>
		</tr>
		<tr>
			<td>
				<a href="checkAmt.htm" >Check Balance</a>
			</td>
		</tr>
	</table>

</body>
</html>