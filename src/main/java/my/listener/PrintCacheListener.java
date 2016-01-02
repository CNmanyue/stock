package my.listener;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import my.listener.bean.PrintCacheBean;

/**
 * @author Mocuishle
 * 打印内存使用情况
 */
public class PrintCacheListener implements ServletContextListener {
	private Timer timer = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		timer = new Timer(true);
	    timer.schedule(new PrintCacheBean(), 10, 10000);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		timer.cancel();
	}

	
}
