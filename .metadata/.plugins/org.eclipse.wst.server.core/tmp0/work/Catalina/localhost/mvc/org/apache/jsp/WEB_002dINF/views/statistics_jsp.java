/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-12-02 07:27:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.multi.mvc.AccountDAO;
import com.multi.mvc.AccountVO;
import java.util.Random;
import java.util.ArrayList;
import org.apache.ibatis.reflection.SystemMetaObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class statistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1669019151789L));
    _jspx_dependants.put("jar:file:/D:/study/algorithm_study/AccountBook/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Account_Book/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.ibatis.reflection.SystemMetaObject");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.multi.mvc.AccountDAO");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.Random");
    _jspx_imports_classes.add("com.multi.mvc.AccountVO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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


      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("	<TITLE>캘린더</TITLE>\r\n");
      out.write("	<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javaScript\" language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	<style TYPE=\"text/css\">\r\n");
      out.write("		body {\r\n");
      out.write("		scrollbar-face-color: #F6F6F6;\r\n");
      out.write("		scrollbar-highlight-color: #bbbbbb;\r\n");
      out.write("		scrollbar-3dlight-color: #FFFFFF;\r\n");
      out.write("		scrollbar-shadow-color: #bbbbbb;\r\n");
      out.write("		scrollbar-darkshadow-color: #FFFFFF;\r\n");
      out.write("		scrollbar-track-color: #FFFFFF;\r\n");
      out.write("		scrollbar-arrow-color: #bbbbbb;\r\n");
      out.write("		margin-left:\"0px\"; margin-right:\"0px\"; margin-top:\"0px\"; margin-bottom:\"0px\";\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		td {font-family: \"돋움\"; font-size: 9pt; color:#595959;}\r\n");
      out.write("		th {font-family: \"돋움\"; font-size: 9pt; color:#000000;}\r\n");
      out.write("		select {font-family: \"돋움\"; font-size: 9pt; color:#595959;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		.divDotText {\r\n");
      out.write("		overflow:hidden;\r\n");
      out.write("		text-overflow:ellipsis;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("A:link { font-size:9pt; font-family:\"돋움\";color:#000000; text-decoration:none; }\r\n");
      out.write("A:visited { font-size:9pt; font-family:\"돋움\";color:#000000; text-decoration:none; }\r\n");
      out.write("A:active { font-size:9pt; font-family:\"돋움\";color:red; text-decoration:none; }\r\n");
      out.write("A:hover { font-size:9pt; font-family:\"돋움\";color:red;text-decoration:none;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</style>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("	");

	List<AccountVO> list = (List<AccountVO>)request.getAttribute("list");

 	ArrayList<String> todays = new ArrayList<String>();
 	ArrayList<Integer> deposits = new ArrayList<Integer>();
 	ArrayList<Integer> withdraws = new ArrayList<Integer>();
 	for(int i = 0; i<list.size(); i++){
 		String to1 = list.get(i).getPaydate();
 		int de1 = list.get(i).getDeposit();
 		int wi1 = list.get(i).getWithdraw();
 		todays.add(to1);
 		deposits.add(de1);
 		withdraws.add(wi1);
 		System.out.println("삽입후 "+ todays);
 		System.out.println("삽입후1 "+ deposits);
 		System.out.println("삽입후2 "+ withdraws);
 	}
 	
 	/* for(int i = 0; i<todays.size(); i++){
 		System.out.println("하나씩"+todays.get(i));
 	}
 	 */
	 

	
      out.write("\r\n");
      out.write("<form name=\"calendarFrm\" id=\"calendarFrm\" action=\"\" method=\"post\"> \r\n");
      out.write("<DIV id=\"content\" style=\"width:712px; text-align: center; margin:0 auto;\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align =\"right\">\r\n");
      out.write("	\r\n");
      out.write("		<input type=\"button\" onclick=\"javascript:location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'\" value=\"오늘\"/> <!-- 오늘날짜로 바로 이동하는 버튼 -->\r\n");
      out.write("	</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--날짜 네비게이션  -->\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"1\" id=\"KOO\" bgcolor=\"#F3F9D7\" style=\"border:1px solid #CED99C\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"60\">\r\n");
      out.write("\r\n");
      out.write("	<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td height=\"10\">\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\" >\r\n");
      out.write("			<a href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("?year=");
      out.print(year-1);
      out.write("&month=");
      out.print(month);
      out.write("\" target=\"_self\"> \r\n");
      out.write("				<b>&lt;&lt;</b><!-- 이전해 -->\r\n");
      out.write("			</a>\r\n");
      out.write("			\r\n");
      out.write("			");
if(month > 0 ){ 
      out.write("\r\n");
      out.write("			<a href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("?year=");
      out.print(year);
      out.write("&amp;month=");
      out.print(month-1);
      out.write("\" target=\"_self\">\r\n");
      out.write("				<b>&lt;</b><!-- 이전달 -->\r\n");
      out.write("			</a>\r\n");
      out.write("			");
} else {
      out.write("\r\n");
      out.write("				<b>&lt;</b>\r\n");
      out.write("			");
} 
      out.write("\r\n");
      out.write("			&nbsp;&nbsp;\r\n");
      out.write("			");
      out.print(year);
      out.write("년\r\n");
      out.write("			\r\n");
      out.write("			");
      out.print(month+1);
      out.write("월\r\n");
      out.write("			&nbsp;&nbsp;\r\n");
      out.write("			");
if(month < 11 ){ 
      out.write("\r\n");
      out.write("			<a href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("?year=");
      out.print(year);
      out.write("&amp;month=");
      out.print(month+1);
      out.write("\" target=\"_self\">\r\n");
      out.write("				<!-- 다음달 --><b>&gt;</b>\r\n");
      out.write("			</a>\r\n");
      out.write("			");
}else{
      out.write("\r\n");
      out.write("				<b>&gt;</b>\r\n");
      out.write("			");
} 
      out.write("\r\n");
      out.write("			<a href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("?year=");
      out.print(year+1);
      out.write("&amp;month=");
      out.print(month);
      out.write("\" target=\"_self\">\r\n");
      out.write("				<!-- 다음해 --><b>&gt;&gt;</b>\r\n");
      out.write("			</a>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<table border=\"0\" cellspacing=\"1\" cellpadding=\"1\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("<THEAD>\r\n");
      out.write("<TR bgcolor=\"#CECECE\">\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\"><font color=\"red\">일</font></DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\">월</DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\">화</DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\">수</DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\">목</DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\">금</DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("	<TD width='100px'>\r\n");
      out.write("	<DIV align=\"center\"><font color=\"#529dbc\">토</font></DIV>\r\n");
      out.write("	</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</THEAD>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR>\r\n");


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
	
	
	//System.out.println(sUseDate +" "+iUseDate );
	System.out.println("인덱스"+index);
	
	
	String backColor = "#EFEFEF";
	if(iUseDate == intToday ) {
		backColor = "#c9c9c9";
	} 
	out.println("<TD valign='top' align='left' height='92px' bgcolor='"+backColor+"' nowrap>");
	
	
      out.write("\r\n");
      out.write("	<font color='");
      out.print(color);
      out.write("'>\r\n");
      out.write("		");
      out.print(index );
      out.write(" <!-- 날짜 출력구간 -->\r\n");
      out.write("	</font>\r\n");
      out.write("	\r\n");
      out.write("	<!--  1) s=\"2022-01-02\"  String[] s2 = s.split(\"-\") 배열을 arraylist로 변경해서, toString) -->\r\n");
      out.write("	\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("</TR>\r\n");
      out.write("\r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</DIV>\r\n");
      out.write("</form>\r\n");
      out.write("<br> \r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/statistics.jsp(130,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("./statistics");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/statistics.jsp(149,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/statistics");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/views/statistics.jsp(154,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/statistics");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /WEB-INF/views/statistics.jsp(166,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/statistics");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /WEB-INF/views/statistics.jsp(172,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/statistics");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }
}
