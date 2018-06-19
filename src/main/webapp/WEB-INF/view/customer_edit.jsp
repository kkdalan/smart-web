<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="BASE" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>客戶管理 - 編輯客戶</title>
</head>
<body>
	<h1>編輯客戶介面</h1>

	<form id="customer_form" enctype="multipart/form-data">
		<input type="hidden" name="id" value="<c:out value="${customer.id}"/>">
		<table>
			<tr>
				<td>客戶名稱: </td>
				<td>
					<input type="text" name="name" value="<c:out value="${customer.name}"/>">
				</td>
			</tr>
			<tr>
				<td>聯絡人: </td>
				<td>
					<input type="text" name="contact" value="<c:out value="${customer.contact}"/>">
				</td>
			</tr>
			<tr>
				<td>電話號碼: </td>
				<td>
					<input type="text" name="telephone" value="<c:out value="${customer.telephone}"/>">
				</td>
			</tr>
			<tr>
				<td>電子郵件: </td>
				<td>
					<input type="text" name="email" value="<c:out value="${customer.email}"/>">
				</td>
			</tr>
			<tr>
				<td>照片: </td>
				<td>
					<input type="file" name="photo" value="${cusotmer.photo}">
				</td>
			</tr>
		</table>
		<button type="submit">儲存</button>
	</form>

	<script src="${BASE}/asset/lib/jquery/jquery-3.3.1.min.js"></script>
	<script src="${BASE}/asset/lib/jquery-form/jquery.form.min.js"></script>
	<script>
		$(function(){
			$('#customer_form').ajaxForm({
				type: 'post',
				url: '${BASE}/customer_edit',
				success: function(data){
					if(data){
						location.href = '${BASE}/customer';
					}
				}
			});			
		});
	</script>
</body>
</html>