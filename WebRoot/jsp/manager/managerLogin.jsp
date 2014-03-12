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
		   /*  $id = isset($_POST['id']) ? intval($_POST['id']) : 0;
		    
		    include 'conn.php';
		     
		    $result = array();
		    $rs = mysql_query("select * from nodes where parentId=$id");
		    while($row = mysql_fetch_array($rs)){
		        $node = array();
		        $node['id'] = $row['id'];
		        $node['text'] = $row['name'];
		        $node['state'] = has_child($row['id']) ? 'closed' : 'open';
		        array_push($result,$node);
		    }
		     
		    echo json_encode($result);
		     
		    function has_child($id){
		        $rs = mysql_query("select count(*) from nodes where parentId=$id");
		        $row = mysql_fetch_array($rs);
		        return $row[0] > 0 ? true : false;
		    }
		    
		    
		    $("#tt"). */
		    	
	    </script>
		<title>GES后台管理系统用户登陆</title>
	</head>
	<body>
	
	  <form id="ff" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input class="easyui-validatebox" type="text" name="name" data-options="required:true"></input></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input class="easyui-validatebox" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input class="easyui-validatebox" type="text" name="subject" data-options="required:true"></input></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea name="message" style="height:60px;"></textarea></td>
                </tr>
                <tr>
                    <td>Language:</td>
                    <td>
                        <select class="easyui-combobox" name="language"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
                    </td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
        </div>
    <script>
        function submitForm(){
            $('#ff').form('submit');
        }
        function clearForm(){
            $('#ff').form('clear');
        }
    </script>
		<form>
			<div>
				<label>账号：</label>
				<input type="text" name="" value=""/>
			</div>
			<div>
				<label>密码：</label>
				<input type="password" name="" value=""/>
			</div>
			<div>
				<label>验证码：</label>
				<input type="text" name="" value=""/>
			</div>
			<div>
				<a href="#">注册</a>
				<a href="#">忘记密码</a>
			</div>
		</form>
	</body>
	<ul id="tt" class="easyui-tree"></ul>
</html>