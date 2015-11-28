package nitin2.httpServlet.jdbcConn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("Login Servlet<br>");
		String uname = request.getParameter("uId");
		String passwd = request.getParameter("uPassword");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql:http://sql3.freemysqlhosting.net/sql397582", "sql397582","pD1!tH2%");
			
			System.out.println("Connection Invoked");
			// ? => Place holders 
		
//			PreparedStatement ps=connection.prepareStatement("select * from Emp where uname=? and passwd=?");
//			ps.setString(1,uname);
//			ps.setString(2,passwd);
//			
//			ResultSet rs=ps.executeQuery();
//			if(rs.next()){
//				RequestDispatcher rd=request.getRequestDispatcher("view");
//				rd.forward(request, response);
//			}
//			else {
//				out.print("<center>User id or password is wrong !!!</center><hr>");
//				RequestDispatcher rd=request.getRequestDispatcher("login.html");
//				rd.include(request, response);
//			}		
		} catch (Exception e) {
			
				e.printStackTrace();
		}
	}
}
