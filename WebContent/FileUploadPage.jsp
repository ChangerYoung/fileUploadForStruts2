<%@ page language="java" import ="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>文件上传</title>
</head>
<body>
	<form action="fileUpload.action" method="post" enctype="multipart/form-data">
		上传文件：<input type="file" name="uploadFile" /><br/>
		<input type="submit" value="上传" />
		<input type="reset" value="重置" />
	</form>
	<hr/>
	<form action="someFileUpload.action" method="post" enctype="multipart/form-data">
		上传多文件：<br/>
		<input type="file" name="uploadFile" /><br/>
		<input type="file" name="uploadFile" /><br/>
		<input type="file" name="uploadFile" /><br/>
		<input type="submit" value="上传" />
		<input type="reset" value="重置" />
	</form>
</body>
</html>