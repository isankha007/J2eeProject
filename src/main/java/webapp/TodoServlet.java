package webapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.tools.javac.comp.Todo;

import webapp.TodoService;


/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
	public TodoService todoService= new TodoService();

	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//      request.setAttribute("todos", todoService.retriveTodos());
		request.getSession().setAttribute("todos", todoService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();


	

}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//      request.setAttribute("todos", todoService.retriveTodos());
		String newTodo = request.getParameter("todoNew");
		List<Todolist> todos2=todoService.retriveTodos();
		Todolist lastElem = todos2.get(todos2.size() - 1);
		todoService.addTodo(new Todolist(newTodo,lastElem.getId()+1));
		response.sendRedirect("/todo.do");

  }
	
	

}