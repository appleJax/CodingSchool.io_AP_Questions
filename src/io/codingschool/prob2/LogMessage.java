package io.codingschool.prob2;

import java.util.regex.Pattern;

public class LogMessage {

    private String machineId;
    private String description;
    
    public LogMessage(String message ) {
    		String[] components = message.split(":");
    		
    		machineId = components[0];
    		description = components[1];
    }
    
    public boolean containsWord(String keyword) {
    		String regex = "(.*\\s)?" + keyword + "(\\s.*)?";
    	
    		return Pattern.matches(regex, description);
    }
    
    public String getMachineId() {
    		return machineId;
    }

    public String getDescription() {
    		return description;
    }
    
    public String toString() {
    		return machineId + ":" + description;
    }
}
