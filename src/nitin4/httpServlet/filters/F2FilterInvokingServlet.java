package nitin4.httpServlet.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class F2FilterInvokingServlet implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Init doFilter from F2FilterInvokingServlet ");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1>Filter Invoked.... Invoking Servlet <h1>");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("Destroyed Filter F2FilterInvokingServlet");
	}

}
