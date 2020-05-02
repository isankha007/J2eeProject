<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<%-- My JSP page ${name} and password is ${password} --%>
	<%
		
	%>
	<p>Welcome ${name}</p>


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

	<%@ include file="../common/footer.jspf" %>