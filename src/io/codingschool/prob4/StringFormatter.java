package io.codingschool.prob4;

import java.util.List;

public class StringFormatter {

	private static int totalLetters(List<String> wordList) {
		int letterCount = 0;
		
		for (String word : wordList)
			letterCount += word.length();
		
		return letterCount;
	}
	
	private static int spacesAvailable(List<String> wordList, int formattedLen) {
		int totalLetters = totalLetters(wordList);
		
		return formattedLen - totalLetters;
	}
	
	private static int leftoverSpaces(List<String> wordList, int formattedLen) {
		int spacesAvailable = spacesAvailable(wordList, formattedLen);
		int gaps = wordList.size() - 1;
		
		return spacesAvailable % gaps;
	}
	
	private static int basicGapWidth(List<String> wordList, int formattedLen) {
		int spacesAvailable = spacesAvailable(wordList, formattedLen);
		int gaps = wordList.size() - 1;
		
		return  spacesAvailable / gaps;
	}
	
	public static String format(List<String> wordList, int formattedLen) {
		int basicGapWidth = basicGapWidth(wordList, formattedLen);
		int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
		String result = "";

		// Build numbered slots from 1 to <formattedLen>
		for (int i = 1; i <= formattedLen; i++) {
			String spacer = (i < 10)
				? "  "
				: " ";
			
			result += "  " + i + spacer;
		}
		
		result += "\n";
		
		// Build the actual formatted word list
		result += "| ";
		int counter = 0;
		
		for (String word : wordList) {
			String[] letters = word.toUpperCase().split("");
			
			for (String letter : letters) {
				result += letter + "  | ";
				counter++;
			}
			
			if (counter < formattedLen) {
				String gap = "   | ";

				for (int j = 0; j < basicGapWidth; j++) {
					result += gap;
					counter++;
				}
				
				if (leftoverSpaces > 0) {
					result += gap;
					counter++;
					leftoverSpaces--;
				}
				
			}
		}
		
		return result + "\n";
	}
}
