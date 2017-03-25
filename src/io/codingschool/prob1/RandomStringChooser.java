package io.codingschool.prob1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RandomStringChooser {
	
	private List<String> availableStrings;
	
	public RandomStringChooser() {
		
	}
	
	public RandomStringChooser(String[] strings) {
		this.availableStrings = new LinkedList<String>(Arrays.asList(strings));
	}
	
	public String getNext() {
		
		if (availableStrings.size() < 1)
			return "NONE";
		
		int randomIndex = (int) (Math.random() * availableStrings.size());
		String result = availableStrings.get(randomIndex);
		availableStrings.remove(result);

		return result;
	}
	
	public int getSize() {
		return availableStrings.size();
	}
	
	public String toString() {

		String result = "";
		
		for (String str : availableStrings)
			result += str + " ";
		
		return result;
	}
}
