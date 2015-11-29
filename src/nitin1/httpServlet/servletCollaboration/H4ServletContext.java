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
 * Servlet implementation class H4ServletContext
 */
public class H4ServletContext extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		// Send as an html instead of just string
		response.setContentType("text/html");
		//application/pdf
		//image/jpeg
		//application-msexcel
		
		out.print("Context Servlet invoked !!!");
		
		ServletContext context= getServletContext();
		out.print("Context Param value is (for Key=GlobalContext)"+context.getInitParameter("GlobalContext"));
		out.print("<hr>");
		out.println("The context (Declared on top of xml) decides the global context. Can have as many params, "
				+ "but ONLY one Context per Application");

		
	}

}
