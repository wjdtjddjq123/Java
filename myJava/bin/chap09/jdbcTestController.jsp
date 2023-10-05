<%@ page contentType="text/html; charset=UTF-8"
		 import="java.util.*, chap09.*"
%>
​
<%
	UserInfoDAO userDAO = (UserInfoDAO)session.getAttribute("userDAO");
	if(userDAO == null) {
		userDAO = new UserInfoDAO();
		session.setAttribute("username", new UserInfoDAO());
	}
	
	if(request.getMethod().equals("POST")) {
		request.setCharacterEncoding("UTF-8");
		
		UserInfoDO userDO = new UserInfoDO();
		userDO.setUsername(request.getParameter("username"));
		userDO.setUsername(request.getParameter("email"));
		
		userDAO.insertUserInfo(userDO);		
	}
	
	request.setAttribute("userList", userDAO.getAllUserInfo());
	pageContext.forward("/WEB-INF/views/chap09/jdbcTest_v3.jsp");
%>