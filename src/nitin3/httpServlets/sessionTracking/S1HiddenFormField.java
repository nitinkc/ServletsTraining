package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1HiddenFormField
 */
public class S1HiddenFormField extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.append(id);
		
		out.print("<form action='hiddenPage' method='get'>");
		out.print("<input type='text' name='id' value='"+id+"'>");
		out.print("<br>");
		out.print("<input type='hidden' name='idEncrypted' value='"+id.concat(": id Concatenated with some text")+"'>");
		out.print("<br>");
		out.print("<input type='submit' value='Next page'>");
		out.print("</form>");
		
		RequestDispatcher rd = request.getRequestDispatcher("hiddenPage");
		rd.forward(request, response);
	}

}
