package nitin1.httpServlet.servletCollaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H1RequestDispatcherForward
 */
public class H1RequestDispatcherForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// The user input
		String input = request.getParameter("nameOfInputField");
		// to Print on the Browser
		PrintWriter pr = response.getWriter();
		
		// This response will not be sent BACK. IT'S DROPPED
		pr.print("Welcome Servlet invoked");
		System.out.println("From H1RequestDispatcherForward - THE RESPONSE PACKET WILL BE DROPPED");
		
		//Check on the Console if the string has been accepted
		System.out.println("TESTING : "+input);
		
		RequestDispatcher rd = request.getRequestDispatcher("fwdWelServlet");
		// Forwarding the current request packet to welcome servlet
		rd.forward(request, response);
	}
}
