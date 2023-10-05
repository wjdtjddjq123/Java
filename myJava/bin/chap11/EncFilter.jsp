<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>encfileter 테스트</h2>
	<hr>
	<form method="post">
		<label for="korParam"></label>
		<input type="text" name="korParam">
		<input type="submit" value="전송">
	</form>
	<hr>
	<h4>KorParam: ${param.KorParam}</h4>
</body>
</html>