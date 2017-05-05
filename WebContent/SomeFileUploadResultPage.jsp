<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>多文件上传成功</title>
</head>
<body>
	<c:forEach items="${uploadFileFileName}"
		var="filename" varStatus="stat" >
		文件名：${filename},文件类型：${uploadFileContentType[stat.index]}<br/>
	</c:forEach><br/>
</body>
</html>