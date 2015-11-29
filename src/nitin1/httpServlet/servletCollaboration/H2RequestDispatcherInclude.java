package nitin1.httpServlet.servletCollaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H2RequestDispatcherInclude
 */
public class H2RequestDispatcherInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// to Print on the Browser
		PrintWriter pr = response.getWriter();
		pr.print("Welcome Servlet invoked");
		pr.print("<br>");
		System.out.println("From H2RequestDispatcherInclude - THE PACKET WILL NOT BE "
				+ "DROPPED BUT SENT BACK TO THE CALLING SERVLET");
		String input = request.getParameter("nameOfInputFieldInc");
		
		//Check on the Console if the string has been accepted
		System.out.println("TESTING : "+input);
		
		RequestDispatcher rd = request.getRequestDispatcher("incWelServlet");
		// sending the include
		rd.include(request, response);
		}

   
}
