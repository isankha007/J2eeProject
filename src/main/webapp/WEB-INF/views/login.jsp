<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sankhadeep!!!!!!!! from JSP</title>
</head>
<%
Date dt=new Date();
System.out.println(request.getParameter("name")) ;
System.out.println(request.getParameter("password")) ;
%>
<body>
<%-- My JSP page ${name} and password is ${password} --%> 
<form action="/login.do" method="post">

<p><font color="red">${errorMessage}</font></p>

Enter your name
<input type="text" name="name"> Password<input type="password" name="password"/><input type="submit" value="login"/>
</form>
</body>
</html>