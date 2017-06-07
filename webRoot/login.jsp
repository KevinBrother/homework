<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath()%>/login">
		姓名：<input type="text" name="name"/>
		职位：<select name="job">
				<option value="管理员">管理员</option><br/>
				<option value="教师">教师</option><br/>
				<option value="学生">学生</option>
			</select>
		密码：<input type="text" name="password"/>
		
		<button type="submit">确定</button>
	</form>
</body>
</html>