<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<%@page import="com.apress.books.model.Category" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<!--  
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		 -->
		<link rel="stylesheet" href="css/bookstore.css" type="text/css" />
		<script src="js/jquery.min.js"></script>
		<script src="js/bookstore.js"></script>
		
		<title>Menu</title>
	</head>
	<body>
		<li>
			<div>
				<a class="link1" href="<%param1 %>?action=allBooks">
					<span class="label" style="margin-left: 15px;">All Books</span>
				</a>
			</div>
		</li>
		<li>
			<div>
				<span class="label" style="margin-left: 15px;">Categories</span>
			</div>
		<ul>
		<%
			
		// Obtiene el listado de categorías
		List<Category> categoryList1 = 
			(List<Category>) application.getAttribute("categoryList");
	
		// Obtiene el iterador a partir de la lista.
		Iterator<Category> iterator1 = iterator();
		
		// Recorre el iterador.
		while (iterator1.hasNext()) {
			
			Category category1 = (Category) iterator1.next(); 
		%>
			<li>
				<a class="label" href="<%=param1%>?action=category&categoryId=<%=category1.getId()%>&category=<%=category1.getCategoryDescription()%>">
					<span class="label" style="margin-left: 30px;"><%=category1.getCategoryDescription() %></span>
				</a>
			</li>
		<%} // while (iterator1.hasNext()) { %>	
		</ul>
		</li>
		
		<form class="search">
			<input type="hidden" name="action" value="search" />
			<input id="text" type="text" name="keyWord" size="12" />
			<span class="tooltip_message">?</span>
			<p />
			<input id="submit" type="submit" value="Search" />
		</form>
		
		<script type="text/javascript">
		
			$(document).ready (function () {
				$("span.tooltip_message").hover(function () {
					$(this).append(
						'<div class="message"><p>Search by Keyword in:<ul><li>Author First Name </li><li>Author Last Name</li><li>Title of the book</li></p></div>'
					);
				}, function () {
					$("div.message").remove ();
				}) // $("span.tooltip_message").hover(function () {
			}) // $(document).ready (function () {
			
			$("span.tooltip_img1").hover (function () {
				$(this).append (
					'<div class="message"><ul><li>Title - Beginning Groovy, Grails and Griffon</li></ul></div>'
				);
			}, function () {
				$("div.message").remove();
			}); // $("span.tooltip_img1").hover (function () {
			
		</script>
	</body>
</html>