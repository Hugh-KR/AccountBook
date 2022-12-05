<%@page import="com.multi.mvc.PurposeVO"%>
<%@page import="com.multi.mvc.AccountVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
List<AccountVO> list = (List<AccountVO>) request.getAttribute("acc"); //소비한 항목 리스트를 가져옴 
PurposeVO target = (PurposeVO) request.getAttribute("vo"); //목표치 항목 리스트를 가져옴
int thisMonth = (Integer) request.getAttribute("mm"); //사용자가 입력한 달

double allSum = 0; //현재 소비금액 총 합
double[] categoryNow = new double[5]; //각 카테고리별 현재 소비금액을 저장하는 배열 / [0] = food , [1] = trans, [2] = medi, [3] = leis, [4] = etc

double targetSum = 0; //목표치 총 합;
double[] categoryTarget = new double[5]; //각 카테고리별 소비목표를 저장하는 배열 / [0] = food , [1] = trans, [2] = medi, [3] = leis, [4] = etc

double totalPercent = 0;
String totalGrade = ""; //종합적인 수치 등급
String[] categoryGrade = new String[5]; //각 카테고리별 소비등급을 저장하는 배열/ [0] = food , [1] = trans, [2] = medi, [3] = leis, [4] = etc
String[] gradeColor = new String[5]; //전체 및 각 카테고리별 소비등급에 따라 컬러를 저장하는 배열 
int[] cgCount = new int[5]; //카테고리별 등급이 몇개인지 저장하는 배열 [0]=여유, [1]=안전, [2]=주의, [3]=경고, [4]=초과

System.out.println("from first screen : " + thisMonth); //사용자가 입력한 달을 콘솔에 출력

for (int i = 0; i < list.size(); i++) { //account table에서 받아온 값을 각 항목별로 합해 categoryNow에 저장, 달이 사용자가 입력한 값과 일치해야만 처리(다른 달의 기록이 더해지는 것을 방지)
	int tablemonth = Integer.parseInt(list.get(i).getPaydate().substring(5, 7));
	if (tablemonth == thisMonth) {
		if (list.get(i).getCategory().equals("food")) {
	categoryNow[0] = categoryNow[0] + list.get(i).getAmount();
		} else if (list.get(i).getCategory().equals("trans")) {
	categoryNow[1] = categoryNow[1] + list.get(i).getAmount();
		} else if (list.get(i).getCategory().equals("medi")) {
	categoryNow[2] = categoryNow[2] + list.get(i).getAmount();
		} else if (list.get(i).getCategory().equals("leis")) {
	categoryNow[3] = categoryNow[3] + list.get(i).getAmount();
		} else if (list.get(i).getCategory().equals("etc")) {
	categoryNow[4] = categoryNow[4] + list.get(i).getAmount();
		}
	} else {

	}
}

categoryTarget[0] = target.getFood(); //각 목표치 항목들을 변수에 저장 
categoryTarget[1] = target.getTrans();
categoryTarget[2] = target.getMedi();
categoryTarget[3] = target.getLeis();
categoryTarget[4] = target.getEtc();

allSum = categoryNow[0] + categoryNow[1] + categoryNow[2] + categoryNow[3] + categoryNow[4]; //소비항목 전체 합 
for (int i = 0; i < categoryTarget.length; i++) { //소비 목표치 전체 합
	targetSum = targetSum + categoryTarget[i];
}

totalPercent = Math.round((allSum / targetSum * 100) * 100) / 100.0;
if (totalPercent > 0 && totalPercent <= 40) {
	totalGrade = "여유";
} else if (totalPercent > 40 && totalPercent <= 70) {
	totalGrade = "안전";
} else if (totalPercent > 70 && totalPercent <= 90) {
	totalGrade = "주의";
} else if (totalPercent > 90 && totalPercent <= 100) {
	totalGrade = "경고";
} else {
	totalGrade = "초과";
}

int[] use = new int[5]; //카테고리별 사용율 저장 배열 
for (int i = 0; i < categoryNow.length; i++) { //카테고리별 사용율을 저장
	use[i] = (int) (categoryNow[i] / categoryTarget[i] * 100);
}

for (int i = 0; i < categoryGrade.length; i++) {
	if (use[i] >= 0 && use[i] <= 40) {
		categoryGrade[i] = "여유";
		cgCount[0]++;
	} else if (use[i] > 40 && use[i] <= 70) {
		categoryGrade[i] = "안전";
		cgCount[1]++;
	} else if (use[i] > 70 && use[i] <= 90) {
		categoryGrade[i] = "주의";
		cgCount[2]++;
	} else if (use[i] > 90 && use[i] <= 100) {
		categoryGrade[i] = "경고";
		cgCount[3]++;
	} else {
		categoryGrade[i] = "초과";
		cgCount[4]++;
	}
}

String totalgradeColor = "";

if (totalGrade.equals("여유")) {
	totalgradeColor = "blue";
} else if (totalGrade.equals("안전")) {
	totalgradeColor = "green";
} else if (totalGrade.equals("주의")) {
	totalgradeColor = "yellow";
} else if (totalGrade.equals("경고")) {
	totalgradeColor = "orange";
} else {
	totalgradeColor = "red";
}

for (int i = 0; i < 5; i++) {
	if (categoryGrade[i].equals("여유")) {
		gradeColor[i] = "blue";
	} else if (categoryGrade[i].equals("안전")) {
		gradeColor[i] = "green";
	} else if (categoryGrade[i].equals("주의")) {
		gradeColor[i] = "yellow";
	} else if (categoryGrade[i].equals("경고")) {
		gradeColor[i] = "orange";
	} else {
		gradeColor[i] = "red";
	}

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel='stylesheet'
	href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
<link rel='stylesheet'
	href='https://cdn-uicons.flaticon.com/uicons-regular-straight/css/uicons-regular-straight.css'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'gauge' ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {

		var data = google.visualization.arrayToDataTable([
				[ 'Label', 'Value' ], [ '식비',
<%=use[0]%>
	],
				[ '교통',
<%=use[1]%>
	], [ '의료',
<%=use[2]%>
	],
				[ '취미',
<%=use[3]%>
	], [ '기타',
<%=use[4]%>
	] ]);

		var options = {
			width : 1000,
			height : 200,
			redFrom : 90,
			redTo : 100,
			yellowFrom : 70,
			yellowTo : 90,
			greenFrom : 40,
			greenTo : 70,
			minorTicks : 5
		};

		var chart = new google.visualization.Gauge(document
				.getElementById('chart_div'));

		chart.draw(data, options);
	}

	$(function() {
		$(".tab-content").eq(0).show(0); // 첫번째 tab 보여줌
		$(".tab-ul li").click(function() { // li 클릭하면
			var idx = $(this).index(); // tab-ul li 중 클릭한 것이 몇 번째인지 확인
			$(".tab-content").hide(); // tab-content 숨김
			$(".tab-content").eq(idx).show(); // 클릭한 것에 해당하는 tab-content 보여줌
			$(".tab-ul li").removeClass("active"); // active 클래스 지워줌
			$(this).addClass("active"); // 클릭한 것에 active 클래스 추가
			if (idx == 0) { // 누른 버튼이 수입/지출 관리이면 
				location.href = "a.jsp";
			} else if (idx == 1) { // 누른 버튼이 캘린더이면
				location.href = "b.jsp"; // 캘린더 페이지 호출할 Controller 주소 입력!
			} else if (idx == 2) { // 누른 버튼이 통계이면
				location.href = "c.jsp"; // 통계 페이지 호출할 Controller 주소 입력!
			} else { // 누른 버튼이 목표지출이면
				location.href = "intro.jsp"; // 목표지출 페이지 호출할 Controller 주소 입력!
			}
		});
	});
</script>
<style type="text/css">
.tBtn {
	border-radius: 20px;
	border: 0;
	background: green;
	color: white;
	width: 140px;
	height: 40px;
}

.circle1 {
	background-color: black;
	width: 38px;
	height: 38px;
	border-radius: 75px;
	text-align: center;
	margin: 0 auto;
	font-size: 12px;
	vertical-align: middle;
	line-height: 150px;
}
</style>

</head>
<body>

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
				<hr style="width: 100%;">
				<br>

				<table style="width: 300%">
					<tr>
						<td width="150px" style="text-align: center;">
							<button type="button" class="tBtn"
								style="background-color: green"
								onClick="location.href='purposeEdit.jsp?food=<%=target.getFood()%> &trans=<%=target.getTrans()%> &medi=<%=target.getMedi()%> &leis=<%=target.getLeis()%> &etc=<%=target.getEtc()%> &month=<%=thisMonth%>'">수정하기</button>
						</td>
						<td style="text-align: center;"><a
							style="text-align: center; font-size: 50px; font-weight: bold;"
							id="title"><%=thisMonth%>월 목표치</a></td>
						<td width="150px" style="text-align: center;">
							<button type="button" class="tBtn"
								style="background-color: green"
								onClick="location.href='intro.jsp'">첫페이지로</button>
						</td>
					</tr>
				</table>
				<table width="300%" style="font-size: 30px">
					<tr>
						<td align="center">
							<table id="useAll">
								<tr>
									<td>전체 소비금액</td>
									<td>:</td>
									<td><%=(int) allSum%>/<%=(int) targetSum%>원</td>
									<td></td>
								</tr>
							</table>
						</td>
						<td align="center">
							<table id="useAllGrade">
								<tr>
									<td>현재 고객님의 총 소비 상태는</td>
									<td><div class="circle1"
											style="background-color: <%=totalgradeColor%>"></div></td>
									<td><strong><%=totalGrade%></strong></td>
									<td>입니다</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="300%">
					<tr>
						<td align="center">
							<div id="chart_div" style="width: 1000px; height: 200px;"></div>
						</td>
					</tr>
				</table>

				<table width="300%">
					<tr>
						<td align="center">
							<table>
								<tr style="font-size: 40px;">
									<td><div class="circle1" style="background-color: blue"></div></td>
									<td>여유</td>
									<td><%=cgCount[0]%></td>
									<td width="10px"></td>
									<td><div class="circle1" style="background-color: green"></div></td>
									<td>안전</td>
									<td><%=cgCount[1]%></td>
									<td width="10px"></td>
									<td><div class="circle1" style="background-color: yellow"></div></td>
									<td>주의</td>
									<td><%=cgCount[2]%></td>
									<td width="10px"></td>
									<td><div class="circle1" style="background-color: orange"></div></td>
									<td>경고</td>
									<td><%=cgCount[3]%></td>
									<td width="10px"></td>
									<td><div class="circle1" style="background-color: red"></div></td>
									<td>초과</td>
									<td><%=cgCount[4]%></td>
								</tr>
							</table>
						</td>
					</tr>


				</table>
				<table width="300%">
					<tr>
						<td style="font-size: 40px;" align="center">
							<table style="text-align: center">
								<tr>
									<td colspan="6">사용현황</td>
								</tr>
								<tr>
									<td width="200px"></td>
									<td width="400px">현재 사용량</td>
									<td width="400px">목표 금액</td>
									<td width="200px">사용율</td>
									<td colspan="2">단계</td>
								</tr>
								<tr>
									<td>식비</td>
									<td style="text-align: right; width: 200px"><%=(int) categoryNow[0]%>원</td>
									<td style="text-align: right; width: 200px">${vo.food}원</td>
									<td><%=use[0]%>%</td>
									<td><div class="circle1"
											style="background-color: <%=gradeColor[0]%>"></div></td>
									<td><%=categoryGrade[0]%></td>
								</tr>
								<tr>
									<td>교통비</td>
									<td style="text-align: right"><%=(int) categoryNow[1]%>원</td>
									<td style="text-align: right">${vo.trans}원</td>
									<td><%=use[1]%>%</td>
									<td><div class="circle1"
											style="background-color: <%=gradeColor[1]%>"></div></td>
									<td><%=categoryGrade[1]%></td>
								</tr>
								<tr>
									<td>의료비</td>
									<td style="text-align: right"><%=(int) categoryNow[2]%>원</td>
									<td style="text-align: right">${vo.medi}원</td>
									<td><%=use[2]%>%</td>
									<td><div class="circle1"
											style="background-color: <%=gradeColor[2]%>"></div></td>
									<td><%=categoryGrade[2]%></td>
								</tr>
								<tr>
									<td>여가비</td>
									<td style="text-align: right"><%=(int) categoryNow[3]%>원</td>
									<td style="text-align: right">${vo.leis}원</td>
									<td><%=use[3]%>%</td>
									<td><div class="circle1"
											style="background-color: <%=gradeColor[3]%>"></div></td>
									<td><%=categoryGrade[3]%></td>
								</tr>
								<tr>
									<td>기타</td>
									<td style="text-align: right"><%=(int) categoryNow[4]%>원</td>
									<td style="text-align: right">${vo.etc}원</td>
									<td><%=use[4]%>%</td>
									<td><div class="circle1"
											style="background-color: <%=gradeColor[4]%>"></div></td>
									<td><%=categoryGrade[4]%></td>
								</tr>
							</table>
						</td>

					</tr>


				</table>





			</div>

		</div>
	</div>






</body>
</html>