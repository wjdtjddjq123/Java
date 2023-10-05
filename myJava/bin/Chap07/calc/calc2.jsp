<%@ page contentType="text/html; charset=UTF-8"
	import="chap07.*"
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSP 계산기</h2>
	<hr>
	<form method="get">
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