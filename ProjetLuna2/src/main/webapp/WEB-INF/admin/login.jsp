<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/index.css">
<title>Insert title here</title>
</head>
<body>
<div class="login">
<s:form	 action="login" validate="true">
    <input type="text" name="j_username" placeholder="Username" id="username">  
  <input type="password" name="j_password" placeholder="password" id="password">  
 
  <input type="submit" value="Sign In">
 </s:form>
</div>
<div class="shadow"></div>
</body>
</html>