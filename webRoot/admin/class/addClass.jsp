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
<body>
<%-- 	${param.name}
	${admin.name}
	${abc} --%>
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
			<form action="${pageContext.request.contextPath}/addTeach" method="post">
				姓名： <input type="text" name="name" placeholder="教师姓名"/> <br/>
				<!-- 教授课程： <input type="text" name="" placeholder="课程名称：英语  语文"/><br/> -->
				<input type="submit" value="确定"/>
			</form>
		</div>
	</section>	
	<!-- 底部 -->
	<footer>
	</footer>
	
</body>
</html>