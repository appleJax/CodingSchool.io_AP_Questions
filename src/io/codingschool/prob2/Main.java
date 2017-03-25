package io.codingschool.prob2;

import java.util.List;

public class Main {
	
	private static void printSeparator() {
		System.out.println("-------------------");
	}

	private static void printLog(String label, SystemLog log) {
		printSeparator();
		System.out.println(label.toUpperCase());
		System.out.println();
		log.viewLog();
		System.out.println();
	}
	
	private static void printFilter(String filter) {
		printSeparator();
		System.out.printf("Keyword to filter: %s%n", filter);
		System.out.println();
	}
	
	public static void main(String[] args) {

		SystemLog sysLog = new SystemLog();

		sysLog.addMessage("CLIENT3:security alert - repeated login failures");
		sysLog.addMessage("Webserver:disk offline");
		sysLog.addMessage("SERVER1:file not found");
		sysLog.addMessage("SERVER2:read error on disk DSK1");
		sysLog.addMessage("SERVER1:write error on disk DSK2");
		sysLog.addMessage("Webserver:error on /dev/disk");
		
		printLog("original system log", sysLog);

		String keyword = "disk";
		List<LogMessage> filteredMessages = sysLog.removeMessages(keyword);
		SystemLog filteredLog = new SystemLog(filteredMessages);
	
		printFilter(keyword);
		
		printLog("matching log messages", filteredLog);
		
		printLog("modified system log", sysLog);
	}

}