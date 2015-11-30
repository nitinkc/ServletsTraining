package nitin5.httpServlet.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class L1CheckListenerSequence
 *
 */
public class L1CheckListenerSequence implements ServletContextAttributeListener, HttpSessionListener, ServletContextListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, ServletRequestListener, ServletRequestAttributeListener {


    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("Context initialized");
    	
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("Context Destroted");
    }

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		
	}
}
