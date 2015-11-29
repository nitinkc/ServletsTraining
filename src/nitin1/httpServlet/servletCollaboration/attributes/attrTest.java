package nitin1.httpServlet.servletCollaboration.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class attrTest
 */
public class attrTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		// Picking up the value from the "input field of the html"
		String str = request.getParameter("val");
		pw.println("From calling Servlet (Caught value) = " + str);
		
		// Setting the value to the Context (Making it GLOBALLY accessible)
		ServletContext context = getServletContext();
		
		// Sets the str to a key, which can be accessed globally
		context.setAttribute("key", str);
		
		pw.println("<hr>");
		pw.println("Going to dispatcher" + "<br>");
		RequestDispatcher rd=request.getRequestDispatcher("AttrTestCalled");
		rd.include(request, response);
		
		// Explicit request making to the called Servlet (The html page doesn't exist, \
		// from the response generated html, we are pushing this code into it)
		pw.print("<br><a href='AttrTestCalled'>Call another servlet</a>");
		
		
	}
}
