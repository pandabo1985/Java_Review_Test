package com.panda.java.test.callback;

public class LogJava {

	/**
	 * @author panda custom log־
	 */
	private static boolean isTest = true;

	public static void log(String info) {
		StackTraceElement[] ste = new Throwable().getStackTrace();
		int i = 1;
		if (isTest) {
			StackTraceElement s = ste[i];
			System.err.println(String.format("======[%s][%s][%s]=====%s",
					s.getClassName(), s.getLineNumber(), s.getMethodName(),
					info));
		}
	}
}
