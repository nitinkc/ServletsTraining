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
 * Servlet Filter implementation class F1Filter1
 */
public class F1Filter1 implements Filter {

	private FilterConfig filterConfig=null;
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init Filter 1...");
		filterConfig=fConfig;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("in Do Filter1 ...");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//To set in the Contaxt so others can also access.
		String str = filterConfig.getInitParameter("filterInitParam");
		
		// Set the Servlet Context, Golbal variable
		ServletContext x = request.getServletContext();
		x.setAttribute("contextVar", str);
		// pass the request along the filter chain
		// The filter sequence is defined in the XML File. 
		// Thus it will follow the sequencefrom swb.XML 
		//chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("Destroyed Filter 1");
	}

}
