<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include Directive Test</title>
</head>
<body>

	<center>
		<%@ include file="../html/login.html"%>
		<h1>includeDirective.jsp</h1>
		<%@ include file="0testJSP.jsp"%>
		<hr>
		<!-- CANT DISPLAY PICTURE -->
		<%-- <%@ include pic="../res/pic.jpg" %> --%>
	</center>

</body>
</html>