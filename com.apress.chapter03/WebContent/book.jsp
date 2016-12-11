<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.apress.chapter03.model.Book" %>
<%@page import="com.apress.chapter03.model.Author" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th width="20px">Descripcion</th>
			<th>code</th>
			<th>output</th>
		</tr>
		<%
			Book book = (Book) request.getAttribute ("bookAttrib");
			Author author = book.getAuthor();
		%>
		<tr>
			<td>Nombre del autor usando <b>Expresion y Scriptlet</b></td>
			<td>${fn:escapeXml("<%= author.getName () %>")} }</td>
			<td><%= author.getName() %></td>
		</tr>
		
		<jsp:useBean id="bookAttrib" class="com.apress.chapter03.model.Book" scope="request" />
		<tr>
			<td>Nombre del autor usando <b>jsp:getProperty action</b></td>
			<td>
				<table border="1">
					<tr>
						<td>
							${fn:escapeXml ("<jps:getProperty name = \"bookAttrib \" property= \"autor \" />")}
						</td>
					</tr>
					<tr>
						<td>
							${fn:escapeXml ("<jsp:getProperty name = \"bookAttrib \" property= \"autor.name \" />")}
						</td>
					</tr>
				</table>
			</td>
			<td>
				<table border="1">
					<tr>
						<td>
							<jsp:getProperty name="bookAttrib" property="author" />
						</td>
					</tr>
					<tr>
						<td>
							<%--
								<jsp:getProperty name="bookId" property="author.name" /> - this code will yield run time exception
							 --%>
							 Not possible
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td>Nombre del autor usando <b> EL </b></td>
			<td>${fn:escapeXml("${bookAttrib.author.name}")} }</td>
			<td>${bookAttrib.author.name}</td>
		</tr>
	</table>
	<br />
	<br />
	user-agent
	<br />
	<span>
		${header["user-agent"]}
	</span>
	<br />
	<br />
	cookie userName
	<br />
	<span>
		${cookie.userName.value}
	</span>
	<br />
	<br />
	Título del libro en session
	<br />
	<span>
		${sessionScope.book.bookTitle}
	</span>
</body>
</html>