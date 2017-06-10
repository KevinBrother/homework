<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/welcome.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/core.js"></script>

</head>
<body onload="window.location.href='${pageContext.request.contextPath}/teachPage';">
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
	<%-- 			   <%
					   //循环显示数据
					   List<Teacher> teacherslist = (List)request.getAttribute("teachersList"); // 取request里面的对象队列
					    if(teacherslist.size() != 0){
					      for(int i = 0; i < teacherslist.size(); i++){        
					         pageContext.setAttribute("teacher", teacherslist.get(i)); 
					           //保存到页面pageContext里面方便下面进行EL表达式调用
				     %> --%>
				<tr>
					${teachersList}
					<td>${teacher.id}</td>
					<td>${teacher.name}</td>
					<td>${teacher.isTutor}</td>
					<td>${teacher.leadClassId}</td>
					<td>${teacher.teachCourse}</td>
				</tr>	
			</table>
		</div>
	</section>	
	<!-- 底部 -->
	<footer>
	</footer>
	
</body>
</html>