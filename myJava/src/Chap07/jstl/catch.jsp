
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>catch.jsp</title>
</head>
<body>

	<h2>JSTL c:catch.jsp</h2>
	<hr />
	
	<c:catch var="errMsg">
		<%= 10 / 5 %><br />
	</c:catch>
	
	error message: ${errMsg}
	
	<hr />
	<c:catch var="errMsg">
		<%= 10 / 0 %>
	</c:catch>
	
	error message: ${errMsg}
	
	<%--${ 10 / 0 }--%>

</body>
</html>










