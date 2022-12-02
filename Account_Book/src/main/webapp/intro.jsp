<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Purpose</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	date = new Date();
	month = date.getMonth() + 1;
	
	$(document).ready(function(){
		$('#month').attr("value", month);
	});
</script>
</head>
<body>

<form action="search">
	<table>
		<tr>
			<td>보고싶은 달을 선택하세요</td>
			<td>
				<input type="text" name="month" id="month" value="">
			</td>
		</tr>
	</table>
	<button type="submit">선택 완료</button>
</form>
</body>
</html>