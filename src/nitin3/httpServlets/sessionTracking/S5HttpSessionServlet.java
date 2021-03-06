package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S5HttpSessionServlet
 */
public class S5HttpSessionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// Captured String
		String str = request.getParameter("id");
		// HttpSession Began
		HttpSession session = request.getSession();
		session.setAttribute("key",str);

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		out.println("HttpSession Began With Input String = "+str);
		out.println("<br>");
		out.println("The Session Id is = " + request.getSession().getId());
		out.print("<br>");
		out.print("<a href='httpContinue'> HttpSession Continued...</a>");
	}
}
