<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	/* 수입/지출 클릭 시 이벤트 */
	$(function ($) {
	  	$(".tab-content2").eq(0).show(0); // 첫번째 tab 보여줌
	  	$(".tab-ul2 li").click(function () {  // li 클릭하면
	    	var idx = $(this).index();  // tab-ul2 li 중 클릭한 것이 몇 번째인지 확인
	    	$(".tab-content2").hide();  // tab-content2 숨김
	    	$(".tab-content2").eq(idx).show();  // 클릭한 것에 해당하는 tab-content2 보여줌
	    	$(".tab-ul2 li").removeClass("active2");  // active2 클래스 지워줌
	    	$(this).addClass("active2");  // 클릭한 것에 active2 클래스 추가
	  	});
	});
</script>
<style>
	button{
		width: 200px;
		height: 45px;
		border: 1.5px solid;
		border-radius: 5px;
		border-color: #2C952C;
		outline-color: #2C952C;
		background: white;
	}
	button:hover{
		background: #2C952C;
		color: white;
	}
	.form-control{
		border-top: 0;
		border-left: 0;
		border-right: 0;
	}
	ul.tab-ul2 li{
		margin-right: 20px;
		padding: 10px;
	 	color: black;
	 	list-style: none;
	 	border: 1.5px solid;
		border-radius: 5px;
		border-color: #2C952C;
		outline-color: #2C952C;
		background: white;
	}
	ul.tab-ul2 li a{
		color: black;
	}
	ul.tab-ul2 li.active2{
		background: #2C952C;
		color: white;
	}
	.tab-content2{
		display: none;
	}
</style>
</head>
<body>
<br>
<div class="row" style="width: 1700px;">
	<div class="col-md-6">
		<form action="insert_account.multi" style= "margin-left: 30px;">
			<table style="width: 500px;">
				<tr>
					<td style="width: 100px;">날짜</td>
					<td>
						<input type="date" class="form-control" name="paydate" style="height: 50px;">
					</td>
				</tr>
			</table>
			<br><br>
			<table style="width: 500px;">
				<tr>
					<td style="width: 100px;">분류</td>
					<td>
						<div class="custom-control custom-radio">
    						<input type="radio" class="custom-control-input" name="payselect" value="수입" checked="checked">
    						<label class="custom-control-label" for="customRadio">수입</label>
 						 </div>
					</td>
					<td>
						<div class="custom-control custom-radio">
    						<input type="radio" class="custom-control-input" name="payselect" value="지출">
    						<label class="custom-control-label" for="customRadio">지출</label>
 						 </div>
					</td>
				</tr>
			</table>
			<br><br>
			<table style="width: 500px;">
				<tr>
					<td style="width: 100px;">카테고리</td>
					<td>
						<select name="category" class="custom-select" style="border-top: 0; border-left: 0; border-right: 0;">
   							<option selected></option>
    						<option value="food">식비</option>
   	 						<option value="trans">교통비</option>
    						<option value="medi">의료비</option>
    						<option value="lels">여가</option>
    						<option value="etc">기타</option>
  						</select>
  					</td>
				</tr>
			</table>
			<br><br>
			<table style="width: 500px;">
				<tr>
					<td style="width: 100px;">금액</td>
					<td><input type="text" class="form-control" name="amount"></td>
				</tr>
			</table>
			<br><br>
			<table style="width: 500px;">
				<tr>
					<td style="width: 100px;">내용</td>
					<td><input type="text" class="form-control" name="memo"></td>
				</tr>
			</table>
			<br><br>
			<div style="float: left;">
			<button type="reset" style="width: 150px;">취소</button>
			<button type="submit" style="background: #2C952C; color: white; width: 330px;">추가</button>
			</div>
		</form>
	</div>
  	<div class="col-md-6">
		<ul class="tab-ul2">
    		<li style="float: left; margin-right: 0; width: 150px; text-align: center;" class="active2"><a>수입</a></li>
    		<li style="float: left; margin-right: 0; width: 150px; text-align: center;"><a>지출</a></li>
  		</ul>
  		<div class="content">
 			 <div class="tab-content2" style="overflow: sroll; width: 600px; height: 750px;">
 			 	<!-- 수입 리스트 -->
 			 	<br>
 			 	<h4>총 수입</h4>
				<h1>5000000</h1> <br>
  				<table class="table table-hover">
    				<thead>
      					<tr>
       	 					<th>날짜</th>
        					<th>카테고리</th>
        					<th>내용</th>
        					<th>금액</th>
      					</tr>
    				</thead>
    				<tbody>
      					<tr>
       			 			<td>John</td>
        					<td>Doe</td>
        					<td>john@example.com</td>
      					</tr>
    				</tbody>
  				</table>
 			 </div>
 			 <div class="tab-content2">
 			 	<!-- 지출 리스트 -->
 			 	지출
 			 </div>
		</div>
		<br>
		<div style="float: left; margin-left: 45px;">
			<button style="background: #2C952C; color: white; width: 240px;">수정</button>
			<button style="background: #2C952C; color: white; width: 240px;">삭제</button>
		</div>
  	</div>
</div>
</body>
</html>