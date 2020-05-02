package webapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthOptionPaneUI;

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

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoeServlet extends HttpServlet {
	public TodoService todoService= new TodoService();

	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		System.out.println(request.getParameter("todo")+" "+request.getParameter("todoid"));
		todoService.deleteodo(new Todolist(request.getParameter("todo"), Integer.parseInt(request.getParameter("todoid")),request.getParameter("todo")));
        response.sendRedirect("/list-todos.do");

}

	
	

}