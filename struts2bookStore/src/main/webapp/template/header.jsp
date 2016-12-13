<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="header">

	<h2>
	
		<span style="margin-left: 15px; margin-top: 15px;" class="label">
			BOOK <span style="color: white;">STORE</span>
		</span>
	</h2>
	
	<span style="color: black; margin-left: 15px;">
	
		<s:if test="%{username!=null && !hasActionErrors() }">Welcome <s:property value="username" /> | 
			<a href='<s:url action="logout.action" />'>Log out</a>
		</s:if>
		<s:else>
			Login
		</s:else>
	</span>
</div>