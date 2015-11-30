package nitin3.httpServlets.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S7CookieServletContd
 */
public class S7CookieServletContd extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//1) fetch the all cookie
		Cookie[] cookies = request.getCookies();
		//2) print the cookie value
		out.print("Cookie Id  : "+ cookies[0].getName()+"<br>");
		out.print("User id is  : "+cookies[0].getValue()+"<hr>");	
	}

}
