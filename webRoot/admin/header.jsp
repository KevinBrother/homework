<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<header class="header">
	<div class="logo">
		<a href="${pageContext.request.contextPath}/admin/welcome.jsp">首页</a>
	</div>
	<div class="login">
		<div class="logout">
			<a>[注销]</a>
		</div>
		<div class="loginName">
			欢迎
			<span>${admin.name}</span>
		</div>
	</div>	
</header>