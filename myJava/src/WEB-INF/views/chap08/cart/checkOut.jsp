<%@ page contentType="text/html; charset=UTF-8"
		 import="java.util.*"
%>


<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>장바구니 확인</title>
</head>
<body>

	<h2>장바구니 확인</h2>
	<hr />
	
	
	<br /><br />
	<a href="selProduct.jsp">상품 구매 페이지로 이동</a>
	
	<form method="post">
		<input type="hidden" name="command" value="cartClear">
		<input type="submit" value="장바구니 비우기">
	</form>
	
	<form method="post">
		<input type="hidden" name="command" value="logout">
		<input type="submit" value="로그아웃">
	</form>

</body>
</html>