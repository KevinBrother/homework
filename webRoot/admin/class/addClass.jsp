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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/util.js"></script>
<script type="text/javascript">
	$.ajax({
		type: "post",
		url: "${pageContext.request.contextPath}/aClasses?method=teachPage",
		dataType: "json",
		success: function(data){
			console.log(data)
			for(var i = 0; curTeachPage = data.result.teachPage[i]; i++) {
				$("#teacherId").append("<option value=" + curTeachPage.id + ">" + curTeachPage.name + "</option>")
			}

			if(param("id"))
				$("#classId").val(param("id"))
		}
	})
</script>
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
				<li>班级管理</li>
				<li>></li>
				<li>新增班级</li>
			</ul>
		</header>
		<div class="body">
			<form action="${pageContext.request.contextPath}/aClasses?method=makeClass" method="post">
				班级名称： <input type="text" name="name" placeholder="班级名称"/> <br/>
					      <input type="hidden" name="id" id="classId" value="0"/>
				班主任编号： <select style="width: 200px;" id="teacherId" name="teacherId"></select> <br/>
				
				<input type="submit" value="确定"/>
			</form>
		</div>
	</section>	
	<!-- 底部 -->
	<footer>
	</footer>
	
</body>
</html>