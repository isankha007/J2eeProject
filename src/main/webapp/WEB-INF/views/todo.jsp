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
<p>Welcome ${name}</p> 

Your Todos 
<ol>
  <c:forEach items="${todos}" var="todo">
  <li> ${todo.name} &nbsp &nbsp <a href="\delete-todo.do?todo=${todo.name}">delete</a></li>
  </c:forEach>
</ol>
<form action="/todo.do" method="POST">
 <input type="text" name="todoNew">
 <input type="submit" value="add">
</form>
<p>${todos}</p>
</body>
</html>