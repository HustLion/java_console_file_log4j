package com.hustlion.java_console_file_log4j;

//引入 log4j 类
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App {
	// 定义对 rootLogger 的静态引用
	private static final Logger rootLogger = LogManager.getRootLogger();

	public static void main(String[] args) {
		rootLogger.error("Logged by root logger: Hello this is an error");
		rootLogger.info("Logged by root logger: Hello World!");
		rootLogger.debug("Logged by root logger: Hello debug message.");
	}
}