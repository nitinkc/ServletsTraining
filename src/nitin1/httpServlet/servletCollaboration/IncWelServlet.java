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
		System.out.println("***********************************");
		System.out.println("From IncWelServlet");
		String str = (String) request.getAttribute("nameOfInputField");
		System.out.println("TESTING : " + str);
		System.out.println("***********************************");
		
		PrintWriter pw = response.getWriter();
		pw.print(request.getAttribute("nameOfInputField"));
		pw.print("<br>");
		pw.print("The request and response packet is not dropped but is sent back to the calling servlet");
	}
}
