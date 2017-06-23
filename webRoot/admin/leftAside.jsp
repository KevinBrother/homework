<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<aside class="leftAside">
	<ul class="level1">
		<li>
			<a>教师管理</a>
			<ul class="level2">
				<li><a href="${pageContext.request.contextPath}/teachPage">教师列表</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/teach/addTeach.jsp">添加教师</a></li>
			</ul>
		</li>
		<li>
			<a>班级管理</a>
			<ul class="level2">
				<li><a href="${pageContext.request.contextPath}/admin/class/classPage.jsp">班级列表</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/teach/addTeach.jsp">添加班级</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/teach/teachDetail.jsp">班级详情</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/teach/modfiyTeach.jsp">修改班级信息</a></li>
			</ul>
		</li>
		
	</ul>
</aside>