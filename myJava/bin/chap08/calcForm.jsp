<%@ page contentType="text/html; charset=UTF-8"
		 import ="chap08.*"
%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSP 계산기</h2>
	<hr>
	<form method="post">
		<fieldset>
			<legend></legend>
			<input type="number" name="num1" value="0">
			<select name = "operation">
				<option selected> + </option>
				<option> - </option>
				<option> * </option>
				<option> / </option>
			</select>
			
			<input type="number" name="num2" value="0">
			<input type="submit" value="계산">
			<input type="reset" value="초기화">			
		</fieldset>
		
	</form>
	<hr>
</body>
</html>