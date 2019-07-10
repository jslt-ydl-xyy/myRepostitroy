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
<script type="text/javascript">
function add(){

	location="add.jsp";
	
}
function change(own){
	if($(own).prop("checked")==false){
			$(":checkbox:gt(0)").prop("checked",false)

		}else{
			$(":checkbox:gt(0)").prop("checked",true)
			}

	
}
function del(){
	var ids = "";
	$(":checkbox:gt(0):checked").each(function(){
			ids += ","+$(this).val();

		})
	ids = ids.substring(1);
	if(ids == ""){
		alert("请选择");
		}else{	
			$.post("del.do",{ids:ids},function(flag){
				if(flag){
						alert("删除成功");
						location="list.do";
					}

				},"json");
			}
	
}
function detail(sid){
	alert(sid);
	location="detail.do?sid="+sid;
}
</script>
<body>
	<table>
		<tr>
			<td colspan="6">
			<form action="list.do" method="post">
				销售商品：<input type="checkbox" name="iids" value="1">IBM笔记本
					   <input type="checkbox" name="iids" value="2">华为手机
					   <input type="checkbox" name="iids" value="3">苹果手机
					   <input type="checkbox" name="iids" value="4">内存<br>
				店铺名称：<input type="text" name="sname">
				<input type="submit" value="查询">
			</form>
			<input type="button" value="添加" onclick="add()">
			<input type="button" value="批量删除" onclick="del()">
			</td>
		</tr>
		<tr>
			<td><input type="checkbox" id="cb1" onchange="change(this)"></td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="n">
			<tr>
				<td><input type="checkbox" name="sid" value="${n.sid }"></td>
				<td>${n.sid }</td>
				<td>${n.sname }</td>
				<td>${n.createtime }</td>
				<td>
					<c:forEach items="${n.list }" var="m">
					${m.iname }
					</c:forEach>
				</td>
				<td>
					<input type="button" value="详情" onclick="detail(${n.sid})">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6">
				<a href="list.do?pageNum=${page.navigateFirstPage}">首页</a>
				<a href="list.do?pageNum=${page.prePage}">上一页</a>
				<a href="list.do?pageNum=${page.nextPage}">下一页</a>
				<a href="list.do?pageNum=${page.navigateLastPage}">尾页</a>
			</td>
		
		</tr>
	</table>

</body>
</html>