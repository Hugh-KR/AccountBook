<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	int selectMonth = (Integer)request.getAttribute("mm");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uturn</title>
<script type="text/javascript">
	alert("해당하는 달의 목표치가 없습니다. 목표치 설정페이지로 이동합니다.");
	location.href="purpose.jsp?selectMonth=" + ${mm};
</script>
</head>
<body>
	<input type="text" name="selectMonth" value="<%=selectMonth%>"> 
</body>
</html>