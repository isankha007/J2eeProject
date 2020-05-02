<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<%-- My JSP page ${name} and password is ${password} --%>
	
	<p>Welcome ${name}</p>

	

	<div class="container">
		<H1>Heading</H1>
		<!-- Body of the Page -->
		<caption>your todos</caption>
		<!-- -->
		<table class="table table-striped">
		<thead>
		<th>Description</th>
		<th>Category</th>
		<th>action</th>
		</thead>
		<tbody>
		<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.categoryStr}</td>
					<td>
					<a class="btn btn-danger"
						href="\delete-todo.do?todo=${todo.name}&todoid=${todo.id}&todocategory=${todo.categoryStr}">delete
					</a>
					</td>
				</tr>
				</c:forEach>
		</tbody>
		</table>
		<%-- Your Todos
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name} &nbsp &nbsp ${todo.categoryStr} <a
					href="\delete-todo.do?todo=${todo.name}&todoid=${todo.id}&todocategory=${todo.categoryStr}">delete</a></li>
			</c:forEach>
		</ol> --%>
		<a class="btn btn-success"
					href="\add-todo.do?">New todos</a>
		<!-- <form action="/add-todo.do" method="POST">
			<input type="text" name="todoNew"> <input type="submit"
				value="add">
		</form>-->
	</div>

	<%@ include file="../common/footer.jspf" %>