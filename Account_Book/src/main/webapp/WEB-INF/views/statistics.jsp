<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<%@page import="com.multi.mvc.AccountDAO"%>
<%@page import="com.multi.mvc.AccountVO"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
Calendar cal = Calendar.getInstance(); //캘린더 객체 이용 현재날짜 가져옴

String strYear = request.getParameter("year");
String strMonth = request.getParameter("month");
	//AccountDAO dao = new AccountDAO();
	
	
//1) s="2022-01-02" --> String[] s2 = s.split("-") --> 배열을 arraylist로 변경해서, toString)

int year = cal.get(Calendar.YEAR); //현재 연도
int month = cal.get(Calendar.MONTH); //현재 달
int date = cal.get(Calendar.DATE); //현재 일

//System.out.println(year+" "+month + " "+ date);

if(strYear != null) 
{
  year = Integer.parseInt(strYear);
  month = Integer.parseInt(strMonth);
   
}else{
	System.out.println(year+" "+month + " "+ date);
}

//년도/월 셋팅
cal.set(year, month, 1); 

int startDay = cal.getMinimum(java.util.Calendar.DATE); // 달에서 첫번째날
int endDay = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH); // 달에서 마지막 날
int start = cal.get(java.util.Calendar.DAY_OF_WEEK); // 캘린더가 가르키는 특정 날짜가 무슨 요일인지 알기위해 쓰임 화요일일 경우 세번째 날이므로 3
int newLine = 0;

//오늘 날짜 저장.
Calendar todayCal = Calendar.getInstance(); // todayCal에 저장 
SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd"); // 날짜 표기 설정 문자열임
int intToday = Integer.parseInt(sdf.format(todayCal.getTime())); //날짜를 인트로 변경 20221201

//System.out.println("inttoday는"+ intToday);

%>

<html lang="ko">
<HEAD>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel='stylesheet'
	href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
<link rel='stylesheet'
	href='https://cdn-uicons.flaticon.com/uicons-regular-straight/css/uicons-regular-straight.css'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	
	<TITLE>캘린더</TITLE>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js">
</script>

<script type="text/javascript">
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
	</script>
	
	<style TYPE="text/css">
		body {
		scrollbar-face-color: #F6F6F6;
		scrollbar-highlight-color: #bbbbbb;
		scrollbar-3dlight-color: #FFFFFF;
		scrollbar-shadow-color: #bbbbbb;
		scrollbar-darkshadow-color: #FFFFFF;
		scrollbar-track-color: #FFFFFF;
		scrollbar-arrow-color: #bbbbbb;
		margin-left:"0px"; margin-right:"0px"; margin-top:"0px"; margin-bottom:"0px";
		
		}

		td {font-family: "돋움"; font-size: 9pt; color:#595959;}
		th {font-family: "돋움"; font-size: 9pt; color:#000000;}
		select {font-family: "돋움"; font-size: 9pt; color:#595959;}


		.divDotText {
		overflow:hidden;
		text-overflow:ellipsis;
		}

A:link { font-size:9pt; font-family:"돋움";color:#000000; text-decoration:none; }
A:visited { font-size:9pt; font-family:"돋움";color:#000000; text-decoration:none; }
A:active { font-size:9pt; font-family:"돋움";color:red; text-decoration:none; }
A:hover { font-size:9pt; font-family:"돋움";color:red;text-decoration:none;}


	</style>
	<script type="text/javascript" src="resources/js/jquery-3.6.1.js"></script>
</HEAD>
<BODY>

	<%
	List<AccountVO> list = (List<AccountVO>)request.getAttribute("list");

 	ArrayList<String> todays = new ArrayList<String>(); //날짜 
 	ArrayList<Integer> deposits = new ArrayList<Integer>(); // 입금
 	ArrayList<Integer> withdraws = new ArrayList<Integer>(); // 출금 
 	for(int i = 0; i<list.size(); i++){
 		String to1 = list.get(i).getPaydate();
 		String to2 = to1.replaceAll("-", ""); // 2022-11-11 --> 20221111 로 변경
 		//System.out.println("바뀜1"+ to2);
 		int de1 = list.get(i).getDeposit();
 		int wi1 = list.get(i).getWithdraw();
 		todays.add(to2);
 		deposits.add(de1);
 		withdraws.add(wi1);
 		
 		/* System.out.println("삽입후 "+ todays);
 		System.out.println("삽입후1 "+ deposits);
 		System.out.println("삽입후2 "+ withdraws); */
 	}
 	
 	/* for(int i = 0; i<todays.size(); i++){
 		System.out.println("하나씩"+todays.get(i));
 	}
 	 */
	%>
	<div class="total">
		<!-- 메뉴 -->
		<div class="menu">
			<h2 style="margin-left: 30px; margin-top: 20px;">
				<i class="fi fi-rr-money-check-edit"></i>가계부
			</h2>
			<ul class="tab-ul">
				<li><a id="tab1"><i class="fi fi-rr-add"></i>수입/지출
						관리</a></li>
				<li class="active"><a id="tab2"><i class="fi fi-rs-calendar-check"></i>캘린더</a>
				</li>
				<li><a id="tab3"><i class="fi fi-rs-chart-histogram"></i>통계</a>
				</li>
				<li ><a id="tab4"><i class="fi fi-rr-coins"></i>목표 지출</a></li>
			</ul>
		</div>
	
<form name="calendarFrm" id="calendarFrm" action="" method="post"> 
<div class="content">
<!-- <DIV id="content" style="width:712px; text-align: center; margin:0 auto;"> -->

<table width="100%" border="0" cellspacing="1" cellpadding="1">
<tr>
	<td align ="right">
	
		<input type="button" class="btn btn-success" onclick="javascript:location.href='<c:url value='./statistics' />'" value="오늘"/> <!-- 오늘날짜로 바로 이동하는 버튼 -->
	</td>

</tr>
</table>
<!--날짜 네비게이션  -->
<table width="100%" border="0" cellspacing="1" cellpadding="1" id="KOO" bgcolor="#F3F9D7" style="border:1px solid #CED99C">

<tr>
<td height="60">

	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td height="10">
		</td>
	</tr>
	
	<tr>
		<td align="center" >
			<a href="<c:url value='/statistics' />?year=<%=year-1%>&month=<%=month%>" target="_self"> 
				<b>&lt;&lt;</b><!-- 이전해 -->
			</a>
			
			<%if(month > 0 ){ %>
			<a href="<c:url value='/statistics' />?year=<%=year%>&amp;month=<%=month-1%>" target="_self">
				<b>&lt;</b><!-- 이전달 -->
			</a>
			<%} else {%>
				<b>&lt;</b>
			<%} %>
			&nbsp;&nbsp;
			<%=year%>년
			
			<%=month+1%>월
			&nbsp;&nbsp;
			<%if(month < 11 ){ %>
			<a href="<c:url value='/statistics' />?year=<%=year%>&amp;month=<%=month+1%>" target="_self">
				<!-- 다음달 --><b>&gt;</b>
			</a>
			<%}else{%>
				<b>&gt;</b>
			<%} %>
			<a href="<c:url value='/statistics' />?year=<%=year+1%>&amp;month=<%=month%>" target="_self">
				<!-- 다음해 --><b>&gt;&gt;</b>
			</a>
		</td>
	</tr>
	</table>

</td>
</tr>
</table>
<br>
<table border="0" cellspacing="1" cellpadding="1" bgcolor="#FFFFFF">
<THEAD>
<TR bgcolor="#CECECE">
	<TD width='100px'>
	<DIV align="center"><font color="red">일</font></DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center">월</DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center">화</DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center">수</DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center">목</DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center">금</DIV>
	</TD>
	<TD width='100px'>
	<DIV align="center"><font color="#529dbc">토</font></DIV>
	</TD>
</TR>
</THEAD>
<TBODY>
<TR>
<%

//처음 빈공란 표시
for(int index = 1; index < start ; index++ )
{
  out.println("<TD >&nbsp;</TD>");
  newLine++;
}
	
//테스트용
 //ArrayList<Integer> list = new ArrayList<>();
 //Random r = new Random();
 
 //테스트용2
  //for(int i = 0; i < endDay; i++){
	// list.add(r.nextInt(100));
 //} 
	
for(int index = 1; index <= endDay; index++)
{
	String color = "";

	if(newLine == 0){			color = "RED"; // 일요일 
	}else if(newLine == 6){ 	color = "#529dbc"; // 토요일일때 색변경
	}else{						color = "BLACK"; }; // 평일 

	String sUseDate = Integer.toString(year);

	sUseDate += Integer.toString(month+1).length() == 1 ? "0" + Integer.toString(month+1) : Integer.toString(month+1);
	sUseDate += Integer.toString(index).length() == 1 ? "0" + Integer.toString(index) : Integer.toString(index);

	int iUseDate = Integer.parseInt(sUseDate);
	
	
	System.out.println(sUseDate +" "+iUseDate );
	//System.out.println("인덱스"+index);
	
	
	String backColor = "#EFEFEF";
	if(iUseDate == intToday ) {
		backColor = "#c9c9c9";
	} 
	out.println("<TD valign='top' align='left' height='92px' bgcolor='"+backColor+"' nowrap>");
	
	%>
	

</script>
	<font color='<%=color%>'>
		<%=index %><!-- 날짜 출력구간 -->
	</font>
	
	<!--  1) s="2022-01-02"  String[] s2 = s.split("-") 배열을 arraylist로 변경해서, toString) -->
	
<%
	if(todays.contains(sUseDate) == true){
		int indexed = todays.indexOf(sUseDate); 
		int depo = deposits.get(indexed);
		int with = withdraws.get(indexed);
				
		out.println("<BR>");
		out.println("<font color='blue'>+"+ depo);
		out.println("<BR>");
		out.println("<font color='red'>-"+ with);
		
	}
	
	

		
	//기능 제거	
	out.println("</TD>");
	newLine++;

	if(newLine == 7)
	{
	  out.println("</TR>");
	  if(index <= endDay)
	  {
	    out.println("<TR>");
	  }
	  newLine=0;
	}
}
//마지막 공란 LOOP
while(newLine > 0 && newLine < 7)
{
  out.println("<TD>&nbsp;</TD>");
  newLine++;
}
%>

</TR>

</TBODY>
</TABLE>
</div>
</form>
</div>
</BODY>
</HTML>
