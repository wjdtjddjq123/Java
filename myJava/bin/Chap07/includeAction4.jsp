<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>includeAction4.jsp</title>
</head>
<body>

	<h2>include 액션 예제4</h2>
	<hr />
	
	<jsp:include page="content4.jsp">
		<jsp:param name="num1" value="5" />
		<jsp:param name="num2" value="3" />
	</jsp:include>

</body>
</html>
