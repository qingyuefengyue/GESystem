<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<c:set var="ctx" value="<%=request.getContextPath() %>"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/js/jquery/easyUI/themes/default/easyui.css">
	    <link rel="stylesheet" type="text/css" href="${ctx}/resources/js/jquery/easyUI/themes/icon.css">
	    <script type="text/javascript" src="${ctx}/resources/js/jquery/jquery.min.js"></script>
	    <script type="text/javascript" src="${ctx}/resources/js/jquery/easyUI/jquery.easyui.min.js"></script>
	    <script type="text/javascript">
	    $('#tt').tree({
	        url: "",
	        loadFilter: function(data){
	            if (data.d){
	                return data.d;
	            } else {
	                return data;
	            }
	        }
	    });
	    
	    $('#tt').tree({
	    	data: [{
	    		text: 'Item1',
	    		state: 'closed',
	    		children: [{
	    			text: 'Item11'
	    		},{
	    			text: 'Item12'
	    		}]
	    	},{
	    		text: 'Item2',
    			formatter:function(node){
    				return node.text;
    			}
	    	}]
	    });
	    </script>
		<title>GES后台管理系统用户登陆</title>
	</head>
	<body>
	<ul id="tt" class="easyui-tree"></ul>
</html>