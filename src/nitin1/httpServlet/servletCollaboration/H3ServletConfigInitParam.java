package nitin1.httpServlet.servletCollaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H3ServletConfigInitParam
 */
public class H3ServletConfigInitParam extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		// Send as an html instead of just string
		response.setContentType("text/html");
		
		out.print("Config Servlet invoked !!!");

		ServletConfig config = getServletConfig();
		out.println("My Name is : "+config.getInitParameter("param1"));
		out.println("My Siblings names are  : "+config.getInitParameter("param2") +", "+ config.getInitParameter("param3"));
		
		out.print("<hr>");
		out.println("The init params are set in the servlet xml field. Set as many initparams for one Servlet");

		out.print("<hr>");
		out.println("getServletConfig().getInitParameterNames() returns an Enum = "+ config.getInitParameterNames());
		out.println("<br>");
		out.println("getServletName() = " +config.getServletName());
		out.println("<br>");
		out.println("getServletContext()  = " + config.getServletContext());
		out.println("hr");
		
	}

}
