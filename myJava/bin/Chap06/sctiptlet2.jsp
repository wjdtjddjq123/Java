<%@ page contentType="text/html; charset=UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>scriptlet example1</h2>
<hr>
<%
	for (int  i = 0; i<10; i++){
		out.println(i+"<br>"+"Hello world!");
	}
%>
</body>
</html>