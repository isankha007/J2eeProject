package webapp.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	public LoginService UserValidationService= new LoginService();
	public TodoService todoService= new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        request.setAttribute("name", name);
        request.setAttribute("password", password);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo!!!!!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean isUserValid=UserValidationService.isValidUser(name, password);
		if(isUserValid)
		{
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");
//			request.setAttribute("name", name);
//			request.setAttribute("todos", todoService.retriveTodos());
////			request.setAttribute("password", password);
//			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}
}

}