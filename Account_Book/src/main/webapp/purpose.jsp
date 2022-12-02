<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% // 스크립트 립 : 자바의 영역, DB와 연동가능
		String selectMonth = request.getParameter("selectMonth");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Purpose</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
/* 	date = new Date();
	month = date.getMonth() + 1;
	
	$(document).ready(function(){
		$('#month').attr("value", ${mm});
	}); */
	
</script>
</head>
<body>

<form action="pps.do">
	<table>
		<tr>
			<td>식비</td>
			<td>
				<input type="text" name="food" value="500000">
			</td>
		</tr>
		<tr>
			<td>교통비</td>
			<td>
				<input type="text" name="trans" value="500000">
			</td>
		</tr>
		<tr>
			<td>의료비</td>
			<td>
				<input type="text" name="medi" value="50000">
			</td>
		</tr>
		<tr>
			<td>여가비</td>
			<td>
				<input type="text" name="leis" value="500000">
			</td>
		</tr>
		<tr>
			<td>기타</td>
			<td>
				<input type="text" name="etc" value="500000">
			</td>
		</tr>
		<tr>
			<td>목표 달</td>
			<td>
				<input type="text" name="month" id="month" value="<%=selectMonth%>">
			</td>
		</tr>
	</table>
	<button type="submit">설정 완료</button>
</form>
</body>
</html>