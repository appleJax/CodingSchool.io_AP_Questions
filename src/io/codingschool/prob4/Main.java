package io.codingschool.prob4;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> wordList = new LinkedList<String>();
		
		wordList.add("Green");
		wordList.add("eggs");
		wordList.add("and");
		wordList.add("ham");
		
		String formattedString = StringFormatter.format(wordList, 20);
		
		System.out.println(formattedString);
	}

}
