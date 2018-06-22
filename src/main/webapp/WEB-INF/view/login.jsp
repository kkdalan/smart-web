<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="/security"%>
<c:set var="BASE" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>登錄</title>
</head>
<body>
	<h1>登錄</h1>

	<security:guest>
		<form action="${BASE}/login" method="post">
			<table>
				<tr>
					<td>用戶名:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>密碼:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">登錄</button>
					</td>
				</tr>
			</table>
		</form>
	</security:guest>

	<security:user>
		<c:redirect url="${BASE}/" />
	</security:user>

</body>
</html>