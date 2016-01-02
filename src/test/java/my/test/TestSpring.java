package my.test;

import my.service.IUserService;
import my.servlet.TestLogServlet;
import my.tools.IPSeeker;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		IUserService userService = (IUserService) ac.getBean("userService");
		userService.test();
		TestLogServlet s = (TestLogServlet) ac.getBean("testLogServlet");
		s.test();
	}
	@Test
	public void testIp() {
		// 指定纯真数据库的文件名，所在文件夹
		IPSeeker ip = new IPSeeker("QQWry.Dat", "D:\\MyDoc");
		// 测试IP 58.20.43.13
		System.out.println(ip.getIPLocation("59.66.132.147").getCountry() + ":" + ip.getIPLocation("59.66.132.147").getArea());
	}
	
	public static void main(String[] args) {
		int a = '0';
		System.out.println(a);
	}
}
