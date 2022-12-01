<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
<link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-straight/css/uicons-regular-straight.css'>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<style>
	ul.tab-ul li{
		margin-top: 50px;
		margin-right: 20px;
		padding: 10px;
	 	font-size: 20px;
	 	color: black;
	 	list-style: none;
	}
	ul.tab-ul li a{
		color: black;
	}
	ul.tab-ul li.active{
		background: #2C952C;
		border-radius: 5px;
		color: white;
	}
}
</style>
<script>
/* 메뉴 클릭 시 이벤트 -> 해당 메뉴에 대한 content 출력 */
$(function ($) {
	  $(".tab-content").eq(0).show(0); // 첫번째 tab 보여줌
	  $(".tab-ul li").click(function () {  // li 클릭하면
	    var idx = $(this).index();  // tab-ul li 중 클릭한 것이 몇 번째인지 확인
	    $(".tab-content").hide();  // tab-content 숨김
	    $(".tab-content").eq(idx).show();  // 클릭한 것에 해당하는 tab-content 보여줌
	    $(".tab-ul li").removeClass("active");  // active 클래스 지워줌
	    $(this).addClass("active");  // 클릭한 것에 active 클래스 추가
	  });
	});

</script>
</head>
<body>
	<!-- 메뉴  -->
	<h2 style="margin-left: 30px; margin-top: 20px;">
		<i class="fi fi-rr-money-check-edit"></i>가계부
	</h2>
	<ul class="tab-ul">
    	<li class="active">
      		<a id="tab1"><i class="fi fi-rr-add"></i>수입/지출 관리</a>
    	</li>
    	<li>
      		<a id="tab2" ><i class="fi fi-rs-calendar-check"></i>캘린더</a>
    	</li>
    	<li>
      		<a id="tab3" ><i class="fi fi-rs-chart-histogram"></i>통계</a>
    	</li>
    	<li>
      		<a id="tab4" ><i class="fi fi-rr-coins"></i>목표 지출</a>
    	</li>
  	</ul>
</body>
</html>