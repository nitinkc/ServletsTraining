package nitin4.httpServlet.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class F1Filter0Init
 */
public class F1Filter0Init implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init Filter 0...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("in Do Filter 0 ...");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1> Filter Invoked before Servlet </h1>");
		
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("Destroyed Filter 0");
	}

}
