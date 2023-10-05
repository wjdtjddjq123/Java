<%@ page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@ page contentType="text/html; charset=UTF-8"
		import="chap08.*"
%>

<%
	String viewPath = "/WEB-INF/views/chap08/";
	if(request.getMethod().equals("get")){
		pageContext.forward(viewPath + "calcForm.jsp");
	}else if(request.getMethod().equals("post")){
		
		CalcBean bean = new CalcBean();
		bean.setNum1(Integer.parseInt(request.getParameter("num1")));
		bean.setOperation(request.getParameter("operation"));
		bean.setNum2(Integer.parseInt(request.getParameter("num2")));
		
		request.setAttribute("result", bean.caculate());
		
		pageContext.forward(viewPath + "calcResult.jsp");
	}
%>
