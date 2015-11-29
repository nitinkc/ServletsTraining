package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S3URLReWritingServlet
 */
public class S3URLReWritingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
		 PrintWriter pw = response.getWriter();
		 response.setContentType("text/html");

		 pw.println("URL Rewriting");

		 String str = request.getParameter("id");
		 pw.println(str);
		 pw.println("URL Redirect using ? and & (if multiple values)");
		 pw.println("<br>");
		 pw.print("<a href='S3URLReWritingServletContd?id="+str+"'>Next Servlet</a>");	
	}

}
