<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="vo" items="${list}">
	검색한 id : ${vo.payselect} <br>
	검색한 name : ${vo.amount}  <br>
	검색한 url : ${vo.category}  <br>
	검색한 img : ${vo.memo}  <br>
	<hr>
	</c:forEach>

</body>
</html>