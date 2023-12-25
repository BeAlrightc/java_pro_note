<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/admin.css">

<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/admin.js"></script>

<!-- 引入zTree插件 -->
<link rel="stylesheet" type="text/css" href="<%=path%>/third/zTree_v3/css/zTreeStyle/zTreeStyle.css" >
<script type="text/javascript" src="<%=path%>/third/zTree_v3/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="<%=path%>/third/zTree_v3/js/jquery.ztree.excheck.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		//重新绑定表单提交
		$("#add_btn").bind("click", function() {
		    var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.getCheckedNodes(true);
            
            var fatherId = nodes[0].areaId;
            var areaRank = parseInt(nodes[0].areaRank) + 1;
            
		    if(nodes.length==0){
		      $("#areaRank").val(1);
		    } else {
		      $("#fatherId").val(fatherId);
		      $("#areaRank").val(areaRank);
		    }
		   
			$('form').submit(); 
		});
		
	});
</script>

</head>
  
  <body>
  <div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加行政区域信息</strong></div>
  <div class="body-content">
    <form id="form-addrole" method="post" class="form-x" action="<%=path%>/area/add">  
      <input id="fid" name="fid" value="" type="hidden"/>
      <div class="form-group">
        <div class="label">
          <label>行政区域编号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="areaId" data-validate=" required:请输入行政区域编号" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>行政区域名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="areaName" data-validate=" required:请输入行政区域名称" />
          <div class="tips"></div>
        </div>
      </div>
      <!-- <div class="form-group">
        <div class="label">
          <label>行政区域级别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="areaRank" data-validate=" required:请输入行政局域级别" />
          <div class="tips"></div>
        </div>
      </div> -->
      <div class="form-group">
        <div class="label">
          <label>上级行政区域：</label>
        </div>
        <div class="field">
          <input type="hidden" id="fatherId" name="fatherId" value="" /> 
          <input type="hidden" id="areaRank" name="areaRank" value="" />
          <!-- <input type="text" class="input w50" value="" name="fatherId" data-validate=" required:请输入上一级行政局域编码" /> -->
          <!-- 树形组件 -->
		    <div>
	           <ul id="tree" class="ztree"></ul>
	        </div>
          <div class="tips"></div>
        </div>
      </div>
   
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button id="add_btn" class="button bg-main icon-check-square-o" type="button"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
  
  
  <script type="text/javascript">
           var settingss = {
                            data: {
                              simpleData: {
                                enable: true,  //true 、 false 分别表示 使用 、 不使用 简单数据模式
                                idKey: "areaId",  //节点数据中保存唯一标识的属性名称
                                pIdKey: "fatherId",    //节点数据中保存其父节点唯一标识的属性名称 
                                rootPId: -1  //用于修正根节点父节点数据，即 pIdKey 指定的属性值
                              },
	                          key: {
	                              name: "areaName"  //zTree 节点数据保存节点名称的属性名称  默认值："name"
	                          }
                            },
                            check: {
								enable: true,  //true 、 false 分别表示 显示 、不显示 复选框或单选框
								chkStyle: "radio",
								radioType: "all"
					            /* chkboxType: { "Y": "ps", "N": "ps" } */
							}
                            
                          };
                     
             //使用ajax加载数据
             $(document).ready(function(){
               $.ajax({
                    type:"get",
                    url:"<%=path%>/area/getAreaTreeList",
                    async:true,
                    success:function(res){
                     //alert(res);
                     console.log(res);
                     zTreeObj = $.fn.zTree.init($("#tree"), settingss, res.areaList); //初始化树
                     zTreeObj.expandAll(true);   //true 节点全部展开、false节点收缩
                                         }
                    });
            });  
            
       </script>
  </body>
</html>
