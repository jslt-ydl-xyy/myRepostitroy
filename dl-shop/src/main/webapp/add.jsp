<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/index3.css">
</head>
<script type="text/javascript" src="js/jquery-1.8.3.js">
</script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">

</script>
<body>
	<form action="add.do" method="post">
		<table>
			<tr>
				<td>店铺名称</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>创建日期</td>
				<td><input type="text" name="createtime" onclick="WdatePicker()"></td>
			</tr>
			<tr>
				<td>
					销售商品
				</td>
				<td>
						<input type="checkbox" name="iids" value="1">IBM笔记本
					   <input type="checkbox" name="iids" value="2">华为手机
					   <input type="checkbox" name="iids" value="3">苹果手机
					   <input type="checkbox" name="iids" value="4">内存<br>
				
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
			</tr>
		</table>
	
	
	</form>
		

</body>
</html>