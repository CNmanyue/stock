package my.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;


public class PrintRequestListener implements ServletRequestListener {

	private Logger logger = Logger.getLogger(PrintRequestListener.class);
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		HttpServletRequest sr = (HttpServletRequest) sre.getServletRequest();
		String remoteAddr = sr.getRemoteAddr();
		String remoteHost = sr.getRemoteHost();
		String userAgent = sr.getHeader("User-Agent");
		logger.info("userAgent:"+userAgent+"\nremoteAddr:"+remoteAddr+"\tremoteHost:"+remoteHost);
		logger.info(sr.getHeader("x-forwarded-for"));
	}

}
