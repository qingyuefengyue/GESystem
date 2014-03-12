<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; UTF-8">
		<title>Exception index</title>
	</head>
	<body>
		请求错误,错误信息如下<br>
		请求路径：<c:out value="${requestUrl}"/><br>
		错误代码<c:out value="${errorCode}"/><br>
		请检查！
	</body>
</html>