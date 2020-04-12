<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WWWW!!!!!!!! from JSP</title>
</head>

<body>
<%-- My JSP page ${name} and password is ${password} --%> 
<% %>
Your Todos 
<ol>
  <c:forEach items="${todos}" var="todo">
  <li> ${todo.name} </li>
  </c:forEach>
</ol>
<p>${todos}</p>
</body>
</html>