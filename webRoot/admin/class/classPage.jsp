<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@page import="java.util.*"%>
<%@page import="com.my.domain.model.Teacher"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/welcome.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/core.js"></script>
</head>
<body>
	<!-- 头部 -->
	<div id="header"></div>		
	<!-- 左侧菜单栏 -->
	<div id="leftAside"></div>
	<!-- 内容 -->
	<section class="content">
		<header class="content-header">
			<ul class="breadcrumb">
				<li>班级管理</li>
				<li>></li>
				<li>班级列表</li>
			</ul>
		</header>
		<div class="body">
			<div class="operator">
				<input type="text" placeholder="请输入教师编号"/>
				<button>搜索</button>
			</div>
			<table class="body-table">
				<tr>
					<th>班级编号</th>
					<th>班级名称</th>
					<th>班主任姓名</th>
				</tr>	
				<tr>
					<td><a href="${pageContext.request.contextPath}/teachDetail?id=${teacher.id}">${teacher.id}</a></td>
					<td>${teacher.name}</td>
					<td>${teacher.isTutor}</td>
				</tr>
			</table>
		</div>
	</section>	
	<!-- 底部 -->
	<footer>
	</footer>
</body>
</html>