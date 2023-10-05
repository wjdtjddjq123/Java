<%@ page contentType="text/html; charset=UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	tabla,td{
	border : 2px solid gray;
	
	border-collapse:collapse;
	}
	td{
	padding: 5px; 
	text-align: center;
	}
</style>
<body>

<h2>scriptlet example3</h2>
<hr>

<table>
<%
	for (int  i = 0; i<10; i++){
		%>		
	
	

<tr><td><%= "Data" + i %> </tr>
<% 
	}
%>
</table>
</body>
</html>