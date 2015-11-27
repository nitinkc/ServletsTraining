package nitin.servlets.creation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * GenericServlet<AC> implements Servlet<I> (becoming its Child) and provides
 * implementation of few of its methods
 */
public class U2GenericServletACServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		System.out.println("Service from Generic Servlets way invoked");
	}

}
