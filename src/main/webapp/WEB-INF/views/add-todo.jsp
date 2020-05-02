<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<title>WWWW!!!!!!!! from JSP</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>
	<%-- My JSP page ${name} and password is ${password} --%>
	<%
		
	%>
	<p>Welcome ${name}</p>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todo.do">Todos</a></li>
			<li><a href="http://sankhablogs.herokuapp.com/">Blogs</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
	Your next action Item
		<form action="/add-todo.do" method="POST">
		<fieldset class="form-group">
		  <label>Description</label>
		   <input type="text" name="todoNew" class="form-control"><br>
		  </fieldset>
		  <fieldset>
				<label>Category  </label> 
				<input type="text" name="category" class="form-control"> <br>
		  </fieldset>
		  <input type="submit" name="add"
				value="Add" class="btn btn-success">
		</form>
	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>