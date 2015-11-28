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
		
		// to Print on the Browser
		PrintWriter pr = response.getWriter();
		pr.print("Welcome Servlet invoked");
		
		String input = request.getParameter("nameOfInputField");
		
		//Check on the Console if the string has been accepted
		System.out.println(input);
		
		RequestDispatcher rd = request.getRequestDispatcher("fwdWelServlet");
		// Forwarding the current request response packet tp welcome servlet
		rd.forward(request, response);
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
