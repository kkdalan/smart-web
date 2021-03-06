<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="BASE" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>客戶管理 </title>
</head>
<body>
	<h1>客戶列表</h1>
	<hr>
	<table>
		<tr>
			<th>客戶名稱</th>
			<th>聯絡人</th>
			<th>電話號碼</th>
			<th>電子郵件</th>
			<th>操作</th>
		</tr>
		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td>${customer.name}</td>
				<td>${customer.contact}</td>
				<td>${customer.telephone}</td>
				<td>${customer.email}</td>
				<td>
				    <a href="${BASE}/customer_show?id=${customer.id}">檢視</a>
					<a href="${BASE}/customer_edit?id=${customer.id}">編輯</a>
					<a href="${BASE}/customer_delete?id=${customer.id}">刪除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="${BASE}/customer_create">新增</a>
	
</body>
</html>