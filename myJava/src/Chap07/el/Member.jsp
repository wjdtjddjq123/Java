<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:userBean id="m" class="chap07.member" scope = "session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>member info</h2>
	<hr>
	<h4>name : ${sessionScope.m.name }</h4>
	<h4>email : ${m.email }</h4>
	<a herf="sessionMember.jsp">session</a>
</body>
</html>