package nitin4.httpServlet.filters;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class F2InvokedServlet
 */
public class F2InvokedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TESTING : 123");
		
		response.getWriter().println("Sucessfully Called the Servlet after Filter Execution is done");
	}
}
