<%@ page contentType="text/html; charset=UTF-8" %>

<jsp:useBean id="loginBean" class="chap07.LoginBean" />
<jsp:setProperty name="loginBean" property="*" />
<% 

	if(session.getAttribute("userId")!= null){
		response.sendRedirect("login.jsp");
	}else{
		if(request.getMethod().equals("POST")){
			if(loginBean.isLogin()){
				session.setAttribute("userId", loginBean.getId());
				response.sendRedirect("selProduct.jsp");
			}
		}
%>

<!DOCTYPE html>

<html>
<head>
    <title>login.html</title>
    <meta charset="UTF-8" />
</head>

<body>
    <h1>로그인</h1>
    <hr />
    
    <form method="POST">
        <fieldset>
            <legend>로그인</legend>
            <label for="id">아이디</label>
            <input type="text" name="id" id="id" />
            <label for="passwd">패스워드</label>
            <input type="password" name="passwd" id="passwd" />
            <input type="submit" value="로그인" />
        </fieldset>
    </form>
    
    <a href="checkOut.jsp">장바구니 확인</a>

</body>
</html>
<% }%>