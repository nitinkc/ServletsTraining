package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S7CookieServlet
 */
public class S7CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String login = request.getParameter("id");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<h2>Cookie is saved in this session</h2>");
		
		out.print("User id is : "+ login+"<br>");
			
		// 1) Creating the cookie
		Cookie cookie=new Cookie("userID", login);
		
		//Attaching the cookie in response
		response.addCookie(cookie);
		
		out.print("<a href='sessionCookie'>Take Cookie to next page</a>");
		
		
	}

}
