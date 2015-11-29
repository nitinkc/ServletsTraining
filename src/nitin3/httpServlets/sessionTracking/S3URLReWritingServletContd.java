package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S3URLReWritingServletContd
 */
public class S3URLReWritingServletContd extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("<h2>After URL Rewriting!!!</h2>");

		String str=request.getParameter("id");
		out.print("Input from previous page Color is : "+str);
	}
}
