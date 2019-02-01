<!--index.jsp-->
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <!DOCTYPE 
    html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> <html> 
    <head> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
    <script type="text/javascript"src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript"src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript"src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript"src="http://code.jquery.com/jquery-1.4.1.min.js"></script>

<script type="text/javascript"src="http://code.jquery.com/jquery-1.4.1.js"></script> 
 

  <link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css"/>
    <script src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
 
 

  <link rel="stylesheet"href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
  <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="jquery.min.js"></script>
  
<script type="text/javascript">
		//使用json作为传输数据的格式 
		$(function(){ 
		// 页面加载时初始化省份信息 
		// 使用POST方式请求数据 
		$.post("${pageContext.request.contextPath}/ProvinceJsonServlet",function(data){ 
		// 遍历返回的数据集合,将数据追加到身份下拉列表中 
		$(data).each(function(i,n){ 
		// json数据直接使用当前的对象直接.即可 
		$("#province").append("<option value='"+n.pid+"'>"+n.pname+"</option>"); }); },"json");
		// 接收的数据格式json 
		// 省份信息变化时变动城市信息
		 $("#province").bind("change",function(){ 
		 // 通过省份下拉列表的变化,向服务器请求对应省份城市的信息
		  $.get("${pageContext.request.contextPath}/ProvinceJsonServlet",{"pid":$(this).val()},function(data){ 
		  // 当省份变化时,初始化城市的信息 
		  $("#city").html("<option>-请选择-</option>"); 
		  // 遍历城市的信息,将数据追加到城市的下拉列表中 
		  $(data).each(function(i,n){ 
		  $("#city").append("<option value='"+n.cid+"'>"+n.cname+"</option>"); }); },"json"); 
		  // 接收的数据格式
		  json }); 
		  });

</script> 
</head> 
<body> 
<h1>JQuery中Ajax的操作</h1> 
<div id="div" style="width: 200px;height:200px"> 
</div> 
       <input type="button" value="test1" id="btn"/> 
<div id="div2" style="width: 200px;height:200px"> 
</div> 
      <input type="button" value="test2" id="btn2"/> 
<div id="div3" style="width: 200px;height:200px"> 
</div> 
      <input type="button" value="test3" id="btn3"/> 
<div id="div4" style="width: 200px;height:200px"> 
</div> 
    <input type="button" value="test4" id="btn4"/> 
</body> 
</html>
