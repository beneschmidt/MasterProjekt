package de.htwsaar.qna;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is a startup class, that is listed in web.xml to perform actions on
 * startup of the server.
 * <p>
 * In the current state of the application, test data is created in the database
 * to work with.
 */
public class ApplicationStartUpListener implements ServletContextListener {

	private static final Logger logger = LogManager.getLogger(ApplicationStartUpListener.class);

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("hey there");
		logger.info("===============================");
		logger.info("Context initialised! Application is started....");
		try {
		} catch (Exception e) {
			logger.error("ApplicationStartup ran into an error! " + e.getMessage(), e);
		} finally {
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

}
