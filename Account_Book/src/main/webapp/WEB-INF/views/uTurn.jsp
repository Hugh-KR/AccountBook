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
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
<link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-straight/css/uicons-regular-straight.css'>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript">
	
	
	/* 메뉴 클릭 시 이벤트 -> 해당 메뉴에 대한 content 출력 */
	$(function() {
	        $(".tab-content").eq(0).show(0); // 첫번째 tab 보여줌
	        $(".tab-ul li").click(function() { // li 클릭하면
	            var idx = $(this).index(); // tab-ul li 중 클릭한 것이 몇 번째인지 확인
	            $(".tab-content").hide(); // tab-content 숨김
	            $(".tab-content").eq(idx).show(); // 클릭한 것에 해당하는 tab-content 보여줌
	            $(".tab-ul li").removeClass("active"); // active 클래스 지워줌
	            $(this).addClass("active"); // 클릭한 것에 active 클래스 추가
	            if(idx == 0){  // 누른 버튼이 수입/지출 관리이면 
	                location.href="account.jsp";
	            } else if(idx == 1){  // 누른 버튼이 캘린더이면
	                location.href="calendar.jsp"; // 캘린더 페이지 호출할 Controller 주소 입력!
	            } else if(idx == 2){ // 누른 버튼이 통계이면
	                location.href=""; // 통계 페이지 호출할 Controller 주소 입력!
	            } else{ // 누른 버튼이 목표지출이면
	                location.href="intro.jsp";  // 목표지출 페이지 호출할 Controller 주소 입력!
	            }
	        });
	    });
	alert("해당하는 달의 목표치가 없습니다. 목표치 설정페이지로 이동합니다.");
	location.href="purpose.jsp?selectMonth=" + ${mm};
</script>
</head>
<body>
	<input type="text" name="selectMonth" value="<%=selectMonth%>"> 
	<div class="total">
		<!-- 메뉴 -->
		<div class="menu">
			<h2 style="margin-left: 30px; margin-top: 20px;">
				<i class="fi fi-rr-money-check-edit"></i>가계부
			</h2>
			<ul class="tab-ul">
				<li><a id="tab1"><i class="fi fi-rr-add"></i>수입/지출
						관리</a></li>
				<li><a id="tab2"><i class="fi fi-rs-calendar-check"></i>캘린더</a>
				</li>
				<li><a id="tab3"><i class="fi fi-rs-chart-histogram"></i>통계</a>
				</li>
				<li  class="active"><a id="tab4"><i class="fi fi-rr-coins"></i>목표 지출</a></li>
			</ul>
		</div>
		<!-- 내용 -->
		<div class="content">
			<div class="tab-content">
				<!-- 수입/지출 관리 페이지 -->
				<h4 style="margin-left: 30px; margin-top: 20px;">
					<i class="fi fi-rr-coins"></i>목표 지출
				</h4>
				<hr style="width: 200%;">
				<br>
				여기 내용 넣기
			</div>
			
		</div>
	</div>
</body>
</html>