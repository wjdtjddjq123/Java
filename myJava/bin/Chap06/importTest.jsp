<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.time.*"
    errorPage = "error.jsp"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>hello, world ..!</h2>
	<hr>
	<h4>현재 날자와 시간 : <%= LocalDateTime.now() %></h4>
</body>
</html>