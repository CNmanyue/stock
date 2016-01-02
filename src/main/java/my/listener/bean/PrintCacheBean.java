package my.listener.bean;

import java.util.TimerTask;

import org.apache.log4j.Logger;

public class PrintCacheBean extends TimerTask {

	private static Logger logger = Logger.getLogger(PrintCacheBean.class);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		 * 这个方法返回的是java虚拟机（这个进程）能构从操作系统那里挖到的最大的内存，以字节为单位，如果在运行java程序的时候，没有添加-Xmx参数
		 * ，那么就是64
		 * 兆，也就是说maxMemory()返回的大约是64*1024*1024字节，这是java虚拟机默认情况下能从操作系统那里挖到的最大的内存
		 * 。如果添加了-Xmx参数，将以这个参数后面的值为准， 例如java -cp ClassPath -Xmx512m
		 * ClassName，那么最大内存就是512*1024*0124字节。
		 */
		long max = Runtime.getRuntime().maxMemory();
		/*
		 * freeMemory()是什么呢，刚才讲到如果在运行java的时候没有添加-Xms参数，那么，在java程序运行的过程的，
		 * 内存总是慢慢的从操作系统那里挖的，基本上是用多少挖多少
		 * ，但是java虚拟机100％的情况下是会稍微多挖一点的，这些挖过来而又没有用上的内存
		 * ，实际上就是freeMemory()，所以freeMemory()的值一般情况下都是很小的，但是如果你在
		 * 运行java程序的时候使用了-Xms
		 * ，这个时候因为程序在启动的时候就会无条件的从操作系统中挖-Xms后面定义的内存数，这个时候，挖过来的内存可能大部分没用上，所以这个时
		 * 候freeMemory()可能会有些大。
		 */
		long free = Runtime.getRuntime().freeMemory();
		/*
		 * totalMemory()这个方法返回的是java虚拟机现在已经从操作系统那里挖过来的内存大小，也就是java虚拟机这个进程当时所占用的所有内存
		 * 。如果在运行java的时候没有添加
		 * -Xms参数，那么，在java程序运行的过程的，内存总是慢慢的从操作系统那里挖的，基本上是用多少挖多少，
		 * 直挖到maxMemory()为止，所以totalMemory()是慢慢增大的。如果用
		 * 了-Xms参数，程序在启动的时候就会无条件的从操作系统中挖-Xms后面定义的内存数，然后在这些内存用的差不多的时候，再去挖。
		 */
		long total = Runtime.getRuntime().totalMemory();
		logger.info("max:" + byteToMega(max) + "\tfree:" + byteToMega(free) + "\ttotal:" + byteToMega(total));

//		logger.error("max:" + byteToMega(max) + "\tfree:" + byteToMega(free) + "\ttotal:" + byteToMega(total));
//		logger.warn("max:" + byteToMega(max) + "\tfree:" + byteToMega(free) + "\ttotal:" + byteToMega(total));
//		logger.debug("max:" + byteToMega(max) + "\tfree:" + byteToMega(free) + "\ttotal:" + byteToMega(total));
	}

	public String byteToMega(long byteval){
		return byteval/1024/1024+"M";
	}
}
