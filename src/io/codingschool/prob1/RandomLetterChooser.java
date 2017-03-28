package io.codingschool.prob1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RandomLetterChooser extends RandomStringChooser {
	
	private List<String> internalString;
	
	public RandomLetterChooser(String string) {
		this.internalString = new LinkedList<String>(Arrays.asList(string.split("")));
	}
	
	public static String[] getSingleLetters(String string) {
		return string.split("");
	}
	
	@Override
	public String getNext() {
		
		if (internalString.size() < 1)
			return "NONE";
		
		int randomIndex = (int) (Math.random() * internalString.size());
		
		String character = internalString.get(randomIndex);
		internalString.remove(randomIndex);
		
		return character;
	}
}
