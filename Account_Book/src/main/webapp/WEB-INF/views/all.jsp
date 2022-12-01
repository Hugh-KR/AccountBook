<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}">
		<table border=1>
			<tr>
				<td class="left">아이디</td>
				<td class="right">${list}</td>
			</tr>
		</table>
		<hr>
	</c:forEach>
</body>
</html>