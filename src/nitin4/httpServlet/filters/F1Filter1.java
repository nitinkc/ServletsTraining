package nitin4.httpServlet.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class F1Filter1
 */
public class F1Filter1 implements Filter {

	private FilterConfig fc=null;
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init Filter 1...");
		fc=fConfig;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("in Do Filter1 ...");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// Get the Filter Config Inti-params
		String val = fc.getInitParameter("filterInitParam");
				
		// Set the Variable to Global (ServletContext) to be accessed later	
		ServletContext sc = request.getServletContext();
		sc.setAttribute("servlet_context_attr", val);
		
		// Input from the user
		String input = request.getParameter("id");
		
		// Check the input against the Filter init params
		if(input.equals(val)){
			out.println("<center><h2>Login Successful</h2></center>");
			// Thus it will follow the sequence from web.XML
			chain.doFilter(request, response);
		} else{
			out.print("<center><h2>Invalid User !!!</h2></center>");
			out.print("<br> The Correct password is " + sc.getAttribute("servlet_context_attr"));
			// Reload the page. 
			RequestDispatcher rd=request.getRequestDispatcher("loginThruFilter.html");
			rd.include(request, response);
		}
	}
	
	public void destroy() {
		System.out.println("Destroyed Filter 1");
	}

}
