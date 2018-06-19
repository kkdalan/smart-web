<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="/security"%>
<c:set var="BASE" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>首頁</title>
</head>
<body>
	<h1>首頁</h1>

	<security:guest>
		<p>身分:遊客</p>
		<a href="${BASE}/login"/>">登入</a>
	</security:guest>

	<security:user>
		<p>身分:<security:principal/></p>
		<ul>
			<li><a href="${BASE}/customer"/>">客戶管理</a></li>
		</ul>
		<a href="${BASE}/logout"/>">登出</a>
	</security:user>

</body>
</html>