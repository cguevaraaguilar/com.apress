<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Bookstore Login</title>
</head>
<body>
	<h3>Login Bookstore</h3>
	
	<s:actionerror />
	<s:form action="login.action" method="post">
		<s:textfield name="username" key="label.username" size="30" />
		<s:password name="passwrod" key="label.password" size="30" />
		<s:submit method="execute" align="center" />
	</s:form>
</body>
</html>