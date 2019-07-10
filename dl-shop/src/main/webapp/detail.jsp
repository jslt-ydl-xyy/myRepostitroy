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
<body>
<table>
		<tr>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
		</tr>
		<c:forEach items="${list }" var="n">
			<tr>
				<td>${n.sid }</td>
				<td>${n.sname }</td>
				<td>${n.createtime }</td>
				<td>
					<c:forEach items="${n.list }" var="m">
					${m.iname }
					</c:forEach>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>