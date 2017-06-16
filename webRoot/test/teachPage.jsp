<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<li>教师管理</li>
				<li>></li>
				<li>教师列表</li>
			</ul>
		</header>
		<div class="body">
			<div class="operator">
				<input type="text" placeholder="请输入教师编号"/>
				<button>搜索</button>
			</div>
			<table class="body-table">
				<tr>
					<th>教师编号</th>
					<th>教师姓名</th>
					<th>是否是班主任</th>
					<th>所带班级编号</th>
					<th>教授课程</th>
				</tr>	
				<c:forEach var="teachersList" items="${teachersList}">
				<tr>
					<c:out value="${name}"/><p>
				<%-- 	<td><a href="${pageContext.request.contextPath}/teachDetail?id=${teacher.id}">${teacher.id}</a></td>
					<td>${teacher.name}</td>
					<td>${teacher.isTutor}</td>
					<td>${teacher.leadClassId}</td>
					<td>${teacher.teachCourse}</td> --%>
				</tr>
				</c:forEach>
			</table>
		</div>
	</section>	
	<!-- 底部 -->
	<footer>
	</footer>
	
</body>
</html>