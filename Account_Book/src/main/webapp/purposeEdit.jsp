<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% // 스크립트 립 : 자바의 영역, DB와 연동가능
    int month = Integer.parseInt(request.getParameter("month")); 
    String food = request.getParameter("food"); 
    String trans = request.getParameter("trans"); 
    String medi = request.getParameter("medi"); 
    String leis = request.getParameter("leis"); 
    String etc = request.getParameter("etc"); 
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목표치 수정</title>

<script type="text/javascript">

</script>
</head>
<body>

<form action="update">
	<h3><%=month%>월 목표치 수정</h3><input type="hidden" name="month" value="<%=month%>">
	<table>
		<tr>
			<td>식비</td>
			<td>
				<input type="text" name="food" value="<%=food%>">
			</td>
		</tr>
		<tr>
			<td>교통비</td>
			<td>
				<input type="text" name="trans" value="<%=trans%>">
			</td>
		</tr>
		<tr>
			<td>의료비</td>
			<td>
				<input type="text" name="medi" value="<%=medi%>">
			</td>
		</tr>
		<tr>
			<td>여가비</td>
			<td>
				<input type="text" name="leis" value="<%=leis%>">
			</td>
		</tr>
		<tr>
			<td>기타</td>
			<td>
				<input type="text" name="etc" value="<%=etc%>">
			</td>
		</tr>
	</table>
	<button type="submit">수정 완료</button>
</form>
</body>
</html>