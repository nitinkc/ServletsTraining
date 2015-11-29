package nitin1.httpServlet.servletCollaboration;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FwdWelServlet
 */
public class IncWelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/****** FOR SERVER SIDE DEBUGGING SOP IS USED BEGIN******/
		System.out.println("***********************************");
		System.out.println("From IncWelServlet");
		String str = (String) request.getParameter("nameOfInputFieldInc");
		System.out.println("TESTING : " + str);
		System.out.println("***********************************");
		/****** SERVER SIDE DEBUGGING END ******/
		
		/***** SENDING THE RESPONSE TO THE CLIENT *****/
		PrintWriter pw = response.getWriter();
		pw.print(str);
		pw.print("<br>");
		pw.print("The response packet (From the H2RequestDispatcherInclude.java) "
				+ "is NOT dropped and thus \"Welcome Servlet invoked\" is called here");
	}
}
