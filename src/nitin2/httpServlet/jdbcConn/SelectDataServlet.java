package nitin2.httpServlet.jdbcConn;
/* 5 Step JDBC Connection Steps
 * 1. Register for the JDBC Driver
 * 2. Open a Connection
 * 3. Create and Execute a Query
 * 4. Extract data from the resultSet (Cursir)
 * 5. Clean up / Close Environment
 * */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		String id = request.getParameter("uId");
		String pwd = request.getParameter("uPassword");

		Connection connection = null;
		try {
			//1. Register for the JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Open a Connection
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root","root");
			
			// ? => Place holders 
		
			// 3a. Create Query
			PreparedStatement ps=connection.prepareStatement("select * from Emp where id=? and password=?");
			ps.setString(1,id);
			ps.setString(2,pwd);
			
			// 3b. Execute Query
			ResultSet rs=ps.executeQuery();
			
			// 4. Read Query rs.next() 
			if(rs.next()){
				RequestDispatcher rd=request.getRequestDispatcher("view");
				// takes you to the next page
				rd.forward(request, response);
			}
			else {
				out.print("<center>User id or password is wrong !!!</center><hr>");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				// Include so that the Wrong message can be viewed inb the same page 
				rd.include(request, response);
			}
			
			//5. Close the connections
			  rs.close();
		      ps.close();
		      connection.close();
			
			
		} catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(connection!=null)
		            connection.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
	}
}
