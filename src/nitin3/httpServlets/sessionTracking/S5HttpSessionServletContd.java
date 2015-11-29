package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class H5HttpSessionContdServlet
 */
public class S5HttpSessionServletContd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String str = (String) session.getAttribute("key");
		
		PrintWriter out = response.getWriter();
		out.println("Captured values from the Previous page ");
		out.append(str);
	}

}
