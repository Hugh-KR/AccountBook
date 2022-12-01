<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	/* 브라우저 확대/축소 90% 기준 */
	.total{
		width: 1000px;
		margin-top: 10px;
	}
	.menu{
		width: 30%;
		height: 1000px;
		float: left;
		border-right: 1px solid lightgray;
	}
	.content{
		width: 65%;
		float: left;
		margin-left: 5%;
	}
	i{
		margin-right: 10px;
	}
	.tab-content{
		display: none;
	}
</style>
</head>
<body>
	<div class="total">
		<!-- 메뉴 -->
		<div class="menu">
			<jsp:include page="menu.jsp"></jsp:include>
		</div>
		<!-- 내용 -->
		<div class="content">
 			 <div class="tab-content">
 			 	<!-- 수입/지출 관리 페이지 -->
 			 	<h4 style="margin-left: 30px; margin-top: 20px;">
					<i class="fi fi-rr-add"></i>수입/지출 관리
				</h4>
				<hr style="width: 1700px;">
 			 	<jsp:include page="account.jsp"></jsp:include>
 			 </div>
 			 <div class="tab-content">
 			 	<!-- 캘린더 페이지 -->
 			 </div>
 			 <div class="tab-content">
 			 	<!-- 통계 페이지 -->
 			 </div>
 			 <div class="tab-content">
 			 	<!-- 목표 지출 페이지 -->
 			 </div>
		</div>

		
	</div>
</body>
</html>