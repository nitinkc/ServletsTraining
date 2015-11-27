package nitin.servlets.creation;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * The Servlet Interface provides 5 methods which needs to implemented
 * 1. init which takes ServletConfig as argument
 * 2. getServletConfig returns Object of ServletConfig (ServletConfig is an 
 * 		Interface can't be instantiated with an object, thus method returns 
 * 		the object)
 * 3. getServletInfo => return info about Servlet
 * 4. service(ServletRequest req, ServletResponse res)
 * 5/ destroy() 
 */
public class U1ServletInterfaceServlet implements Servlet { // ctrl + space
	static int count = 0;
	// MUST IMPLEMENT ALL INHERITED ABSTRACT METHODS (all 5)
	
	// These are LIFE CYCLE methods
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init invoked..ONLY ONCE - FROM SERVICE ");
	}

	
	@Override
	// Invoked for every Request
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("Service Invoked for each Request: " + count);
		//DOES NOT EXECUTE
		res.getWriter().append("From Servlet Interface ").append(res.getClass() + res.getContentType());
		
	}

	@Override
	// When app gets updeployed
	public void destroy() {
		System.out.println("Destroy invoked..");
		
	}
	
	// NON LIFE CYCLE methods
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
