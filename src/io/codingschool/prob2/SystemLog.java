package io.codingschool.prob2;

import java.util.List;
import java.util.LinkedList;

public class SystemLog {

	private List<LogMessage> messageList;
	
	public SystemLog() {
		messageList = new LinkedList<LogMessage>();
	}
	
	public SystemLog(List<LogMessage> messages) {
		messageList = messages;
	}
	
	public void viewLog() {
		for (LogMessage message : messageList)
			System.out.println(message);
	}
	
	public void addMessage(LogMessage message) {
		messageList.add(message);
	}
	
	public void addMessage(String message) {
		LogMessage newMessage = new LogMessage(message);
		messageList.add(newMessage);
	}
	
	public List<LogMessage> removeMessages(String keyword) {
		List<LogMessage> filteredList = new LinkedList<LogMessage>();
		List<LogMessage> modifiedMessages = new LinkedList<LogMessage>();

		for (LogMessage message : messageList) {
			if (message.containsWord(keyword)) {
				filteredList.add(message);
			} else modifiedMessages.add(message);
		}
		
		messageList = modifiedMessages;
		
		return filteredList;
	}
}